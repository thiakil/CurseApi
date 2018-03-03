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
 * FingerprintMatch.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package addons.curse;


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
import java.util.List;
import java.util.Vector;

/**
 * FingerprintMatch bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class FingerprintMatch implements ADBBean {
	private static final QName fileQName = new QName("Curse.AddOns", "File");
	private static final QName idQName = new QName("Curse.AddOns", "Id");
	private static final QName latestFilesQName = new QName("Curse.AddOns", "LatestFiles");
    /* This type was generated from the piece of schema that had
       name = FingerprintMatch
       Namespace URI = Curse.AddOns
       Namespace Prefix = ns4
     */

	/**
	 * field for File
	 */
	protected AddOnFile localFile;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localFileTracker = false;

	/**
	 * field for Id
	 */
	protected int localId;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localIdTracker = false;

	/**
	 * field for LatestFiles
	 */
	protected List<AddOnFile> localLatestFiles;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localLatestFilesTracker = false;

	public FingerprintMatch() {
	}
	
	public FingerprintMatch(AddOnFile file, int id, List<AddOnFile> latestFiles) {
		this.setFile(file);
		this.setId(id);
		this.setLatestFiles(latestFiles);
	}
	
	public boolean isFileSpecified() {
		return localFileTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return addons.curse.AddOnFile
	 */
	public AddOnFile getFile() {
		return localFile;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param File
	 */
	public void setFile(AddOnFile param) {
		localFileTracker = true;

		this.localFile = param;
	}

	public boolean isIdSpecified() {
		return localIdTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getId() {
		return localId;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Id
	 */
	public void setId(int param) {
		// setting primitive attribute tracker to true
		localIdTracker = param != Integer.MIN_VALUE;

		this.localId = param;
	}

	public boolean isLatestFilesSpecified() {
		return localLatestFilesTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return addons.curse.ArrayOfAddOnFile
	 */
	public List<AddOnFile> getLatestFiles() {
		return localLatestFiles;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param LatestFiles
	 */
	public void setLatestFiles(List<AddOnFile> param) {
		localLatestFilesTracker = true;

		this.localLatestFiles = param;
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
			String namespacePrefix = Util.registerPrefix(xmlWriter, "Curse.AddOns");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":FingerprintMatch", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "FingerprintMatch", xmlWriter);
			}
		}

		if (localFileTracker) {
			if (localFile == null) {
				Util.writeStartElement(null, "Curse.AddOns", "File", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localFile.serialize(fileQName, xmlWriter);
			}
		}

		if (localIdTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "Id", xmlWriter);

			if (localId == Integer.MIN_VALUE) {
				throw new ADBException("Id cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localId));
			}

			xmlWriter.writeEndElement();
		}

		if (localLatestFilesTracker) {
			if (localLatestFiles == null) {
				Util.writeStartElement(null, "Curse.AddOns", "LatestFiles", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				ArrayOfAddOnFile.Factory.serialize(latestFilesQName, xmlWriter, localLatestFiles);
			}
		}

		xmlWriter.writeEndElement();
	}

	private static String generatePrefix(String namespace) {
		if (namespace.equals("Curse.AddOns")) {
			return "ns4";
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
		public static FingerprintMatch parse(XMLStreamReader reader) throws Exception {
			FingerprintMatch object = new FingerprintMatch();

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

						if (!"FingerprintMatch".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (FingerprintMatch) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && fileQName.equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setFile(null);
						reader.next();

						reader.next();
					} else {
						object.setFile(AddOnFile.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && idQName.equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "Id" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setId(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setId(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && latestFilesQName.equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setLatestFiles(null);
						reader.next();

						reader.next();
					} else {
						object.setLatestFiles(ArrayOfAddOnFile.Factory.parse(reader));

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
