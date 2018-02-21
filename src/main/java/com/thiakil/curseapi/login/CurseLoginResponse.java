package com.thiakil.curseapi.login;

/**
 * Created by Thiakil on 21/02/2018.
 */
public class CurseLoginResponse {
	public int Status;
	public String StatusMessage;
	public LoginSession Session;
	public long Timestamp;
	public String TwitchUsernameReservationToken;
	
	public static class LoginSession{
		public long UserID;
		public String Username;
		public String DisplayName;
		public String SessionID;
		public String Token;
		public String EmailAddress;
		public boolean EffectivePremiumStatus;
		public boolean ActualPremiumStatus;
		public long SubscriptionToken;
		public long Expires;
		public long RenewAfter;
		public boolean IsTemporaryAccount;
		public boolean IsMerged;
		public int Bans;
	}
}
