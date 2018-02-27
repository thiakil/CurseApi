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

import addons.curse.CategorySection;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class CategorySectionAdaptor extends TypeAdapter<CategorySection> {
	public static CategorySectionAdaptor INSTANCE = new CategorySectionAdaptor();
	
	@Override
	public void write(JsonWriter out, CategorySection value) throws IOException {
		out.beginObject();
		out.name("ExtraIncludePattern");
		out.value(value.getExtraIncludePattern());

		out.name("GameID");
		out.value(value.getGameID());

		out.name("ID");
		out.value(value.getID());

		out.name("InitialInclusionPattern");
		out.value(value.getInitialInclusionPattern());

		out.name("Name");
		out.value(value.getName());

		out.name("PackageType");
		PackageTypesAdaptor.INSTANCE.write(out, value.getPackageType());

		out.name("Path");
		out.value(value.getPath());

		out.endObject();
	}
	
	@Override
	public CategorySection read(JsonReader in) throws IOException {
		CategorySection out = new CategorySection();
		
		in.beginObject();
		while (in.hasNext()){
			String prop = in.nextName();
			switch (prop) {
				case "ExtraIncludePattern":
					out.setExtraIncludePattern(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				case "GameID":
					out.setGameID(in.nextInt());
					break;
				case "ID":
					out.setID(in.nextInt());
					break;
				case "InitialInclusionPattern":
					out.setInitialInclusionPattern(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				case "Name":
					out.setName(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				case "PackageType":
					out.setPackageType(PackageTypesAdaptor.INSTANCE.read(in));
					break;
				case "Path":
					out.setPath(ProjectFeedAdaptor.readStringOrNull(in));
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
