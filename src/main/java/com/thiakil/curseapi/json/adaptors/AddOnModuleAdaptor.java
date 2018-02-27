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

import addons.curse.AddOnModule;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class AddOnModuleAdaptor extends TypeAdapter<AddOnModule> {
	public static AddOnModuleAdaptor INSTANCE = new AddOnModuleAdaptor();
	
	@Override
	public void write(JsonWriter out, AddOnModule value) throws IOException {
		out.beginObject();
		out.name("Fingerprint");
		out.value(value.getFingerprint());

		out.name("Foldername");
		out.value(value.getFoldername());

		out.endObject();
	}
	
	@Override
	public AddOnModule read(JsonReader in) throws IOException {
		AddOnModule out = new AddOnModule();
		
		in.beginObject();
		while (in.hasNext()){
			String prop = in.nextName();
			switch (prop) {
				case "Fingerprint":
					out.setFingerprint(in.nextLong());
					break;
				case "Foldername":
					out.setFoldername(ProjectFeedAdaptor.readStringOrNull(in));
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
