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

import addons.curse.AddOnAuthor;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class AddOnAuthorAdaptor extends TypeAdapter<AddOnAuthor> {
	public static AddOnAuthorAdaptor INSTANCE = new AddOnAuthorAdaptor();
	
	@Override
	public void write(JsonWriter out, AddOnAuthor value) throws IOException {
		out.beginObject();
		out.name("Name");
		out.value(value.getName());

		out.name("Url");
		out.value(value.getUrl());

		out.endObject();
	}
	
	@Override
	public AddOnAuthor read(JsonReader in) throws IOException {
		AddOnAuthor out = new AddOnAuthor();
		
		in.beginObject();
		while (in.hasNext()){
			String prop = in.nextName();
			switch (prop) {
				case "Name":
					out.setName(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				case "Url":
					out.setUrl(ProjectFeedAdaptor.readStringOrNull(in));
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
