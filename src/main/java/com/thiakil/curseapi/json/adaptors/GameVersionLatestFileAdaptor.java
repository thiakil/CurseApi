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

import org.datacontract.schemas._2004._07.curse_addons.GameVersionLatestFile;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class GameVersionLatestFileAdaptor extends TypeAdapter<GameVersionLatestFile> {
	public static GameVersionLatestFileAdaptor INSTANCE = new GameVersionLatestFileAdaptor();
	
	@Override
	public void write(JsonWriter out, GameVersionLatestFile value) throws IOException {
		out.beginObject();
		out.name("FileType");
		FileTypeAdaptor.INSTANCE.write(out, value.getFileType());

		out.name("GameVesion");
		out.value(value.getGameVesion());

		out.name("ProjectFileID");
		out.value(value.getProjectFileID());

		out.name("ProjectFileName");
		out.value(value.getProjectFileName());

		out.endObject();
	}
	
	@Override
	public GameVersionLatestFile read(JsonReader in) throws IOException {
		GameVersionLatestFile out = new GameVersionLatestFile();
		
		in.beginObject();
		while (in.hasNext()){
			String prop = in.nextName();
			switch (prop) {
				case "FileType":
					out.setFileType(FileTypeAdaptor.INSTANCE.read(in));
					break;
				case "GameVesion":
					out.setGameVesion(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				case "ProjectFileID":
					out.setProjectFileID(in.nextInt());
					break;
				case "ProjectFileName":
					out.setProjectFileName(ProjectFeedAdaptor.readStringOrNull(in));
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
