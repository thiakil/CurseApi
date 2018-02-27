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
import com.thiakil.curseapi.json.manifests.Modloader;

import java.io.IOException;

/**
 * Created by Thiakil on 25/02/2018.
 */
public class ModloaderAdaptor extends TypeAdapter<Modloader> {
	public static final ModloaderAdaptor INSTANCE = new ModloaderAdaptor();

	@Override
	public void write(JsonWriter out, Modloader value) throws IOException {
		out.beginObject();

		out.name("id");
		out.value(value.id);

		out.name("primary");
		out.value(value.primary);

		out.endObject();
	}

	@Override
	public Modloader read(JsonReader in) throws IOException {
		Modloader obj = new Modloader();

		in.beginObject();

		while (in.hasNext()){
			switch (in.nextName()){
				case "id":
					obj.id = in.nextString();
					break;
				case "primary":
					obj.primary = in.nextBoolean();
					break;
			}
		}

		in.endObject();

		return obj;
	}
}
