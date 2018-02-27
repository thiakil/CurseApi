/*
 * CurseAPI library - Java abstraction layer for Curse's feed & SOAP API
 * Copyright (C) 2018  Thiakil
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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
