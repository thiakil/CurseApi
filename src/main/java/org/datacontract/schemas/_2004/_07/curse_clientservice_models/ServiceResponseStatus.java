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
 * ServiceResponseStatus.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package org.datacontract.schemas._2004._07.curse_clientservice_models;


import com.thiakil.curseapi.soap.Util;
import org.apache.axiom.om.OMAttribute;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * ServiceResponseStatus bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class ServiceResponseStatus implements ADBBean {
	public static final QName MY_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", "ServiceResponseStatus", "ns5");
	private static HashMap _table_ = new HashMap();
	public static final String _Successful = ConverterUtil.convertToString("Successful");
	public static final String _UnknownException = ConverterUtil.convertToString("UnknownException");
	public static final String _JoinSyncGroup_GroupNotFound = ConverterUtil.convertToString("JoinSyncGroup_GroupNotFound");
	public static final String _JoinSyncGroup_AlreadyInGroup = ConverterUtil.convertToString("JoinSyncGroup_AlreadyInGroup");
	public static final String _CreateSyncGroup_GroupAlreadyExists = ConverterUtil.convertToString("CreateSyncGroup_GroupAlreadyExists");
	public static final String _LeaveSyncGroup_GroupNotFound = ConverterUtil.convertToString("LeaveSyncGroup_GroupNotFound");
	public static final String _LeaveSyncGroup_ComputerNotFound = ConverterUtil.convertToString("LeaveSyncGroup_ComputerNotFound");
	public static final String _SaveSyncSnapshot_GroupNotFound = ConverterUtil.convertToString("SaveSyncSnapshot_GroupNotFound");
	public static final String _SaveSyncTransactions_GroupNotFound = ConverterUtil.convertToString("SaveSyncTransactions_GroupNotFound");
	public static final String _DeleteSavedGame_SavedGameNotFound = ConverterUtil.convertToString("DeleteSavedGame_SavedGameNotFound");
	public static final String _DeleteSavedGameRevision_SavedGameNotFound = ConverterUtil.convertToString("DeleteSavedGameRevision_SavedGameNotFound");
	public static final String _DeleteSavedGameRevision_RevisionNotFound = ConverterUtil.convertToString("DeleteSavedGameRevision_RevisionNotFound");
	public static final String _SetSavedGameStatus_SavedGameNotFound = ConverterUtil.convertToString("SetSavedGameStatus_SavedGameNotFound");
	public static final String _SetSavedGameName_SavedGameNotFound = ConverterUtil.convertToString("SetSavedGameName_SavedGameNotFound");
	public static final String _SetSavedGameDescription_SavedGameNotFound = ConverterUtil.convertToString("SetSavedGameDescription_SavedGameNotFound");
	public static final String _SetSavedGameDefaultRevision_SavedGameNotFound = ConverterUtil.convertToString("SetSavedGameDefaultRevision_SavedGameNotFound");
	public static final String _SetSavedGameDefaultRevision_RevisionNotFound = ConverterUtil.convertToString("SetSavedGameDefaultRevision_RevisionNotFound");
	public static final String _SetSavedGameFavoriteRevision_SavedGameNotFound = ConverterUtil.convertToString("SetSavedGameFavoriteRevision_SavedGameNotFound");
	public static final String _SetSavedGameFavoriteRevision_RevisionNotFound = ConverterUtil.convertToString("SetSavedGameFavoriteRevision_RevisionNotFound");
	public static final String _UserOrSlotsAvailable_NoCloudSlotsAvailable = ConverterUtil.convertToString("UserOrSlotsAvailable_NoCloudSlotsAvailable");
	public static final ServiceResponseStatus Successful = new ServiceResponseStatus(_Successful, true);
	public static final ServiceResponseStatus UnknownException = new ServiceResponseStatus(_UnknownException, true);
	public static final ServiceResponseStatus JoinSyncGroup_GroupNotFound = new ServiceResponseStatus(_JoinSyncGroup_GroupNotFound, true);
	public static final ServiceResponseStatus JoinSyncGroup_AlreadyInGroup = new ServiceResponseStatus(_JoinSyncGroup_AlreadyInGroup, true);
	public static final ServiceResponseStatus CreateSyncGroup_GroupAlreadyExists = new ServiceResponseStatus(_CreateSyncGroup_GroupAlreadyExists, true);
	public static final ServiceResponseStatus LeaveSyncGroup_GroupNotFound = new ServiceResponseStatus(_LeaveSyncGroup_GroupNotFound, true);
	public static final ServiceResponseStatus LeaveSyncGroup_ComputerNotFound = new ServiceResponseStatus(_LeaveSyncGroup_ComputerNotFound, true);
	public static final ServiceResponseStatus SaveSyncSnapshot_GroupNotFound = new ServiceResponseStatus(_SaveSyncSnapshot_GroupNotFound, true);
	public static final ServiceResponseStatus SaveSyncTransactions_GroupNotFound = new ServiceResponseStatus(_SaveSyncTransactions_GroupNotFound, true);
	public static final ServiceResponseStatus DeleteSavedGame_SavedGameNotFound = new ServiceResponseStatus(_DeleteSavedGame_SavedGameNotFound, true);
	public static final ServiceResponseStatus DeleteSavedGameRevision_SavedGameNotFound = new ServiceResponseStatus(_DeleteSavedGameRevision_SavedGameNotFound, true);
	public static final ServiceResponseStatus DeleteSavedGameRevision_RevisionNotFound = new ServiceResponseStatus(_DeleteSavedGameRevision_RevisionNotFound, true);
	public static final ServiceResponseStatus SetSavedGameStatus_SavedGameNotFound = new ServiceResponseStatus(_SetSavedGameStatus_SavedGameNotFound, true);
	public static final ServiceResponseStatus SetSavedGameName_SavedGameNotFound = new ServiceResponseStatus(_SetSavedGameName_SavedGameNotFound, true);
	public static final ServiceResponseStatus SetSavedGameDescription_SavedGameNotFound = new ServiceResponseStatus(_SetSavedGameDescription_SavedGameNotFound, true);
	public static final ServiceResponseStatus SetSavedGameDefaultRevision_SavedGameNotFound = new ServiceResponseStatus(_SetSavedGameDefaultRevision_SavedGameNotFound, true);
	public static final ServiceResponseStatus SetSavedGameDefaultRevision_RevisionNotFound = new ServiceResponseStatus(_SetSavedGameDefaultRevision_RevisionNotFound, true);
	public static final ServiceResponseStatus SetSavedGameFavoriteRevision_SavedGameNotFound = new ServiceResponseStatus(_SetSavedGameFavoriteRevision_SavedGameNotFound, true);
	public static final ServiceResponseStatus SetSavedGameFavoriteRevision_RevisionNotFound = new ServiceResponseStatus(_SetSavedGameFavoriteRevision_RevisionNotFound, true);
	public static final ServiceResponseStatus UserOrSlotsAvailable_NoCloudSlotsAvailable = new ServiceResponseStatus(_UserOrSlotsAvailable_NoCloudSlotsAvailable, true);

	/**
	 * field for ServiceResponseStatus
	 */
	protected String localServiceResponseStatus;

	// Constructor
	protected ServiceResponseStatus(String value, boolean isRegisterValue) {
		localServiceResponseStatus = value;

		if (isRegisterValue) {
			_table_.put(localServiceResponseStatus, this);
		}
	}

	public String getValue() {
		return localServiceResponseStatus;
	}

	public boolean equals(Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public String toString() {
		return localServiceResponseStatus;
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
		//We can safely assume an element has only one type associated with it
		String namespace = parentQName.getNamespaceURI();
		String _localName = parentQName.getLocalPart();

		Util.writeStartElement(null, namespace, _localName, xmlWriter);

		// add the type details if this is used in a simple type
		if (serializeType) {
			String namespacePrefix = Util.registerPrefix(xmlWriter, "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":ServiceResponseStatus", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ServiceResponseStatus", xmlWriter);
			}
		}

		if (localServiceResponseStatus == null) {
			throw new ADBException("ServiceResponseStatus cannot be null !!");
		} else {
			xmlWriter.writeCharacters(localServiceResponseStatus);
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

		public static ServiceResponseStatus fromValue(String value) throws IllegalArgumentException {
			ServiceResponseStatus enumeration = (ServiceResponseStatus) _table_.get(value);

			// handle unexpected enumeration values properly
			if (enumeration == null) {
				throw new IllegalArgumentException();
			}

			return enumeration;
		}

		public static ServiceResponseStatus fromString(String value, String namespaceURI) throws IllegalArgumentException {
			try {
				return fromValue(ConverterUtil.convertToString(value));
			} catch (Exception e) {
				throw new IllegalArgumentException();
			}
		}

		public static ServiceResponseStatus fromString(XMLStreamReader xmlStreamReader, String content) {
			if (content.contains(":")) {
				String prefix = content.substring(0, content.indexOf(":"));
				String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);

				return ServiceResponseStatus.Factory.fromString(content, namespaceUri);
			} else {
				return ServiceResponseStatus.Factory.fromString(content, "");
			}
		}

		/**
		 * static method to create the object
		 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
		 * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
		 * Postcondition: If this object is an element, the reader is positioned at its end element
		 * If this object is a complex type, the reader is positioned at the end element of its outer element
		 */
		public static ServiceResponseStatus parse(XMLStreamReader reader) throws Exception {
			ServiceResponseStatus object = null;

			// initialize a hash map to keep values
			Map attributeMap = new HashMap();
			List extraAttributeList = new ArrayList<OMAttribute>();

			int event;
			QName currentQName = null;
			String nillableValue = null;
			String prefix = "";
			String namespaceuri = "";

			try {
				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				currentQName = reader.getName();

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				while (!reader.isEndElement()) {
					if (reader.isStartElement() || reader.hasText()) {
						nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

						if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
							throw new ADBException("The element: " + "ServiceResponseStatus" + "  cannot be null");
						}

						String content = reader.getElementText();

						if (content.indexOf(":") > 0) {
							// this seems to be a Qname so find the namespace and send
							prefix = content.substring(0, content.indexOf(":"));
							namespaceuri = reader.getNamespaceURI(prefix);
							object = ServiceResponseStatus.Factory.fromString(content, namespaceuri);
						} else {
							// this seems to be not a qname send and empty namespace incase of it is
							// check is done in fromString method
							object = ServiceResponseStatus.Factory.fromString(content, "");
						}
					} else {
						reader.next();
					}
				} // end of while loop
			} catch (XMLStreamException e) {
				throw new Exception(e);
			}

			return object;
		}
	} //end of factory class
}
