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
