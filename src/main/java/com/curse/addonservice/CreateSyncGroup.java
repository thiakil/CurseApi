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
 * CreateSyncGroup.java
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
 * CreateSyncGroup bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class CreateSyncGroup implements ADBBean {
	public static final QName MY_QNAME = new QName("http://addonservice.curse.com/", "CreateSyncGroup", "ns9");
	private static final QName instanceNameQName = new QName("http://addonservice.curse.com/", "instanceName");
	private static final QName gameIDQName = new QName("http://addonservice.curse.com/", "gameID");
	private static final QName computerNameQName = new QName("http://addonservice.curse.com/", "computerName");
	private static final QName instanceGUIDQName = new QName("http://addonservice.curse.com/", "instanceGUID");
	private static final QName instanceLabelQName = new QName("http://addonservice.curse.com/", "instanceLabel");

	/**
	 * field for InstanceName
	 */
	protected String localInstanceName;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localInstanceNameTracker = false;

	/**
	 * field for GameID
	 */
	protected int localGameID;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localGameIDTracker = false;

	/**
	 * field for ComputerName
	 */
	protected String localComputerName;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localComputerNameTracker = false;

	/**
	 * field for InstanceGUID
	 */
	protected String localInstanceGUID;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localInstanceGUIDTracker = false;

	/**
	 * field for InstanceLabel
	 */
	protected String localInstanceLabel;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localInstanceLabelTracker = false;

	public CreateSyncGroup() {
	}

	public CreateSyncGroup(String instanceName, int gameID, String computerName, String instanceGUID, String instanceLabel) {
		this.setInstanceName(instanceName);
		this.setGameID(gameID);
		this.setComputerName(computerName);
		this.setInstanceGUID(instanceGUID);
		this.setInstanceLabel(instanceLabel);
	}

	public boolean isInstanceNameSpecified() {
		return localInstanceNameTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getInstanceName() {
		return localInstanceName;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param InstanceName
	 */
	public void setInstanceName(String param) {
		localInstanceNameTracker = true;

		this.localInstanceName = param;
	}

	public boolean isGameIDSpecified() {
		return localGameIDTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getGameID() {
		return localGameID;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param GameID
	 */
	public void setGameID(int param) {
		// setting primitive attribute tracker to true
		localGameIDTracker = param != Integer.MIN_VALUE;

		this.localGameID = param;
	}

	public boolean isComputerNameSpecified() {
		return localComputerNameTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getComputerName() {
		return localComputerName;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param ComputerName
	 */
	public void setComputerName(String param) {
		localComputerNameTracker = true;

		this.localComputerName = param;
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

	public boolean isInstanceLabelSpecified() {
		return localInstanceLabelTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getInstanceLabel() {
		return localInstanceLabel;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param InstanceLabel
	 */
	public void setInstanceLabel(String param) {
		localInstanceLabelTracker = true;

		this.localInstanceLabel = param;
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
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":CreateSyncGroup", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "CreateSyncGroup", xmlWriter);
			}
		}

		if (localInstanceNameTracker) {
			namespace = "http://addonservice.curse.com/";
			Util.writeStartElement(null, namespace, "instanceName", xmlWriter);

			if (localInstanceName == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localInstanceName);
			}

			xmlWriter.writeEndElement();
		}

		if (localGameIDTracker) {
			namespace = "http://addonservice.curse.com/";
			Util.writeStartElement(null, namespace, "gameID", xmlWriter);

			if (localGameID == Integer.MIN_VALUE) {
				throw new ADBException("gameID cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localGameID));
			}

			xmlWriter.writeEndElement();
		}

		if (localComputerNameTracker) {
			namespace = "http://addonservice.curse.com/";
			Util.writeStartElement(null, namespace, "computerName", xmlWriter);

			if (localComputerName == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localComputerName);
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

		if (localInstanceLabelTracker) {
			namespace = "http://addonservice.curse.com/";
			Util.writeStartElement(null, namespace, "instanceLabel", xmlWriter);

			if (localInstanceLabel == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localInstanceLabel);
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
		public static CreateSyncGroup parse(XMLStreamReader reader) throws Exception {
			CreateSyncGroup object = new CreateSyncGroup();

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

						if (!"CreateSyncGroup".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (CreateSyncGroup) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && instanceNameQName.equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setInstanceName(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && gameIDQName.equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "gameID" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setGameID(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setGameID(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && computerNameQName.equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setComputerName(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && instanceGUIDQName.equals(reader.getName())) {
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

				if (reader.isStartElement() && instanceLabelQName.equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setInstanceLabel(ConverterUtil.convertToString(content));
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
