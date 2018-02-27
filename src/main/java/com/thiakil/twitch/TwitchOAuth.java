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

import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.oauth.OAuth20Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TwitchOAuth {
	public static final String CURSE_APPID = "jf3xu125ejjjt5cl4osdjci6oz6p93r";
	public static final String CURSE_REDIRECT_URI = "https://web.curseapp.net/laguna/passport-callback.html";
	private static final OAuth20Service service = new ServiceBuilder(CURSE_APPID)
			                                              .callback(CURSE_REDIRECT_URI)
			                                              //.scope("user_read")
			                                              .responseType("code")
			                                              //.state()
			                                              .build(TwitchApi.instance());
	private static Map<String, String> additionalParams = new HashMap<>(2);
	
	public static String getAuthURL(){
		additionalParams.put("state", UUID.randomUUID().toString());
		return service.getAuthorizationUrl(additionalParams);
	}
	
	public static String getLastStateCode(){
		return additionalParams.getOrDefault("state", "");
	}
}
