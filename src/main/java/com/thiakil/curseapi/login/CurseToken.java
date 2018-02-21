package com.thiakil.curseapi.login;

/**
 * Created by Thiakil on 21/02/2018.
 */
public class CurseToken {
	public final long userID;
	public final String token;
	public final String apiKey;

	public CurseToken(long userID, String token, String apiKey){
		this.userID = userID;
		this.token = token;
		this.apiKey = apiKey;
	}

	public CurseToken(long userID, String token){
		this(userID, token, null);
	}
}
