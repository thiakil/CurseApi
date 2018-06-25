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
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * This library may be dynamically linked against (used as a dependency) in any project licenced under terms requiring complete
 * source code availability (a "FREE SOFTWARE LICENCE" https://www.gnu.org/philosophy/free-sw.html), such as the Apache License(s),
 * without the using project being required to be GPL licenced. This library remains GPL licenced and any modifications to this
 * library must still be made under the terms of the GPL. Bundling of the compiled binary class files ("fat jars") is permitted
 * for OPEN SOURCE projects, provided no modifications have been made (in which case source code for modifications must be available).
 *
 * Repackaging (sometimes known as "shading") where ONLY the package names are changed to avoid conflicts requires the configuration
 * and instructions for the method of repackaging to be made available in the same manner as source code.
 *
 * You may NOT use this library in a closed source project under any circumstance.
 */

import addons.curse.Addon;
import addons.curse.AddonFile;
import addons.curse.FingerprintMatchResult;
import com.thiakil.curseapi.json.AddonServiceJson;
import com.thiakil.curseapi.login.*;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import org.apache.axis2.databinding.utils.ConverterUtil;


import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by Thiakil on 19/02/2018.
 */
public class test {
	public static void main(String[] args) throws CurseAuthException {
		if (args.length <2){
			throw new RuntimeException("need user and pass on command line");
		}
		//try {
			LoginSession session = null;
			File sessionStore = new File("curse_session.json");
			if (sessionStore.exists()){
				try {
					LoginSession tmp = LoginSession.fromFile(sessionStore);
					if (tmp != null && tmp.isValid()){
						session = tmp;
						if (session.shouldRenew()){
							session.renew();
							session.saveToFile(sessionStore);
						}
						System.out.println("session loaded from file");
					}
				} catch (IOException e){
					//new token it is
				}
			}
			if (session == null) {
				LoginSessionProvider sessionProvider = CurseAuth.getResponseFromCurseAccount(args[0], args[1]);
				session = sessionProvider.getLoginSession();
				try {
					session.saveToFile(sessionStore);
				} catch (IOException e) {
					System.err.println(e.getMessage());
					e.printStackTrace(System.err);
				}
			}
			Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
			calendar.clear();
			calendar.setTimeInMillis(session.expires);
			StringBuffer sb = new StringBuffer(20);
			ConverterUtil.appendTime(calendar, sb);
			sb.append(" ");
			ConverterUtil.appendDate(sb, calendar);
			sb.append(" ");
			ConverterUtil.appendTimeZone(calendar, sb);
			System.out.printf("Expiry: %s\n", sb.toString());

		AddonServiceJson svc = new AddonServiceJson(session.createCurseToken());
		//AddOn addon = svc.GetAddOn(268560);
		//System.out.println(addon);
		//System.out.println(svc.GetRepositoryMatchFromSlug("mc", "jei"));
		//System.out.println(svc.getString("api/addon/269708/files"));
		List<AddonFile> res = svc.GetAddonFiles(269708);
		for (AddonFile f : res) {
			System.out.print(f.fileName);
			System.out.print(" : ");
			System.out.println(f.packageFingerprint);
		}
			//RenewTokenResponse res1 = CurseAuth.renewAccessToken(token.token);
			//AddOnService svc = AddOnService.initialise(session.createCurseToken());
			/*List<AddOnFile> res = svc.getAllFilesForAddOn(269708);
			for (AddOnFile f : res) {
				System.out.print(f.getFileName());
				System.out.print(" : ");
				System.out.println(f.getPackageFingerprint());
			}
			FingerprintMatchResult fingerprintMatchResult = svc.v2GetFingerprintMatches(3752024154L);
			System.out.println(fingerprintMatchResult.getExactMatches().get(0).getFile().getFileName());*/
			//System.out.println(svc.healthCheck());
			//Int2ObjectMap<List<AddOnFile>> map =  svc.getAddOnFiles(new AddOnFileKey(222836, 2535679), new AddOnFileKey(222836, 2316313), new AddOnFileKey(241596, 2350574));
			//System.out.println(map.size());
			/*for (String s : svc.logDump(new LogDump()).getLogDumpResult()){
				System.out.println(s);
			}*/
			//System.out.println(svc.resetFeeds(new ResetFeeds()).getResetFeedsResult());
		/*} catch (AxisFault e) {
			System.err.println(e.getReason());
			System.err.println(e);
			throw new RuntimeException(e);
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}*/
	}
}