/**
 * GetSecureDownloadToken.java
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
 * GetSecureDownloadToken bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class GetSecureDownloadToken implements ADBBean {
	public static final QName MY_QNAME = new QName("http://addonservice.curse.com/", "GetSecureDownloadToken", "ns9");

	/**
	 * field for FileID
	 */
	protected int localFileID;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localFileIDTracker = false;

	/**
	 * field for UserID
	 */
	protected int localUserID;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localUserIDTracker = false;

	/**
	 * field for HasPremium
	 */
	protected boolean localHasPremium;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localHasPremiumTracker = false;

	/**
	 * field for SubscriptionToken
	 */
	protected int localSubscriptionToken;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localSubscriptionTokenTracker = false;

	public boolean isFileIDSpecified() {
		return localFileIDTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getFileID() {
		return localFileID;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param FileID
	 */
	public void setFileID(int param) {
		// setting primitive attribute tracker to true
		localFileIDTracker = param != Integer.MIN_VALUE;

		this.localFileID = param;
	}

	public boolean isUserIDSpecified() {
		return localUserIDTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getUserID() {
		return localUserID;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param UserID
	 */
	public void setUserID(int param) {
		// setting primitive attribute tracker to true
		localUserIDTracker = param != Integer.MIN_VALUE;

		this.localUserID = param;
	}

	public boolean isHasPremiumSpecified() {
		return localHasPremiumTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return boolean
	 */
	public boolean getHasPremium() {
		return localHasPremium;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param HasPremium
	 */
	public void setHasPremium(boolean param) {
		// setting primitive attribute tracker to true
		localHasPremiumTracker = true;

		this.localHasPremium = param;
	}

	public boolean isSubscriptionTokenSpecified() {
		return localSubscriptionTokenTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getSubscriptionToken() {
		return localSubscriptionToken;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param SubscriptionToken
	 */
	public void setSubscriptionToken(int param) {
		// setting primitive attribute tracker to true
		localSubscriptionTokenTracker = param != Integer.MIN_VALUE;

		this.localSubscriptionToken = param;
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
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":GetSecureDownloadToken", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "GetSecureDownloadToken", xmlWriter);
			}
		}

		if (localFileIDTracker) {
			namespace = "http://addonservice.curse.com/";
			Util.writeStartElement(null, namespace, "fileID", xmlWriter);

			if (localFileID == Integer.MIN_VALUE) {
				throw new ADBException("fileID cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localFileID));
			}

			xmlWriter.writeEndElement();
		}

		if (localUserIDTracker) {
			namespace = "http://addonservice.curse.com/";
			Util.writeStartElement(null, namespace, "userID", xmlWriter);

			if (localUserID == Integer.MIN_VALUE) {
				throw new ADBException("userID cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localUserID));
			}

			xmlWriter.writeEndElement();
		}

		if (localHasPremiumTracker) {
			namespace = "http://addonservice.curse.com/";
			Util.writeStartElement(null, namespace, "hasPremium", xmlWriter);

			xmlWriter.writeCharacters(ConverterUtil.convertToString(localHasPremium));

			xmlWriter.writeEndElement();
		}

		if (localSubscriptionTokenTracker) {
			namespace = "http://addonservice.curse.com/";
			Util.writeStartElement(null, namespace, "subscriptionToken", xmlWriter);

			if (localSubscriptionToken == Integer.MIN_VALUE) {
				throw new ADBException("subscriptionToken cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localSubscriptionToken));
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
		public static GetSecureDownloadToken parse(XMLStreamReader reader) throws Exception {
			GetSecureDownloadToken object = new GetSecureDownloadToken();

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

						if (!"GetSecureDownloadToken".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (GetSecureDownloadToken) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://addonservice.curse.com/", "fileID").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "fileID" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setFileID(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setFileID(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://addonservice.curse.com/", "userID").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "userID" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setUserID(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setUserID(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://addonservice.curse.com/", "hasPremium").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "hasPremium" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setHasPremium(ConverterUtil.convertToBoolean(content));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://addonservice.curse.com/", "subscriptionToken").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "subscriptionToken" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setSubscriptionToken(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setSubscriptionToken(Integer.MIN_VALUE);
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
