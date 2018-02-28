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

package com.thiakil.curseapi.json.adaptors;

import addons.curse.AddOn;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class AddOnAdaptor extends TypeAdapter<AddOn> {
	public static final AddOnAdaptor INSTANCE = new AddOnAdaptor();
	
	@Override
	public void write(JsonWriter out, AddOn value) throws IOException {
		out.beginObject();

		out.name("Attachments");
		ProjectFeedAdaptor.writeArray(out, value.getAttachments(), AddOnAttachmentAdaptor.INSTANCE);

		out.name("Authors");
		ProjectFeedAdaptor.writeArray(out, value.getAuthors(), AddOnAuthorAdaptor.INSTANCE);

		out.name("AvatarUrl");
		out.value(value.getAvatarUrl());

		out.name("Categories");
		ProjectFeedAdaptor.writeArray(out, value.getCategories(), AddOnCategoryAdaptor.INSTANCE);

		out.name("CategorySection");
		CategorySectionAdaptor.INSTANCE.write(out, value.getCategorySection());

		out.name("CommentCount");
		out.value(value.getCommentCount());

		out.name("DefaultFileId");
		out.value(value.getDefaultFileId());

		out.name("DonationUrl");
		out.value(value.getDonationUrl());

		out.name("DownloadCount");
		out.value(value.getDownloadCount());

		out.name("ExternalUrl");
		out.value(value.getExternalUrl());

		out.name("GameId");
		out.value(value.getGameId());

		out.name("GamePopularityRank");
		out.value(value.getGamePopularityRank());

		out.name("GameVersionLatestFiles");
		ProjectFeedAdaptor.writeArray(out, value.getGameVersionLatestFiles(), GameVersionLatestFileAdaptor.INSTANCE);

		out.name("IconId");
		out.value(value.getIconId());

		out.name("Id");
		out.value(value.getId());

		out.name("InstallCount");
		out.value(value.getInstallCount());

		out.name("IsFeatured");
		out.value(value.getIsFeatured());

		out.name("LatestFiles");
		ProjectFeedAdaptor.writeArray(out, value.getLatestFiles(), AddOnFileAdaptor.INSTANCE);

		out.name("Likes");
		out.value(value.getLikes());

		out.name("Name");
		out.value(value.getName());

		out.name("PackageType");
		PackageTypesAdaptor.INSTANCE.write(out, value.getPackageType());

		out.name("PopularityScore");
		out.value(value.getPopularityScore());

		out.name("PrimaryAuthorName");
		out.value(value.getPrimaryAuthorName());

		out.name("PrimaryCategoryAvatarUrl");
		out.value(value.getPrimaryCategoryAvatarUrl());

		out.name("PrimaryCategoryId");
		out.value(value.getPrimaryCategoryId());

		out.name("PrimaryCategoryName");
		out.value(value.getPrimaryCategoryName());

		out.name("Rating");
		out.value(value.getRating());

		out.name("Stage");
		ProjectStageAdaptor.INSTANCE.write(out, value.getStage());

		out.name("Status");
		ProjectStatusAdaptor.INSTANCE.write(out, value.getStatus());

		out.name("Summary");
		out.value(value.getSummary());

		out.name("WebSiteURL");
		out.value(value.getWebSiteURL());

		
		out.endObject();
	}
	
	@Override
	public AddOn read(JsonReader in) throws IOException {
		AddOn out = new AddOn();
		
		in.beginObject();
		while (in.hasNext()) {
			String prop = in.nextName();
			switch (prop){
				case "Attachments": {
					out.setAttachments(ProjectFeedAdaptor.readListOfObjects(in, AddOnAttachmentAdaptor.INSTANCE));
					break;
				}
				case "Authors": {
					out.setAuthors(ProjectFeedAdaptor.readListOfObjects(in, AddOnAuthorAdaptor.INSTANCE));
					break;
				}
				case "AvatarUrl": {
					out.setAvatarUrl(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				}
				case "Categories": {
					out.setCategories(ProjectFeedAdaptor.readListOfObjects(in, AddOnCategoryAdaptor.INSTANCE));
					break;
				}
				case "CategorySection": {
					out.setCategorySection(CategorySectionAdaptor.INSTANCE.read(in));
					break;
				}
				case "CommentCount": {
					out.setCommentCount(in.nextInt());
					break;
				}
				case "DefaultFileId": {
					out.setDefaultFileId(in.nextInt());
					break;
				}
				case "DonationUrl": {
					out.setDonationUrl(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				}
				case "DownloadCount": {
					out.setDownloadCount(in.nextDouble());
					break;
				}
				case "ExternalUrl": {
					out.setExternalUrl(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				}
				case "GameId": {
					out.setGameId(in.nextInt());
					break;
				}
				case "GamePopularityRank": {
					out.setGamePopularityRank(in.nextInt());
					break;
				}
				case "GameVersionLatestFiles": {
					out.setGameVersionLatestFiles(ProjectFeedAdaptor.readListOfObjects(in, GameVersionLatestFileAdaptor.INSTANCE));
					break;
				}
				case "IconId": {
					out.setIconId(in.nextInt());
					break;
				}
				case "Id": {
					out.setId(in.nextInt());
					break;
				}
				case "InstallCount": {
					out.setInstallCount(in.nextInt());
					break;
				}
				case "IsFeatured": {
					out.setIsFeatured(in.nextInt());
					break;
				}
				case "LatestFiles": {
					out.setLatestFiles(ProjectFeedAdaptor.readListOfObjects(in, AddOnFileAdaptor.INSTANCE));
					break;
				}
				case "Likes": {
					out.setLikes(in.nextInt());
					break;
				}
				case "Name": {
					out.setName(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				}
				case "PackageType": {
					out.setPackageType(PackageTypesAdaptor.INSTANCE.read(in));
					break;
				}
				case "PopularityScore": {
					out.setPopularityScore(in.nextDouble());
					break;
				}
				case "PrimaryAuthorName": {
					out.setPrimaryAuthorName(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				}
				case "PrimaryCategoryAvatarUrl": {
					out.setPrimaryCategoryAvatarUrl(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				}
				case "PrimaryCategoryId": {
					out.setPrimaryCategoryId(in.nextInt());
					break;
				}
				case "PrimaryCategoryName": {
					out.setPrimaryCategoryName(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				}
				case "Rating": {
					out.setRating(in.nextInt());
					break;
				}
				case "Stage": {
					out.setStage(ProjectStageAdaptor.INSTANCE.read(in));
					break;
				}
				case "Status": {
					out.setStatus(ProjectStatusAdaptor.INSTANCE.read(in));
					break;
				}
				case "Summary": {
					out.setSummary(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				}
				case "WebSiteURL": {
					out.setWebSiteURL(ProjectFeedAdaptor.readStringOrNull(in));
					break;
				}
				default:
					throw new JsonParseException("Unknown property '"+prop+"'");
			}
		}
		in.endObject();
		
		return out;
	}
}
