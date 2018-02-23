package com.thiakil.curseapi.json.adaptors;

import addons.curse.AddOnAttachment;
import com.thiakil.curseapi.json.adaptors.JsonDumpAdaptor;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class AddOnAttachmentAdaptor extends TypeAdapter<AddOnAttachment> {
	public static AddOnAttachmentAdaptor INSTANCE = new AddOnAttachmentAdaptor();
	
	@Override
	public void write(JsonWriter out, AddOnAttachment value) throws IOException {
		out.beginObject();
		out.name("Description");
		out.value(value.getDescription());

		out.name("IsDefault");
		out.value(value.getIsDefault());

		out.name("ThumbnailUrl");
		out.value(value.getThumbnailUrl());

		out.name("Title");
		out.value(value.getTitle());

		out.name("Url");
		out.value(value.getUrl());

		out.endObject();
	}
	
	@Override
	public AddOnAttachment read(JsonReader in) throws IOException {
		AddOnAttachment out = new AddOnAttachment();
		
		in.beginObject();
		while (in.hasNext()){
			String prop = in.nextName();
			switch (prop) {
				case "Description":
					out.setDescription(JsonDumpAdaptor.readStringOrNull(in));
					break;
				case "IsDefault":
					out.setIsDefault(in.nextBoolean());
					break;
				case "ThumbnailUrl":
					out.setThumbnailUrl(JsonDumpAdaptor.readStringOrNull(in));
					break;
				case "Title":
					out.setTitle(JsonDumpAdaptor.readStringOrNull(in));
					break;
				case "Url":
					out.setUrl(JsonDumpAdaptor.readStringOrNull(in));
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
