package addons.curse;

import com.google.gson.annotations.JsonAdapter;
import com.thiakil.curseapi.json.adaptors.CalendarAdaptor;

import java.util.Calendar;
import java.util.List;

public class AddonFile {
	public int alternateFileId;
	public List<AddonFileDependency> dependencies;
	public String downloadUrl;
	@JsonAdapter(CalendarAdaptor.class)
	public Calendar fileDate;
	public String fileName;
	public String fileNameOnDisk;
	public FileStatus fileStatus;
	public List<String> gameVersion;
	public int id;
	public boolean isAlternate;
	public boolean isAvailable;
	public List<AddonModule> modules;
	public long packageFingerprint;
	public FileType releaseType;
}