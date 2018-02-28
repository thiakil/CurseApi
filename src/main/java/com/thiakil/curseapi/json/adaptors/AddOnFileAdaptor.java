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

import addons.curse.AddOnFile;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class AddOnFileAdaptor extends TypeAdapter<AddOnFile> {
	public static AddOnFileAdaptor INSTANCE = new AddOnFileAdaptor();
	
	@Override
	public void write(JsonWriter out, AddOnFile value) throws IOException {
		out.beginObject();
		out.name("AlternateFileId");
		out.value(value.getAlternateFileId());

		out.name("Dependencies");
		ProjectFeedAdaptor.writeArray(out, value.getDependencies(), AddOnFileDependencyAdaptor.INSTANCE);

		out.name("DownloadURL");
		out.value(value.getDownloadURL());

		out.name("FileDate");
		CalendarAdaptor.INSTANCE.write(out, value.getFileDate());

		out.name("FileName");
		out.value(value.getFileName());

		out.name("FileNameOnDisk");
		out.value(value.getFileNameOnDisk());

		out.name("FileStatus");
		FileStatusAdaptor.INSTANCE.write(out, value.getFileStatus());

		out.name("GameVersion");
		ProjectFeedAdaptor.writeStringArray(out, value.getGameVersion());

		out.name("Id");
		out.value(value.getId());

		out.name("IsAlternate");
		out.value(value.getIsAlternate());

		out.name("IsAvailable");
		out.value(value.getIsAvailable());

		out.name("Modules");
		ProjectFeedAdaptor.writeArray(out, value.getModules(), AddOnModuleAdaptor.INSTANCE);

		out.name("PackageFingerprint");
		out.value(value.getPackageFingerprint());

		out.name("ReleaseType");
		FileTypeAdaptor.INSTANCE.write(out, value.getReleaseType());

		out.endObject();
	}
	
	@Override
	public AddOnFile read(JsonReader in) throws IOException {
		AddOnFile out = new AddOnFile();
		
		in.beginObject();
		while (in.hasNext()){
			String prop = in.nextName();
			switch (prop) {
				case "AlternateFileId":
					out.setAlternateFileId(in.nextInt());
					break;
				case "Dependencies":
					out.setDependencies(ProjectFeedAdaptor.readListOfObjects(in, AddOnFileDependencyAdaptor.INSTANCE));
					break;
				case "DownloadURL":
					out.setDownloadURL(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				case "FileDate":
					out.setFileDate(CalendarAdaptor.INSTANCE.read(in));
					break;
				case "FileName":
					out.setFileName(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				case "FileNameOnDisk":
					out.setFileNameOnDisk(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				case "FileStatus":
					out.setFileStatus(FileStatusAdaptor.INSTANCE.read(in));
					break;
				case "GameVersion":
					out.setGameVersion(ProjectFeedAdaptor.readListOfStrings(in));
					break;
				case "Id":
					out.setId(in.nextInt());
					break;
				case "IsAlternate":
					out.setIsAlternate(in.nextBoolean());
					break;
				case "IsAvailable":
					out.setIsAvailable(in.nextBoolean());
					break;
				case "Modules":
					out.setModules(ProjectFeedAdaptor.readListOfObjects(in, AddOnModuleAdaptor.INSTANCE));
					break;
				case "PackageFingerprint":
					out.setPackageFingerprint(in.nextLong());
					break;
				case "ReleaseType":
					out.setReleaseType(FileTypeAdaptor.INSTANCE.read(in));
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
