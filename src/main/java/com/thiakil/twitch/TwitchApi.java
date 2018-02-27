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

package com.thiakil.twitch;

import com.github.scribejava.core.builder.api.ClientAuthenticationType;
import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.model.OAuthConfig;
import com.github.scribejava.core.model.Verb;

import java.util.Map;

public class TwitchApi extends DefaultApi20 {
	private static final String AUTHORIZATION_URL = "https://api.twitch.tv/kraken/oauth2/authorize";

	private static final String ACCESSTOKEN_URL = "https://api.twitch.tv/kraken/oauth2/token";

	protected TwitchApi() {}
	private static final TwitchApi INSTANCE = new TwitchApi();

	public static TwitchApi instance() {
		return INSTANCE;
	}

	@Override
	public String getAccessTokenEndpoint() {
		return ACCESSTOKEN_URL;
	}

	@Override
	public String getAuthorizationBaseUrl() {
		return AUTHORIZATION_URL;
	}

	@Override
	public ClientAuthenticationType getClientAuthenticationType() {
		return ClientAuthenticationType.REQUEST_BODY;
	}
}