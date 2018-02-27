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
		return builderIn.registerTypeAdapter(ProjectFeed.class, ProjectFeedAdaptor.INSTANCE)
				.registerTypeAdapter(AddOn.class, AddOnAdaptor.INSTANCE)
				.registerTypeAdapter(AddOnAttachment.class, AddOnAttachmentAdaptor.INSTANCE)
				.registerTypeAdapter(AddOnCategory.class, AddOnCategoryAdaptor.INSTANCE)
				.registerTypeAdapter(AddOnFile.class, AddOnFileAdaptor.INSTANCE)
				.registerTypeAdapter(AddOnFileDependency.class, AddOnFileDependencyAdaptor.INSTANCE)
				.registerTypeAdapter(AddOnModule.class, AddOnModuleAdaptor.INSTANCE)
				.registerTypeAdapter(CategorySection.class, CategorySectionAdaptor.INSTANCE)
				.registerTypeAdapter(DependencyType.class, DependencyTypeAdaptor.INSTANCE)
				.registerTypeAdapter(FileStatus.class, FileStatusAdaptor.INSTANCE)
				.registerTypeAdapter(FileType.class, FileTypeAdaptor.INSTANCE)
				.registerTypeAdapter(GameVersionLatestFile.class, GameVersionLatestFileAdaptor.INSTANCE)
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
