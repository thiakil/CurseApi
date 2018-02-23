import com.thiakil.curseapi.json.ProjectFeed;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Thiakil on 22/02/2018.
 */
public class gsontest {
	public static void main(String[] args) throws IOException {
		ProjectFeed test = ProjectFeed.GSON.fromJson(new FileReader("C:\\Users\\xander.v\\Downloads\\hourly.json"), ProjectFeed.class);
		System.out.println(test.getAddons().size());
	}
	
}
