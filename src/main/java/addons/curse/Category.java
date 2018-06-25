package addons.curse;

import com.google.gson.annotations.JsonAdapter;
import com.thiakil.curseapi.json.adaptors.CalendarAdaptor;

import java.util.Calendar;

public class Category {
	public String avatarUrl;
	@JsonAdapter(CalendarAdaptor.class)
	public Calendar dateModified;
	public int[] gameIds;
	public int id;
	public String name;
	public int parentId;
	public String slug;
}