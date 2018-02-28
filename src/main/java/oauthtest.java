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

import com.thiakil.curseapi.login.CurseAuth;
import com.thiakil.curseapi.login.CurseAuthException;
import com.thiakil.curseapi.login.OauthPopup;
import com.thiakil.twitch.TwitchOAuth;

import java.util.Scanner;

/**
 * Created by Thiakil on 21/02/2018.
 */
public class oauthtest {
	public static void main(String[] args) throws CurseAuthException {
		String authurl = TwitchOAuth.getAuthURL();

// Option 1, manual entry
		/*
		System.out.printf("go to: %s\n", authurl);
		System.out.println("And paste the authorization code here");
		System.out.print(">>");
		final Scanner in = new Scanner(System.in, "UTF-8");
		final String code = in.nextLine();
		System.out.println();
		*/

//Option 2, JavaFX UI
		final String code = OauthPopup.getCode(authurl);

		//System.out.println("Trading the Request Token for an Access Token...");
		//OAuth2AccessToken accessToken = service.getAccessToken(code);
		//System.out.println("Got the Access Token!");
		//System.out.println("(The raw response looks like this: " + accessToken.getRawResponse() + "')");
		System.out.println(CurseAuth.getTokenFromTwitchOauth(code).token);
	}
}
