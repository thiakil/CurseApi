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
package com.thiakil.httpcache;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.StatusLine;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.cache.*;
import org.apache.http.impl.client.cache.CacheConfig;
import org.apache.http.impl.client.cache.FileResource;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.Args;

import java.io.*;
import java.lang.ref.ReferenceQueue;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * <p>
 * {@link HttpCacheStorage} implementation capable of deallocating resources associated with
 * the cache entries.
 * <p>
 * This cache keeps track of cache entries using
 * {@link java.lang.ref.PhantomReference} and maintains a collection of all resources that
 * are no longer in use. The cache, however, does not automatically deallocates associated
 * resources by invoking {@link Resource#dispose()} method.
 * </p>
 * <p>
 * This {@link HttpCacheStorage} implementation is intended for use with {@link FileResource}
 * and similar.
 * </p>
 * <p>
 * Compatibility note. Prior to version 4.4 this storage implementation used to dispose of
 * all resource entries upon {@link #close()}. As of version 4.4 the {@link #close()} method
 * disposes only of those resources that have been explicitly removed from the cache with
 * {@link #removeEntry(String)} method.
 * </p>
 *
 */
@Contract(threading = ThreadingBehavior.SAFE)
public class PersistentHttpCacheStorage implements HttpCacheStorage, Closeable {

    private static TypeToken<Map<String, HttpCacheEntry>> CACHE_ENTRY_MAP_TOKEN = new TypeToken<Map<String, HttpCacheEntry>>(){};

    private static final Gson GSON = new GsonBuilder()
            .registerTypeAdapterFactory(new HttpCacheEntryAdaptor.Factory())
            .registerTypeAdapter(Header.class, new HeaderAdaptor())
            .registerTypeAdapter(Resource.class, new ResourceAdaptor())
            .registerTypeAdapter(StatusLine.class, new StatusLineAdaptor())
            .create();

    private final CacheMap entries;
    private final ReferenceQueue<HttpCacheEntry> morque;
    private final Set<ResourceReference> resources;
    private final AtomicBoolean active;
    private final File cacheFile;

    private final Map<URL, Long> maxAgeFallbacks = new HashMap<>();

    private boolean initDone;

    public PersistentHttpCacheStorage(final CacheConfig config, File cacheDir) {
        super();
        this.entries = new CacheMap(config.getMaxCacheEntries());
        this.morque = new ReferenceQueue<>();
        this.resources = new HashSet<>();
        this.active = new AtomicBoolean(true);
        this.cacheFile = new File(cacheDir, "cacheEntries.json");
        this.initDone = false;
        loadEntries();
        this.initDone = true;
    }

    private void ensureValidState() throws IllegalStateException {
        if (!this.active.get()) {
            throw new IllegalStateException("Cache has been shut down");
        }
    }

    private void loadEntries() {
        if (this.cacheFile.exists()){
            try(Reader reader = new FileReader(this.cacheFile)) {
                Map<String, HttpCacheEntry> entryMap = GSON.fromJson(reader, CACHE_ENTRY_MAP_TOKEN.getType());
                for (Map.Entry<String,HttpCacheEntry> e : entryMap.entrySet()){
                    putEntry(e.getKey(), e.getValue());
                }
            } catch (IOException|JsonIOException e){
                //oh well
                System.out.println("Load failed, "+e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private void saveEntries() {
        if (!this.cacheFile.getParentFile().exists() && !this.cacheFile.getParentFile().mkdirs()){
            return;
        }
        try (JsonWriter w = new JsonWriter(new OutputStreamWriter(new FileOutputStream(this.cacheFile), "utf-8"))){
            GSON.toJson(this.entries, CACHE_ENTRY_MAP_TOKEN.getType(), w);
        } catch (IOException|JsonIOException e){
            this.cacheFile.delete();
        }
    }

    private void keepResourceReference(final HttpCacheEntry entry) {
        final Resource resource = entry.getResource();
        if (resource != null) {
            // Must deallocate the resource when the entry is no longer in used
            final ResourceReference ref = new ResourceReference(entry, this.morque);
            this.resources.add(ref);
        }
    }

    @Override
    public void putEntry(final String url, HttpCacheEntry entry) throws IOException {
        Args.notNull(url, "URL");
        Args.notNull(entry, "Cache entry");
        ensureValidState();
        URL urlURL;
        try {
            urlURL = new URL(url);
        } catch (MalformedURLException e){
            urlURL = null;
        }
        if (urlURL != null && getMaxAge(entry) == -1 && maxAgeFallbacks.containsKey(urlURL)){
            Header[] oldHeaders = entry.getAllHeaders();
            Header[] newHeaders = Arrays.copyOf(oldHeaders, oldHeaders.length+1);
            newHeaders[oldHeaders.length] = new BasicHeader(HeaderConstants.CACHE_CONTROL, HeaderConstants.CACHE_CONTROL_MAX_AGE+"="+maxAgeFallbacks.get(urlURL).toString());
            entry = new HttpCacheEntry(entry.getRequestDate(), entry.getResponseDate(), entry.getStatusLine(), newHeaders, entry.getResource(), entry.getVariantMap(), entry.getRequestMethod());
        }
        synchronized (this) {
            if (this.entries.containsKey(url) && this.entries.get(url) != entry){
                this.entries.get(url).getResource().dispose();//nb this forcibly disposes of the file, since they dont otherwise seem to be removed
            }
            this.entries.put(url, entry);
            keepResourceReference(entry);
            if (this.initDone){
                saveEntries();
            }
        }
    }

    @Override
    public HttpCacheEntry getEntry(final String url) throws IOException {
        Args.notNull(url, "URL");
        ensureValidState();
        synchronized (this) {
            return this.entries.get(url);
        }
    }

    @Override
    public void removeEntry(final String url) throws IOException {
        Args.notNull(url, "URL");
        ensureValidState();
        synchronized (this) {
            // Cannot deallocate the associated resources immediately as the
            // cache entry may still be in use
            this.entries.remove(url);
        }
    }

    @Override
    public void updateEntry(
            final String url,
            final HttpCacheUpdateCallback callback) throws IOException {
        Args.notNull(url, "URL");
        Args.notNull(callback, "Callback");
        ensureValidState();
        synchronized (this) {
            final HttpCacheEntry existing = this.entries.get(url);
            final HttpCacheEntry updated = callback.update(existing);
            this.entries.put(url, updated);
            if (existing != updated) {
                keepResourceReference(updated);
            }
        }
    }

    @Override
    public void close() {
        if (this.active.compareAndSet(true, false)) {
            synchronized (this) {
                ResourceReference ref;
                while ((ref = (ResourceReference) this.morque.poll()) != null) {
                    this.resources.remove(ref);
                    ref.getResource().dispose();
                }
            }
        }
    }

    public void addMaxAgeFallback(String url, long maxAge){
        try {
            maxAgeFallbacks.put(new URL(url), maxAge);
        } catch (MalformedURLException e){
            throw new IllegalArgumentException("url", e);
        }
    }

    protected long getMaxAge(final HttpCacheEntry entry) {
        long maxage = -1;
        for (final Header hdr : entry.getHeaders(HeaderConstants.CACHE_CONTROL)) {
            for (final HeaderElement elt : hdr.getElements()) {
                if (HeaderConstants.CACHE_CONTROL_MAX_AGE.equals(elt.getName())
                        || "s-maxage".equals(elt.getName())) {
                    try {
                        final long currMaxAge = Long.parseLong(elt.getValue());
                        if (maxage == -1 || currMaxAge < maxage) {
                            maxage = currMaxAge;
                        }
                    } catch (final NumberFormatException nfe) {
                        // be conservative if can't parse
                        maxage = 0;
                    }
                }
            }
        }
        return maxage;
    }

}
