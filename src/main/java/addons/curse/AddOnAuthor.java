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
 * AddOnAuthor.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package addons.curse;


import com.curse.addonservice.ExtensionMapper;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
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

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import java.util.Vector;

/**
 * AddOnAuthor bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class AddOnAuthor implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = AddOnAuthor
       Namespace URI = Curse.AddOns
       Namespace Prefix = ns4
     */

	/**
	 * field for Name
	 */
	@SerializedName("Name")
	protected String localName;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localNameTracker = false;

	/**
	 * field for Url
	 */
	@SerializedName("Url")
	@Expose
	protected String localUrl;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localUrlTracker = false;

	public boolean isNameSpecified() {
		return localNameTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getName() {
		return localName;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Name
	 */
	public void setName(String param) {
		localNameTracker = true;

		this.localName = param;
	}

	public boolean isUrlSpecified() {
		return localUrlTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getUrl() {
		return localUrl;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Url
	 */
	public void setUrl(String param) {
		localUrlTracker = true;

		this.localUrl = param;
	}

	/**
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public OMElement getOMElement(final QName parentQName, final OMFactory factory) {
		return factory.createOMElement(new ADBDataSource(this, parentQName));
	}

	public void serialize(final QName parentQName, XMLStreamWriter xmlWriter) throws XMLStreamException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final QName parentQName, XMLStreamWriter xmlWriter, boolean serializeType) throws XMLStreamException {
		String prefix = null;
		String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		Util.writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {
			String namespacePrefix = Util.registerPrefix(xmlWriter, "Curse.AddOns");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":AddOnAuthor", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "AddOnAuthor", xmlWriter);
			}
		}

		if (localNameTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "Name", xmlWriter);

			if (localName == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localName);
			}

			xmlWriter.writeEndElement();
		}

		if (localUrlTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "Url", xmlWriter);

			if (localUrl == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localUrl);
			}

			xmlWriter.writeEndElement();
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals("Curse.AddOns")) {
			return "ns4";
		}

		return BeanUtil.getUniquePrefix();
	}











	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {
		private static Log log = LogFactory.getLog(Factory.class);

		/**
		 * static method to create the object
		 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
		 * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
		 * Postcondition: If this object is an element, the reader is positioned at its end element
		 * If this object is a complex type, the reader is positioned at the end element of its outer element
		 */
		public static AddOnAuthor parse(XMLStreamReader reader) throws Exception {
			AddOnAuthor object = new AddOnAuthor();

			int event;
			QName currentQName = null;
			String nillableValue = null;
			String prefix = "";
			String namespaceuri = "";

			try {
				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				currentQName = reader.getName();

				if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");

					if (fullTypeName != null) {
						String nsPrefix = null;

						if (fullTypeName.contains(":")) {
							nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
						}

						nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

						String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

						if (!"AddOnAuthor".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (AddOnAuthor) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Name").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setName(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Url").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setUrl(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement()) {
					// 2 - A start element we are not expecting indicates a trailing invalid property
					throw new ADBException("Unexpected subelement " + reader.getName());
				}
			} catch (XMLStreamException e) {
				throw new Exception(e);
			}

			return object;
		}
	} //end of factory class
}
