package com.thiakil.curseapi.json.adaptors;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thiakil.curseapi.json.manifests.ManifestResource;

import java.io.IOException;

/**
 * Created by Thiakil on 25/02/2018.
 */
public class ManifestResourceAdaptor extends TypeAdapter<ManifestResource> {
	public static final ManifestResourceAdaptor INSTANCE = new ManifestResourceAdaptor();

	@Override
	public void write(JsonWriter out, ManifestResource value) throws IOException {
		out.beginObject();

		out.name("projectID");
		out.value(value.projectID);

		out.name("fileID");
		out.value(value.fileID);

		out.name("required");
		out.value(value.required);

		out.endObject();
	}

	@Override
	public ManifestResource read(JsonReader in) throws IOException {
		ManifestResource obj = new ManifestResource();

		in.beginObject();

		while (in.hasNext()){
			switch (in.nextName()){
				case "projectID":
					obj.projectID = in.nextInt();
					break;

				case "fileID":
					obj.fileID = in.nextInt();
					break;

				case "required":
					obj.required = in.nextBoolean();
					break;
			}
		}

		in.endObject();
		return obj;
	}
}
