package com.thiakil.curseapi.json.adaptors;

import org.datacontract.schemas._2004._07.curse_addons.PackageTypes;

public class PackageTypesAdaptor extends BeanEnumAdaptor<PackageTypes> {
	public static final PackageTypesAdaptor INSTANCE = new PackageTypesAdaptor();
	
	private PackageTypesAdaptor(){
		super(PackageTypes.Folder, PackageTypes.Ctoc, PackageTypes.SingleFile, PackageTypes.Cmod2, PackageTypes.ModPack, PackageTypes.Mod);
	}
}
