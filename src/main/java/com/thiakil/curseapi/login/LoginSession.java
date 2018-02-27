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
 */

package com.thiakil.curseapi.login;

import com.google.gson.annotations.SerializedName;

public class LoginSession {
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
	public UserBanType Bans;

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
