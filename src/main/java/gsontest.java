import addons.curse.AddOn;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by Thiakil on 22/02/2018.
 */
public class gsontest {
	public static void main(String[] args) throws IOException {
		Gson GSON = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

		Hourly test = GSON.fromJson(new FileReader("C:\\Users\\lex\\Downloads\\hourly.json"), Hourly.class);
		System.out.println(test.data.size());
	}

	public static class Hourly{
		@Expose
		long timestamp;
		@Expose
		List<AddOn> data;
	}
}
