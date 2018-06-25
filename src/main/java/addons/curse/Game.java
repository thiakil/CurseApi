package addons.curse;

import com.google.gson.annotations.JsonAdapter;
import com.thiakil.curseapi.json.adaptors.CalendarAdaptor;

import java.util.Calendar;
import java.util.List;

public class Game {
	public int id;
	public String name;
	public String slug;
	@JsonAdapter(CalendarAdaptor.class)
	public Calendar dateModified;
	public List<GameFile> gameFiles;
	public List<GameDetectionHint> gameDetectionHints;
	public List<GameFileParsingRule> fileParsingRules;
	public List<CategorySection> categorySections;
	public long maxFreeStorage;
	public long maxPremiumStorage;
	public long maxFileSize;
	public String AddonSettingsFolderFilter;
	public String AddonSettingsStartingFolder;
	public String AddonSettingsFileFilter;
	public String AddonSettingsFileRemovalFilter;
	public boolean supportsAddons;
	public SupportedClientConfiguration supportedClientConfiguration;
	public boolean supportsNotifications;
	public int profilerAddonId;
	public int twitchGameId;
}