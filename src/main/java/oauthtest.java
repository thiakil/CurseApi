import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.oauth.OAuth20Service;
import com.github.scribejava.core.oauth.OAuthService;
import com.thiakil.twitch.TwitchApi;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/**
 * Created by Thiakil on 21/02/2018.
 */
public class oauthtest {
	public static void main(String[] args) throws IOException,ExecutionException,InterruptedException {
		OAuth20Service service = new ServiceBuilder("s5yaa7s00e0h3h9ko44feh6pzti37y")
				.apiSecret("to5mg2i65ucsi0mianiiiigdqdd00q")
				.callback("http://127.0.0.1:8080")
				//.scope("user_read")
				.responseType("code")
				.state("mullemaus")
				.build(TwitchApi.instance());
		String authurl = service.getAuthorizationUrl();
		System.out.printf("go to: %s\n", authurl);
		System.out.println("And paste the authorization code here");
		System.out.print(">>");
		final Scanner in = new Scanner(System.in, "UTF-8");
		final String code = in.nextLine();
		System.out.println();
		System.out.println("Trading the Request Token for an Access Token...");
		OAuth2AccessToken accessToken = service.getAccessToken(code);
		System.out.println("Got the Access Token!");
		System.out.println("(The raw response looks like this: " + accessToken.getRawResponse() + "')");
	}
}
