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
import com.thiakil.curseapi.json.manifests.MinecraftModpackManifest;

import java.io.IOException;

/**
 * Created by Thiakil on 25/02/2018.
 */
public class MinecraftModpackManifestAdaptor extends TypeAdapter<MinecraftModpackManifest> {
	public static final MinecraftModpackManifestAdaptor INSTANCE = new MinecraftModpackManifestAdaptor();

	@Override
	public void write(JsonWriter out, MinecraftModpackManifest value) throws IOException {
		out.beginObject();

		ModpackManifestAdaptor.writeCommonElements(out, value);

		out.name("minecraft");
		MinecraftModpackGameSettingsAdaptor.INSTANCE.write(out, value.minecraft);

		out.endObject();
	}

	@Override
	public MinecraftModpackManifest read(JsonReader in) throws IOException {
		MinecraftModpackManifest obj = new MinecraftModpackManifest();

		in.beginObject();

		while (in.hasNext()){
			String name = in.nextName();
			if (name.equals("minecraft")){
				obj.minecraft = MinecraftModpackGameSettingsAdaptor.INSTANCE.read(in);
			} else {
				ModpackManifestAdaptor.readCommonElements(in, name, obj);
			}
		}

		in.endObject();

		return obj;
	}
}
