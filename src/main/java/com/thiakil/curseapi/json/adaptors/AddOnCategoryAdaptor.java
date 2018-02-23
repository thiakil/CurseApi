package com.thiakil.curseapi.json.adaptors;

import addons.curse.AddOnCategory;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class AddOnCategoryAdaptor extends TypeAdapter<AddOnCategory> {
	public static AddOnCategoryAdaptor INSTANCE = new AddOnCategoryAdaptor();
	
	@Override
	public void write(JsonWriter out, AddOnCategory value) throws IOException {
		out.beginObject();
		out.name("Id");
		out.value(value.getId());

		out.name("Name");
		out.value(value.getName());

		out.name("URL");
		out.value(value.getURL());

		out.endObject();
	}
	
	@Override
	public AddOnCategory read(JsonReader in) throws IOException {
		AddOnCategory out = new AddOnCategory();
		
		in.beginObject();
		while (in.hasNext()){
			String prop = in.nextName();
			switch (prop) {
				case "Id":
					out.setId(in.nextInt());
					break;
				case "Name":
					out.setName(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				case "URL":
					out.setURL(ProjectFeedAdaptor.readStringOrNull(in));
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
