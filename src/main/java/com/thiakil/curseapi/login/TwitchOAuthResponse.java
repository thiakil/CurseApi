package com.thiakil.curseapi.login;

import com.google.gson.annotations.SerializedName;

public class TwitchOAuthResponse {
	@SerializedName("Status")
	public TwitchOAuthStatus status;
	
	@SerializedName("Session")
	public LoginSession session;
	
	@SerializedName("Timestamp")
	public long timestamp;
	
	@SerializedName("MergeToken")
	public String mergeToken;
	
	@SerializedName("TwitchUsername")
	public String twitchUsername;
	
	@SerializedName("TwitchDisplayName")
	public String twitchDisplayName;
	
	@SerializedName("TwitchAvatar")
	public String twitchAvatar;
	
	@SerializedName("TwitchUserID")
	public String twitchUserID;
	
	public enum TwitchOAuthStatus
	{
		@SerializedName("0")
		Success,
		@SerializedName("1")
		FailedValidation,
		@SerializedName("2")
		FailedInvalidOAuthCode,
		@SerializedName("3")
		FailedOAuthError,
		@SerializedName("4")
		RequiresMerge,
	}
}
