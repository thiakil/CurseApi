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
 * ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package org.datacontract.schemas._2004._07.curse_clientservice_models;


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
import java.util.Vector;

/**
 * ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4 bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4 implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4
       Namespace URI = http://schemas.datacontract.org/2004/07/Curse.ClientService.Models
       Namespace Prefix = ns5
     */

	/**
	 * field for Message
	 */
	protected String localMessage;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localMessageTracker = false;

	/**
	 * field for Status
	 */
	protected ServiceResponseStatus localStatus;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localStatusTracker = false;

	/**
	 * field for Value
	 */
	protected ArrayOfSyncedGameInstance localValue;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localValueTracker = false;

	public boolean isMessageSpecified() {
		return localMessageTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getMessage() {
		return localMessage;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Message
	 */
	public void setMessage(String param) {
		localMessageTracker = true;

		this.localMessage = param;
	}

	public boolean isStatusSpecified() {
		return localStatusTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return org.datacontract.schemas._2004._07.curse_clientservice_models.ServiceResponseStatus
	 */
	public ServiceResponseStatus getStatus() {
		return localStatus;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Status
	 */
	public void setStatus(ServiceResponseStatus param) {
		localStatusTracker = param != null;

		this.localStatus = param;
	}

	public boolean isValueSpecified() {
		return localValueTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return org.datacontract.schemas._2004._07.curse_clientservice_models.ArrayOfSyncedGameInstance
	 */
	public ArrayOfSyncedGameInstance getValue() {
		return localValue;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Value
	 */
	public void setValue(ArrayOfSyncedGameInstance param) {
		localValueTracker = true;

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
			String namespacePrefix = Util.registerPrefix(xmlWriter, "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4", xmlWriter);
			}
		}

		if (localMessageTracker) {
			namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models";
			Util.writeStartElement(null, namespace, "Message", xmlWriter);

			if (localMessage == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localMessage);
			}

			xmlWriter.writeEndElement();
		}

		if (localStatusTracker) {
			if (localStatus == null) {
				throw new ADBException("Status cannot be null!!");
			}

			localStatus.serialize(new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "Status"), xmlWriter);
		}

		if (localValueTracker) {
			if (localValue == null) {
				Util.writeStartElement(null, "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "Value", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localValue.serialize(new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "Value"), xmlWriter);
			}
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models")) {
			return "ns5";
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
		public static ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4 parse(XMLStreamReader reader) throws Exception {
			ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4 object = new ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4();

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

						if (!"ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "Message").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setMessage(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "Status").equals(reader.getName())) {
					object.setStatus(ServiceResponseStatus.Factory.parse(reader));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "Value").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setValue(null);
						reader.next();

						reader.next();
					} else {
						object.setValue(ArrayOfSyncedGameInstance.Factory.parse(reader));

						reader.next();
					}
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
