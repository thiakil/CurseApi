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
 * DirectoryInfo.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package org.datacontract.schemas._2004._07.system_io;


import com.curse.addonservice.ExtensionMapper;
import com.thiakil.curseapi.soap.Util;
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
import java.util.Vector;

/**
 * DirectoryInfo bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class DirectoryInfo extends FileSystemInfo implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = DirectoryInfo
       Namespace URI = http://schemas.datacontract.org/2004/07/System.IO
       Namespace Prefix = ns7
     */
	public DirectoryInfo(){}

	public DirectoryInfo(OMElement[] extraElement,QName factoryType){
		this.setExtraElement(extraElement);
		this.setFactoryType(factoryType);
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

		String namespacePrefix = Util.registerPrefix(xmlWriter, "http://schemas.datacontract.org/2004/07/System.IO");

		if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
			Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":DirectoryInfo", xmlWriter);
		} else {
			Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "DirectoryInfo", xmlWriter);
		}

		if (localFactoryType != null) {
			Util.writeQNameAttribute("http://schemas.microsoft.com/2003/10/Serialization/", "FactoryType", localFactoryType, xmlWriter);
		}

		if (localExtraElementTracker) {
			if (localExtraElement != null) {
				for (OMElement aLocalExtraElement : localExtraElement) {
					if (aLocalExtraElement != null) {
						aLocalExtraElement.serialize(xmlWriter);
					} else {
						// we have to do nothing since minOccures zero
					}
				}
			} else {
				throw new ADBException("extraElement cannot be null!!");
			}
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals("http://schemas.datacontract.org/2004/07/System.IO")) {
			return "ns7";
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
		public static DirectoryInfo parse(XMLStreamReader reader) throws Exception {
			DirectoryInfo object = new DirectoryInfo();

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

						if (!"DirectoryInfo".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (DirectoryInfo) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				// handle attribute "FactoryType"
				String tempAttribFactoryType = reader.getAttributeValue("http://schemas.microsoft.com/2003/10/Serialization/", "FactoryType");

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

					object.setFactoryType(ConverterUtil.convertToQName(tempAttribFactoryType, namespaceuri));
				} else {
				}

				handledAttributes.add("FactoryType");

				reader.next();

				ArrayList list1 = new ArrayList();

				while (!reader.isEndElement()) {
					if (reader.isStartElement()) {
						if (reader.isStartElement()) {
							// Process the array and step past its final element's end.
							boolean loopDone1 = false;

							while (!loopDone1) {
								event = reader.getEventType();

								if (XMLStreamConstants.START_ELEMENT == event) {
									// We need to wrap the reader so that it produces a fake START_DOCUEMENT event
									NamedStaxOMBuilder builder1 = new NamedStaxOMBuilder(new StreamWrapper(reader), reader.getName());

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

							object.setExtraElement((OMElement[]) ConverterUtil.convertToArray(OMElement.class, list1));
						} // End of if for expected property start element

						else {
							// 3 - A start element we are not expecting indicates an invalid parameter was passed
							throw new ADBException("Unexpected subelement " + reader.getName());
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
