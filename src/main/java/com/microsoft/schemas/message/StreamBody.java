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

/**
 * StreamBody.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.microsoft.schemas.message;


import com.thiakil.curseapi.soap.Util;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axis2.databinding.ADBBean;
import org.apache.axis2.databinding.ADBDataSource;
import org.apache.axis2.databinding.ADBException;
import org.apache.axis2.databinding.utils.BeanUtil;
import org.apache.axis2.databinding.utils.ConverterUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.activation.DataHandler;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import java.util.Vector;

/**
 * StreamBody bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class StreamBody implements ADBBean {
	public static final QName MY_QNAME = new QName("http://schemas.microsoft.com/Message", "StreamBody", "ns8");

	/**
	 * field for StreamBody
	 */
	protected DataHandler localStreamBody;

	/**
	 * Auto generated getter method
	 *
	 * @return javax.activation.DataHandler
	 */
	public DataHandler getStreamBody() {
		return localStreamBody;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param StreamBody
	 */
	public void setStreamBody(DataHandler param) {
		this.localStreamBody = param;
	}

	public String toString() {
		return localStreamBody.toString();
	}

	/**
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public OMElement getOMElement(final QName parentQName, final OMFactory factory) {
		return factory.createOMElement(new ADBDataSource(this, MY_QNAME));
	}

	public void serialize(final QName parentQName, XMLStreamWriter xmlWriter) throws XMLStreamException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final QName parentQName, XMLStreamWriter xmlWriter, boolean serializeType) throws XMLStreamException {
		//We can safely assume an element has only one type associated with it
		String namespace = parentQName.getNamespaceURI();
		String _localName = parentQName.getLocalPart();

		Util.writeStartElement(null, namespace, _localName, xmlWriter);

		// add the type details if this is used in a simple type
		if (serializeType) {
			String namespacePrefix = Util.registerPrefix(xmlWriter, "http://schemas.microsoft.com/Message");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":StreamBody", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "StreamBody", xmlWriter);
			}
		}

		if (localStreamBody == null) {
			throw new ADBException("StreamBody cannot be null !!");
		} else {
			xmlWriter.writeCharacters(ConverterUtil.convertToString(localStreamBody));
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals("http://schemas.microsoft.com/Message")) {
			return "ns8";
		}

		return BeanUtil.getUniquePrefix();
	}











	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {
		private static Log log = LogFactory.getLog(Factory.class);

		public static StreamBody fromString(String value, String namespaceURI) {
			StreamBody returnValue = new StreamBody();

			returnValue.setStreamBody(ConverterUtil.convertToBase64Binary(value));

			return returnValue;
		}

		public static StreamBody fromString(XMLStreamReader xmlStreamReader, String content) {
			if (content.contains(":")) {
				String prefix = content.substring(0, content.indexOf(":"));
				String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);

				return StreamBody.Factory.fromString(content, namespaceUri);
			} else {
				return StreamBody.Factory.fromString(content, "");
			}
		}

		/**
		 * static method to create the object
		 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
		 * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
		 * Postcondition: If this object is an element, the reader is positioned at its end element
		 * If this object is a complex type, the reader is positioned at the end element of its outer element
		 */
		public static StreamBody parse(XMLStreamReader reader) throws Exception {
			StreamBody object = new StreamBody();

			int event;
			QName currentQName = null;
			String nillableValue = null;
			String prefix = "";
			String namespaceuri = "";

			try {
				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				currentQName = reader.getName();

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				while (!reader.isEndElement()) {
					if (reader.isStartElement() || reader.hasText()) {
						if (reader.isStartElement() || reader.hasText()) {
							nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

							if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
								throw new ADBException("The element: " + "StreamBody" + "  cannot be null");
							}

							String content = reader.getElementText();

							object.setStreamBody(ConverterUtil.convertToBase64Binary(content));
						} // End of if for expected property start element

						else {
							// 3 - A start element we are not expecting indicates an invalid parameter was passed
							throw new ADBException("Unexpected subelement " + reader.getName());
						}
					} else {
						reader.next();
					}
				} // end of while loop
			} catch (XMLStreamException e) {
				throw new Exception(e);
			}

			return object;
		}
	} //end of factory class
}
