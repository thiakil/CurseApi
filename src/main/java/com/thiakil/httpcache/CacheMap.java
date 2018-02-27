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
 */
package com.thiakil.httpcache;

import org.apache.http.client.cache.HttpCacheEntry;

import java.util.LinkedHashMap;
import java.util.Map;

final class CacheMap extends LinkedHashMap<String, HttpCacheEntry> {

    private static final long serialVersionUID = -7750025207539768511L;

    private final int maxEntries;

    CacheMap(final int maxEntries) {
        super(20, 0.75f, true);
        this.maxEntries = maxEntries;
    }

    @Override
    protected boolean removeEldestEntry(final Map.Entry<String, HttpCacheEntry> eldest) {
        return size() > this.maxEntries;
    }

}
