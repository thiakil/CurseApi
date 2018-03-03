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

import com.google.gson.annotations.SerializedName;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class LoginSession {
	@SerializedName("UserID")
	public long userID;

	@SerializedName("Username")
	public String username;

	@SerializedName("DisplayName")
	public String displayName;

	@SerializedName("SessionID")
	public String sessionID;

	@SerializedName("Token")
	public String token;

	@SerializedName("EmailAddress")
	public String emailAddress;

	@SerializedName("EffectivePremiumStatus")
	public boolean effectivePremiumStatus;

	@SerializedName("ActualPremiumStatus")
	public boolean actualPremiumStatus;

	@SerializedName("SubscriptionToken")
	public long subscriptionToken;

	@SerializedName("Expires")
	public long expires;

	@SerializedName("RenewAfter")
	public long renewAfter;

	@SerializedName("IsTemporaryAccount")
	public boolean isTemporaryAccount;

	@SerializedName("IsMerged")
	public boolean isMerged;

	@SerializedName("Bans")
	public UserBanType bans;

	/**
	 * Helper to create a CurseToken from this session's info
	 * @return a curseToken
	 */
	public CurseToken createCurseToken(){
		return new CurseToken(userID, token);
	}

	/**
	 * Attempts to renew this session, and updates the expiry info on success.
	 * @throws CurseAuthException if any failure, in which case the token was likely not renewed.
	 */
	public void renew() throws CurseAuthException{
		RenewTokenResponse response = CurseAuth.renewAccessToken(token);
		expires = response.expires;
		renewAfter = response.renewAfter;
	}

	/**
	 * Test if the token has expired
	 * @return true if it is ok to use, false if it has expired.
	 */
	public boolean isValid(){
		return expires > System.currentTimeMillis();
	}

	/**
	 * Tests if the session is within the Curse recommended renew window.
	 * @return true if the token should be renewed in order to stay valid.
	 */
	public boolean shouldRenew(){
		return renewAfter <= System.currentTimeMillis();
	}

	/**
	 * Convenience method to check the time left on this token
	 * @return milliseconds until this session will expire
	 */
	public long millisUntilExpiry(){
		return expires - System.currentTimeMillis();
	}

	/**
	 * Sets up auto session renewal, errors will be printed on stderr.
	 */
	public void autoRenew(){
		scheduleRenew(this);
	}

	private static ScheduledExecutorService scheduler;

	private static void scheduleRenew(LoginSession loginSession){
		if (!loginSession.isValid()){
			throw new IllegalArgumentException("invalid LoginSession; already expired");
		}
		scheduleRenew(new SessionRenewer(loginSession));
	}

	private static void scheduleRenew(SessionRenewer renewer){
		if (scheduler == null){
			scheduler = Executors.newScheduledThreadPool(1);
		}
		scheduler.schedule(renewer, renewer.loginSession.millisUntilExpiry(), TimeUnit.MILLISECONDS);
	}

	private static class SessionRenewer implements Runnable{
		final LoginSession loginSession;

		SessionRenewer(LoginSession loginSession) {
			this.loginSession = loginSession;
		}

		@Override
		public void run() {
			try {
				loginSession.renew();
				scheduleRenew(this);
			} catch (CurseAuthException e){
				System.err.println("Failed to renew token for "+loginSession.username);
				System.err.println(e.getMessage());
			}
		}
	}

	public enum UserBanType
	{
		@SerializedName("-1")
		Global,
		@SerializedName("0")
		None,
		@SerializedName("1")
		Social,
		@SerializedName("2")
		Whisper,
	}
}
