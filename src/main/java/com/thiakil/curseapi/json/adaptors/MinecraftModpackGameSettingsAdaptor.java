package com.thiakil.curseapi.json.adaptors;

import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thiakil.curseapi.json.manifests.MinecraftModpackGameSettings;
import com.thiakil.curseapi.json.manifests.Modloader;
import com.thiakil.curseapi.json.ProjectFeed;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by Thiakil on 25/02/2018.
 */
public class MinecraftModpackGameSettingsAdaptor extends TypeAdapter<MinecraftModpackGameSettings> {
	public static final MinecraftModpackGameSettingsAdaptor INSTANCE = new MinecraftModpackGameSettingsAdaptor();

	private static final TypeAdapter<Map<String,String>> STRING_MAP_ADAPTOR = ProjectFeed.GSON.getAdapter(new TypeToken<Map<String, String>>(){});

	@Override
	public void write(JsonWriter out, MinecraftModpackGameSettings value) throws IOException {
		out.beginObject();

		out.name("version");
		out.value(value.version);

		out.name("additionalJavaArgs");
		STRING_MAP_ADAPTOR.write(out, value.additionalJavaArgs);

		out.name("modLoaders");
		out.beginArray();
		for (Modloader m : value.modLoaders){
			ModloaderAdaptor.INSTANCE.write(out, m);
		}
		out.endArray();

		out.name("libraries");
		out.value(value.libraries);
		
		out.endObject();
	}

	@Override
	public MinecraftModpackGameSettings read(JsonReader in) throws IOException {
		MinecraftModpackGameSettings obj = new MinecraftModpackGameSettings();

		in.beginObject();

		while (in.hasNext()) {
			switch (in.nextName()) {
				case "version":
					obj.version = in.nextString();
					break;
				case "additionalJavaArgs":
					obj.additionalJavaArgs = STRING_MAP_ADAPTOR.read(in);
					break;
				case "modLoaders":
					in.beginArray();
					obj.modLoaders = new LinkedList<>();
					while (in.hasNext()){
						obj.modLoaders.add(ModloaderAdaptor.INSTANCE.read(in));
					}
					in.endArray();
					break;
				case "libraries":
					obj.libraries = in.nextString();
					break;
			}
		}

		in.endObject();
		return obj;
	}
}
