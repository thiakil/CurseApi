package addons.curse;

import com.google.gson.annotations.JsonAdapter;
import com.thiakil.curseapi.json.adaptors.CalendarAdaptor;

import java.util.Calendar;
import java.util.List;

public class SyncedGameInstance {
	public List<SyncedAddon> addons;
	public List<SyncedComputer> computers;
	public int gameId;
	public int instanceId;
	public String instanceName;
	@JsonAdapter(CalendarAdaptor.class)
	public Calendar lastBackupDate;
	public long lastBackupFingerprint;
	public long lastBackupScreenHeight;
	public long lastBackupScreenWidth;
}