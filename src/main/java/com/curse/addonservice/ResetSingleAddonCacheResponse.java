/**
 * ResetSingleAddonCacheResponse.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.curse.addonservice;


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
 * ResetSingleAddonCacheResponse bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class ResetSingleAddonCacheResponse implements ADBBean {
	public static final QName MY_QNAME = new QName("http://addonservice.curse.com/", "ResetSingleAddonCacheResponse", "ns9");

	/**
	 * field for ResetSingleAddonCacheResult
	 */
	protected String localResetSingleAddonCacheResult;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localResetSingleAddonCacheResultTracker = false;

	public boolean isResetSingleAddonCacheResultSpecified() {
		return localResetSingleAddonCacheResultTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getResetSingleAddonCacheResult() {
		return localResetSingleAddonCacheResult;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param ResetSingleAddonCacheResult
	 */
	public void setResetSingleAddonCacheResult(String param) {
		localResetSingleAddonCacheResultTracker = true;

		this.localResetSingleAddonCacheResult = param;
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
		String prefix = null;
		String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {
			String namespacePrefix = registerPrefix(xmlWriter, "http://addonservice.curse.com/");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":ResetSingleAddonCacheResponse", xmlWriter);
			} else {
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ResetSingleAddonCacheResponse", xmlWriter);
			}
		}

		if (localResetSingleAddonCacheResultTracker) {
			namespace = "http://addonservice.curse.com/";
			writeStartElement(null, namespace, "ResetSingleAddonCacheResult", xmlWriter);

			if (localResetSingleAddonCacheResult == null) {
				// write the nil attribute
				writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
			} else {
				xmlWriter.writeCharacters(localResetSingleAddonCacheResult);
			}

			xmlWriter.writeEndElement();
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals("http://addonservice.curse.com/")) {
			return "ns9";
		}

		return BeanUtil.getUniquePrefix();
	}

	/**
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(String prefix, String namespace, String localPart, XMLStreamWriter xmlWriter) throws XMLStreamException {
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
	private void writeAttribute(String prefix, String namespace, String attName, String attValue, XMLStreamWriter xmlWriter) throws XMLStreamException {
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
	private void writeAttribute(String namespace, String attName, String attValue, XMLStreamWriter xmlWriter) throws XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(String namespace, String attName, QName qname, XMLStreamWriter xmlWriter) throws XMLStreamException {
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
			xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
		}
	}

	/**
	 * method to handle Qnames
	 */
	private void writeQName(QName qname, XMLStreamWriter xmlWriter) throws XMLStreamException {
		String namespaceURI = qname.getNamespaceURI();

		if (namespaceURI != null) {
			String prefix = xmlWriter.getPrefix(namespaceURI);

			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(prefix + ":" + ConverterUtil.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(ConverterUtil.convertToString(qname));
			}
		} else {
			xmlWriter.writeCharacters(ConverterUtil.convertToString(qname));
		}
	}

	private void writeQNames(QName[] qnames, XMLStreamWriter xmlWriter) throws XMLStreamException {
		if (qnames != null) {
			// we have to store this data until last moment since it is not possible to write any
			// namespace data after writing the charactor data
			StringBuilder stringToWrite = new StringBuilder();
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
						stringToWrite.append(prefix).append(":").append(ConverterUtil.convertToString(qnames[i]));
					} else {
						stringToWrite.append(ConverterUtil.convertToString(qnames[i]));
					}
				} else {
					stringToWrite.append(ConverterUtil.convertToString(qnames[i]));
				}
			}

			xmlWriter.writeCharacters(stringToWrite.toString());
		}
	}

	/**
	 * Register a namespace prefix
	 */
	private String registerPrefix(XMLStreamWriter xmlWriter, String namespace) throws XMLStreamException {
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
		public static ResetSingleAddonCacheResponse parse(XMLStreamReader reader) throws Exception {
			ResetSingleAddonCacheResponse object = new ResetSingleAddonCacheResponse();

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

						if (!"ResetSingleAddonCacheResponse".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (ResetSingleAddonCacheResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://addonservice.curse.com/", "ResetSingleAddonCacheResult").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setResetSingleAddonCacheResult(ConverterUtil.convertToString(content));
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
