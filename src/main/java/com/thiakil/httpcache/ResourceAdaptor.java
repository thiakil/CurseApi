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

package com.thiakil.httpcache;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.apache.http.client.cache.Resource;
import org.apache.http.impl.client.cache.FileResource;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

/**
 * Created by Thiakil on 23/02/2018.
 */
public class ResourceAdaptor extends TypeAdapter<Resource> {

	private final MethodHandle getFile;

	public ResourceAdaptor(){
		try {
			Method m = FileResource.class.getDeclaredMethod("getFile");
			m.setAccessible(true);
			getFile = MethodHandles.lookup().unreflect(m);
		} catch (ReflectiveOperationException e){
			throw new RuntimeException("Reflection failed", e);
		}
	}

	@Override
	public void write(JsonWriter out, Resource value) throws IOException {
		if (value instanceof FileResource){
			try {
				out.value(((File)getFile.invoke(value)).getPath());
			} catch (Throwable t){
				throw new RuntimeException(t);
			}
		} else {
			out.nullValue();
		}
	}

	@Override
	public Resource read(JsonReader in) throws IOException {
		return new FileResource(new File(in.nextString()));
	}
}
