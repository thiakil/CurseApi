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
