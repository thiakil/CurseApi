/**
 * Guid.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.microsoft.schemas._2003._10.serialization;


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
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import java.util.Vector;

/**
 * Guid bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class Guid implements ADBBean {
	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid", "ns2");

	/**
	 * field for Guid
	 */
	protected String localGuid;

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getGuid() {
		return localGuid;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Guid
	 */
	public void setGuid(String param) {
		if (ConverterUtil.convertToString(param).matches("[\\da-fA-F]{8}-[\\da-fA-F]{4}-[\\da-fA-F]{4}-[\\da-fA-F]{4}-[\\da-fA-F]{12}")) {
			this.localGuid = param;
		} else {
			throw new RuntimeException("Input values do not follow defined XSD restrictions");
		}
	}

	public String toString() {
		return localGuid;
	}

	/**
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public OMElement getOMElement(final javax.xml.namespace.QName parentQName, final OMFactory factory) {
		return factory.createOMElement(new ADBDataSource(this, MY_QNAME));
	}

	public void serialize(final javax.xml.namespace.QName parentQName, XMLStreamWriter xmlWriter) throws XMLStreamException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName, XMLStreamWriter xmlWriter, boolean serializeType) throws XMLStreamException {
		//We can safely assume an element has only one type associated with it
		String namespace = parentQName.getNamespaceURI();
		String _localName = parentQName.getLocalPart();

		Util.writeStartElement(null, namespace, _localName, xmlWriter);

		// add the type details if this is used in a simple type
		if (serializeType) {
			String namespacePrefix = Util.registerPrefix(xmlWriter, "http://schemas.microsoft.com/2003/10/Serialization/");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":guid", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "guid", xmlWriter);
			}
		}

		if (localGuid == null) {
			throw new ADBException("guid cannot be null !!");
		} else {
			xmlWriter.writeCharacters(localGuid);
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals("http://schemas.microsoft.com/2003/10/Serialization/")) {
			return "ns2";
		}

		return BeanUtil.getUniquePrefix();
	}









	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {
		private static Log log = LogFactory.getLog(Factory.class);

		public static Guid fromString(String value, String namespaceURI) {
			Guid returnValue = new Guid();

			returnValue.setGuid(ConverterUtil.convertToString(value));

			return returnValue;
		}

		public static Guid fromString(XMLStreamReader xmlStreamReader, String content) {
			if (content.contains(":")) {
				String prefix = content.substring(0, content.indexOf(":"));
				String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);

				return Guid.Factory.fromString(content, namespaceUri);
			} else {
				return Guid.Factory.fromString(content, "");
			}
		}

		/**
		 * static method to create the object
		 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
		 * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
		 * Postcondition: If this object is an element, the reader is positioned at its end element
		 * If this object is a complex type, the reader is positioned at the end element of its outer element
		 */
		public static Guid parse(XMLStreamReader reader) throws Exception {
			Guid object = new Guid();

			int event;
			javax.xml.namespace.QName currentQName = null;
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
								throw new ADBException("The element: " + "guid" + "  cannot be null");
							}

							String content = reader.getElementText();

							object.setGuid(ConverterUtil.convertToString(content));
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
