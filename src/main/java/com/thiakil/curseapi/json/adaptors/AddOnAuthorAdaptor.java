package com.thiakil.curseapi.json.adaptors;

import addons.curse.AddOnAuthor;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class AddOnAuthorAdaptor extends TypeAdapter<AddOnAuthor> {
	public static AddOnAuthorAdaptor INSTANCE = new AddOnAuthorAdaptor();
	
	@Override
	public void write(JsonWriter out, AddOnAuthor value) throws IOException {
		out.beginObject();
		out.name("Name");
		out.value(value.getName());

		out.name("Url");
		out.value(value.getUrl());

		out.endObject();
	}
	
	@Override
	public AddOnAuthor read(JsonReader in) throws IOException {
		AddOnAuthor out = new AddOnAuthor();
		
		in.beginObject();
		while (in.hasNext()){
			String prop = in.nextName();
			switch (prop) {
				case "Name":
					out.setName(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				case "Url":
					out.setUrl(ProjectFeedAdaptor.readStringOrNull(in));
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
