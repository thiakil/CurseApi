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
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * This library may be dynamically linked against (used as a dependency) in any project licenced under terms requiring complete
 * source code availability (a "FREE SOFTWARE LICENCE" https://www.gnu.org/philosophy/free-sw.html), such as the Apache License(s),
 * without the using project being required to be GPL licenced. This library remains GPL licenced and any modifications to this
 * library must still be made under the terms of the GPL. Bundling of the compiled binary class files ("fat jars") is permitted
 * for OPEN SOURCE projects, provided no modifications have been made (in which case source code for modifications must be available).
 *
 * Repackaging (sometimes known as "shading") where ONLY the package names are changed to avoid conflicts requires the configuration
 * and instructions for the method of repackaging to be made available in the same manner as source code.
 *
 * You may NOT use this library in a closed source project under any circumstance.
 */

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
		if (value != null)
			out.value(getIndex(value));
		else
			out.nullValue();
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
