package com.thiakil.curseapi.json.adaptors;

import org.datacontract.schemas._2004._07.curse_addons.ProjectStatus;

public class ProjectStatusAdaptor extends BeanEnumAdaptor<ProjectStatus> {
	public static final ProjectStatusAdaptor INSTANCE = new ProjectStatusAdaptor();
	
	private ProjectStatusAdaptor(){
		super(
				ProjectStatus.Normal,
				ProjectStatus.Hidden,
				ProjectStatus.Deleted
		);
	}
}
