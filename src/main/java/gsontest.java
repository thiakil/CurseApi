import addons.curse.AddOn;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.thiakil.curseapi.json.JsonDump;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by Thiakil on 22/02/2018.
 */
public class gsontest {
	public static void main(String[] args) throws IOException {
		JsonDump test = JsonDump.GSON.fromJson(new FileReader("C:\\Users\\xander.v\\Downloads\\hourly.json"), JsonDump.class);
		System.out.println(test.getAddons().size());
	}

	public static class Hourly{
		@Expose
		long timestamp;
		@Expose
		List<AddOn> data;
	}
}
