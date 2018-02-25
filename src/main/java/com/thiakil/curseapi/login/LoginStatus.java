package com.thiakil.curseapi.login;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Thiakil on 21/02/2018.
 */
public enum LoginStatus {
	@SerializedName("1")
	Success,
	@SerializedName("3")
	UnauthorizedLogin,
	@SerializedName("4")
	InvalidPassword,
	@SerializedName("5")
	UnknownUsername,
	@SerializedName("6")
	UnknownEmail,
	@SerializedName("102")
	CorruptLibrary, // 0x00000066
	@SerializedName("104")
	SubscriptionMismatch, // 0x00000068
	@SerializedName("105")
	SubscriptionExpired, // 0x00000069
	@SerializedName("108")
	MissingGrant, // 0x0000006C
	@SerializedName("1000")
	GeneralError, // 0x000003E8
}
