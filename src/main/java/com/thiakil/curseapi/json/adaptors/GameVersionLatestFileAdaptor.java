package com.thiakil.curseapi.json.adaptors;

import org.datacontract.schemas._2004._07.curse_addons.GameVersionLatestFile;
import com.thiakil.curseapi.json.adaptors.JsonDumpAdaptor;
import com.google.gson.JsonParseException;
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
					out.setGameVesion(JsonDumpAdaptor.readStringOrNull(in));
					break;
				case "ProjectFileID":
					out.setProjectFileID(in.nextInt());
					break;
				case "ProjectFileName":
					out.setProjectFileName(JsonDumpAdaptor.readStringOrNull(in));
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
