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
 * ArrayOfAddOnFileKey.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package org.datacontract.schemas._2004._07.curse_addonservice_requests;


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
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * ArrayOfAddOnFileKey bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class ArrayOfAddOnFileKey implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = ArrayOfAddOnFileKey
       Namespace URI = http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests
       Namespace Prefix = ns6
     */

	/**
	 * field for AddOnFileKey
	 * This was an Array!
	 */
	protected AddOnFileKey[] localAddOnFileKey;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localAddOnFileKeyTracker = false;

	public ArrayOfAddOnFileKey() {
	}

	public ArrayOfAddOnFileKey(AddOnFileKey[] addOnFileKey) {
		this.setAddOnFileKey(addOnFileKey);
	}

	public boolean isAddOnFileKeySpecified() {
		return localAddOnFileKeyTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return org.datacontract.schemas._2004._07.curse_addonservice_requests.AddOnFileKey[]
	 */
	public AddOnFileKey[] getAddOnFileKey() {
		return localAddOnFileKey;
	}

	/**
	 * validate the array for AddOnFileKey
	 */
	protected void validateAddOnFileKey(AddOnFileKey[] param) {
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param AddOnFileKey
	 */
	public void setAddOnFileKey(AddOnFileKey[] param) {
		validateAddOnFileKey(param);

		localAddOnFileKeyTracker = true;

		this.localAddOnFileKey = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 *
	 * @param param org.datacontract.schemas._2004._07.curse_addonservice_requests.AddOnFileKey
	 */
	public void addAddOnFileKey(AddOnFileKey param) {
		if (localAddOnFileKey == null) {
			localAddOnFileKey = new AddOnFileKey[]{

			};
		}

		//update the setting tracker
		localAddOnFileKeyTracker = true;

		List list = ConverterUtil.toList(localAddOnFileKey);
		list.add(param);
		this.localAddOnFileKey = (AddOnFileKey[]) list.toArray(new AddOnFileKey[list.size()]);
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
			String namespacePrefix = Util.registerPrefix(xmlWriter, "http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":ArrayOfAddOnFileKey", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ArrayOfAddOnFileKey", xmlWriter);
			}
		}

		if (localAddOnFileKeyTracker) {
			if (localAddOnFileKey != null) {
				for (AddOnFileKey aLocalAddOnFileKey : localAddOnFileKey) {
					if (aLocalAddOnFileKey != null) {
						aLocalAddOnFileKey.serialize(new QName("http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests", "AddOnFileKey"), xmlWriter);
					} else {
						Util.writeStartElement(null, "http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests", "AddOnFileKey", xmlWriter);

						// write the nil attribute
						Util.writeNil(xmlWriter);
						xmlWriter.writeEndElement();
					}
				}
			} else {
				Util.writeStartElement(null, "http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests", "AddOnFileKey", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			}
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals("http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests")) {
			return "ns6";
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
		public static ArrayOfAddOnFileKey parse(XMLStreamReader reader) throws Exception {
			ArrayOfAddOnFileKey object = new ArrayOfAddOnFileKey();

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

						if (!"ArrayOfAddOnFileKey".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (ArrayOfAddOnFileKey) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				ArrayList list1 = new ArrayList();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests", "AddOnFileKey").equals(reader.getName())) {
					// Process the array and step past its final element's end.
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						list1.add(null);
						reader.next();
					} else {
						list1.add(AddOnFileKey.Factory.parse(reader));
					}

					//loop until we find a start element that is not part of this array
					boolean loopDone1 = false;

					while (!loopDone1) {
						// We should be at the end element, but make sure
						while (!reader.isEndElement()) reader.next();

						// Step out of this element
						reader.next();

						// Step to next element event.
						while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

						if (reader.isEndElement()) {
							//two continuous end elements means we are exiting the xml structure
							loopDone1 = true;
						} else {
							if (new QName("http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests", "AddOnFileKey").equals(reader.getName())) {
								nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

								if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
									list1.add(null);
									reader.next();
								} else {
									list1.add(AddOnFileKey.Factory.parse(reader));
								}
							} else {
								loopDone1 = true;
							}
						}
					}

					// call the converter utility  to convert and set the array
					object.setAddOnFileKey((AddOnFileKey[]) ConverterUtil.convertToArray(AddOnFileKey.class, list1));
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
