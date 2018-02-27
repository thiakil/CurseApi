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

package com.thiakil.curseapi.json.adaptors;

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
	public static ProjectFeedAdaptor INSTANCE = new ProjectFeedAdaptor();
	
	@Override
	public void write(JsonWriter out, ProjectFeed value) throws IOException {
		out.beginObject();
		
		out.name("timestamp");
		out.value(value.getTimestamp());
		
		out.name("data");
		writeArray(out, value.getAddons(), AddOnAdaptor.INSTANCE);
		
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
				out.setData(readListOfObjects(in, AddOnAdaptor.INSTANCE));
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
		for (T el : list){
			adaptor.write(out, el);
		}
		out.endArray();
	}
	
	static void writeStringArray(JsonWriter out, List<String> list) throws IOException {
		out.beginArray();
		for (String el : list){
			out.value(el);
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
