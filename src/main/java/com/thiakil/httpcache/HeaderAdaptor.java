package com.thiakil.httpcache;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

import java.io.IOException;

/**
 * Created by Thiakil on 23/02/2018.
 */
public class HeaderAdaptor extends TypeAdapter<Header> {
	@Override
	public void write(JsonWriter out, Header value) throws IOException {
		out.beginArray();

		out.value(value.getName());
		out.value(value.getValue());

		out.endArray();
	}

	@Override
	public Header read(JsonReader in) throws IOException {
		in.beginArray();
		BasicHeader head = new BasicHeader(in.nextString(), in.nextString());
		in.endArray();
		return head;
	}
}
