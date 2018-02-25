package com.thiakil.curseapi.json.adaptors;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thiakil.curseapi.json.manifests.MinecraftModpackManifest;

import java.io.IOException;

/**
 * Created by Thiakil on 25/02/2018.
 */
public class MinecraftModpackManifestAdaptor extends TypeAdapter<MinecraftModpackManifest> {
	public static final MinecraftModpackManifestAdaptor INSTANCE = new MinecraftModpackManifestAdaptor();

	@Override
	public void write(JsonWriter out, MinecraftModpackManifest value) throws IOException {
		out.beginObject();

		ModpackManifestAdaptor.writeCommonElements(out, value);

		out.name("minecraft");
		MinecraftModpackGameSettingsAdaptor.INSTANCE.write(out, value.minecraft);

		out.endObject();
	}

	@Override
	public MinecraftModpackManifest read(JsonReader in) throws IOException {
		MinecraftModpackManifest obj = new MinecraftModpackManifest();

		in.beginObject();

		while (in.hasNext()){
			String name = in.nextName();
			if (name.equals("minecraft")){
				obj.minecraft = MinecraftModpackGameSettingsAdaptor.INSTANCE.read(in);
			} else {
				ModpackManifestAdaptor.readCommonElements(in, name, obj);
			}
		}

		in.endObject();

		return obj;
	}
}
