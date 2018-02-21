package com.thiakil.curseapi.login;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Thiakil on 21/02/2018.
 */
public class CurseLoginResponse {
	@SerializedName("Status")
	public int Status;
	@SerializedName("StatusMessage")
	public String StatusMessage;
	@SerializedName("Session")
	public LoginSession Session;
	@SerializedName("Timestamp")
	public long Timestamp;
	@SerializedName("TwitchUsernameReservationToken")
	public String TwitchUsernameReservationToken;

	public static class LoginSession{
		@SerializedName("UserID")
		public long UserID;
		@SerializedName("Username")
		public String Username;
		@SerializedName("DisplayName")
		public String DisplayName;
		@SerializedName("SessionID")
		public String SessionID;
		@SerializedName("Token")
		public String Token;
		@SerializedName("EmailAddress")
		public String EmailAddress;
		@SerializedName("EffectivePremiumStatus")
		public boolean EffectivePremiumStatus;
		@SerializedName("ActualPremiumStatus")
		public boolean ActualPremiumStatus;
		@SerializedName("SubscriptionToken")
		public long SubscriptionToken;
		@SerializedName("Expires")
		public long Expires;
		@SerializedName("RenewAfter")
		public long RenewAfter;
		@SerializedName("IsTemporaryAccount")
		public boolean IsTemporaryAccount;
		@SerializedName("IsMerged")
		public boolean IsMerged;
		@SerializedName("Bans")
		public int Bans;
	}
}