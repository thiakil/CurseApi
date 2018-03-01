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
 * ArrayOfKeyValue_int_AddOnFile.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.microsoft.schemas._2003._10.serialization.arrays;


import addons.curse.AddOn;
import addons.curse.AddOnFile;
import com.curse.addonservice.ExtensionMapper;
import com.thiakil.curseapi.soap.Util;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axis2.databinding.ADBBean;
import org.apache.axis2.databinding.ADBDataSource;
import org.apache.axis2.databinding.ADBException;
import org.apache.axis2.databinding.utils.BeanUtil;
import org.apache.axis2.databinding.utils.ConverterUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 * ArrayOfKeyValue_int_AddOnFile bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class ArrayOfKeyValue_int_AddOnFile implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = ArrayOfKeyValue_int_AddOnFile
       Namespace URI = http://schemas.microsoft.com/2003/10/Serialization/Arrays
       Namespace Prefix = ns3
     */

	/**
	 * field for KeyValueOfintArrayOfAddOnFileHlmYZPzp
	 * This was an Array!
	 */
	protected Int2ObjectMap<List<AddOnFile>> localKeyValueOfintArrayOfAddOnFileHlmYZPzp;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localKeyValueOfintArrayOfAddOnFileHlmYZPzpTracker = false;

	public ArrayOfKeyValue_int_AddOnFile() {
	}

	public ArrayOfKeyValue_int_AddOnFile(Int2ObjectMap<List<AddOnFile>> keyValueOfintArrayOfAddOnFileHlmYZPzp) {
		this.setKeyValueOfintArrayOfAddOnFileHlmYZPzp(keyValueOfintArrayOfAddOnFileHlmYZPzp);
	}

	public boolean isKeyValueOfintArrayOfAddOnFileHlmYZPzpSpecified() {
		return localKeyValueOfintArrayOfAddOnFileHlmYZPzpTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return com.microsoft.schemas._2003._10.serialization.arrays.KeyValuePair_int_AddonFileList[]
	 */
	public Int2ObjectMap<List<AddOnFile>> getKeyValueOfintArrayOfAddOnFileHlmYZPzp() {
		return localKeyValueOfintArrayOfAddOnFileHlmYZPzp;
	}

	/**
	 * validate the array for KeyValueOfintArrayOfAddOnFileHlmYZPzp
	 */
	protected void validateKeyValueOfintArrayOfAddOnFileHlmYZPzp(Int2ObjectMap<List<AddOnFile>> param) {
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param KeyValueOfintArrayOfAddOnFileHlmYZPzp
	 */
	public void setKeyValueOfintArrayOfAddOnFileHlmYZPzp(Int2ObjectMap<List<AddOnFile>> param) {
		validateKeyValueOfintArrayOfAddOnFileHlmYZPzp(param);

		localKeyValueOfintArrayOfAddOnFileHlmYZPzpTracker = param != null;

		this.localKeyValueOfintArrayOfAddOnFileHlmYZPzp = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 *
	 * @param param com.microsoft.schemas._2003._10.serialization.arrays.KeyValuePair_int_AddonFileList
	 */
	public void addKeyValueOfintArrayOfAddOnFileHlmYZPzp(int key, List<AddOnFile> param) {
		if (localKeyValueOfintArrayOfAddOnFileHlmYZPzp == null) {
			localKeyValueOfintArrayOfAddOnFileHlmYZPzp = new Int2ObjectOpenHashMap<>();
		}

		//update the setting tracker
		localKeyValueOfintArrayOfAddOnFileHlmYZPzpTracker = true;

		this.localKeyValueOfintArrayOfAddOnFileHlmYZPzp.put(key, param);
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

	public static void serialize(final QName parentQName, XMLStreamWriter xmlWriter, Int2ObjectMap<List<AddOnFile>> map) throws XMLStreamException {
		String prefix = null;
		String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		Util.writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (map != null) {
			for (Int2ObjectMap.Entry<List<AddOnFile>> entry : map.int2ObjectEntrySet()) {
				if (entry != null) {
					KeyValuePair_int_AddonFileList.serialize(new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "KeyValueOfintArrayOfAddOnFileHlmYZPzp"), xmlWriter, entry);
				} else {
					// we don't have to do any thing since minOccures is zero
				}
			}
		} else {
			throw new ADBException("map cannot be null!!");
		}

		xmlWriter.writeEndElement();
	}

	public void serialize(final QName parentQName, XMLStreamWriter xmlWriter, boolean serializeType) throws XMLStreamException {
		String prefix = null;
		String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		Util.writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (serializeType) {
			String namespacePrefix = Util.registerPrefix(xmlWriter, "http://schemas.microsoft.com/2003/10/Serialization/Arrays");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":ArrayOfKeyValue_int_AddOnFile", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ArrayOfKeyValue_int_AddOnFile", xmlWriter);
			}
		}

		if (localKeyValueOfintArrayOfAddOnFileHlmYZPzpTracker) {
			if (localKeyValueOfintArrayOfAddOnFileHlmYZPzp != null) {
				for (Int2ObjectMap.Entry<List<AddOnFile>> entry : localKeyValueOfintArrayOfAddOnFileHlmYZPzp.int2ObjectEntrySet()) {
					if (entry != null) {
						KeyValuePair_int_AddonFileList.serialize(new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "KeyValueOfintArrayOfAddOnFileHlmYZPzp"), xmlWriter, entry);
					} else {
						// we don't have to do any thing since minOccures is zero
					}
				}
			} else {
				throw new ADBException("KeyValueOfintArrayOfAddOnFileHlmYZPzp cannot be null!!");
			}
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals("http://schemas.microsoft.com/2003/10/Serialization/Arrays")) {
			return "ns3";
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
		public static Int2ObjectMap<List<AddOnFile>> parse(XMLStreamReader reader) throws Exception {
			Int2ObjectMap<List<AddOnFile>> object = new Int2ObjectOpenHashMap<>();

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

						if (!"ArrayOfKeyValue_int_AddOnFile".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (Int2ObjectMap<List<AddOnFile>>) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				//ArrayList list1 = new ArrayList();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "KeyValueOfintArrayOfAddOnFileHlmYZPzp").equals(reader.getName())) {
					// Process the array and step past its final element's end.
					Int2ObjectMap.Entry<List<AddOnFile>> e = KeyValuePair_int_AddonFileList.Factory.parse(reader);
					object.put(e.getIntKey(), e.getValue());

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
							if (new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "KeyValueOfintArrayOfAddOnFileHlmYZPzp").equals(reader.getName())) {
								Int2ObjectMap.Entry<List<AddOnFile>> e2 = KeyValuePair_int_AddonFileList.Factory.parse(reader);
								object.put(e2.getIntKey(), e2.getValue());
							} else {
								loopDone1 = true;
							}
						}
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