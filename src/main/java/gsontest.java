/*
 * CurseAPI library - Java abstraction layer for Curse's feed & SOAP API
 * Copyright (C) 2018  Thiakil
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import addons.curse.AddOn;
import addons.curse.AddOnFile;
import addons.curse.CategorySection;
import com.thiakil.curseapi.json.ProjectFeed;
import com.thiakil.curseapi.json.ProjectFeedDownloader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

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
		Set<AddOn> addons = db.getAddonsForAuthor("Thiakil");
		if (addons != null){
			addons.forEach(addOn -> System.out.println(addOn.getName()));
		} else {
			System.out.println("Author not found");
		}
	}

}
