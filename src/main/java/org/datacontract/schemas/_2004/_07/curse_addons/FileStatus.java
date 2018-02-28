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
 * FileStatus.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package org.datacontract.schemas._2004._07.curse_addons;


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
 * FileStatus bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class FileStatus implements ADBBean {
	public static final QName MY_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "FileStatus", "ns1");
	private static HashMap _table_ = new HashMap();
	public static final String _Normal = ConverterUtil.convertToString("Normal");
	public static final String _SemiNormal = ConverterUtil.convertToString("SemiNormal");
	public static final String _Reported = ConverterUtil.convertToString("Reported");
	public static final String _Malformed = ConverterUtil.convertToString("Malformed");
	public static final String _Locked = ConverterUtil.convertToString("Locked");
	public static final String _InvalidLayout = ConverterUtil.convertToString("InvalidLayout");
	public static final String _Hidden = ConverterUtil.convertToString("Hidden");
	public static final String _NeedsApproval = ConverterUtil.convertToString("NeedsApproval");
	public static final String _Deleted = ConverterUtil.convertToString("Deleted");
	public static final String _UnderReview = ConverterUtil.convertToString("UnderReview");
	public static final String _MalwareDetected = ConverterUtil.convertToString("MalwareDetected");
	public static final String _WaitingOnProject = ConverterUtil.convertToString("WaitingOnProject");
	public static final String _ClientOnly = ConverterUtil.convertToString("ClientOnly");
	public static final FileStatus Normal = new FileStatus(_Normal, true);
	public static final FileStatus SemiNormal = new FileStatus(_SemiNormal, true);
	public static final FileStatus Reported = new FileStatus(_Reported, true);
	public static final FileStatus Malformed = new FileStatus(_Malformed, true);
	public static final FileStatus Locked = new FileStatus(_Locked, true);
	public static final FileStatus InvalidLayout = new FileStatus(_InvalidLayout, true);
	public static final FileStatus Hidden = new FileStatus(_Hidden, true);
	public static final FileStatus NeedsApproval = new FileStatus(_NeedsApproval, true);
	public static final FileStatus Deleted = new FileStatus(_Deleted, true);
	public static final FileStatus UnderReview = new FileStatus(_UnderReview, true);
	public static final FileStatus MalwareDetected = new FileStatus(_MalwareDetected, true);
	public static final FileStatus WaitingOnProject = new FileStatus(_WaitingOnProject, true);
	public static final FileStatus ClientOnly = new FileStatus(_ClientOnly, true);

	/**
	 * field for FileStatus
	 */
	protected String localFileStatus;

	// Constructor
	protected FileStatus(String value, boolean isRegisterValue) {
		localFileStatus = value;

		if (isRegisterValue) {
			_table_.put(localFileStatus, this);
		}
	}

	public String getValue() {
		return localFileStatus;
	}

	public boolean equals(Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public String toString() {
		return localFileStatus;
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
			String namespacePrefix = Util.registerPrefix(xmlWriter, "http://schemas.datacontract.org/2004/07/Curse.AddOns");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":FileStatus", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "FileStatus", xmlWriter);
			}
		}

		if (localFileStatus == null) {
			throw new ADBException("FileStatus cannot be null !!");
		} else {
			xmlWriter.writeCharacters(localFileStatus);
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals("http://schemas.datacontract.org/2004/07/Curse.AddOns")) {
			return "ns1";
		}

		return BeanUtil.getUniquePrefix();
	}











	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {
		private static Log log = LogFactory.getLog(Factory.class);

		public static FileStatus fromValue(String value) throws IllegalArgumentException {
			FileStatus enumeration = (FileStatus) _table_.get(value);

			// handle unexpected enumeration values properly
			if (enumeration == null) {
				throw new IllegalArgumentException();
			}

			return enumeration;
		}

		public static FileStatus fromString(String value, String namespaceURI) throws IllegalArgumentException {
			try {
				return fromValue(ConverterUtil.convertToString(value));
			} catch (Exception e) {
				throw new IllegalArgumentException();
			}
		}

		public static FileStatus fromString(XMLStreamReader xmlStreamReader, String content) {
			if (content.contains(":")) {
				String prefix = content.substring(0, content.indexOf(":"));
				String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);

				return FileStatus.Factory.fromString(content, namespaceUri);
			} else {
				return FileStatus.Factory.fromString(content, "");
			}
		}

		/**
		 * static method to create the object
		 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
		 * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
		 * Postcondition: If this object is an element, the reader is positioned at its end element
		 * If this object is a complex type, the reader is positioned at the end element of its outer element
		 */
		public static FileStatus parse(XMLStreamReader reader) throws Exception {
			FileStatus object = null;

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
							throw new ADBException("The element: " + "FileStatus" + "  cannot be null");
						}

						String content = reader.getElementText();

						if (content.indexOf(":") > 0) {
							// this seems to be a Qname so find the namespace and send
							prefix = content.substring(0, content.indexOf(":"));
							namespaceuri = reader.getNamespaceURI(prefix);
							object = FileStatus.Factory.fromString(content, namespaceuri);
						} else {
							// this seems to be not a qname send and empty namespace incase of it is
							// check is done in fromString method
							object = FileStatus.Factory.fromString(content, "");
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
