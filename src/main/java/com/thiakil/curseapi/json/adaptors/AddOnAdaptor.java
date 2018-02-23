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
		throw new IllegalStateException("TODO");
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