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
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * This library may be dynamically linked against (used as a dependency) in any project licenced under terms requiring complete
 * source code availability (a "FREE SOFTWARE LICENCE" https://www.gnu.org/philosophy/free-sw.html), such as the Apache License(s),
 * without the using project being required to be GPL licenced. This library remains GPL licenced and any modifications to this
 * library must still be made under the terms of the GPL. Bundling of the compiled binary class files ("fat jars") is permitted
 * for OPEN SOURCE projects, provided no modifications have been made (in which case source code for modifications must be available).
 *
 * Repackaging (sometimes known as "shading") where ONLY the package names are changed to avoid conflicts requires the configuration
 * and instructions for the method of repackaging to be made available in the same manner as source code.
 *
 * You may NOT use this library in a closed source project under any circumstance.
 */

package com.thiakil.curseapi.json;

import addons.curse.AddOn;
import addons.curse.AddOnAttachment;
import addons.curse.AddOnCategory;
import addons.curse.AddOnFile;
import addons.curse.AddOnFileDependency;
import addons.curse.AddOnModule;
import addons.curse.CategorySection;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thiakil.curseapi.json.adaptors.AdaptorFactory;
import com.thiakil.curseapi.json.adaptors.AddOnAdaptor;
import com.thiakil.curseapi.json.adaptors.AddOnAttachmentAdaptor;
import com.thiakil.curseapi.json.adaptors.AddOnCategoryAdaptor;
import com.thiakil.curseapi.json.adaptors.AddOnFileAdaptor;
import com.thiakil.curseapi.json.adaptors.AddOnFileDependencyAdaptor;
import com.thiakil.curseapi.json.adaptors.AddOnModuleAdaptor;
import com.thiakil.curseapi.json.adaptors.CategorySectionAdaptor;
import com.thiakil.curseapi.json.adaptors.DependencyTypeAdaptor;
import com.thiakil.curseapi.json.adaptors.FileStatusAdaptor;
import com.thiakil.curseapi.json.adaptors.FileTypeAdaptor;
import com.thiakil.curseapi.json.adaptors.GameVersionLatestFileAdaptor;
import com.thiakil.curseapi.json.adaptors.ProjectFeedAdaptor;
import com.thiakil.curseapi.json.adaptors.PackageTypesAdaptor;
import com.thiakil.curseapi.json.adaptors.ProjectStageAdaptor;
import com.thiakil.curseapi.json.adaptors.ProjectStatusAdaptor;
import org.datacontract.schemas._2004._07.curse_addons.DependencyType;
import org.datacontract.schemas._2004._07.curse_addons.FileStatus;
import org.datacontract.schemas._2004._07.curse_addons.FileType;
import org.datacontract.schemas._2004._07.curse_addons.GameVersionLatestFile;
import org.datacontract.schemas._2004._07.curse_addons.PackageTypes;
import org.datacontract.schemas._2004._07.curse_addons.ProjectStage;
import org.datacontract.schemas._2004._07.curse_addons.ProjectStatus;

import java.util.List;

public class ProjectFeed {
	public static final Gson GSON = registerTypeAdaptors(new GsonBuilder()).create();
	
	/**
	 * Helper function to register the Json adaptors to your GSON builder instance, in case you need more than just these.
	 * If you only want to read the structure from the root level, you only really need {@link ProjectFeedAdaptor}, as the
	 * others are chained statically.
	 *
	 * @param builderIn builder to add to
	 * @return builderIn, for chaining
	 */
	@SuppressWarnings("WeakerAccess")
	public static GsonBuilder registerTypeAdaptors(GsonBuilder builderIn){
		return builderIn.registerTypeAdapterFactory(new AdaptorFactory<>(ProjectFeedAdaptor::new, ProjectFeed.class))
				.registerTypeAdapterFactory(new AdaptorFactory<>(AddOnAdaptor::new, AddOn.class))
				.registerTypeAdapter(AddOnAttachment.class, AddOnAttachmentAdaptor.INSTANCE)
				.registerTypeAdapter(AddOnCategory.class, AddOnCategoryAdaptor.INSTANCE)
				.registerTypeAdapterFactory(new AdaptorFactory<>(AddOnFileAdaptor::new, AddOnFile.class))
				.registerTypeAdapterFactory(new AdaptorFactory<>(AddOnFileDependencyAdaptor::new, AddOnFileDependency.class))
				.registerTypeAdapter(AddOnModule.class, AddOnModuleAdaptor.INSTANCE)
				.registerTypeAdapterFactory(new AdaptorFactory<>(CategorySectionAdaptor::new, CategorySection.class))
				.registerTypeAdapter(DependencyType.class, DependencyTypeAdaptor.INSTANCE)
				.registerTypeAdapter(FileStatus.class, FileStatusAdaptor.INSTANCE)
				.registerTypeAdapter(FileType.class, FileTypeAdaptor.INSTANCE)
				.registerTypeAdapterFactory(new AdaptorFactory<>(GameVersionLatestFileAdaptor::new, GameVersionLatestFile.class))
				.registerTypeAdapter(PackageTypes.class, PackageTypesAdaptor.INSTANCE)
				.registerTypeAdapter(ProjectStage.class, ProjectStageAdaptor.INSTANCE)
				.registerTypeAdapter(ProjectStatus.class, ProjectStatusAdaptor.INSTANCE);
	}
	
	private long timestamp;
	private List<AddOn> data;
	
	public long getTimestamp(){
		return timestamp;
	}
	
	public List<AddOn> getAddons() {
		return data;
	}
	
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public void setData(List<AddOn> data) {
		this.data = data;
	}
}
