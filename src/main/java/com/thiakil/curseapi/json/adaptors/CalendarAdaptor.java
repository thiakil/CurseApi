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
