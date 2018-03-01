package com.thiakil.curseapi.json.manifests;

import com.google.gson.Gson;
import com.thiakil.curseapi.soap.AddOnService;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ManifestUtils {
	private static Gson GSON = new Gson();
	
	public static MinecraftModpackManifest loadMinecraftManifestFromJSON(InputStream is){
		return GSON.fromJson(new InputStreamReader(is), MinecraftModpackManifest.class);
	}
	
	public static MinecraftModpackManifest loadMinecraftManifestFromZip(InputStream is) throws IOException {
		ZipInputStream zis = new ZipInputStream(is);
		ZipEntry ze;
		while ((ze = zis.getNextEntry()) != null){
			if (ze.getName().equals("manifest.json")){
				return loadMinecraftManifestFromJSON(zis);
			}
		}
		return null;
	}
}
