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
