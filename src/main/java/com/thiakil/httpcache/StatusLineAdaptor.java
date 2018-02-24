package com.thiakil.httpcache;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicStatusLine;

import java.io.IOException;

/**
 * Created by Thiakil on 23/02/2018.
 */
public class StatusLineAdaptor extends TypeAdapter<StatusLine> {

	@Override
	public void write(JsonWriter out, StatusLine value) throws IOException {
		out.beginArray();

		out.value(value.getProtocolVersion().getProtocol());
		out.value(value.getProtocolVersion().getMajor());
		out.value(value.getProtocolVersion().getMinor());

		out.value(value.getStatusCode());

		out.value(value.getReasonPhrase());

		out.endArray();
	}

	@Override
	public StatusLine read(JsonReader in) throws IOException {
		in.beginArray();
		StatusLine line = new BasicStatusLine(new ProtocolVersion(in.nextString(), in.nextInt(), in.nextInt()), in.nextInt(), in.nextString());
		in.endArray();
		return line;
	}
}
