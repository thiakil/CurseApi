package addons.curse;

import com.google.gson.annotations.JsonAdapter;
import com.thiakil.curseapi.json.adaptors.CalendarAdaptor;

import java.util.Calendar;

public class MinecraftModLoaderVersion {
	public String additionalFilesJson;
	public boolean approved;
	@JsonAdapter(CalendarAdaptor.class)
	public Calendar dateModified;
	public String downloadUrl;
	public String filename;
	public ModLoaderInstallMethod installMethod;
	public boolean latest;
	public String librariesInstallLocation;
	public String mavenVersionString;
	public String minecraftVersion;
	public String name;
	public boolean recommended;
	public ModLoaderType type;
	public String versionJson;
}