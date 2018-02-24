import addons.curse.AddOnFile;
import com.thiakil.curseapi.json.ProjectFeed;
import com.thiakil.curseapi.json.ProjectFeedDownloader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Thiakil on 22/02/2018.
 */
public class gsontest {
	public static void main(String[] args) throws IOException {
		ProjectFeedDownloader db = new ProjectFeedDownloader();
		File dbStorage = new File(ProjectFeedDownloader.DEFAULT_CACHE_DIR, "db.json");
		db.load(dbStorage);
		db.sync();
		db.save(dbStorage);
		System.out.printf("Loaded %d addons\n", db.getAddOns().size());
		db.getAddonById(268560).ifPresent(addOn -> {
			for (AddOnFile f : addOn.getLatestFiles()) {
				System.out.print(f.getFileName());
				System.out.print(" : ");
				System.out.println(f.getPackageFingerprint());
			}
		});
	}
	
}
