package com.thiakil.curseapi.login;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.thiakil.twitch.TwitchOAuth;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by Thiakil on 21/02/2018.
 */
public class CurseAuth {
	private static final CloseableHttpClient httpclient = HttpClients.createDefault();
	private static final Gson GSON = new Gson();

	public static CurseLoginResponse getResponseFromCurseAccount(String username, String password) throws CurseAuthException{
		HttpPost post = new HttpPost("https://logins-v1.curseapp.net/login");
		JsonObject data = new JsonObject();
		data.addProperty("username", username);
		data.addProperty("password", password);
		post.setEntity(new JsonEntity(data));
		try {
			CloseableHttpResponse response = httpclient.execute(post);
			if (response.getStatusLine().getStatusCode() != 200){
				handleHttpErrorWithException(response);
			}
			if (response.getEntity() == null){
				throw new CurseAuthException("HTTP response body empty");
			}
			HttpEntity entity = response.getEntity();
			return GSON.fromJson(new InputStreamReader(entity.getContent()), CurseLoginResponse.class);
		} catch (IOException|JsonParseException e){
			throw new CurseAuthException(e);
		}
	}
	
	public static TwitchOAuthResponse getResponseFromTwitchOauth(String code) throws CurseAuthException{
		HttpPost post = new HttpPost("https://logins-v1.curseapp.net/login/twitch-oauth");
		JsonObject data = new JsonObject();
		data.addProperty("ClientID", TwitchOAuth.CURSE_APPID);
		data.addProperty("Code", code);
		data.addProperty("RedirectUri", TwitchOAuth.CURSE_REDIRECT_URI);
		data.addProperty("State", TwitchOAuth.getLastStateCode());
		post.setEntity(new JsonEntity(data));
		try {
			CloseableHttpResponse response = httpclient.execute(post);
			if (response.getStatusLine().getStatusCode() != 200){
				handleHttpErrorWithException(response);
			}
			if (response.getEntity() == null){
				throw new CurseAuthException("HTTP response body empty");
			}
			HttpEntity entity = response.getEntity();
			TwitchOAuthResponse twitchOAuthResponse = GSON.fromJson(new InputStreamReader(entity.getContent()), TwitchOAuthResponse.class);
			entity.getContent().close();
			return twitchOAuthResponse;
		} catch (IOException|JsonParseException e){
			throw new CurseAuthException(e);
		}
	}

	private static void handleHttpErrorWithException(CloseableHttpResponse response) throws IOException, CurseAuthException {
		String errMsg = "";
		if (response.getEntity() != null && response.getEntity().getContentLength() > 0){
			Reader r = new InputStreamReader(response.getEntity().getContent(), "utf-8");
			char[] buf = new char[(int)response.getEntity().getContentLength()];
			r.read(buf);
			errMsg = "\n"+new String(buf);
		}
		throw new CurseAuthException("HTTP response code "+response.getStatusLine().getStatusCode()+errMsg);
	}

	public static CurseToken getTokenFromCurseAccount(String username, String password) throws CurseAuthException{
		CurseLoginResponse response = getResponseFromCurseAccount(username, password);
		if (response.Status != LoginStatus.Success){
			throw new CurseAuthException("Incorrect login status: "+response.Status);
		}
		return new CurseToken(response.Session.UserID, response.Session.Token);
	}
	
	public static CurseToken getTokenFromTwitchOauth(String code) throws CurseAuthException {
		TwitchOAuthResponse response = getResponseFromTwitchOauth(code);
		if (response.status != TwitchOAuthResponse.TwitchOAuthStatus.Success){
			throw new CurseAuthException("Unknown login status: "+response.status.name());
		}
		return new CurseToken(response.session.UserID, response.session.Token);
	}

	public static RenewTokenResponse renewAccessToken(String token) throws CurseAuthException {
		HttpPost post = new HttpPost("https://logins-v1.curseapp.net/login/renew");
		post.addHeader("AuthenticationToken", token);
		try {
			CloseableHttpResponse response = httpclient.execute(post);
			if (response.getStatusLine().getStatusCode() != 200){
				handleHttpErrorWithException(response);
			}
			if (response.getEntity() == null){
				throw new CurseAuthException("HTTP response body empty");
			}
			HttpEntity entity = response.getEntity();
			RenewTokenResponse renewTokenResponse = GSON.fromJson(new InputStreamReader(entity.getContent()), RenewTokenResponse.class);
			entity.getContent().close();
			return renewTokenResponse;
		} catch (IOException|JsonParseException e){
			throw new CurseAuthException(e);
		}
	}
	
}
