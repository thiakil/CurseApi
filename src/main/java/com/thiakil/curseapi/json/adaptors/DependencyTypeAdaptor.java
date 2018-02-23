package com.thiakil.curseapi.json.adaptors;

import org.datacontract.schemas._2004._07.curse_addons.DependencyType;

public class DependencyTypeAdaptor extends BeanEnumAdaptor<DependencyType> {
	public static final DependencyTypeAdaptor INSTANCE = new DependencyTypeAdaptor();
	
	private DependencyTypeAdaptor(){
		super(
				DependencyType.Required,
				DependencyType.Optional,
				DependencyType.Embedded
		);
	}
}
