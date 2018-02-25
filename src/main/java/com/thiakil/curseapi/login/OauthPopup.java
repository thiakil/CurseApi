package com.thiakil.curseapi.login;

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
 * Basic JavaFX window that directs to twitch auth url and captures the return data via injected Javascript.
 * Exploits the WebEngine's alert() handling with a UUID value.
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

		final String randomAlertValue = UUID.randomUUID().toString();

		public Browser() {
			//apply the styles
			getStyleClass().add("browser");
			webEngine.getLoadWorker().stateProperty().addListener((obs, oldState, newState) -> {
				if (newState == Worker.State.SUCCEEDED) {
					addFunctionHandlerToDocument(webEngine);
				}
			});

			webEngine.setOnAlert(event -> {
				if (event.getData().equals(randomAlertValue)) {
					Object data = webEngine.executeScript("window['"+randomAlertValue+"']");
					if (data instanceof String){
						System.out.println((String)data);
					} else if (data instanceof JSObject) {
						JSObject evdata = (JSObject)data;
						if (evdata.getMember("redirectURI") != null)
							sendCode(evdata.getMember("redirectURI").toString());
					}
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

		private void addFunctionHandlerToDocument(WebEngine engine) {
			engine.executeScript("window.parent = window;" +
					"window.addEventListener('message', function (ev) {" +
						//"if (ev.data.messageType != 'cursePassportCallback') " +
						//	"return;" +
						//"document.body.innerText = \"Your code is \"+ev.data.redirectURI;\n" +
						//"alert(ev.data.redirectURI);\n" +
						"window['"+randomAlertValue+"'] = ev.data;" +
						"window.alert('"+randomAlertValue+"');" +
					"});");
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
