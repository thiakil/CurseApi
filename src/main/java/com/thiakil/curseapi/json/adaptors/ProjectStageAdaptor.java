package com.thiakil.curseapi.json.adaptors;

import org.datacontract.schemas._2004._07.curse_addons.ProjectStage;

public class ProjectStageAdaptor extends BeanEnumAdaptor<ProjectStage> {
	public static final ProjectStageAdaptor INSTANCE = new ProjectStageAdaptor();
	
	private ProjectStageAdaptor(){
		super(
				ProjectStage.Alpha,
				ProjectStage.Beta,
				ProjectStage.Deleted,
				ProjectStage.Inactive,
				ProjectStage.Mature,
				ProjectStage.Planning,
				ProjectStage.Release,
				ProjectStage.Abandoned
		);
	}
}
