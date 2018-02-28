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

/**
 * AddOn.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package addons.curse;


import com.curse.addonservice.ExtensionMapper;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.thiakil.curseapi.soap.Util;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axis2.databinding.ADBBean;
import org.apache.axis2.databinding.ADBDataSource;
import org.apache.axis2.databinding.ADBException;
import org.apache.axis2.databinding.utils.BeanUtil;
import org.apache.axis2.databinding.utils.ConverterUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.datacontract.schemas._2004._07.curse_addons.ArrayOfGameVersionLatestFile;
import org.datacontract.schemas._2004._07.curse_addons.GameVersionLatestFile;
import org.datacontract.schemas._2004._07.curse_addons.PackageTypes;
import org.datacontract.schemas._2004._07.curse_addons.ProjectStage;
import org.datacontract.schemas._2004._07.curse_addons.ProjectStatus;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import java.util.List;
import java.util.Vector;

/**
 * AddOn bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class AddOn implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = AddOn
       Namespace URI = Curse.AddOns
       Namespace Prefix = ns4
     */

	/**
	 * field for Attachments
	 */
	@SerializedName("Attachments")
	@Expose
	protected List<AddOnAttachment> localAttachments;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localAttachmentsTracker = false;

	/**
	 * field for Authors
	 */
	@SerializedName("Authors")
	@Expose
	protected List<AddOnAuthor> localAuthors;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localAuthorsTracker = false;

	/**
	 * field for AvatarUrl
	 */
	@SerializedName("AvatarUrl")
	@Expose
	protected String localAvatarUrl;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localAvatarUrlTracker = false;

	/**
	 * field for Categories
	 */
	@SerializedName("Categories")
	@Expose
	protected List<AddOnCategory> localCategories;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localCategoriesTracker = false;

	/**
	 * field for CategorySection
	 */
	@SerializedName("CategorySection")
	@Expose
	protected CategorySection localCategorySection;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localCategorySectionTracker = false;

	/**
	 * field for CommentCount
	 */
	@SerializedName("CommentCount")
	@Expose
	protected int localCommentCount;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localCommentCountTracker = false;

	/**
	 * field for DefaultFileId
	 */
	@SerializedName("DefaultFileId")
	@Expose
	protected int localDefaultFileId;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localDefaultFileIdTracker = false;

	/**
	 * field for DonationUrl
	 */
	@SerializedName("DonationUrl")
	@Expose
	protected String localDonationUrl;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localDonationUrlTracker = false;

	/**
	 * field for DownloadCount
	 */
	@SerializedName("DownloadCount")
	@Expose
	protected double localDownloadCount;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localDownloadCountTracker = false;

	/**
	 * field for ExternalUrl
	 */
	@SerializedName("ExternalUrl")
	@Expose
	protected String localExternalUrl;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localExternalUrlTracker = false;

	/**
	 * field for GameId
	 */
	@SerializedName("GameId")
	@Expose
	protected int localGameId;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localGameIdTracker = false;

	/**
	 * field for GamePopularityRank
	 */
	@SerializedName("GamePopularityRank")
	@Expose
	protected int localGamePopularityRank;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localGamePopularityRankTracker = false;

	/**
	 * field for GameVersionLatestFiles
	 */
	@SerializedName("GameVersionLatestFiles")
	@Expose
	protected List<GameVersionLatestFile> localGameVersionLatestFiles;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localGameVersionLatestFilesTracker = false;

	/**
	 * field for IconId
	 */
	@SerializedName("IconId")
	@Expose
	protected int localIconId;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localIconIdTracker = false;

	/**
	 * field for Id
	 */
	@SerializedName("Id")
	@Expose
	protected int localId;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localIdTracker = false;

	/**
	 * field for InstallCount
	 */
	@SerializedName("InstallCount")
	@Expose
	protected int localInstallCount;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localInstallCountTracker = false;

	/**
	 * field for IsFeatured
	 */
	@SerializedName("IsFeatured")
	@Expose
	protected int localIsFeatured;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localIsFeaturedTracker = false;

	/**
	 * field for LatestFiles
	 */
	@SerializedName("LatestFiles")
	@Expose
	protected List<AddOnFile> localLatestFiles;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localLatestFilesTracker = false;

	/**
	 * field for Likes
	 */
	@SerializedName("Likes")
	@Expose
	protected int localLikes;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localLikesTracker = false;

	/**
	 * field for Name
	 */
	@SerializedName("Name")
	@Expose
	protected String localName;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localNameTracker = false;

	/**
	 * field for PackageType
	 */
	@SerializedName("PackageType")
	@Expose
	protected PackageTypes localPackageType;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localPackageTypeTracker = false;

	/**
	 * field for PopularityScore
	 */
	@SerializedName("PopularityScore")
	@Expose
	protected double localPopularityScore;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localPopularityScoreTracker = false;

	/**
	 * field for PrimaryAuthorName
	 */
	@SerializedName("PrimaryAuthorName")
	@Expose
	protected String localPrimaryAuthorName;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localPrimaryAuthorNameTracker = false;

	/**
	 * field for PrimaryCategoryAvatarUrl
	 */
	@SerializedName("PrimaryCategoryAvatarUrl")
	@Expose
	protected String localPrimaryCategoryAvatarUrl;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localPrimaryCategoryAvatarUrlTracker = false;

	/**
	 * field for PrimaryCategoryId
	 */
	@SerializedName("PrimaryCategoryId")
	@Expose
	protected int localPrimaryCategoryId;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localPrimaryCategoryIdTracker = false;

	/**
	 * field for PrimaryCategoryName
	 */
	@SerializedName("PrimaryCategoryName")
	@Expose
	protected String localPrimaryCategoryName;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localPrimaryCategoryNameTracker = false;

	/**
	 * field for Rating
	 */
	@SerializedName("Rating")
	@Expose
	protected int localRating;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localRatingTracker = false;

	/**
	 * field for Stage
	 */
	@SerializedName("Stage")
	@Expose
	protected ProjectStage localStage;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localStageTracker = false;

	/**
	 * field for Status
	 */
	@SerializedName("Status")
	@Expose
	protected ProjectStatus localStatus;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localStatusTracker = false;

	/**
	 * field for Summary
	 */
	@SerializedName("Summary")
	@Expose
	protected String localSummary;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localSummaryTracker = false;

	/**
	 * field for WebSiteURL
	 */
	@SerializedName("WebSiteURL")
	@Expose
	protected String localWebSiteURL;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localWebSiteURLTracker = false;
	
	public AddOn() {
	}
	
	public AddOn(List<AddOnAttachment> attachments, List<AddOnAuthor> authors, String avatarUrl, List<AddOnCategory> categories, CategorySection categorySection, int commentCount, int defaultFileId, String donationUrl, double downloadCount, String externalUrl, int gameId, int gamePopularityRank, List<GameVersionLatestFile> gameVersionLatestFiles, int iconId, int id, int installCount, int iIsFeatured, List<AddOnFile> latestFiles, int likes, String name, PackageTypes packageType, double popularityScore, String primaryAuthorName, String primaryCategoryAvatarUrl, int primaryCategoryId, String primaryCategoryName, int rating, ProjectStage stage, ProjectStatus status, String summary, String webSiteURL) {
		this.setAttachments(attachments);
		this.setAuthors(authors);
		this.setAvatarUrl(avatarUrl);
		this.setCategories(categories);
		this.setCategorySection(categorySection);
		this.setCommentCount(commentCount);
		this.setDefaultFileId(defaultFileId);
		this.setDonationUrl(donationUrl);
		this.setDownloadCount(downloadCount);
		this.setExternalUrl(externalUrl);
		this.setGameId(gameId);
		this.setGamePopularityRank(gamePopularityRank);
		this.setGameVersionLatestFiles(gameVersionLatestFiles);
		this.setIconId(iconId);
		this.setId(id);
		this.setInstallCount(installCount);
		this.setIsFeatured(iIsFeatured);
		this.setLatestFiles(latestFiles);
		this.setLikes(likes);
		this.setName(name);
		this.setPackageType(packageType);
		this.setPopularityScore(popularityScore);
		this.setPrimaryAuthorName(primaryAuthorName);
		this.setPrimaryCategoryAvatarUrl(primaryCategoryAvatarUrl);
		this.setPrimaryCategoryId(primaryCategoryId);
		this.setPrimaryCategoryName(primaryCategoryName);
		this.setRating(rating);
		this.setStage(stage);
		this.setStatus(status);
		this.setSummary(summary);
		this.setWebSiteURL(webSiteURL);
	}
	
	public boolean isAttachmentsSpecified() {
		return localAttachmentsTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return addons.curse.List<AddOnAttachment>
	 */
	public List<AddOnAttachment> getAttachments() {
		return localAttachments;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Attachments
	 */
	public void setAttachments(List<AddOnAttachment> param) {
		localAttachmentsTracker = true;

		this.localAttachments = param;
	}

	public boolean isAuthorsSpecified() {
		return localAuthorsTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return addons.curse.List<AddOnAuthor>
	 */
	public List<AddOnAuthor> getAuthors() {
		return localAuthors;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Authors
	 */
	public void setAuthors(List<AddOnAuthor> param) {
		localAuthorsTracker = true;

		this.localAuthors = param;
	}

	public boolean isAvatarUrlSpecified() {
		return localAvatarUrlTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getAvatarUrl() {
		return localAvatarUrl;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param AvatarUrl
	 */
	public void setAvatarUrl(String param) {
		localAvatarUrlTracker = true;

		this.localAvatarUrl = param;
	}

	public boolean isCategoriesSpecified() {
		return localCategoriesTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return addons.curse.List<AddOnCategory>
	 */
	public List<AddOnCategory> getCategories() {
		return localCategories;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Categories
	 */
	public void setCategories(List<AddOnCategory> param) {
		localCategoriesTracker = true;

		this.localCategories = param;
	}

	public boolean isCategorySectionSpecified() {
		return localCategorySectionTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return addons.curse.CategorySection
	 */
	public CategorySection getCategorySection() {
		return localCategorySection;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param CategorySection
	 */
	public void setCategorySection(CategorySection param) {
		localCategorySectionTracker = true;

		this.localCategorySection = param;
	}

	public boolean isCommentCountSpecified() {
		return localCommentCountTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getCommentCount() {
		return localCommentCount;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param CommentCount
	 */
	public void setCommentCount(int param) {
		// setting primitive attribute tracker to true
		localCommentCountTracker = param != Integer.MIN_VALUE;

		this.localCommentCount = param;
	}

	public boolean isDefaultFileIdSpecified() {
		return localDefaultFileIdTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getDefaultFileId() {
		return localDefaultFileId;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param DefaultFileId
	 */
	public void setDefaultFileId(int param) {
		// setting primitive attribute tracker to true
		localDefaultFileIdTracker = param != Integer.MIN_VALUE;

		this.localDefaultFileId = param;
	}

	public boolean isDonationUrlSpecified() {
		return localDonationUrlTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getDonationUrl() {
		return localDonationUrl;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param DonationUrl
	 */
	public void setDonationUrl(String param) {
		localDonationUrlTracker = true;

		this.localDonationUrl = param;
	}

	public boolean isDownloadCountSpecified() {
		return localDownloadCountTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return double
	 */
	public double getDownloadCount() {
		return localDownloadCount;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param DownloadCount
	 */
	public void setDownloadCount(double param) {
		// setting primitive attribute tracker to true
		localDownloadCountTracker = !Double.isNaN(param);

		this.localDownloadCount = param;
	}

	public boolean isExternalUrlSpecified() {
		return localExternalUrlTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getExternalUrl() {
		return localExternalUrl;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param ExternalUrl
	 */
	public void setExternalUrl(String param) {
		localExternalUrlTracker = true;

		this.localExternalUrl = param;
	}

	public boolean isGameIdSpecified() {
		return localGameIdTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getGameId() {
		return localGameId;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param GameId
	 */
	public void setGameId(int param) {
		// setting primitive attribute tracker to true
		localGameIdTracker = param != Integer.MIN_VALUE;

		this.localGameId = param;
	}

	public boolean isGamePopularityRankSpecified() {
		return localGamePopularityRankTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getGamePopularityRank() {
		return localGamePopularityRank;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param GamePopularityRank
	 */
	public void setGamePopularityRank(int param) {
		// setting primitive attribute tracker to true
		localGamePopularityRankTracker = param != Integer.MIN_VALUE;

		this.localGamePopularityRank = param;
	}

	public boolean isGameVersionLatestFilesSpecified() {
		return localGameVersionLatestFilesTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return org.datacontract.schemas._2004._07.curse_addons.List<GameVersionLatestFile>
	 */
	public List<GameVersionLatestFile> getGameVersionLatestFiles() {
		return localGameVersionLatestFiles;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param GameVersionLatestFiles
	 */
	public void setGameVersionLatestFiles(List<GameVersionLatestFile> param) {
		localGameVersionLatestFilesTracker = true;

		this.localGameVersionLatestFiles = param;
	}

	public boolean isIconIdSpecified() {
		return localIconIdTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getIconId() {
		return localIconId;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param IconId
	 */
	public void setIconId(int param) {
		// setting primitive attribute tracker to true
		localIconIdTracker = param != Integer.MIN_VALUE;

		this.localIconId = param;
	}

	public boolean isIdSpecified() {
		return localIdTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getId() {
		return localId;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Id
	 */
	public void setId(int param) {
		// setting primitive attribute tracker to true
		localIdTracker = param != Integer.MIN_VALUE;

		this.localId = param;
	}

	public boolean isInstallCountSpecified() {
		return localInstallCountTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getInstallCount() {
		return localInstallCount;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param InstallCount
	 */
	public void setInstallCount(int param) {
		// setting primitive attribute tracker to true
		localInstallCountTracker = param != Integer.MIN_VALUE;

		this.localInstallCount = param;
	}

	public boolean isIsFeaturedSpecified() {
		return localIsFeaturedTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getIsFeatured() {
		return localIsFeatured;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param IsFeatured
	 */
	public void setIsFeatured(int param) {
		// setting primitive attribute tracker to true
		localIsFeaturedTracker = param != Integer.MIN_VALUE;

		this.localIsFeatured = param;
	}

	public boolean isLatestFilesSpecified() {
		return localLatestFilesTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return addons.curse.List<AddOnFile>
	 */
	public List<AddOnFile> getLatestFiles() {
		return localLatestFiles;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param LatestFiles
	 */
	public void setLatestFiles(List<AddOnFile> param) {
		localLatestFilesTracker = true;

		this.localLatestFiles = param;
	}

	public boolean isLikesSpecified() {
		return localLikesTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getLikes() {
		return localLikes;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Likes
	 */
	public void setLikes(int param) {
		// setting primitive attribute tracker to true
		localLikesTracker = param != Integer.MIN_VALUE;

		this.localLikes = param;
	}

	public boolean isNameSpecified() {
		return localNameTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getName() {
		return localName;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Name
	 */
	public void setName(String param) {
		localNameTracker = true;

		this.localName = param;
	}

	public boolean isPackageTypeSpecified() {
		return localPackageTypeTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return org.datacontract.schemas._2004._07.curse_addons.PackageTypes
	 */
	public PackageTypes getPackageType() {
		return localPackageType;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param PackageType
	 */
	public void setPackageType(PackageTypes param) {
		localPackageTypeTracker = param != null;

		this.localPackageType = param;
	}

	public boolean isPopularityScoreSpecified() {
		return localPopularityScoreTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return double
	 */
	public double getPopularityScore() {
		return localPopularityScore;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param PopularityScore
	 */
	public void setPopularityScore(double param) {
		// setting primitive attribute tracker to true
		localPopularityScoreTracker = !Double.isNaN(param);

		this.localPopularityScore = param;
	}

	public boolean isPrimaryAuthorNameSpecified() {
		return localPrimaryAuthorNameTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getPrimaryAuthorName() {
		return localPrimaryAuthorName;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param PrimaryAuthorName
	 */
	public void setPrimaryAuthorName(String param) {
		localPrimaryAuthorNameTracker = true;

		this.localPrimaryAuthorName = param;
	}

	public boolean isPrimaryCategoryAvatarUrlSpecified() {
		return localPrimaryCategoryAvatarUrlTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getPrimaryCategoryAvatarUrl() {
		return localPrimaryCategoryAvatarUrl;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param PrimaryCategoryAvatarUrl
	 */
	public void setPrimaryCategoryAvatarUrl(String param) {
		localPrimaryCategoryAvatarUrlTracker = true;

		this.localPrimaryCategoryAvatarUrl = param;
	}

	public boolean isPrimaryCategoryIdSpecified() {
		return localPrimaryCategoryIdTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getPrimaryCategoryId() {
		return localPrimaryCategoryId;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param PrimaryCategoryId
	 */
	public void setPrimaryCategoryId(int param) {
		// setting primitive attribute tracker to true
		localPrimaryCategoryIdTracker = param != Integer.MIN_VALUE;

		this.localPrimaryCategoryId = param;
	}

	public boolean isPrimaryCategoryNameSpecified() {
		return localPrimaryCategoryNameTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getPrimaryCategoryName() {
		return localPrimaryCategoryName;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param PrimaryCategoryName
	 */
	public void setPrimaryCategoryName(String param) {
		localPrimaryCategoryNameTracker = true;

		this.localPrimaryCategoryName = param;
	}

	public boolean isRatingSpecified() {
		return localRatingTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getRating() {
		return localRating;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Rating
	 */
	public void setRating(int param) {
		// setting primitive attribute tracker to true
		localRatingTracker = param != Integer.MIN_VALUE;

		this.localRating = param;
	}

	public boolean isStageSpecified() {
		return localStageTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return org.datacontract.schemas._2004._07.curse_addons.ProjectStage
	 */
	public ProjectStage getStage() {
		return localStage;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Stage
	 */
	public void setStage(ProjectStage param) {
		localStageTracker = param != null;

		this.localStage = param;
	}

	public boolean isStatusSpecified() {
		return localStatusTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return org.datacontract.schemas._2004._07.curse_addons.ProjectStatus
	 */
	public ProjectStatus getStatus() {
		return localStatus;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Status
	 */
	public void setStatus(ProjectStatus param) {
		localStatusTracker = param != null;

		this.localStatus = param;
	}

	public boolean isSummarySpecified() {
		return localSummaryTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getSummary() {
		return localSummary;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Summary
	 */
	public void setSummary(String param) {
		localSummaryTracker = true;

		this.localSummary = param;
	}

	public boolean isWebSiteURLSpecified() {
		return localWebSiteURLTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getWebSiteURL() {
		return localWebSiteURL;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param WebSiteURL
	 */
	public void setWebSiteURL(String param) {
		localWebSiteURLTracker = true;

		this.localWebSiteURL = param;
	}

	@Override
	public int hashCode() {
		return this.localId;
	}

	/**
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public OMElement getOMElement(final QName parentQName, final OMFactory factory) {
		return factory.createOMElement(new ADBDataSource(this, parentQName));
	}

	public void serialize(final QName parentQName, XMLStreamWriter xmlWriter) throws XMLStreamException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final QName parentQName, XMLStreamWriter xmlWriter, boolean serializeType) throws XMLStreamException {
		String prefix = null;
		String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		Util.writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {
			String namespacePrefix = Util.registerPrefix(xmlWriter, "Curse.AddOns");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":AddOn", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "AddOn", xmlWriter);
			}
		}

		if (localAttachmentsTracker) {
			if (localAttachments == null) {
				Util.writeStartElement(null, "Curse.AddOns", "Attachments", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				ArrayOfAddOnAttachment.serialize(new QName("Curse.AddOns", "Attachments"), xmlWriter, localAttachments);
			}
		}

		if (localAuthorsTracker) {
			if (localAuthors == null) {
				Util.writeStartElement(null, "Curse.AddOns", "Authors", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				ArrayOfAddOnAuthor.serialize(new QName("Curse.AddOns", "Authors"), xmlWriter, localAuthors);
			}
		}

		if (localAvatarUrlTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "AvatarUrl", xmlWriter);

			if (localAvatarUrl == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localAvatarUrl);
			}

			xmlWriter.writeEndElement();
		}

		if (localCategoriesTracker) {
			if (localCategories == null) {
				Util.writeStartElement(null, "Curse.AddOns", "Categories", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				ArrayOfAddOnCategory.serialize(new QName("Curse.AddOns", "Categories"), xmlWriter, localCategories);
			}
		}

		if (localCategorySectionTracker) {
			if (localCategorySection == null) {
				Util.writeStartElement(null, "Curse.AddOns", "CategorySection", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localCategorySection.serialize(new QName("Curse.AddOns", "CategorySection"), xmlWriter);
			}
		}

		if (localCommentCountTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "CommentCount", xmlWriter);

			if (localCommentCount == Integer.MIN_VALUE) {
				throw new ADBException("CommentCount cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localCommentCount));
			}

			xmlWriter.writeEndElement();
		}

		if (localDefaultFileIdTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "DefaultFileId", xmlWriter);

			if (localDefaultFileId == Integer.MIN_VALUE) {
				throw new ADBException("DefaultFileId cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localDefaultFileId));
			}

			xmlWriter.writeEndElement();
		}

		if (localDonationUrlTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "DonationUrl", xmlWriter);

			if (localDonationUrl == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localDonationUrl);
			}

			xmlWriter.writeEndElement();
		}

		if (localDownloadCountTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "DownloadCount", xmlWriter);

			if (Double.isNaN(localDownloadCount)) {
				throw new ADBException("DownloadCount cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localDownloadCount));
			}

			xmlWriter.writeEndElement();
		}

		if (localExternalUrlTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "ExternalUrl", xmlWriter);

			if (localExternalUrl == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localExternalUrl);
			}

			xmlWriter.writeEndElement();
		}

		if (localGameIdTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "GameId", xmlWriter);

			if (localGameId == Integer.MIN_VALUE) {
				throw new ADBException("GameId cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localGameId));
			}

			xmlWriter.writeEndElement();
		}

		if (localGamePopularityRankTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "GamePopularityRank", xmlWriter);

			if (localGamePopularityRank == Integer.MIN_VALUE) {
				throw new ADBException("GamePopularityRank cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localGamePopularityRank));
			}

			xmlWriter.writeEndElement();
		}

		if (localGameVersionLatestFilesTracker) {
			if (localGameVersionLatestFiles == null) {
				Util.writeStartElement(null, "Curse.AddOns", "GameVersionLatestFiles", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				ArrayOfGameVersionLatestFile.serialize(new QName("Curse.AddOns", "GameVersionLatestFiles"), xmlWriter, localGameVersionLatestFiles);
			}
		}

		if (localIconIdTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "IconId", xmlWriter);

			if (localIconId == Integer.MIN_VALUE) {
				throw new ADBException("IconId cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localIconId));
			}

			xmlWriter.writeEndElement();
		}

		if (localIdTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "Id", xmlWriter);

			if (localId == Integer.MIN_VALUE) {
				throw new ADBException("Id cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localId));
			}

			xmlWriter.writeEndElement();
		}

		if (localInstallCountTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "InstallCount", xmlWriter);

			if (localInstallCount == Integer.MIN_VALUE) {
				throw new ADBException("InstallCount cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localInstallCount));
			}

			xmlWriter.writeEndElement();
		}

		if (localIsFeaturedTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "IsFeatured", xmlWriter);

			if (localIsFeatured == Integer.MIN_VALUE) {
				throw new ADBException("IsFeatured cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localIsFeatured));
			}

			xmlWriter.writeEndElement();
		}

		if (localLatestFilesTracker) {
			if (localLatestFiles == null) {
				Util.writeStartElement(null, "Curse.AddOns", "LatestFiles", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				ArrayOfAddOnFile.Factory.serialize(new QName("Curse.AddOns", "LatestFiles"), xmlWriter, localLatestFiles);
			}
		}

		if (localLikesTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "Likes", xmlWriter);

			if (localLikes == Integer.MIN_VALUE) {
				throw new ADBException("Likes cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localLikes));
			}

			xmlWriter.writeEndElement();
		}

		if (localNameTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "Name", xmlWriter);

			if (localName == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localName);
			}

			xmlWriter.writeEndElement();
		}

		if (localPackageTypeTracker) {
			if (localPackageType == null) {
				throw new ADBException("PackageType cannot be null!!");
			}

			localPackageType.serialize(new QName("Curse.AddOns", "PackageType"), xmlWriter);
		}

		if (localPopularityScoreTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "PopularityScore", xmlWriter);

			if (Double.isNaN(localPopularityScore)) {
				throw new ADBException("PopularityScore cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localPopularityScore));
			}

			xmlWriter.writeEndElement();
		}

		if (localPrimaryAuthorNameTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "PrimaryAuthorName", xmlWriter);

			if (localPrimaryAuthorName == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localPrimaryAuthorName);
			}

			xmlWriter.writeEndElement();
		}

		if (localPrimaryCategoryAvatarUrlTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "PrimaryCategoryAvatarUrl", xmlWriter);

			if (localPrimaryCategoryAvatarUrl == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localPrimaryCategoryAvatarUrl);
			}

			xmlWriter.writeEndElement();
		}

		if (localPrimaryCategoryIdTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "PrimaryCategoryId", xmlWriter);

			if (localPrimaryCategoryId == Integer.MIN_VALUE) {
				throw new ADBException("PrimaryCategoryId cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localPrimaryCategoryId));
			}

			xmlWriter.writeEndElement();
		}

		if (localPrimaryCategoryNameTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "PrimaryCategoryName", xmlWriter);

			if (localPrimaryCategoryName == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localPrimaryCategoryName);
			}

			xmlWriter.writeEndElement();
		}

		if (localRatingTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "Rating", xmlWriter);

			if (localRating == Integer.MIN_VALUE) {
				throw new ADBException("Rating cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localRating));
			}

			xmlWriter.writeEndElement();
		}

		if (localStageTracker) {
			if (localStage == null) {
				throw new ADBException("Stage cannot be null!!");
			}

			localStage.serialize(new QName("Curse.AddOns", "Stage"), xmlWriter);
		}

		if (localStatusTracker) {
			if (localStatus == null) {
				throw new ADBException("Status cannot be null!!");
			}

			localStatus.serialize(new QName("Curse.AddOns", "Status"), xmlWriter);
		}

		if (localSummaryTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "Summary", xmlWriter);

			if (localSummary == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localSummary);
			}

			xmlWriter.writeEndElement();
		}

		if (localWebSiteURLTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "WebSiteURL", xmlWriter);

			if (localWebSiteURL == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localWebSiteURL);
			}

			xmlWriter.writeEndElement();
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals("Curse.AddOns")) {
			return "ns4";
		}

		return BeanUtil.getUniquePrefix();
	}











	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {
		private static Log log = LogFactory.getLog(Factory.class);

		/**
		 * static method to create the object
		 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
		 * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
		 * Postcondition: If this object is an element, the reader is positioned at its end element
		 * If this object is a complex type, the reader is positioned at the end element of its outer element
		 */
		public static AddOn parse(XMLStreamReader reader) throws Exception {
			AddOn object = new AddOn();

			int event;
			QName currentQName = null;
			String nillableValue = null;
			String prefix = "";
			String namespaceuri = "";

			try {
				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				currentQName = reader.getName();

				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");

					if (fullTypeName != null) {
						String nsPrefix = null;

						if (fullTypeName.contains(":")) {
							nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
						}

						nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

						String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

						if (!"AddOn".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (AddOn) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Attachments").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setAttachments(null);
						reader.next();

						reader.next();
					} else {
						object.setAttachments(ArrayOfAddOnAttachment.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Authors").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setAuthors(null);
						reader.next();

						reader.next();
					} else {
						object.setAuthors(ArrayOfAddOnAuthor.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "AvatarUrl").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setAvatarUrl(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Categories").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setCategories(null);
						reader.next();

						reader.next();
					} else {
						object.setCategories(ArrayOfAddOnCategory.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "CategorySection").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setCategorySection(null);
						reader.next();

						reader.next();
					} else {
						object.setCategorySection(CategorySection.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "CommentCount").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "CommentCount" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setCommentCount(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setCommentCount(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "DefaultFileId").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "DefaultFileId" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setDefaultFileId(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setDefaultFileId(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "DonationUrl").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setDonationUrl(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "DownloadCount").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "DownloadCount" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setDownloadCount(ConverterUtil.convertToDouble(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setDownloadCount(Double.NaN);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "ExternalUrl").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setExternalUrl(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "GameId").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "GameId" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setGameId(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setGameId(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "GamePopularityRank").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "GamePopularityRank" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setGamePopularityRank(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setGamePopularityRank(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "GameVersionLatestFiles").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setGameVersionLatestFiles(null);
						reader.next();

						reader.next();
					} else {
						object.setGameVersionLatestFiles(ArrayOfGameVersionLatestFile.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "IconId").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "IconId" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setIconId(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setIconId(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Id").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "Id" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setId(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setId(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "InstallCount").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "InstallCount" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setInstallCount(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setInstallCount(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "IsFeatured").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "IsFeatured" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setIsFeatured(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setIsFeatured(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "LatestFiles").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setLatestFiles(null);
						reader.next();

						reader.next();
					} else {
						object.setLatestFiles(ArrayOfAddOnFile.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Likes").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "Likes" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setLikes(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setLikes(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Name").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setName(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "PackageType").equals(reader.getName())) {
					object.setPackageType(PackageTypes.Factory.parse(reader));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "PopularityScore").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "PopularityScore" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setPopularityScore(ConverterUtil.convertToDouble(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setPopularityScore(Double.NaN);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "PrimaryAuthorName").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setPrimaryAuthorName(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "PrimaryCategoryAvatarUrl").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setPrimaryCategoryAvatarUrl(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "PrimaryCategoryId").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "PrimaryCategoryId" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setPrimaryCategoryId(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setPrimaryCategoryId(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "PrimaryCategoryName").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setPrimaryCategoryName(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Rating").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "Rating" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setRating(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setRating(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Stage").equals(reader.getName())) {
					object.setStage(ProjectStage.Factory.parse(reader));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Status").equals(reader.getName())) {
					object.setStatus(ProjectStatus.Factory.parse(reader));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Summary").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setSummary(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "WebSiteURL").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setWebSiteURL(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement()) {
					// 2 - A start element we are not expecting indicates a trailing invalid property
					throw new ADBException("Unexpected subelement " + reader.getName());
				}
			} catch (XMLStreamException e) {
				throw new Exception(e);
			}

			return object;
		}
	} //end of factory class
}
