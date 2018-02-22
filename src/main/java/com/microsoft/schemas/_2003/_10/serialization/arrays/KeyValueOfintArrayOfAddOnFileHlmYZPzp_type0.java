/**
 * KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.microsoft.schemas._2003._10.serialization.arrays;


import addons.curse.AddOnFile;
import addons.curse.ArrayOfAddOnFile;
import com.curse.addonservice.ExtensionMapper;
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
import java.util.List;
import java.util.Vector;

/**
 * KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0 bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0 implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0
       Namespace URI = http://schemas.microsoft.com/2003/10/Serialization/Arrays
       Namespace Prefix = ns3
     */

	/**
	 * field for Key
	 */
	protected int localKey;

	/**
	 * field for Value
	 */
	protected List<AddOnFile> localValue;

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getKey() {
		return localKey;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Key
	 */
	public void setKey(int param) {
		this.localKey = param;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return addons.curse.ArrayOfAddOnFile
	 */
	public List<AddOnFile> getValue() {
		return localValue;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Value
	 */
	public void setValue(List<AddOnFile> param) {
		this.localValue = param;
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
			String namespacePrefix = Util.registerPrefix(xmlWriter, "http://schemas.microsoft.com/2003/10/Serialization/Arrays");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0", xmlWriter);
			}
		}

		namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays";
		Util.writeStartElement(null, namespace, "Key", xmlWriter);

		if (localKey == Integer.MIN_VALUE) {
			throw new ADBException("Key cannot be null!!");
		} else {
			xmlWriter.writeCharacters(ConverterUtil.convertToString(localKey));
		}

		xmlWriter.writeEndElement();

		if (localValue == null) {
			Util.writeStartElement(null, "http://schemas.microsoft.com/2003/10/Serialization/Arrays", "Value", xmlWriter);

			// write the nil attribute
			Util.writeNil(xmlWriter);
			xmlWriter.writeEndElement();
		} else {
			ArrayOfAddOnFile.Factory.serialize(new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "Value"), xmlWriter, localValue);
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals("http://schemas.microsoft.com/2003/10/Serialization/Arrays")) {
			return "ns3";
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
		public static KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0 parse(XMLStreamReader reader) throws Exception {
			KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0 object = new KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0();

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

						if (!"KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "Key").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "Key" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setKey(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					// 1 - A start element we are not expecting indicates an invalid parameter was passed
					throw new ADBException("Unexpected subelement " + reader.getName());
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "Value").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setValue(null);
						reader.next();

						reader.next();
					} else {
						object.setValue(ArrayOfAddOnFile.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
					// 1 - A start element we are not expecting indicates an invalid parameter was passed
					throw new ADBException("Unexpected subelement " + reader.getName());
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
