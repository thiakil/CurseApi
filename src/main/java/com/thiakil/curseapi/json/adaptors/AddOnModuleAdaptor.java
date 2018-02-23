package com.thiakil.curseapi.json.adaptors;

import addons.curse.AddOnModule;
import com.thiakil.curseapi.json.adaptors.JsonDumpAdaptor;
import com.google.gson.JsonParseException;
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
					out.setFoldername(JsonDumpAdaptor.readStringOrNull(in));
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
