package com.thiakil.curseapi.json.adaptors;

import addons.curse.AddOnFileDependency;
import com.thiakil.curseapi.json.adaptors.JsonDumpAdaptor;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class AddOnFileDependencyAdaptor extends TypeAdapter<AddOnFileDependency> {
	public static AddOnFileDependencyAdaptor INSTANCE = new AddOnFileDependencyAdaptor();
	
	@Override
	public void write(JsonWriter out, AddOnFileDependency value) throws IOException {
		out.beginObject();
		out.name("AddOnId");
		out.value(value.getAddOnId());

		out.name("Type");
		DependencyTypeAdaptor.INSTANCE.write(out, value.getType());

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
					out.setType(DependencyTypeAdaptor.INSTANCE.read(in));
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
