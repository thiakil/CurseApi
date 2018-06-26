package com.thiakil.curseapi.json;

import addons.curse.*;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.thiakil.curseapi.json.adaptors.CalendarAdaptor;
import com.thiakil.curseapi.login.CurseAuthException;
import com.thiakil.curseapi.login.CurseToken;
import com.thiakil.curseapi.login.JsonEntity;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.*;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Thiakil on 24/06/2018.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class AddonServiceJson {
	private static final String baseURL = "https://addons-v2.forgesvc.net/";
	private static final CloseableHttpClient httpclient = HttpClients.createDefault();
	private static final Gson GSON = new Gson();

	private CurseToken authToken;

	public AddonServiceJson(CurseToken token){
		this.authToken = token;
	}

	private static void handleHttpErrorWithException(CloseableHttpResponse response) throws IOException, CurseAuthException {
		String errMsg = "";
		if (response.getEntity() != null && response.getEntity().getContentLength() > 0){
			Reader r = new InputStreamReader(response.getEntity().getContent(), "utf-8");
			char[] buf = new char[(int)response.getEntity().getContentLength()];
			r.read(buf);
			errMsg = "\n"+new String(buf);
		}
		throw new CurseAuthException("HTTP response code "+response.getStatusLine().getStatusCode()+errMsg);
	}

	private <T> T processResponse(InputStreamConsumer<T> responseProcessor, HttpRequestBase request) throws CurseAuthException {
		try {
			CloseableHttpResponse response = httpclient.execute(request);
			if (response.getStatusLine().getStatusCode() != 200){
				handleHttpErrorWithException(response);
			}
			if (response.getEntity() == null){
				throw new CurseAuthException("HTTP response body empty");
			}
			HttpEntity entity = response.getEntity();
			T result = responseProcessor.apply(entity.getContent());
			entity.getContent().close();
			return result;
		} catch (IOException |JsonParseException e){
			throw new CurseAuthException(e);
		}
	}

	private <T> T get(InputStreamConsumer<T> responseProcessor, String path) throws CurseAuthException {
		HttpGet request = new HttpGet(baseURL+path);
		request.addHeader("AuthenticationToken", authToken.token);
		return processResponse(responseProcessor, request);
	}

	private <T> T post(InputStreamConsumer<T> responseProcessor, String path, Object body) throws CurseAuthException {
		HttpPost request = new HttpPost(baseURL+path);
		request.addHeader("AuthenticationToken", authToken.token);
		request.setEntity(new JsonEntity(GSON.toJsonTree(body)));
		return processResponse(responseProcessor, request);
	}


	private <T> T getJson(Class<T> jsonDecodeClass, String path) throws CurseAuthException {
		return get(in->GSON.fromJson(new InputStreamReader(in, "utf8"), jsonDecodeClass), path);
	}

	private Calendar getCalendar(String path) throws CurseAuthException {
		return get(in-> CalendarAdaptor.INSTANCE.read(new JsonReader(new InputStreamReader(in, "utf8"))), path);
	}

	private <T> List<T> getList(TypeToken<List<T>> jsonDecodeClass, String path) throws CurseAuthException {
		return get(in->GSON.fromJson(new InputStreamReader(in, "utf8"), jsonDecodeClass.getType()), path);
	}

	public String getString(String path) throws CurseAuthException {
		return get(in->{
			BufferedReader reader = new BufferedReader(new InputStreamReader(in, "utf8"));
			return reader.lines().collect(Collectors.joining("\n"));
		}, path);
	}

	private <T> T postJson(Class<T> jsonDecodeClass, String path, Object body) throws CurseAuthException {
		return post(in->GSON.fromJson(new InputStreamReader(in, "utf8"), jsonDecodeClass), path, body);
	}

	private <T> T postJson(TypeToken<T> jsonDecodeClass, String path, Object body) throws CurseAuthException {
		return post(in->GSON.fromJson(new InputStreamReader(in, "utf8"), jsonDecodeClass.getType()), path, body);
	}

	private <T> List<T> postList(TypeToken<T> jsonDecodeClass, String path, Object body) throws CurseAuthException {
		return post(in->GSON.fromJson(new InputStreamReader(in, "utf8"), jsonDecodeClass.getType()), path, body);
	}

	public Addon getAddon(int addonId) throws CurseAuthException
	{
		return this.getJson(Addon.class, String.format("api/addon/%d", addonId));
	}

	public List<Addon> getAddons(int[] addonIds) throws CurseAuthException
	{
		return this.postList(new TypeToken<Addon>(){}, "api/addon", addonIds);
	}

	public List<Addon> getAddonsByCriteria(int gameId)  throws CurseAuthException
	{
		return this.getAddonsByCriteria(gameId, -1, -1, AddonSortMethod.Featured, true, null, 0, 1000, null);
	}

	public List<Addon> getAddonsByCriteria(int gameId, int sectionId, int categoryId, AddonSortMethod sort, boolean isSortDescending, String gameVersion, int index, int pageSize, String searchFilter)  throws CurseAuthException
	{
		return this.getList(new TypeToken<List<Addon>>(){}, String.format("api/addon/search?gameId=%d&sectionId=%d&categoryId=%d&gameVersion=%s&index=%d&pageSize=%d&searchFilter=%s&sort=%s&sortDescending=%b", gameId, sectionId, categoryId, gameVersion, index, pageSize, searchFilter, sort.toString(), isSortDescending));
	}

	public String getAddonDescription(int addonId)  throws CurseAuthException
	{
		return this.getString(String.format("api/addon/%d/description", addonId));
	}

	public String getAddonChangelog(int addonId, int fileId) throws CurseAuthException
	{
		return this.getString(String.format("api/addon/%d/file/%d/changelog", addonId, fileId));
	}

	public AddonFile getAddonFile(int addonId, int fileId) throws CurseAuthException
	{
		return this.getJson(AddonFile.class, String.format("api/addon/%d/file/%d", addonId, fileId));
	}

	public List<AddonFile> getAddonFiles(int addonId) throws CurseAuthException
	{
		return this.getList(new TypeToken<List<AddonFile>>(){}, String.format("api/addon/%d/files", addonId));
	}

	public Map<Integer, List<AddonFile>> getAddonFiles(AddOnFileKey[] keys) throws CurseAuthException
	{
		return this.postJson(new TypeToken<Map<Integer, List<AddonFile>>>(){}, "api/addon/files", keys);
	}

	public RepositoryMatch getRepositoryMatchFromSlug(String gameSlug, String addonSlug) throws CurseAuthException
	{
		return this.getJson(RepositoryMatch.class, String.format("api/addon/slug?gameSlug=%s&addonSlug=%s", gameSlug, addonSlug));
	}

	public Map<FeaturedAddonType, List<Addon>> getFeaturedAddons(int gameId) throws CurseAuthException{
		return getFeaturedAddons(gameId, 6, 14, 14, null);
	}

	public Map<FeaturedAddonType, List<Addon>> getFeaturedAddons(int gameId, int featuredCount, int popularCount, int updatedCount, int[] addonIds) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("gameId", gameId);
		data.put("featuredCount", featuredCount);
		data.put("popularCount", popularCount);
		data.put("updatedCount", updatedCount);
		if (addonIds != null)
			data.put("excludedAddons", addonIds);
		return this.postJson(new TypeToken<Map<FeaturedAddonType, List<Addon>>>(){}, "api/addon/featured", data);
	}

	public Calendar getAddonsDatabaseTimestamp() throws CurseAuthException
	{
		return this.getCalendar("api/addon/timestamp");
	}

	public List<SyncedGameInstance> getSyncProfile() throws CurseAuthException
	{
		return this.getList(new TypeToken<List<SyncedGameInstance>>(){}, "api/addonsync");
	}

	public JoinSyncGroupStatus joinSyncGroup(int instanceId, String computerName, String instanceGuid, String instanceLabel) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("instanceId", instanceId);
		data.put("computerName", computerName);
		data.put("instanceGuid", instanceGuid);
		data.put("instanceLabel", instanceLabel);
		return this.postJson(JoinSyncGroupStatus.class, "api/addonsync/group/join", data);
	}

	public LeaveSyncGroupStatus leaveSyncGroup(int instanceId, int computerId, String instanceGuid) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("instanceId", instanceId);
		data.put("computerId", computerId);
		data.put("instanceGuid", instanceGuid);
		return this.postJson(LeaveSyncGroupStatus.class, "api/addonsync/group/leave", data);
	}

	public CreateSyncGroupResult createSyncGroup(String instanceName, int gameId, String computerName, String instanceGuid, String instanceLabel) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("instanceName", instanceName);
		data.put("gameId", gameId);
		data.put("computerName", computerName);
		data.put("instanceGuid", instanceGuid);
		data.put("instanceLabel", instanceLabel);
		return this.postJson(CreateSyncGroupResult.class, "api/addonsync/group/create", data);
	}

	public SaveSyncSnapshotStatus saveSyncSnapshot(int instanceId, SyncedAddon[] addons) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("instanceId", instanceId);
		data.put("addOns", addons);
		return this.postJson(SaveSyncSnapshotStatus.class, "api/addonsync/snapshot", data);
	}

	public SaveSyncTransactionsStatus saveSyncTransactions(int instanceId, SyncTransaction[] transactions) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("instanceId", instanceId);
		data.put("transactions", transactions);
		return this.postJson(SaveSyncTransactionsStatus.class, "api/addonsync/transactions", data);
	}

	public SaveUserBackupStatus saveUserBackup(int instanceId, long fingerprint, int screenWidth, int screenHeight, byte[] dataIn) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("instanceId", instanceId);
		data.put("fingerprint", fingerprint);
		data.put("screenWidth", screenWidth);
		data.put("screenHeight", screenHeight);
		data.put("fileBytes", dataIn);
		return this.postJson(SaveUserBackupStatus.class, "api/addonsync/backup", data);
	}

	public FingerprintMatchResult getFingerprintMatches(long[] fingerprints) throws CurseAuthException
	{
		return this.postJson(FingerprintMatchResult.class, "/api/fingerprint", fingerprints);
	}

	public List<FuzzyMatch> getFuzzyMatches(int gameId, FolderFingerprint[] fingerprints) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("gameId", gameId);
		data.put("fingerprints", fingerprints);
		return this.postList(new TypeToken<FuzzyMatch>(){}, "/api/fingerprint/fuzzy", data);
	}

	public MinecraftModLoaderVersion getModloader(String key) throws CurseAuthException
	{
		return this.getJson(MinecraftModLoaderVersion.class, String.format("/api/minecraft/modloader/%s", key));
	}

	public List<MinecraftModLoaderIndex> getModloaders() throws CurseAuthException
	{
		return this.getList(new TypeToken<List<MinecraftModLoaderIndex>>(){}, "/api/minecraft/modloader");
	}

	public List<MinecraftModLoaderIndex> getModloadersForGameVersion(String gameVersion) throws CurseAuthException
	{
		return this.getList(new TypeToken<List<MinecraftModLoaderIndex>>(){}, String.format("/api/minecraft/modloader/%s", gameVersion));
	}

	public Calendar getModloadersDatabaseTimestamp() throws CurseAuthException
	{
		return this.getCalendar("api/minecraft/modloader/timestamp");
	}

	public List<MinecraftGameVersion> getMinecraftVersions() throws CurseAuthException
	{
		return this.getList(new TypeToken<List<MinecraftGameVersion>>(){}, "/api/minecraft/version");
	}

	public List<MinecraftGameVersion> getMinecraftVersion(String gameVersion) throws CurseAuthException
	{
		return this.getList(new TypeToken<List<MinecraftGameVersion>>(){}, String.format("/api/minecraft/version/%s", gameVersion));
	}

	public Calendar getMinecraftVersionsDatabaseTimestamp() throws CurseAuthException
	{
		return this.getCalendar("api/minecraft/version/timestamp");
	}

	public Game getGame(int gameId) throws CurseAuthException
	{
		return this.getJson(Game.class, String.format("api/game/%d", gameId));
	}

	public List<Game> getGames(boolean supportsAddons) throws CurseAuthException
	{
		return this.getList(new TypeToken<List<Game>>(){}, String.format("api/game%s", supportsAddons ? "?supportsAddons=true" : ""));
	}

	public Calendar getGameDatabaseTimestamp() throws CurseAuthException
	{
		return this.getCalendar("api/game/timestamp");
	}

	public Category getCategoryByID(int categoryId) throws CurseAuthException
	{
		return this.getJson(Category.class, String.format("api/category/%d", categoryId));
	}

	public Category getCategoryBySlug(String slug) throws CurseAuthException
	{
		return this.getJson(Category.class, String.format("api/category?slug=%s", slug));
	}

	public List<Category> getCategories() throws CurseAuthException
	{
		return this.getList(new TypeToken<List<Category>>(){}, "api/category");
	}

	public Calendar getCategoryDatabaseTimestamp() throws CurseAuthException
	{
		return this.getCalendar("api/category/timestamp");
	}

	public List<Category> getCategoriesBySection(int sectionId) throws CurseAuthException
	{
		return this.getList(new TypeToken<List<Category>>(){}, String.format("api/category/section/%d", sectionId));
	}

	@FunctionalInterface
	private interface InputStreamConsumer<R> {

		/**
		 * Applies this function to the given argument.
		 *
		 * @param t the function argument
		 * @return the function result
		 */
		R apply(InputStream t) throws IOException;
	}
}
