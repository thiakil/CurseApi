/**
 * DurationE.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.microsoft.schemas._2003._10.serialization;


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
 *  DurationE bean class
 */
@SuppressWarnings({"unchecked",
		"unused"
})
public class DurationE implements ADBBean {
	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/",
			"duration", "ns2");

	/**
	 * field for Duration
	 */
	protected Duration localDuration;

	/**
	 * Auto generated getter method
	 * @return com.microsoft.schemas._2003._10.serialization.Duration
	 */
	public Duration getDuration() {
		return localDuration;
	}

	/**
	 * Auto generated setter method
	 * @param param Duration
	 */
	public void setDuration(
			Duration param) {
		this.localDuration = param;
	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public OMElement getOMElement(
			final javax.xml.namespace.QName parentQName,
			final OMFactory factory)
			throws ADBException {
		return factory.createOMElement(new ADBDataSource(
				this, MY_QNAME));
	}

	public void serialize(final javax.xml.namespace.QName parentQName,
						  XMLStreamWriter xmlWriter)
			throws XMLStreamException,
			ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final javax.xml.namespace.QName parentQName,
						  XMLStreamWriter xmlWriter, boolean serializeType)
			throws XMLStreamException,
			ADBException {
		//We can safely assume an element has only one type associated with it
		if (localDuration == null) {
			java.lang.String namespace = "http://schemas.microsoft.com/2003/10/Serialization/";
			writeStartElement(null, namespace, "duration", xmlWriter);

			// write the nil attribute
			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
					"nil", "1", xmlWriter);
			xmlWriter.writeEndElement();
		} else {
			localDuration.serialize(MY_QNAME, xmlWriter);
		}
	}

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals(
				"http://schemas.microsoft.com/2003/10/Serialization/")) {
			return "ns2";
		}

		return BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(java.lang.String prefix,
								   java.lang.String namespace, java.lang.String localPart,
								   XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

		if (writerPrefix != null) {
			xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
		} else {
			if (namespace.length() == 0) {
				prefix = "";
			} else if (prefix == null) {
				prefix = generatePrefix(namespace);
			}

			xmlWriter.writeStartElement(prefix, localPart, namespace);
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix,
								java.lang.String namespace, java.lang.String attName,
								java.lang.String attValue, XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

		if (writerPrefix != null) {
			xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
		} else {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
			xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace,
								java.lang.String attName, java.lang.String attValue,
								XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
					namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace,
									 java.lang.String attName, javax.xml.namespace.QName qname,
									 XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}

		java.lang.String attributeValue;

		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(attributePrefix, namespace, attName,
					attributeValue);
		}
	}

	/**
	 *  method to handle Qnames
	 */
	private void writeQName(javax.xml.namespace.QName qname,
							XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();

		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(prefix + ":" +
						ConverterUtil.convertToString(
								qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(ConverterUtil.convertToString(
						qname));
			}
		} else {
			xmlWriter.writeCharacters(ConverterUtil.convertToString(
					qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames,
							 XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		if (qnames != null) {
			// we have to store this data until last moment since it is not possible to write any
			// namespace data after writing the charactor data
			StringBuffer stringToWrite = new StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}

				namespaceURI = qnames[i].getNamespaceURI();

				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);

					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite.append(prefix).append(":")
								.append(ConverterUtil.convertToString(
										qnames[i]));
					} else {
						stringToWrite.append(ConverterUtil.convertToString(
								qnames[i]));
					}
				} else {
					stringToWrite.append(ConverterUtil.convertToString(
							qnames[i]));
				}
			}

			xmlWriter.writeCharacters(stringToWrite.toString());
		}
	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(
			XMLStreamWriter xmlWriter, java.lang.String namespace)
			throws XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);

		if (prefix == null) {
			prefix = generatePrefix(namespace);

			NamespaceContext nsContext = xmlWriter.getNamespaceContext();

			while (true) {
				java.lang.String uri = nsContext.getNamespaceURI(prefix);

				if ((uri == null) || (uri.length() == 0)) {
					break;
				}

				prefix = BeanUtil.getUniquePrefix();
			}

			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}

		return prefix;
	}

	/**
	 *  Factory class that keeps the parse method
	 */
	public static class Factory {
		private static Log log = LogFactory.getLog(Factory.class);

		/**
		 * static method to create the object
		 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
		 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
		 * Postcondition: If this object is an element, the reader is positioned at its end element
		 *                If this object is a complex type, the reader is positioned at the end element of its outer element
		 */
		public static DurationE parse(XMLStreamReader reader)
				throws Exception {
			DurationE object = new DurationE();

			int event;
			javax.xml.namespace.QName currentQName = null;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";

			try {
				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				currentQName = reader.getName();

				nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
						"nil");

				if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
					// Skip the element and report the null value.  It cannot have subelements.
					while (!reader.isEndElement())
						reader.next();

					return object;
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				while (!reader.isEndElement()) {
					if (reader.isStartElement()) {
						if (reader.isStartElement() &&
								new javax.xml.namespace.QName(
										"http://schemas.microsoft.com/2003/10/Serialization/",
										"duration").equals(reader.getName())) {
							nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
									"nil");

							if ("true".equals(nillableValue) ||
									"1".equals(nillableValue)) {
								object.setDuration(null);
								reader.next();
							} else {
								object.setDuration(Duration.Factory.parse(
										reader));
							}
						} // End of if for expected property start element

						else {
							// 3 - A start element we are not expecting indicates an invalid parameter was passed
							throw new ADBException(
									"Unexpected subelement " + reader.getName());
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
