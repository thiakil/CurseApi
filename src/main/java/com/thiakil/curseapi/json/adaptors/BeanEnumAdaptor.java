package com.thiakil.curseapi.json.adaptors;

import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Base class for 1-based enum values in json to Bean type
 * @param <T> the bean object's type
 */
public class BeanEnumAdaptor<T> extends TypeAdapter<T> {
	private final T[] values;
	
	protected BeanEnumAdaptor(T... values){
		this.values = values;
	}
	
	private int getIndex(T value){
		for (int i = 1; i <= values.length; i++){
			if (this.values[i-1] == value){
				return i;
			}
		}
		throw new RuntimeException("Unknown type, "+value.toString());
	}
	
	@Override
	public void write(JsonWriter out, T value) throws IOException {
		out.value(getIndex(value));
	}
	
	@Override
	public T read(JsonReader in) throws IOException {
		int index = in.nextInt();
		if (index > values.length){
			throw new JsonParseException("Unknown index "+index);
		}
		return this.values[index-1];
	}
}
