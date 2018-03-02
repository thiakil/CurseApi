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

package com.thiakil.curseapi.json.adaptors;

import addons.curse.AddOn;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thiakil.curseapi.json.ProjectFeed;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ProjectFeedAdaptor extends TypeAdapter<ProjectFeed> {
	
	private final TypeAdapter<AddOn> addOnTypeAdapter;
	
	public ProjectFeedAdaptor(Gson gson){
		
		addOnTypeAdapter = gson.getAdapter(AddOn.class);
	}
	
	@Override
	public void write(JsonWriter out, ProjectFeed value) throws IOException {
		out.beginObject();
		
		out.name("timestamp");
		out.value(value.getTimestamp());
		
		out.name("data");
		writeArray(out, value.getAddons(), addOnTypeAdapter);
		
		out.endObject();
	}
	
	@Override
	public ProjectFeed read(JsonReader in) throws IOException {
		ProjectFeed out = new ProjectFeed();
		
		in.beginObject();
		while (in.hasNext()){
			String prop = in.nextName();
			if (prop.equals("timestamp")){
				out.setTimestamp(in.nextLong());
			} else if (prop.equals("data")){
				out.setData(readListOfObjects(in, addOnTypeAdapter));
			} else {
				throw new JsonParseException("Unknown property '"+prop+"'");
			}
		}
		in.endObject();
		
		return out;
	}
	
	static <T> List<T> readListOfObjects(JsonReader in, TypeAdapter<T> adaptor) throws IOException{
		List<T> listOut = new LinkedList<>();
		if (in.peek() != JsonToken.NULL) {
			in.beginArray();
			while (in.hasNext()) {
				listOut.add(adaptor.read(in));
			}
			in.endArray();
		} else {
			in.nextNull();
		}
		return listOut;
	}
	
	static List<String> readListOfStrings(JsonReader in) throws IOException{
		List<String> listOut = new LinkedList<>();
		if (in.peek() != JsonToken.NULL) {
			in.beginArray();
			while (in.hasNext()) {
				listOut.add(ProjectFeedAdaptor.readStringOrNull(in));
			}
			in.endArray();
		} else {
			in.nextNull();
		}
		return listOut;
	}
	
	static <T> void writeArray(JsonWriter out, List<T> list, TypeAdapter<T> adaptor) throws IOException {
		out.beginArray();
		if (list != null) {
			for (T el : list) {
				adaptor.write(out, el);
			}
		}
		out.endArray();
	}
	
	static void writeStringArray(JsonWriter out, List<String> list) throws IOException {
		out.beginArray();
		if (list != null) {
			for (String el : list) {
				out.value(el);
			}
		}
		out.endArray();
	}
	
	static String readStringOrNull(JsonReader in) throws IOException {
		if (in.peek() == JsonToken.NULL){
			in.nextNull();
			return "";
		}
		return in.nextString();
	}
}
