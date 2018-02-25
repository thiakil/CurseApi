package com.thiakil.curseapi.json.manifests;

import java.util.List;
import java.util.Map;

/**
 * Created by Thiakil on 25/02/2018.
 */
public class MinecraftModpackGameSettings {
	public String version;

    public Map<String,String> additionalJavaArgs;

    public List<Modloader> modLoaders;

    public String libraries;
}
