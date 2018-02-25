package com.thiakil.curseapi.login;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Thiakil on 21/02/2018.
 */
public class CurseLoginResponse {
	@SerializedName("Status")
	public LoginStatus Status;
	@SerializedName("StatusMessage")
	public String StatusMessage;
	@SerializedName("Session")
	public LoginSession Session;
	@SerializedName("Timestamp")
	public long Timestamp;
	@SerializedName("TwitchUsernameReservationToken")
	public String TwitchUsernameReservationToken;

}
