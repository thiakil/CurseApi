/**
 * FileSystemInfo.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package org.datacontract.schemas._2004._07.system_io;


import com.curse.addonservice.ExtensionMapper;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axis2.databinding.ADBBean;
import org.apache.axis2.databinding.ADBDataSource;
import org.apache.axis2.databinding.ADBException;
import org.apache.axis2.databinding.utils.BeanUtil;
import org.apache.axis2.databinding.utils.ConverterUtil;
import org.apache.axis2.databinding.utils.NamedStaxOMBuilder;
import org.apache.axis2.util.StreamWrapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *  FileSystemInfo bean class
 */
@SuppressWarnings({"unchecked",
		"unused"
})
public class FileSystemInfo implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = FileSystemInfo
       Namespace URI = http://schemas.datacontract.org/2004/07/System.IO
       Namespace Prefix = ns7
     */

	/**
	 * field for ExtraElement
	 * This was an Array!
	 */
	protected OMElement[] localExtraElement;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localExtraElementTracker = false;

	/**
	 * field for FactoryType
	 * This was an Attribute!
	 */
	protected QName localFactoryType;

	public boolean isExtraElementSpecified() {
		return localExtraElementTracker;
	}

	/**
	 * Auto generated getter method
	 * @return org.apache.axiom.om.OMElement[]
	 */
	public OMElement[] getExtraElement() {
		return localExtraElement;
	}

	/**
	 * validate the array for ExtraElement
	 */
	protected void validateExtraElement(OMElement[] param) {
	}

	/**
	 * Auto generated setter method
	 * @param param ExtraElement
	 */
	public void setExtraElement(OMElement[] param) {
		validateExtraElement(param);

		localExtraElementTracker = param != null;

		this.localExtraElement = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * @param param org.apache.axiom.om.OMElement
	 */
	public void addExtraElement(OMElement param) {
		if (localExtraElement == null) {
			localExtraElement = new OMElement[]{};
		}

		//update the setting tracker
		localExtraElementTracker = true;

		List list = ConverterUtil.toList(localExtraElement);
		list.add(param);
		this.localExtraElement = (OMElement[]) list.toArray(new OMElement[list.size()]);
	}

	/**
	 * Auto generated getter method
	 * @return javax.xml.namespace.QName
	 */
	public QName getFactoryType() {
		return localFactoryType;
	}

	/**
	 * Auto generated setter method
	 * @param param FactoryType
	 */
	public void setFactoryType(QName param) {
		this.localFactoryType = param;
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
					"http://schemas.datacontract.org/2004/07/System.IO");

			if ((namespacePrefix != null) &&
					(namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":FileSystemInfo", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"FileSystemInfo", xmlWriter);
			}
		}

		if (localFactoryType != null) {
			writeQNameAttribute("http://schemas.microsoft.com/2003/10/Serialization/",
					"FactoryType", localFactoryType, xmlWriter);
		}

		if (localExtraElementTracker) {
			if (localExtraElement != null) {
				for (int i = 0; i < localExtraElement.length; i++) {
					if (localExtraElement[i] != null) {
						localExtraElement[i].serialize(xmlWriter);
					} else {
						// we have to do nothing since minOccures zero
					}
				}
			} else {
				throw new ADBException(
						"extraElement cannot be null!!");
			}
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals(
				"http://schemas.datacontract.org/2004/07/System.IO")) {
			return "ns7";
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
		public static FileSystemInfo parse(
				XMLStreamReader reader) throws Exception {
			FileSystemInfo object = new FileSystemInfo();

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

						if (!"FileSystemInfo".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext()
									.getNamespaceURI(nsPrefix);

							return (FileSystemInfo) ExtensionMapper.getTypeObject(nsUri,
									type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				// handle attribute "FactoryType"
				String tempAttribFactoryType = reader.getAttributeValue("http://schemas.microsoft.com/2003/10/Serialization/",
						"FactoryType");

				if (tempAttribFactoryType != null) {
					String content = tempAttribFactoryType;

					int index = tempAttribFactoryType.indexOf(":");

					if (index > -1) {
						prefix = tempAttribFactoryType.substring(0, index);
					} else {
						// i.e this is in default namesace
						prefix = "";
					}

					namespaceuri = reader.getNamespaceURI(prefix);

					object.setFactoryType(ConverterUtil.convertToQName(
							tempAttribFactoryType, namespaceuri));
				} else {
				}

				handledAttributes.add("FactoryType");

				reader.next();

				ArrayList list1 = new ArrayList();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()) {
					// Process the array and step past its final element's end.
					boolean loopDone1 = false;

					while (!loopDone1) {
						event = reader.getEventType();

						if (XMLStreamConstants.START_ELEMENT == event) {
							// We need to wrap the reader so that it produces a fake START_DOCUEMENT event
							NamedStaxOMBuilder builder1 =
									new NamedStaxOMBuilder(new StreamWrapper(
											reader), reader.getName());

							list1.add(builder1.getOMElement());
							reader.next();

							if (reader.isEndElement()) {
								// we have two countinuos end elements
								loopDone1 = true;
							}
						} else if (XMLStreamConstants.END_ELEMENT == event) {
							loopDone1 = true;
						} else {
							reader.next();
						}
					}

					object.setExtraElement((OMElement[]) ConverterUtil.convertToArray(
							OMElement.class, list1));
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
