package com.thiakil.curseapi.json.adaptors;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.apache.axis2.databinding.utils.ConverterUtil;

import java.io.IOException;
import java.util.Calendar;

public class CalendarAdaptor extends TypeAdapter<Calendar> {
	public static final CalendarAdaptor INSTANCE = new CalendarAdaptor();
	
	@Override
	public void write(JsonWriter out, Calendar value) throws IOException {
		out.value(ConverterUtil.convertToString(value));
	}
	
	@Override
	public Calendar read(JsonReader in) throws IOException {
		return ConverterUtil.convertToDateTime(ProjectFeedAdaptor.readStringOrNull(in));
	}
}
