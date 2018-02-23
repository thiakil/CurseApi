package com.thiakil.curseapi.json;

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

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ProjectFeedDownloader {
	public static final String FEED_TEMPLATE = "http://clientupdate-v6.cursecdn.com/feed/addons/%s/v10/%s";//[gameid, feed-file]
	public static final String DEFAULT_CACHE_DIR = System.getProperty("java.io.tmpdir") + File.pathSeparator + "cursefeed";
	
	private static final CacheConfig cacheConfig = CacheConfig.custom()
			                          .setMaxCacheEntries(1000)
			                          .setMaxObjectSize(8192)
			                          .build();
	private static final RequestConfig requestConfig = RequestConfig.custom()
			                              .setConnectTimeout(30000)
			                              .setSocketTimeout(30000)
			                              .build();
	
	private final String usedFeedTemplate;
	private final File usedCacheDir;
	private long completeTimeStamp = -1;
	private long hourlyTimeStamp = -1;
	
	private final CloseableHttpClient httpclient;
	
	public ProjectFeedDownloader(String feedTemplate, File cacheDir) throws IOException {
		this.usedCacheDir = cacheDir;
		this.usedFeedTemplate = feedTemplate;
		
		if (!cacheDir.mkdirs() || !cacheDir.exists()){
			throw new IOException("Cache dir could not be created or does not already exist");
		}
		
		httpclient = CachingHttpClients.custom().setCacheConfig(cacheConfig).setCacheDir(cacheDir).setDefaultRequestConfig(requestConfig).build();
	}
	
	public ProjectFeedDownloader() throws IOException {
		this(FEED_TEMPLATE, new File(DEFAULT_CACHE_DIR));
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
	
	private boolean needUpdateByTimestamp(long lastTimestamp, String timestampURL) throws IOException {
		if (lastTimestamp == -1)//dont bother getting the timestamp txt if we havent updated yet
			return true;
		
	}
	
	public void sync() throws IOException {
	
	}
}
