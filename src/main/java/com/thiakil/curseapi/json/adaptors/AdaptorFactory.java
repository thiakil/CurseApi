package com.thiakil.curseapi.json.adaptors;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.function.Function;

public class AdaptorFactory<T> implements TypeAdapterFactory {
	
	private final Function<Gson,TypeAdapter<T>> supplier;
	private final Class<T> clazz;
	
	public AdaptorFactory(Function<Gson,TypeAdapter<T>> s, Class<T> c){
		this.supplier = s;
		this.clazz = c;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public <U> TypeAdapter<U> create(Gson gson, TypeToken<U> type) {
		return type.getType() == clazz ? (TypeAdapter<U>)supplier.apply(gson) : null;
	}
}
