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
 *
 * Additional permission under GNU GPL version 3 section 7
 *
 * This library may be dynamically linked against (used as a dependency) in any project licenced under terms requiring complete
 * source code availability (a "FREE SOFTWARE LICENCE" https://www.gnu.org/philosophy/free-sw.html), such as the Apache License(s),
 * without the using project being required to be GPL licenced. This library remains GPL licenced and any modifications to this
 * library must still be made under the terms of the GPL. Bundling of the compiled binary class files ("fat jars") is permitted
 * for OPEN SOURCE projects, provided no modifications have been made (in which case source code for modifications must be available).
 *
 * Repackaging (sometimes known as "shading") where ONLY the package names are changed to avoid conflicts requires the configuration
 * and instructions for the method of repackaging to be made available in the same manner as source code.
 *
 * You may NOT use this library in a closed source project under any circumstance.
 */

/**
 * SaveSyncTransactions.java
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
import org.datacontract.schemas._2004._07.curse_clientservice_models.ArrayOfSyncTransaction;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import java.util.Vector;

/**
 * SaveSyncTransactions bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class SaveSyncTransactions implements ADBBean {
	public static final QName MY_QNAME = new QName("http://addonservice.curse.com/", "SaveSyncTransactions", "ns9");
	private static final QName instanceIDQName = new QName("http://addonservice.curse.com/", "instanceID");
	private static final QName transactionsQName = new QName("http://addonservice.curse.com/", "transactions");

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
	 * field for Transactions
	 */
	protected ArrayOfSyncTransaction localTransactions;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localTransactionsTracker = false;

	public SaveSyncTransactions() {
	}

	public SaveSyncTransactions(int instanceID, ArrayOfSyncTransaction transactions) {
		this.setInstanceID(instanceID);
		this.setTransactions(transactions);
	}

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

	public boolean isTransactionsSpecified() {
		return localTransactionsTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return org.datacontract.schemas._2004._07.curse_clientservice_models.ArrayOfSyncTransaction
	 */
	public ArrayOfSyncTransaction getTransactions() {
		return localTransactions;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Transactions
	 */
	public void setTransactions(ArrayOfSyncTransaction param) {
		localTransactionsTracker = true;

		this.localTransactions = param;
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
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":SaveSyncTransactions", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "SaveSyncTransactions", xmlWriter);
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

		if (localTransactionsTracker) {
			if (localTransactions == null) {
				Util.writeStartElement(null, "http://addonservice.curse.com/", "transactions", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localTransactions.serialize(transactionsQName, xmlWriter);
			}
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
		public static SaveSyncTransactions parse(XMLStreamReader reader) throws Exception {
			SaveSyncTransactions object = new SaveSyncTransactions();

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

						if (!"SaveSyncTransactions".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (SaveSyncTransactions) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && instanceIDQName.equals(reader.getName())) {
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

				if (reader.isStartElement() && transactionsQName.equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setTransactions(null);
						reader.next();

						reader.next();
					} else {
						object.setTransactions(ArrayOfSyncTransaction.Factory.parse(reader));

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
