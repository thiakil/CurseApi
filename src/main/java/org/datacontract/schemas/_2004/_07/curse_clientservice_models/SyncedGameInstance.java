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
 * SyncedGameInstance.java
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
import java.util.Calendar;
import java.util.Vector;

/**
 * SyncedGameInstance bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class SyncedGameInstance implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = SyncedGameInstance
       Namespace URI = http://schemas.datacontract.org/2004/07/Curse.ClientService.Models
       Namespace Prefix = ns5
     */

	/**
	 * field for Addons
	 */
	protected ArrayOfSyncedAddon localAddons;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localAddonsTracker = false;

	/**
	 * field for Computers
	 */
	protected ArrayOfSyncedComputer localComputers;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localComputersTracker = false;

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
	 * field for InstanceID
	 */
	protected int localInstanceID;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localInstanceIDTracker = false;

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
	 * field for LastBackupDate
	 */
	protected Calendar localLastBackupDate;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localLastBackupDateTracker = false;

	/**
	 * field for LastBackupFingerprint
	 */
	protected long localLastBackupFingerprint;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localLastBackupFingerprintTracker = false;

	/**
	 * field for LastBackupScreenHeight
	 */
	protected long localLastBackupScreenHeight;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localLastBackupScreenHeightTracker = false;

	/**
	 * field for LastBackupScreenWidth
	 */
	protected long localLastBackupScreenWidth;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localLastBackupScreenWidthTracker = false;

	public boolean isAddonsSpecified() {
		return localAddonsTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return org.datacontract.schemas._2004._07.curse_clientservice_models.ArrayOfSyncedAddon
	 */
	public ArrayOfSyncedAddon getAddons() {
		return localAddons;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Addons
	 */
	public void setAddons(ArrayOfSyncedAddon param) {
		localAddonsTracker = true;

		this.localAddons = param;
	}

	public boolean isComputersSpecified() {
		return localComputersTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return org.datacontract.schemas._2004._07.curse_clientservice_models.ArrayOfSyncedComputer
	 */
	public ArrayOfSyncedComputer getComputers() {
		return localComputers;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Computers
	 */
	public void setComputers(ArrayOfSyncedComputer param) {
		localComputersTracker = true;

		this.localComputers = param;
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

	public boolean isLastBackupDateSpecified() {
		return localLastBackupDateTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.util.Calendar
	 */
	public Calendar getLastBackupDate() {
		return localLastBackupDate;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param LastBackupDate
	 */
	public void setLastBackupDate(Calendar param) {
		localLastBackupDateTracker = param != null;

		this.localLastBackupDate = param;
	}

	public boolean isLastBackupFingerprintSpecified() {
		return localLastBackupFingerprintTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return long
	 */
	public long getLastBackupFingerprint() {
		return localLastBackupFingerprint;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param LastBackupFingerprint
	 */
	public void setLastBackupFingerprint(long param) {
		// setting primitive attribute tracker to true
		localLastBackupFingerprintTracker = param != Long.MIN_VALUE;

		this.localLastBackupFingerprint = param;
	}

	public boolean isLastBackupScreenHeightSpecified() {
		return localLastBackupScreenHeightTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return long
	 */
	public long getLastBackupScreenHeight() {
		return localLastBackupScreenHeight;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param LastBackupScreenHeight
	 */
	public void setLastBackupScreenHeight(long param) {
		// setting primitive attribute tracker to true
		localLastBackupScreenHeightTracker = param != Long.MIN_VALUE;

		this.localLastBackupScreenHeight = param;
	}

	public boolean isLastBackupScreenWidthSpecified() {
		return localLastBackupScreenWidthTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return long
	 */
	public long getLastBackupScreenWidth() {
		return localLastBackupScreenWidth;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param LastBackupScreenWidth
	 */
	public void setLastBackupScreenWidth(long param) {
		// setting primitive attribute tracker to true
		localLastBackupScreenWidthTracker = param != Long.MIN_VALUE;

		this.localLastBackupScreenWidth = param;
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
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":SyncedGameInstance", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "SyncedGameInstance", xmlWriter);
			}
		}

		if (localAddonsTracker) {
			if (localAddons == null) {
				Util.writeStartElement(null, "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "Addons", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localAddons.serialize(new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "Addons"), xmlWriter);
			}
		}

		if (localComputersTracker) {
			if (localComputers == null) {
				Util.writeStartElement(null, "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "Computers", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localComputers.serialize(new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "Computers"), xmlWriter);
			}
		}

		if (localGameIDTracker) {
			namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models";
			Util.writeStartElement(null, namespace, "GameID", xmlWriter);

			if (localGameID == Integer.MIN_VALUE) {
				throw new ADBException("GameID cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localGameID));
			}

			xmlWriter.writeEndElement();
		}

		if (localInstanceIDTracker) {
			namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models";
			Util.writeStartElement(null, namespace, "InstanceID", xmlWriter);

			if (localInstanceID == Integer.MIN_VALUE) {
				throw new ADBException("InstanceID cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localInstanceID));
			}

			xmlWriter.writeEndElement();
		}

		if (localInstanceNameTracker) {
			namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models";
			Util.writeStartElement(null, namespace, "InstanceName", xmlWriter);

			if (localInstanceName == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localInstanceName);
			}

			xmlWriter.writeEndElement();
		}

		if (localLastBackupDateTracker) {
			namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models";
			Util.writeStartElement(null, namespace, "LastBackupDate", xmlWriter);

			if (localLastBackupDate == null) {
				// write the nil attribute
				throw new ADBException("LastBackupDate cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localLastBackupDate));
			}

			xmlWriter.writeEndElement();
		}

		if (localLastBackupFingerprintTracker) {
			namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models";
			Util.writeStartElement(null, namespace, "LastBackupFingerprint", xmlWriter);

			if (localLastBackupFingerprint == Long.MIN_VALUE) {
				throw new ADBException("LastBackupFingerprint cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localLastBackupFingerprint));
			}

			xmlWriter.writeEndElement();
		}

		if (localLastBackupScreenHeightTracker) {
			namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models";
			Util.writeStartElement(null, namespace, "LastBackupScreenHeight", xmlWriter);

			if (localLastBackupScreenHeight == Long.MIN_VALUE) {
				throw new ADBException("LastBackupScreenHeight cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localLastBackupScreenHeight));
			}

			xmlWriter.writeEndElement();
		}

		if (localLastBackupScreenWidthTracker) {
			namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models";
			Util.writeStartElement(null, namespace, "LastBackupScreenWidth", xmlWriter);

			if (localLastBackupScreenWidth == Long.MIN_VALUE) {
				throw new ADBException("LastBackupScreenWidth cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localLastBackupScreenWidth));
			}

			xmlWriter.writeEndElement();
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
		public static SyncedGameInstance parse(XMLStreamReader reader) throws Exception {
			SyncedGameInstance object = new SyncedGameInstance();

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

						if (!"SyncedGameInstance".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (SyncedGameInstance) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "Addons").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setAddons(null);
						reader.next();

						reader.next();
					} else {
						object.setAddons(ArrayOfSyncedAddon.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "Computers").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setComputers(null);
						reader.next();

						reader.next();
					} else {
						object.setComputers(ArrayOfSyncedComputer.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "GameID").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "GameID" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setGameID(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setGameID(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "InstanceID").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "InstanceID" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setInstanceID(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setInstanceID(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "InstanceName").equals(reader.getName())) {
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

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "LastBackupDate").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "LastBackupDate" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setLastBackupDate(ConverterUtil.convertToDateTime(content));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "LastBackupFingerprint").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "LastBackupFingerprint" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setLastBackupFingerprint(ConverterUtil.convertToLong(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setLastBackupFingerprint(Long.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "LastBackupScreenHeight").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "LastBackupScreenHeight" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setLastBackupScreenHeight(ConverterUtil.convertToLong(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setLastBackupScreenHeight(Long.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "LastBackupScreenWidth").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "LastBackupScreenWidth" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setLastBackupScreenWidth(ConverterUtil.convertToLong(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setLastBackupScreenWidth(Long.MIN_VALUE);
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
