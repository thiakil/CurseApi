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
		if (response.status != LoginStatus.Success){
			throw new CurseAuthException("Incorrect login status: "+response.status);
		}
		return response.session.createCurseToken();
	}
	
	public static CurseToken getTokenFromTwitchOauth(String code) throws CurseAuthException {
		TwitchOAuthResponse response = getResponseFromTwitchOauth(code);
		if (response.status != TwitchOAuthResponse.TwitchOAuthStatus.Success){
			throw new CurseAuthException("Unknown login status: "+response.status.name());
		}
		return response.session.createCurseToken();
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
