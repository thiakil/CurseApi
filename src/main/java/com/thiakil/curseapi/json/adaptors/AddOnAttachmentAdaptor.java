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

import addons.curse.AddOnAttachment;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class AddOnAttachmentAdaptor extends TypeAdapter<AddOnAttachment> {
	public static AddOnAttachmentAdaptor INSTANCE = new AddOnAttachmentAdaptor();
	
	@Override
	public void write(JsonWriter out, AddOnAttachment value) throws IOException {
		out.beginObject();
		out.name("Description");
		out.value(value.getDescription());

		out.name("IsDefault");
		out.value(value.getIsDefault());

		out.name("ThumbnailUrl");
		out.value(value.getThumbnailUrl());

		out.name("Title");
		out.value(value.getTitle());

		out.name("Url");
		out.value(value.getUrl());

		out.endObject();
	}
	
	@Override
	public AddOnAttachment read(JsonReader in) throws IOException {
		AddOnAttachment out = new AddOnAttachment();
		
		in.beginObject();
		while (in.hasNext()){
			String prop = in.nextName();
			switch (prop) {
				case "Description":
					out.setDescription(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				case "IsDefault":
					out.setIsDefault(in.nextBoolean());
					break;
				case "ThumbnailUrl":
					out.setThumbnailUrl(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				case "Title":
					out.setTitle(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				case "Url":
					out.setUrl(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				default:
					in.skipValue();
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
