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
