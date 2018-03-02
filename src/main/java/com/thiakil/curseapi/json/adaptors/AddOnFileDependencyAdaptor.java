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

import addons.curse.AddOnFileDependency;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.datacontract.schemas._2004._07.curse_addons.DependencyType;

import java.io.IOException;

public class AddOnFileDependencyAdaptor extends TypeAdapter<AddOnFileDependency> {
	
	private final TypeAdapter<DependencyType> dependencyTypeTypeAdapter;
	
	public AddOnFileDependencyAdaptor(Gson g){
		dependencyTypeTypeAdapter = g.getAdapter(DependencyType.class);
	}
	
	@Override
	public void write(JsonWriter out, AddOnFileDependency value) throws IOException {
		out.beginObject();
		out.name("AddOnId");
		out.value(value.getAddOnId());

		out.name("Type");
		dependencyTypeTypeAdapter.write(out, value.getType());

		out.endObject();
	}
	
	@Override
	public AddOnFileDependency read(JsonReader in) throws IOException {
		AddOnFileDependency out = new AddOnFileDependency();
		
		in.beginObject();
		while (in.hasNext()){
			String prop = in.nextName();
			switch (prop) {
				case "AddOnId":
					out.setAddOnId(in.nextInt());
					break;
				case "Type":
					out.setType(dependencyTypeTypeAdapter.read(in));
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
