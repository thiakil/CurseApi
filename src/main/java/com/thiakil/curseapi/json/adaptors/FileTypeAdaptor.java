package com.thiakil.curseapi.json.adaptors;

import org.datacontract.schemas._2004._07.curse_addons.FileType;

public class FileTypeAdaptor extends BeanEnumAdaptor<FileType> {
	public static final FileTypeAdaptor INSTANCE = new FileTypeAdaptor();
	
	private FileTypeAdaptor(){
		super(FileType.Release, FileType.Beta, FileType.Alpha);
	}
}
