package com.thiakil.curseapi.login;

import com.google.gson.Gson;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;

import java.util.Map;

/**
 * Created by Thiakil on 21/02/2018.
 */
public class JsonEntity extends StringEntity {
	private static Gson GSON = new Gson();

	public JsonEntity(Map keys){
		super(GSON.toJson(keys), ContentType.APPLICATION_JSON);
	}
}
