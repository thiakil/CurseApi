package com.thiakil.curseapi.json;

import addons.curse.AddOn;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thiakil.curseapi.json.adaptors.AddOnAdaptor;
import com.thiakil.httpcache.PersistentHttpCacheStorage;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.cache.CacheResponseStatus;
import org.apache.http.client.cache.HttpCacheContext;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.cache.CacheConfig;
import org.apache.http.impl.client.cache.CachingHttpClients;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class ProjectFeedDownloader {
	public static final String FEED_TEMPLATE = "https://clientupdate-v6.cursecdn.com/feed/addons/%d/v10/%s";//[gameid, feed-file]
	public static final String DEFAULT_CACHE_DIR = System.getProperty("java.io.tmpdir") + File.separator + "cursefeed";
	public static final int MINECRAFT_GAMEID = 432;
	
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
	private long completeTimeStamp = -1;
	private long hourlyTimeStamp = -1;
	private final int gameId;
	private Int2ObjectMap<AddOn> addOns = new Int2ObjectOpenHashMap<>(15000);//actual expected is 20000
	
	private final CloseableHttpClient httpclient;
	
	public ProjectFeedDownloader(int gameId, String feedTemplate, File cacheDir) throws IOException {
		this.usedCacheDir = cacheDir;
		this.usedFeedTemplate = feedTemplate;
		this.gameId = gameId;
		
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
	}
	
	public ProjectFeedDownloader() throws IOException {
		this(MINECRAFT_GAMEID, FEED_TEMPLATE, new File(DEFAULT_CACHE_DIR));
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
	
	public void sync() throws IOException {
		System.out.println("Start sync");
		if (completeTimeStamp == -1 || completeTimeStamp != getTimestamp("complete.json.bz2.txt")){
			InputStream completeFeed = new BZip2CompressorInputStream(downloadToCache(getUrl("complete.json.bz2")));
			ProjectFeed feed = ProjectFeed.GSON.fromJson(new InputStreamReader(completeFeed), ProjectFeed.class);
			if (feed.getTimestamp() != completeTimeStamp){//no point replacing if the json says its the same
				this.addOns.clear();
				feed.getAddons().forEach(a->addOns.put(a.getId(), a));
			}
			completeTimeStamp = feed.getTimestamp();
			completeFeed.close();
		}
		System.out.println("Start hourly sync");
		if (hourlyTimeStamp == -1 || hourlyTimeStamp != getTimestamp("hourly.json.bz2.txt")){
			InputStream hourlyFeed = new BZip2CompressorInputStream(downloadToCache(getUrl("hourly.json.bz2")));
			ProjectFeed feed = ProjectFeed.GSON.fromJson(new InputStreamReader(hourlyFeed), ProjectFeed.class);
			if (feed.getTimestamp() != hourlyTimeStamp) {//no point replacing if the json says its the same
				feed.getAddons().forEach(a->addOns.put(a.getId(), a));
			}
			hourlyTimeStamp = feed.getTimestamp();
			hourlyFeed.close();
		}
		System.out.println("end sync");
	}

	public Int2ObjectMap<AddOn> getAddOns() {
		return addOns;
	}

	public Optional<AddOn> getAddonById(int id){
		return Optional.ofNullable(addOns.get(id));
	}

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
				AddOnAdaptor.INSTANCE.write(writer, a);
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
							AddOn a = AddOnAdaptor.INSTANCE.read(reader);
							this.addOns.put(a.getId(), a);
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
}
