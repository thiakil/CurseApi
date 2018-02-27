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
