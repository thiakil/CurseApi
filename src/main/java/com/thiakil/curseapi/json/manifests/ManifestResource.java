package com.thiakil.curseapi.json.manifests;

import org.datacontract.schemas._2004._07.curse_addonservice_requests.AddOnFileKey;

/**
 * Created by Thiakil on 25/02/2018.
 */
public class ManifestResource {
	//json prop = projectID
	public int projectID;

    //json prop = fileID
	public int fileID;

    //json prop = required (prop is optional)
	public boolean required;

	public AddOnFileKey toAddOnFileKey(){
		return new AddOnFileKey(projectID, fileID);
	}
}
