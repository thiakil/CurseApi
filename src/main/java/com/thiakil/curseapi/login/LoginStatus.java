package com.thiakil.curseapi.login;

/**
 * Created by Thiakil on 21/02/2018.
 */
public class LoginStatus {
	public static final int Unsuccessful = 0;

	public static final int Success = 1;

	public static final int InvalidSession = 2;

	public static final int UnauthorizedLogin = 3;

	public static final int InvalidPassword = 4;

	public static final int UnknownUsername = 5;

	public static final int UnknownEmail = 6;

	public static final int UnknownError = 100;

	public static final int IncorrectTime = 101;

	public static final int CorruptLibrary = 102;

	public static final int OutdatedClient = 103;

	public static final int SubscriptionMismatch = 104;

	public static final int SubscriptionExpired = 105;

	public static final int InsufficientAccessLevel = 106;

	public static final int InvalidApiKey = 107;

	public static final int MissingGrant = 108;
	
	public static final int GeneralError = 1000;
}
