package com.thiakil.curseapi.login;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Thiakil on 21/02/2018.
 */
public class CurseAuth {
	private static final CloseableHttpClient httpclient = HttpClients.createDefault();
	private static final Gson GSON = new Gson();

	public static CurseLoginResponse getSessionFromCurseAccount(String username, String password) throws CurseAuthException{
		HttpPost post = new HttpPost("https://logins-v1.curseapp.net/login");
		JsonObject data = new JsonObject();
		data.addProperty("username", username);
		data.addProperty("password", password);
		post.setEntity(new JsonEntity(data));
		try {
			CloseableHttpResponse response = httpclient.execute(post);
			if (response.getStatusLine().getStatusCode() != 200){
				throw new CurseAuthException("HTTP response code "+response.getStatusLine().getStatusCode());
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

	public static CurseToken getTokenFromCurseAccount(String username, String password) throws CurseAuthException{
		CurseLoginResponse response = getSessionFromCurseAccount(username, password);
		if (response.Status != LoginStatus.Success){
			throw new CurseAuthException("Unknown login status: "+response.Status);
		}
		return new CurseToken(response.Session.UserID, response.Session.Token);
	}

	public static class CurseAuthException extends RuntimeException {
		public CurseAuthException(Throwable t){
			super(t);
		}

		public CurseAuthException(String reason){
			super(reason);
		}
	}
}
