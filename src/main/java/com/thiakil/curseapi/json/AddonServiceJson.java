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
import org.datacontract.schemas._2004._07.curse_addons.FolderFingerprint;
import org.datacontract.schemas._2004._07.curse_addons.RepositoryMatch;
import org.datacontract.schemas._2004._07.curse_addonservice_requests.AddOnFileKey;
import org.datacontract.schemas._2004._07.curse_clientservice_models.SyncTransaction;
import org.datacontract.schemas._2004._07.curse_clientservice_models.SyncedAddon;
import org.datacontract.schemas._2004._07.curse_clientservice_models.SyncedGameInstance;

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
	private static final Gson GSON = ProjectFeed.GSON;

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

	private <T> List<T> getList(TypeToken<T> jsonDecodeClass, String path) throws CurseAuthException {
		return get(in->GSON.fromJson(new InputStreamReader(in, "utf8"), jsonDecodeClass.getType()), path);
	}

	private String getString(String path) throws CurseAuthException {
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

	public AddOn GetAddOn(int addonId) throws CurseAuthException
	{
		return this.getJson(AddOn.class, String.format("api/addon/%d", addonId));
	}

	public List<AddOn> GetAddOns(int[] addonIds) throws CurseAuthException
	{
		return this.postList(new TypeToken<AddOn>(){}, "api/addon", addonIds);
	}

	public List<AddOn> GetAddOnsByCriteria(int gameId)  throws CurseAuthException
	{
		return this.GetAddOnsByCriteria(gameId, -1, -1, AddonSortMethod.Featured, true, null, 0, 1000, null);
	}

	public List<AddOn> GetAddOnsByCriteria(int gameId, int sectionId, int categoryId, AddonSortMethod sort, boolean isSortDescending, String gameVersion, int index, int pageSize, String searchFilter)  throws CurseAuthException
	{
		return this.getList(new TypeToken<AddOn>(){}, String.format("api/addon/search?gameId=%d&sectionId=%d&categoryId=%d&gameVersion=%s&index=%d&pageSize=%d&searchFilter=%s&sort=%s&sortDescending=%b", gameId, sectionId, categoryId, gameVersion, index, pageSize, searchFilter, sort.toString(), isSortDescending));
	}

	public String GetAddOnDescription(int addonId)  throws CurseAuthException
	{
		return this.getString(String.format("api/addon/%d/description", addonId));
	}

	public String GetAddOnChangelog(int addonId, int fileId) throws CurseAuthException
	{
		return this.getString(String.format("api/addon/%d/file/%d/changelog", addonId, fileId));
	}

	public AddOnFile GetAddOnFile(int addonId, int fileId) throws CurseAuthException
	{
		return this.getJson(AddOnFile.class, String.format("api/addon/%d/file/%d", addonId, fileId));
	}

	public List<AddOnFile> GetAddOnFiles(int addonId) throws CurseAuthException
	{
		return this.getList(new TypeToken<AddOnFile>(){}, String.format("api/addon/%d/files", addonId));
	}

	public Map<Integer, List<AddOnFile>> GetAddOnFiles(AddOnFileKey[] keys) throws CurseAuthException
	{
		return this.postJson(new TypeToken<Map<Integer, List<AddOnFile>>>(){}, "api/addon/files", keys);
	}

	public RepositoryMatch GetRepositoryMatchFromSlug(String gameSlug, String addonSlug) throws CurseAuthException
	{
		return this.getJson(RepositoryMatch.class, String.format("api/addon/slug?gameSlug=%s&addonSlug=%s", gameSlug, addonSlug));
	}

	public Map<FeaturedAddonType, List<AddOn>> GetFeaturedAddOns(int gameId) throws CurseAuthException{
		return GetFeaturedAddOns(gameId, 6, 14, 14, null);
	}

	public Map<FeaturedAddonType, List<AddOn>> GetFeaturedAddOns(int gameId, int featuredCount, int popularCount, int updatedCount, int[] addonIds) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("gameId", gameId);
		data.put("featuredCount", featuredCount);
		data.put("popularCount", popularCount);
		data.put("updatedCount", updatedCount);
		if (addonIds != null)
			data.put("excludedAddOns", addonIds);
		return this.postJson(new TypeToken<Map<FeaturedAddonType, List<AddOn>>>(){}, "api/addon/featured", data);
	}

	public Calendar GetAddOnsDatabaseTimestamp() throws CurseAuthException
	{
		return this.getCalendar("api/addon/timestamp");
	}

	public List<SyncedGameInstance> GetSyncProfile() throws CurseAuthException
	{
		return this.getList(new TypeToken<SyncedGameInstance>(){}, "api/addonsync");
	}

	public JoinSyncGroupStatus JoinSyncGroup(int instanceId, String computerName, String instanceGuid, String instanceLabel) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("instanceId", instanceId);
		data.put("computerName", computerName);
		data.put("instanceGuid", instanceGuid);
		data.put("instanceLabel", instanceLabel);
		return this.postJson(JoinSyncGroupStatus.class, "api/addonsync/group/join", data);
	}

	public LeaveSyncGroupStatus LeaveSyncGroup(int instanceId, int computerId, String instanceGuid) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("instanceId", instanceId);
		data.put("computerId", computerId);
		data.put("instanceGuid", instanceGuid);
		return this.postJson(LeaveSyncGroupStatus.class, "api/addonsync/group/leave", data);
	}

	public CreateSyncGroupResult CreateSyncGroup(String instanceName, int gameId, String computerName, String instanceGuid, String instanceLabel) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("instanceName", instanceName);
		data.put("gameId", gameId);
		data.put("computerName", computerName);
		data.put("instanceGuid", instanceGuid);
		data.put("instanceLabel", instanceLabel);
		return this.postJson(CreateSyncGroupResult.class, "api/addonsync/group/create", data);
	}

	public SaveSyncSnapshotStatus SaveSyncSnapshot(int instanceId, SyncedAddon[] addons) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("instanceId", instanceId);
		data.put("addOns", addons);
		return this.postJson(SaveSyncSnapshotStatus.class, "api/addonsync/snapshot", data);
	}

	public SaveSyncTransactionsStatus SaveSyncTransactions(int instanceId, SyncTransaction[] transactions) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("instanceId", instanceId);
		data.put("transactions", transactions);
		return this.postJson(SaveSyncTransactionsStatus.class, "api/addonsync/transactions", data);
	}

	public SaveUserBackupStatus SaveUserBackup(int instanceId, long fingerprint, int screenWidth, int screenHeight, byte[] dataIn) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("instanceId", instanceId);
		data.put("fingerprint", fingerprint);
		data.put("screenWidth", screenWidth);
		data.put("screenHeight", screenHeight);
		data.put("fileBytes", dataIn);
		return this.postJson(SaveUserBackupStatus.class, "api/addonsync/backup", data);
	}

	public FingerprintMatchResult GetFingerprintMatches(long[] fingerprints) throws CurseAuthException
	{
		return this.postJson(FingerprintMatchResult.class, "/api/fingerprint", fingerprints);
	}

	public List<FuzzyMatch> GetFuzzyMatches(int gameId, FolderFingerprint[] fingerprints) throws CurseAuthException
	{
		Map<String, Object> data = new HashMap<>();
		data.put("gameId", gameId);
		data.put("fingerprints", fingerprints);
		return this.postList(new TypeToken<FuzzyMatch>(){}, "/api/fingerprint/fuzzy", data);
	}

	public MinecraftModLoaderVersion GetModloader(String key) throws CurseAuthException
	{
		return this.getJson(MinecraftModLoaderVersion.class, String.format("/api/minecraft/modloader/%s", key));
	}

	public List<MinecraftModLoaderIndex> GetModloaders() throws CurseAuthException
	{
		return this.getList(new TypeToken<MinecraftModLoaderIndex>(){}, "/api/minecraft/modloader");
	}

	public List<MinecraftModLoaderIndex> GetModloadersForGameVersion(String gameVersion) throws CurseAuthException
	{
		return this.getList(new TypeToken<MinecraftModLoaderIndex>(){}, String.format("/api/minecraft/modloader/%s", gameVersion));
	}

	public Calendar GetModloadersDatabaseTimestamp() throws CurseAuthException
	{
		return this.getCalendar("api/minecraft/modloader/timestamp");
	}

	public List<MinecraftGameVersion> GetMinecraftVersions() throws CurseAuthException
	{
		return this.getList(new TypeToken<MinecraftGameVersion>(){}, "/api/minecraft/version");
	}

	public List<MinecraftGameVersion> GetMinecraftVersion(String gameVersion) throws CurseAuthException
	{
		return this.getList(new TypeToken<MinecraftGameVersion>(){}, String.format("/api/minecraft/version/%s", gameVersion));
	}

	public Calendar GetMinecraftVersionsDatabaseTimestamp() throws CurseAuthException
	{
		return this.getCalendar("api/minecraft/version/timestamp");
	}

	public Game GetGame(int gameId) throws CurseAuthException
	{
		return this.getJson(Game.class, String.format("api/game/%d", gameId));
	}

	public List<Game> GetGames(boolean supportsAddOns) throws CurseAuthException
	{
		return this.getList(new TypeToken<Game>(){}, String.format("api/game%s", supportsAddOns ? "?supportsAddOns=true" : ""));
	}

	public Calendar GetGameDatabaseTimestamp() throws CurseAuthException
	{
		return this.getCalendar("api/game/timestamp");
	}

	public AddonServiceCategory GetCategoryByID(int categoryId) throws CurseAuthException
	{
		return this.getJson(AddonServiceCategory.class, String.format("api/category/%d", categoryId));
	}

	public AddonServiceCategory GetCategoryBySlug(String slug) throws CurseAuthException
	{
		return this.getJson(AddonServiceCategory.class, String.format("api/category?slug=%s", slug));
	}

	public List<AddonServiceCategory> GetCategories() throws CurseAuthException
	{
		return this.getList(new TypeToken<AddonServiceCategory>(){}, "api/category");
	}

	public Calendar GetCategoryDatabaseTimestamp() throws CurseAuthException
	{
		return this.getCalendar("api/category/timestamp");
	}

	public List<AddonServiceCategory> GetCategoriesBySection(int sectionId) throws CurseAuthException
	{
		return this.getList(new TypeToken<AddonServiceCategory>(){}, String.format("api/category/section/%d", sectionId));
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
