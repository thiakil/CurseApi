package com.thiakil.curseapi.json.adaptors;

import addons.curse.CategorySection;
import com.thiakil.curseapi.json.adaptors.JsonDumpAdaptor;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class CategorySectionAdaptor extends TypeAdapter<CategorySection> {
	public static CategorySectionAdaptor INSTANCE = new CategorySectionAdaptor();
	
	@Override
	public void write(JsonWriter out, CategorySection value) throws IOException {
		out.beginObject();
		out.name("ExtraIncludePattern");
		out.value(value.getExtraIncludePattern());

		out.name("GameID");
		out.value(value.getGameID());

		out.name("ID");
		out.value(value.getID());

		out.name("InitialInclusionPattern");
		out.value(value.getInitialInclusionPattern());

		out.name("Name");
		out.value(value.getName());

		out.name("PackageType");
		PackageTypesAdaptor.INSTANCE.write(out, value.getPackageType());

		out.name("Path");
		out.value(value.getPath());

		out.endObject();
	}
	
	@Override
	public CategorySection read(JsonReader in) throws IOException {
		CategorySection out = new CategorySection();
		
		in.beginObject();
		while (in.hasNext()){
			String prop = in.nextName();
			switch (prop) {
				case "ExtraIncludePattern":
					out.setExtraIncludePattern(JsonDumpAdaptor.readStringOrNull(in));
					break;
				case "GameID":
					out.setGameID(in.nextInt());
					break;
				case "ID":
					out.setID(in.nextInt());
					break;
				case "InitialInclusionPattern":
					out.setInitialInclusionPattern(JsonDumpAdaptor.readStringOrNull(in));
					break;
				case "Name":
					out.setName(JsonDumpAdaptor.readStringOrNull(in));
					break;
				case "PackageType":
					out.setPackageType(PackageTypesAdaptor.INSTANCE.read(in));
					break;
				case "Path":
					out.setPath(JsonDumpAdaptor.readStringOrNull(in));
					break;
			}
		}
		in.endObject();
		
		return out;
	}
}
