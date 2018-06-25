package addons.curse;

import com.google.gson.annotations.JsonAdapter;
import com.thiakil.curseapi.json.adaptors.CalendarAdaptor;

import java.util.Calendar;

public class MinecraftModLoaderIndex {
	public String name;
	public String gameVersion;
	public boolean latest;
	public boolean recommended;
	@JsonAdapter(CalendarAdaptor.class)
	public Calendar dateModified;
}