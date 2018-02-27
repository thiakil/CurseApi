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

import com.thiakil.twitch.TwitchOAuth;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Worker;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;
import org.apache.http.client.utils.URLEncodedUtils;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Basic JavaFX window that directs to twitch auth url and captures the return data via navigation handling.
 */
public class OauthPopup extends Application {
	private Scene scene;
	private Stage stage;
	private String oauthURL;
	private String uuid;

	private static Map<String,String> codes = new HashMap<>();

	public static String getCode(String oauthURL) throws CurseAuthException{
		String uuid = UUID.randomUUID().toString();
		launch(oauthURL, uuid);
		String retval = codes.remove(uuid);
		if (retval == null){
			throw new CurseAuthException("Didn't receive a code back");
		}
		return retval;
	}

	@Override
	public void start(Stage stage) throws Exception {
		List<String> params = getParameters().getRaw();
		this.oauthURL = params.get(0);
		this.uuid = params.get(1);

		this.stage = stage;
		stage.setTitle("Twitch OAuth");
		scene = new Scene(new Browser(),750,500);
		stage.setScene(scene);
		stage.show();
	}

	class Browser extends Region {

		final WebView browser = new WebView();
		final WebEngine webEngine = browser.getEngine();

		public Browser() {
			//apply the styles
			getStyleClass().add("browser");
			webEngine.getLoadWorker().stateProperty().addListener((obs, oldState, newState) -> {
				String loc = webEngine.getLocation();
				if (loc.startsWith(TwitchOAuth.CURSE_REDIRECT_URI)){
					sendCode(loc);
				}
			});

			// load the web page
			webEngine.load(oauthURL);
			//add the web view to the scene
			getChildren().add(browser);

		}

		@Override protected void layoutChildren() {
			double w = getWidth();
			double h = getHeight();
			layoutInArea(browser,0,0,w,h,0, HPos.CENTER, VPos.CENTER);
		}

		@Override protected double computePrefWidth(double height) {
			return 750;
		}

		@Override protected double computePrefHeight(double width) {
			return 500;
		}

		public void sendCode(String urlStr){
			try {
				Map<String,String> params = new HashMap<>();
				URLEncodedUtils.parse(new URI(urlStr), StandardCharsets.UTF_8).forEach(p->params.put(p.getName(), p.getValue()));

				OauthPopup.codes.put(uuid, params.get("code"));
			} catch (URISyntaxException e){
				OauthPopup.codes.put(uuid, null);
			}
			stage.close();
			//Platform.exit();
		}
	}
}
