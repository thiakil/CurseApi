/*
 * CurseAPI library - Java abstraction layer for Curse's feed & SOAP API
 * Copyright (C) 2018  Thiakil
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * This library may be dynamically linked against (used as a dependency) in any project licenced under terms requiring complete
 * source code availability (a "FREE SOFTWARE LICENCE" https://www.gnu.org/philosophy/free-sw.html), such as the Apache License(s),
 * without the using project being required to be GPL licenced. This library remains GPL licenced and any modifications to this
 * library must still be made under the terms of the GPL. Bundling of the compiled binary class files ("fat jars") is permitted
 * for OPEN SOURCE projects, provided no modifications have been made (in which case source code for modifications must be available).
 *
 * Repackaging (sometimes known as "shading") where ONLY the package names are changed to avoid conflicts requires the configuration
 * and instructions for the method of repackaging to be made available in the same manner as source code.
 *
 * You may NOT use this library in a closed source project under any circumstance.
 */

package com.thiakil.curseapi.json;

import addons.curse.AddOn;
import addons.curse.AddOnAuthor;
import addons.curse.CategorySection;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thiakil.curseapi.json.adaptors.AddOnAdaptor;
import com.thiakil.httpcache.PersistentHttpCacheStorage;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.http.client.cache.CacheResponseStatus;
import org.apache.http.client.cache.HttpCacheContext;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.cache.CacheConfig;
import org.apache.http.impl.client.cache.CachingHttpClients;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 * Provides methods to download and parse curse's data dumps.
 *
 * HTTP responses are cached, as well as the timestamps built into the data being checked.
 * The class also offers a way to save the parsed data to JSON or a custom format - highly recommended to avoid the
 * startup overhead of decompressing the dump and skipping the 32mb or so of whitespace contained.
 *
 * The objects used are the same as returned from the SOAP API, so you could theoretically update the addon data map
 * with data you retrieve from the SOAP calls.
 *
 * Basic usage
 *
 * <code>
 *		ProjectFeedDownloader db = new ProjectFeedDownloader();
 		File dbStorage = new File(ProjectFeedDownloader.DEFAULT_CACHE_DIR, "db.json");
		db.load(dbStorage);
		db.sync();
		db.save(dbStorage);
 		//use the data
 * </code>
 *
 */
public class ProjectFeedDownloader {
	public static final String FEED_TEMPLATE = "https://clientupdate-v6.cursecdn.com/feed/addons/%d/v10/%s";//[gameid, feed-file]
	public static final String DEFAULT_CACHE_DIR = System.getProperty("java.io.tmpdir") + File.separator + "cursefeed";
	
	private static final CacheConfig cacheConfig = CacheConfig.custom()
			                          .setMaxCacheEntries(1000)
			                          .setMaxObjectSize(8 * 1024 * 1024)
			                          .build();
	private static final RequestConfig requestConfig = RequestConfig.custom()
			                              .setConnectTimeout(30000)
			                              .setSocketTimeout(30000)
			                              .build();
	
	private final String usedFeedTemplate;
	private final File usedCacheDir;
	private final TypeAdapter<AddOn> addOnTypeAdapter;
	private long completeTimeStamp = -1;
	private long hourlyTimeStamp = -1;
	private final int gameId;
	private Int2ObjectMap<AddOn> addOns = new Int2ObjectOpenHashMap<>(15000);//actual expected is 20000
	private MultiSet<AddOnAuthor, AddOn> authors = new MultiSet<>();
	private MultiSet<Integer, AddOn> addonsByCategorySection = new MultiSet<>();
	
	private final CloseableHttpClient httpclient;
	
	/**
	 * Create a downloaded with customised options
	 *
	 * @param curseGame - gameid to query the feed for, default is {@link CurseGame#MINECRAFT}
	 * @param feedTemplate - URL template for the remote server, in case you want to cache it or it changes.
	 *                     Must contain %d for the game id, and %s for the filename. Default {@link ProjectFeedDownloader#FEED_TEMPLATE}
	 * @param cacheDir - directory to store the HTTP cache in. Default is TEMP/cursefeed {@link ProjectFeedDownloader#DEFAULT_CACHE_DIR}
	 * @throws IOException if the cache dir cannot be created
	 */
	public ProjectFeedDownloader(CurseGame curseGame, String feedTemplate, File cacheDir) throws IOException {
		this.usedCacheDir = cacheDir;
		this.usedFeedTemplate = feedTemplate;
		this.gameId = curseGame.id;
		
		if (!cacheDir.exists() && !cacheDir.mkdirs()){
			throw new IOException("Cache dir could not be created or does not already exist");
		}

		PersistentHttpCacheStorage storage = new PersistentHttpCacheStorage(cacheConfig, cacheDir);
		//add the max-age headers so the cache can actually be uses, otherwise the http cache re-requests instead of doing a conditional
		storage.addMaxAgeFallback(getUrl("complete.json.bz2"), 23 * 60 * 60);//23 hours
		storage.addMaxAgeFallback(getUrl("complete.json.bz2.txt"), 23 * 60 * 60);//23 hours
		storage.addMaxAgeFallback(getUrl("hourly.json.bz2"),  60 * 60);//1 hours
		storage.addMaxAgeFallback(getUrl("hourly.json.bz2.txt"),  60 * 60);//1 hours

		Runtime.getRuntime().addShutdownHook(new Thread(storage::close));

		httpclient = CachingHttpClients.custom().setCacheConfig(cacheConfig).setCacheDir(usedCacheDir).setHttpCacheStorage(storage).setDefaultRequestConfig(requestConfig).build();
		addOnTypeAdapter = ProjectFeed.GSON.getAdapter(AddOn.class);
	}

	/**
	 * Create a downloader with default options, configured for Minecraft
	 *
	 * @throws IOException if the TEMP/cursefeed directory cannot be created.
	 */
	public ProjectFeedDownloader() throws IOException {
		this(CurseGame.MINECRAFT, FEED_TEMPLATE, new File(DEFAULT_CACHE_DIR));
	}
	
	private InputStream downloadToCache(String url) throws IOException {
		HttpGet req = new HttpGet(url);
		HttpCacheContext context = HttpCacheContext.create();
		CloseableHttpResponse response = httpclient.execute(req, context);
		int code = response.getStatusLine().getStatusCode();
		if (context.getCacheResponseStatus() != CacheResponseStatus.CACHE_MISS && code != org.apache.http.HttpStatus.SC_OK && code != org.apache.http.HttpStatus.SC_NOT_MODIFIED){
			EntityUtils.consume(response.getEntity());
			throw new IOException("HTTP code not ok, "+code);
		}
		
		return response.getEntity().getContent();
	}
	
	private long getTimestamp(String timestampURL) throws IOException {
		InputStream content = downloadToCache(getUrl(timestampURL));
		BufferedReader reader = new BufferedReader(new InputStreamReader(content, "utf-8"));
		long stamp = Long.parseLong(reader.readLine());
		reader.close();
		return stamp;
	}

	private String getUrl(String filename){
		return String.format(usedFeedTemplate, gameId, filename);
	}

	/**
	 * Downloads/updates the data from the upstream server.
	 *
	 * @throws IOException on HTTP errors
	 */
	public void sync() throws IOException {
		System.out.println("Start sync");
		long txtCompleteStamp = getTimestamp("complete.json.bz2.txt");
		if (completeTimeStamp == -1 || completeTimeStamp != txtCompleteStamp){
			InputStream completeFeed = new BZip2CompressorInputStream(downloadToCache(getUrl("complete.json.bz2")));
			ProjectFeed feed = ProjectFeed.GSON.fromJson(new InputStreamReader(completeFeed), ProjectFeed.class);
			if (feed.getTimestamp() != completeTimeStamp){//no point replacing if the json says its the same
				this.addOns.clear();
				this.authors.clear();
				this.addonsByCategorySection.clear();
				feed.getAddons().forEach(this::insertAddonEntry);
			}
			completeTimeStamp = txtCompleteStamp;
			completeFeed.close();
		}
		System.out.println("Start hourly sync");
		long txtHourlyStamp = getTimestamp("hourly.json.bz2.txt");
		if (hourlyTimeStamp == -1 || (hourlyTimeStamp != txtHourlyStamp && txtHourlyStamp > txtCompleteStamp)){
			InputStream hourlyFeed = new BZip2CompressorInputStream(downloadToCache(getUrl("hourly.json.bz2")));
			ProjectFeed feed = ProjectFeed.GSON.fromJson(new InputStreamReader(hourlyFeed), ProjectFeed.class);
			if (feed.getTimestamp() != hourlyTimeStamp) {//no point replacing if the json says its the same
				feed.getAddons().forEach(this::insertAddonEntry);
			}
			hourlyTimeStamp = txtHourlyStamp;
			hourlyFeed.close();
		}
		System.out.println("end sync");
	}

	/**
	 * @return a map of all found addons, mapped by their ID
	 */
	public Int2ObjectMap<AddOn> getAddOns() {
		return addOns;
	}

	/**
	 * Retrieve an addon by ID
	 *
	 * @param id the id you're after
	 * @return an Optional of the addon
	 */
	public Optional<AddOn> getAddonById(int id){
		return Optional.ofNullable(addOns.get(id));
	}

	/**
	 * Save the downloaded data to a JSON cache file.
	 *
	 * @param destination where the file goes
	 * @throws IOException on IO errors passed up from the writers/streams
	 */
	public void save(File destination) throws IOException {
		JsonWriter writer = new JsonWriter(new OutputStreamWriter(new FileOutputStream(destination), "utf-8"));
		writer.beginObject();

		writer.name("completeTimestamp");
		writer.value(this.completeTimeStamp);

		writer.name("hourlyTimestamp");
		writer.value(this.hourlyTimeStamp);

		writer.name("addons");
		writer.beginArray();
		addOns.values().forEach(a->{
			try {
				addOnTypeAdapter.write(writer, a);
			} catch (IOException e){
				throw new RuntimeException(e);
			}
		});
		writer.endArray();

		writer.endObject();
		writer.close();
	}

	/**
	 * loads from a saved state.
	 *
	 * @param source file to load from
	 * @return true if the file was loaded and parsed (whether or not any entries were loaded), false if any error occurred.
	 */
	public boolean load(File source) {
		if (!source.exists())
			return false;

		try {
			JsonReader reader = new JsonReader(new InputStreamReader(new FileInputStream(source), "utf-8"));
			reader.beginObject();

			while (reader.hasNext()) {
				switch (reader.nextName()) {
					case "completeTimestamp":
						this.completeTimeStamp = reader.nextLong();
						break;
					case "hourlyTimestamp":
						this.hourlyTimeStamp = reader.nextLong();
						break;
					case "addons":
						reader.beginArray();
						while (reader.hasNext()) {
							this.insertAddonEntry(addOnTypeAdapter.read(reader));
						}
						reader.endArray();
						break;
				}
			}

			reader.endObject();
		} catch (IOException e){
			return false;
		}

		return true;
	}

	/**
	 * Loads from a custom loader, e.g. database, etc
	 *
	 * @param loader where to query for the data
	 */
	public void loadCustom(ProjectFeedLoader loader){
		this.completeTimeStamp = loader.getTimestampComplete();
		this.hourlyTimeStamp = loader.getTimestampHourly();
		this.addOns.clear();
		loader.getAddOns().forEach(this::insertAddonEntry);
	}

	/**
	 * Saves to a custom loader, e.g. database
	 *
	 * @param saver where to send the data.
	 */
	public void saveCustom(ProjectFeedSaver saver){
		saver.save(this.completeTimeStamp, this.hourlyTimeStamp, this.addOns.values());
	}
	
	private void insertAddonEntry(AddOn addon){
		addOns.put(addon.getId(), addon);
		this.addonsByCategorySection.putValue(addon.getCategorySection().getID(), addon);
		for (AddOnAuthor author : addon.getAuthors()){
			this.authors.putValue(author, addon);
		}
	}
	
	public Set<AddOnAuthor> getAuthors() {
		return this.authors.keySet();
	}
	
	public AddOnAuthor getAuthor(String name){
		return this.authors.keySet().stream().filter(addOnAuthor -> name.equals(addOnAuthor.getName())).findFirst().orElse(null);
	}
	
	public Set<AddOn> getAddonsForAuthor(AddOnAuthor author){
		return this.authors.get(author);
	}
	
	public Set<AddOn> getAddonsForAuthor(String authorName){
		return this.authors.keySet().stream().filter(addOnAuthor -> authorName.equals(addOnAuthor.getName())).findFirst().map(this.authors::get).orElse(null);
	}
	
	public Set<AddOn> getAddonsByCategorySection(int section){
		return this.addonsByCategorySection.get(section);
	}
	
	public Set<AddOn> getMods(){
		return getAddonsByCategorySection(CategorySection.MINECRAFT_MODS);
	}
	
	public Set<AddOn> getModPacks(){
		return getAddonsByCategorySection(CategorySection.MINECRAFT_MODPACKS);
	}
	
	/**
	 * Find an addon by its website slug.
	 *
	 * For the URLS
	 * https://minecraft.curseforge.com/projects/immersive-engineering
	 * https://www.curseforge.com/minecraft/mc-mods/immersive-engineering
	 *
	 * the slug is "immersive-engineering"
	 *
	 * @param slug the addon's slug
	 * @return optional addon if found
	 */
	public Optional<AddOn> findAddonBySlug(String slug){
		return this.addOns.values().stream().filter(a-> Objects.equals(a.getAddonSlug(), slug)).findFirst();
	}
}
