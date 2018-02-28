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

package com.thiakil.curseapi.soap;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.builder.SOAPBuilder;
import org.apache.axis2.context.MessageContext;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/**
 * Bit of a hack to prepend an xml 1.1 processing instruction in from of the stream if one is not present.
 */
public class CustomSoapBuilder extends SOAPBuilder {
	private static Pattern xmlVersion = Pattern.compile("\\s*<\\?xml\\s+version");
	
	@Override
	public OMElement processDocument(InputStream inputStream, String contentType, MessageContext messageContext) throws AxisFault {
		try {
			String charSetEncoding = (String) messageContext.getProperty(Constants.Configuration.CHARACTER_SET_ENCODING);
			
			inputStream = new BufferedInputStream(inputStream);
			
			CharBuffer cbuf = CharBuffer.allocate(1024);
			inputStream.mark(cbuf.length());
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, charSetEncoding));
			
			boolean foundXmlPI = false;
			
			int read = reader.read(cbuf);
			if (read > 0){
				foundXmlPI = xmlVersion.matcher(cbuf).find();
			}
			
			inputStream.reset();
			
			if (!foundXmlPI){
				inputStream = new PrependingXmlVersionInputStream(inputStream);
			}
			
			return super.processDocument(inputStream, contentType, messageContext);
		} catch (IOException e) {
			throw AxisFault.makeFault(e);
		}
	}
	
	private static class PrependingXmlVersionInputStream extends InputStream {
		
		private final InputStream doc;
		private final ByteArrayInputStream versionStr;
		
		PrependingXmlVersionInputStream(InputStream document){
			this.doc = document;
			versionStr = new ByteArrayInputStream("<?xml version=\"1.1\"?>".getBytes(StandardCharsets.UTF_8));
		}
		
		@Override
		public int read() throws IOException {
			return versionStr.available() > 0 ? versionStr.read() : doc.read();
		}
		
		@Override
		public int read(byte[] b, int off, int len) throws IOException {
			return versionStr.available() > 0 ? versionStr.read(b, off, len) : doc.read(b, off, len);
		}
	}
}
