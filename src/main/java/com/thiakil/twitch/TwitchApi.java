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