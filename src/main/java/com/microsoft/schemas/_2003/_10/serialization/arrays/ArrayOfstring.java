/**
 * ArrayOfstring.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.microsoft.schemas._2003._10.serialization.arrays;


import com.curse.addonservice.ExtensionMapper;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *  ArrayOfstring bean class
 */
@SuppressWarnings({"unchecked",
		"unused"
})
public class ArrayOfstring implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = ArrayOfstring
       Namespace URI = http://schemas.microsoft.com/2003/10/Serialization/Arrays
       Namespace Prefix = ns3
     */

	/**
	 * field for String
	 * This was an Array!
	 */
	protected String[] localString;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localStringTracker = false;

	public boolean isStringSpecified() {
		return localStringTracker;
	}

	/**
	 * Auto generated getter method
	 * @return java.lang.String[]
	 */
	public String[] getString() {
		return localString;
	}

	/**
	 * validate the array for String
	 */
	protected void validateString(String[] param) {
	}

	/**
	 * Auto generated setter method
	 * @param param String
	 */
	public void setString(String[] param) {
		validateString(param);

		localStringTracker = true;

		this.localString = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * @param param java.lang.String
	 */
	public void addString(String param) {
		if (localString == null) {
			localString = new String[]{};
		}

		//update the setting tracker
		localStringTracker = true;

		List list = ConverterUtil.toList(localString);
		list.add(param);
		this.localString = (String[]) list.toArray(new String[list.size()]);
	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public OMElement getOMElement(
			final QName parentQName,
			final OMFactory factory)
			throws ADBException {
		return factory.createOMElement(new ADBDataSource(
				this, parentQName));
	}

	public void serialize(final QName parentQName,
						  XMLStreamWriter xmlWriter)
			throws XMLStreamException,
			ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final QName parentQName,
						  XMLStreamWriter xmlWriter, boolean serializeType)
			throws XMLStreamException,
			ADBException {
		String prefix = null;
		String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(),
				xmlWriter);

		if (serializeType) {
			String namespacePrefix = registerPrefix(xmlWriter,
					"http://schemas.microsoft.com/2003/10/Serialization/Arrays");

			if ((namespacePrefix != null) &&
					(namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":ArrayOfstring", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"ArrayOfstring", xmlWriter);
			}
		}

		if (localStringTracker) {
			if (localString != null) {
				namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays";

				for (int i = 0; i < localString.length; i++) {
					if (localString[i] != null) {
						writeStartElement(null, namespace, "string", xmlWriter);

						xmlWriter.writeCharacters(ConverterUtil.convertToString(
								localString[i]));

						xmlWriter.writeEndElement();
					} else {
						// write null attribute
						namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays";
						writeStartElement(null, namespace, "string", xmlWriter);
						writeAttribute("xsi",
								"http://www.w3.org/2001/XMLSchema-instance", "nil",
								"1", xmlWriter);
						xmlWriter.writeEndElement();
					}
				}
			} else {
				// write the null attribute
				// write null attribute
				writeStartElement(null,
						"http://schemas.microsoft.com/2003/10/Serialization/Arrays",
						"string", xmlWriter);

				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
						xmlWriter);
				xmlWriter.writeEndElement();
			}
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals(
				"http://schemas.microsoft.com/2003/10/Serialization/Arrays")) {
			return "ns3";
		}

		return BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(String prefix,
								   String namespace, String localPart,
								   XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		String writerPrefix = xmlWriter.getPrefix(namespace);

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
	private void writeAttribute(String prefix,
								String namespace, String attName,
								String attValue, XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		String writerPrefix = xmlWriter.getPrefix(namespace);

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
	private void writeAttribute(String namespace,
								String attName, String attValue,
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
	private void writeQNameAttribute(String namespace,
									 String attName, QName qname,
									 XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		String attributeNamespace = qname.getNamespaceURI();
		String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}

		String attributeValue;

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
	private void writeQName(QName qname,
							XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		String namespaceURI = qname.getNamespaceURI();

		if (namespaceURI != null) {
			String prefix = xmlWriter.getPrefix(namespaceURI);

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

	private void writeQNames(QName[] qnames,
							 XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		if (qnames != null) {
			// we have to store this data until last moment since it is not possible to write any
			// namespace data after writing the charactor data
			StringBuffer stringToWrite = new StringBuffer();
			String namespaceURI = null;
			String prefix = null;

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
	private String registerPrefix(
			XMLStreamWriter xmlWriter, String namespace)
			throws XMLStreamException {
		String prefix = xmlWriter.getPrefix(namespace);

		if (prefix == null) {
			prefix = generatePrefix(namespace);

			NamespaceContext nsContext = xmlWriter.getNamespaceContext();

			while (true) {
				String uri = nsContext.getNamespaceURI(prefix);

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
		public static ArrayOfstring parse(
				XMLStreamReader reader) throws Exception {
			ArrayOfstring object = new ArrayOfstring();

			int event;
			QName currentQName = null;
			String nillableValue = null;
			String prefix = "";
			String namespaceuri = "";

			try {
				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				currentQName = reader.getName();

				if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"type");

					if (fullTypeName != null) {
						String nsPrefix = null;

						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0,
									fullTypeName.indexOf(":"));
						}

						nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

						String type = fullTypeName.substring(fullTypeName.indexOf(
								":") + 1);

						if (!"ArrayOfstring".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext()
									.getNamespaceURI(nsPrefix);

							return (ArrayOfstring) ExtensionMapper.getTypeObject(nsUri,
									type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				ArrayList list1 = new ArrayList();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName(
								"http://schemas.microsoft.com/2003/10/Serialization/Arrays",
								"string").equals(reader.getName())) {
					// Process the array and step past its final element's end.
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

					if ("true".equals(nillableValue) ||
							"1".equals(nillableValue)) {
						list1.add(null);

						reader.next();
					} else {
						list1.add(reader.getElementText());
					}

					//loop until we find a start element that is not part of this array
					boolean loopDone1 = false;

					while (!loopDone1) {
						// Ensure we are at the EndElement
						while (!reader.isEndElement()) {
							reader.next();
						}

						// Step out of this element
						reader.next();

						// Step to next element event.
						while (!reader.isStartElement() &&
								!reader.isEndElement())
							reader.next();

						if (reader.isEndElement()) {
							//two continuous end elements means we are exiting the xml structure
							loopDone1 = true;
						} else {
							if (new QName(
									"http://schemas.microsoft.com/2003/10/Serialization/Arrays",
									"string").equals(reader.getName())) {
								nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
										"nil");

								if ("true".equals(nillableValue) ||
										"1".equals(nillableValue)) {
									list1.add(null);

									reader.next();
								} else {
									list1.add(reader.getElementText());
								}
							} else {
								loopDone1 = true;
							}
						}
					}

					// call the converter utility  to convert and set the array
					object.setString((String[]) list1.toArray(
							new String[list1.size()]));
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()) {
					// 2 - A start element we are not expecting indicates a trailing invalid property
					throw new ADBException(
							"Unexpected subelement " + reader.getName());
				}
			} catch (XMLStreamException e) {
				throw new Exception(e);
			}

			return object;
		}
	} //end of factory class
}