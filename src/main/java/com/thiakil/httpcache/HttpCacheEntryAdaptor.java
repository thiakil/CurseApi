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

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.apache.http.Header;
import org.apache.http.StatusLine;
import org.apache.http.client.cache.HttpCacheEntry;
import org.apache.http.client.cache.Resource;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Thiakil on 23/02/2018.
 */
public class HttpCacheEntryAdaptor extends TypeAdapter<HttpCacheEntry> {

	private static final TypeToken<Map<String,String>> MAP_STRING_STRING = new TypeToken<Map<String,String>>(){};

	private final TypeAdapter<Date> dateTypeAdapter;
	private final TypeAdapter<StatusLine> lineTypeAdapter;
	private final TypeAdapter<Header[]> headerArrayAdapter;
	private final TypeAdapter<Resource> resourceTypeAdapter;
	private final TypeAdapter<Map<String, String>> stringMapAdapter;

	public HttpCacheEntryAdaptor(Gson g){
		dateTypeAdapter = g.getAdapter(Date.class);
		lineTypeAdapter = g.getAdapter(StatusLine.class);
		headerArrayAdapter = g.getAdapter(Header[].class);
		resourceTypeAdapter = g.getAdapter(Resource.class).nullSafe();
		stringMapAdapter = g.getAdapter(MAP_STRING_STRING);
	}

	@Override
	public void write(JsonWriter out, HttpCacheEntry value) throws IOException {
		out.beginObject();

		out.name("requestDate");
		dateTypeAdapter.write(out, value.getRequestDate());

		out.name("responseDate");
		dateTypeAdapter.write(out, value.getResponseDate());

		out.name("statusLine");
		lineTypeAdapter.write(out, value.getStatusLine());

		out.name("responseHeaders");
		headerArrayAdapter.write(out, value.getAllHeaders());

		out.name("resource");
		resourceTypeAdapter.write(out, value.getResource());

		out.name("variantMap");
		stringMapAdapter.write(out, value.getVariantMap());

		out.endObject();
	}

	@Override
	public HttpCacheEntry read(JsonReader in) throws IOException {

		in.beginObject();

		Date requestDate = new Date(0), responseDate = new Date(0);
		StatusLine statusLine = null;
		Header[] responseHeaders = new Header[0];
		Resource resource = null;
		Map<String,String> variantMap = new HashMap<>();

		while (in.hasNext()) {
			switch (in.nextName()) {

				case "requestDate":
					requestDate = dateTypeAdapter.read(in);
					break;

				case "responseDate":
					responseDate = dateTypeAdapter.read(in);
					break;

				case "statusLine":
					statusLine = lineTypeAdapter.read(in);
					break;

				case "responseHeaders":
					responseHeaders = headerArrayAdapter.read(in);
					break;

				case "resource":
					resource = resourceTypeAdapter.read(in);
					break;

				case "variantMap":
					variantMap = stringMapAdapter.read(in);
					break;
			}
		}

		in.endObject();

		return new HttpCacheEntry(requestDate,responseDate,statusLine,responseHeaders,resource,variantMap);
	}

	public static class Factory implements TypeAdapterFactory {
		@Override
		public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
			return type.getRawType() == HttpCacheEntry.class ? (TypeAdapter<T>)new HttpCacheEntryAdaptor(gson) : null;
		}
	}
}
