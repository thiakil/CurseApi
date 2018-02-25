package com.thiakil.curseapi.json.manifests;

import java.util.List;

/**
 * Created by Thiakil on 25/02/2018.
 */
public class ModpackManifest {

	//manifestType
	public String manifestType;
	
	//manifestVersion
	public int manifestVersion;
	
	//name
	public String name;
	
	//version
	public String version;
	
	//author
	public String author;
	
	//description
	public String description;
	
	//projectID, optional?
	public int projectID;
	
	//files
	public List<ManifestResource> files;
	
	//overrides
	public String overrides;

}
