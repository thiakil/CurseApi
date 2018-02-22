/**
 * LeaveSyncGroup.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.curse.addonservice;


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
 * LeaveSyncGroup bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class LeaveSyncGroup implements ADBBean {
	public static final QName MY_QNAME = new QName("http://addonservice.curse.com/", "LeaveSyncGroup", "ns9");

	/**
	 * field for InstanceID
	 */
	protected int localInstanceID;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localInstanceIDTracker = false;

	/**
	 * field for ComputerID
	 */
	protected int localComputerID;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localComputerIDTracker = false;

	/**
	 * field for InstanceGUID
	 */
	protected String localInstanceGUID;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localInstanceGUIDTracker = false;

	public boolean isInstanceIDSpecified() {
		return localInstanceIDTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getInstanceID() {
		return localInstanceID;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param InstanceID
	 */
	public void setInstanceID(int param) {
		// setting primitive attribute tracker to true
		localInstanceIDTracker = param != Integer.MIN_VALUE;

		this.localInstanceID = param;
	}

	public boolean isComputerIDSpecified() {
		return localComputerIDTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getComputerID() {
		return localComputerID;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param ComputerID
	 */
	public void setComputerID(int param) {
		// setting primitive attribute tracker to true
		localComputerIDTracker = param != Integer.MIN_VALUE;

		this.localComputerID = param;
	}

	public boolean isInstanceGUIDSpecified() {
		return localInstanceGUIDTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getInstanceGUID() {
		return localInstanceGUID;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param InstanceGUID
	 */
	public void setInstanceGUID(String param) {
		localInstanceGUIDTracker = true;

		this.localInstanceGUID = param;
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
		Util.writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {
			String namespacePrefix = Util.registerPrefix(xmlWriter, "http://addonservice.curse.com/");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":LeaveSyncGroup", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "LeaveSyncGroup", xmlWriter);
			}
		}

		if (localInstanceIDTracker) {
			namespace = "http://addonservice.curse.com/";
			Util.writeStartElement(null, namespace, "instanceID", xmlWriter);

			if (localInstanceID == Integer.MIN_VALUE) {
				throw new ADBException("instanceID cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localInstanceID));
			}

			xmlWriter.writeEndElement();
		}

		if (localComputerIDTracker) {
			namespace = "http://addonservice.curse.com/";
			Util.writeStartElement(null, namespace, "computerID", xmlWriter);

			if (localComputerID == Integer.MIN_VALUE) {
				throw new ADBException("computerID cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localComputerID));
			}

			xmlWriter.writeEndElement();
		}

		if (localInstanceGUIDTracker) {
			namespace = "http://addonservice.curse.com/";
			Util.writeStartElement(null, namespace, "instanceGUID", xmlWriter);

			if (localInstanceGUID == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localInstanceGUID);
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
		public static LeaveSyncGroup parse(XMLStreamReader reader) throws Exception {
			LeaveSyncGroup object = new LeaveSyncGroup();

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

						if (!"LeaveSyncGroup".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (LeaveSyncGroup) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://addonservice.curse.com/", "instanceID").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "instanceID" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setInstanceID(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setInstanceID(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://addonservice.curse.com/", "computerID").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "computerID" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setComputerID(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setComputerID(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://addonservice.curse.com/", "instanceGUID").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setInstanceGUID(ConverterUtil.convertToString(content));
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
