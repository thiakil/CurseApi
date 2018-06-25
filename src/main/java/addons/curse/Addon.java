package addons.curse;

import com.google.gson.annotations.JsonAdapter;
import com.thiakil.curseapi.json.adaptors.CalendarAdaptor;

import java.util.Calendar;
import java.util.List;

public class Addon {
	public List<AddonAttachment> attachments;
	public List<AddonAuthor> authors;
	public String avatarUrl;
	public List<AddonCategory> categories;
	public String categoryList;
	public CategorySection categorySection;
	public String clientUrl;
	public int commentCount;
	@JsonAdapter(CalendarAdaptor.class)
	public Calendar dateCreated;
	@JsonAdapter(CalendarAdaptor.class)
	public Calendar dateModified;
	@JsonAdapter(CalendarAdaptor.class)
	public Calendar dateReleased;
	public int defaultFileId;
	public String donationUrl;
	public double downloadCount;
	public String externalUrl;
	public String fullDescription;
	public int gameId;
	public String gameName;
	public int gamePopularityRank;
	public List<GameVersionLatestFile> gameVersionLatestFiles;
	public int id;
	public int installCount;
	public boolean isAvailable;
	public int isFeatured;
	public List<AddonFile> latestFiles;
	public int likes;
	public String name;
	public PackageType packageType;
	public double popularityScore;
	public String portalName;
	public String primaryAuthorName;
	public String primaryCategoryAvatarUrl;
	public String primaryCategoryName;
	public int rating;
	public String sectionName;
	public String slug;
	public ProjectStage stage;
	public ProjectStatus status;
	public String summary;
	public String websiteUrl;
}