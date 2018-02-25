package com.thiakil.curseapi.json.adaptors;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thiakil.curseapi.json.manifests.Modloader;

import java.io.IOException;

/**
 * Created by Thiakil on 25/02/2018.
 */
public class ModloaderAdaptor extends TypeAdapter<Modloader> {
	public static final ModloaderAdaptor INSTANCE = new ModloaderAdaptor();

	@Override
	public void write(JsonWriter out, Modloader value) throws IOException {
		out.beginObject();

		out.name("id");
		out.value(value.id);

		out.name("primary");
		out.value(value.primary);

		out.endObject();
	}

	@Override
	public Modloader read(JsonReader in) throws IOException {
		Modloader obj = new Modloader();

		in.beginObject();

		while (in.hasNext()){
			switch (in.nextName()){
				case "id":
					obj.id = in.nextString();
					break;
				case "primary":
					obj.primary = in.nextBoolean();
					break;
			}
		}

		in.endObject();

		return obj;
	}
}
