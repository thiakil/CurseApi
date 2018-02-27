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

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thiakil.curseapi.json.manifests.ManifestResource;
import com.thiakil.curseapi.json.manifests.ModpackManifest;

import java.io.IOException;
import java.util.LinkedList;

/**
 * Created by Thiakil on 25/02/2018.
 */
public class ModpackManifestAdaptor extends TypeAdapter<ModpackManifest> {
	public static final ModpackManifestAdaptor INSTANCE = new ModpackManifestAdaptor();

	@Override
	public void write(JsonWriter out, ModpackManifest value) throws IOException {
		out.beginObject();

		writeCommonElements(out, value);

		out.endObject();
	}

	static void writeCommonElements(JsonWriter out, ModpackManifest value) throws IOException {
		out.name("manifestType");
		out.value(value.manifestType);

		out.name("manifestVersion");
		out.value(value.manifestVersion);

		out.name("name");
		out.value(value.name);

		out.name("version");
		out.value(value.version);

		out.name("author");
		out.value(value.author);

		out.name("description");
		out.value(value.description);

		out.name("projectID");
		out.value(value.projectID);

		out.name("files");
		out.beginArray();
		for (ManifestResource r : value.files) {
			ManifestResourceAdaptor.INSTANCE.write(out, r);
		}
		out.endArray();

		out.name("overrides");
		out.value(value.overrides);
	}

	@Override
	public ModpackManifest read(JsonReader in) throws IOException {
		ModpackManifest obj = new ModpackManifest();

		in.beginObject();

		while (in.hasNext()){
			readCommonElements(in, in.nextName(), obj);
		}

		in.endObject();

		return obj;
	}

	static void readCommonElements(JsonReader in, String name, ModpackManifest obj) throws IOException {
		switch (name){
			case "manifestType":
				obj.manifestType = in.nextString();
				break;

			case "manifestVersion":
				obj.manifestVersion = in.nextInt();
				break;

			case "name":
				obj.name = in.nextString();
				break;

			case "version":
				obj.version = in.nextString();
				break;

			case "author":
				obj.author = in.nextString();
				break;

			case "description":
				obj.description = in.nextString();
				break;

			case "projectID":
				obj.projectID = in.nextInt();
				break;

			case "files":
				obj.files = new LinkedList<>();
				in.beginArray();
				while (in.hasNext()){
					obj.files.add(ManifestResourceAdaptor.INSTANCE.read(in));
				}
				in.endArray();
				break;

			case "overrides":
				obj.overrides = in.nextString();
				break;
		}
	}
}
