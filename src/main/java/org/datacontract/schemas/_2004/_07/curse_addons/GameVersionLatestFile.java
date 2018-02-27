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
 * GameVersionLatestFile.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package org.datacontract.schemas._2004._07.curse_addons;


import com.curse.addonservice.ExtensionMapper;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
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
 * GameVersionLatestFile bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class GameVersionLatestFile implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = GameVersionLatestFile
       Namespace URI = http://schemas.datacontract.org/2004/07/Curse.AddOns
       Namespace Prefix = ns1
     */

	/**
	 * field for FileType
	 */
	@SerializedName("FileType")
	@Expose
	protected FileType localFileType;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localFileTypeTracker = false;

	/**
	 * field for GameVesion
	 */
	@SerializedName("GameVersion")
	@Expose
	protected String localGameVesion;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localGameVesionTracker = false;

	/**
	 * field for ProjectFileID
	 */
	@SerializedName("ProjectFileID")
	@Expose
	protected int localProjectFileID;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localProjectFileIDTracker = false;

	/**
	 * field for ProjectFileName
	 */
	@SerializedName("ProjectFileName")
	@Expose
	protected String localProjectFileName;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localProjectFileNameTracker = false;
	
	public GameVersionLatestFile() {
	}
	
	public GameVersionLatestFile(FileType fileType, String gameVesion, int projectFileID, String projectFileName) {
		this.setFileType(fileType);
		this.setGameVesion(gameVesion);
		this.setProjectFileID(projectFileID);
		this.setProjectFileName(projectFileName);
	}
	
	public boolean isFileTypeSpecified() {
		return localFileTypeTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return org.datacontract.schemas._2004._07.curse_addons.FileType
	 */
	public FileType getFileType() {
		return localFileType;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param FileType
	 */
	public void setFileType(FileType param) {
		localFileTypeTracker = param != null;

		this.localFileType = param;
	}

	public boolean isGameVesionSpecified() {
		return localGameVesionTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getGameVesion() {
		return localGameVesion;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param GameVesion
	 */
	public void setGameVesion(String param) {
		localGameVesionTracker = true;

		this.localGameVesion = param;
	}

	public boolean isProjectFileIDSpecified() {
		return localProjectFileIDTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getProjectFileID() {
		return localProjectFileID;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param ProjectFileID
	 */
	public void setProjectFileID(int param) {
		// setting primitive attribute tracker to true
		localProjectFileIDTracker = param != Integer.MIN_VALUE;

		this.localProjectFileID = param;
	}

	public boolean isProjectFileNameSpecified() {
		return localProjectFileNameTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getProjectFileName() {
		return localProjectFileName;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param ProjectFileName
	 */
	public void setProjectFileName(String param) {
		localProjectFileNameTracker = true;

		this.localProjectFileName = param;
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
			String namespacePrefix = Util.registerPrefix(xmlWriter, "http://schemas.datacontract.org/2004/07/Curse.AddOns");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":GameVersionLatestFile", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "GameVersionLatestFile", xmlWriter);
			}
		}

		if (localFileTypeTracker) {
			if (localFileType == null) {
				throw new ADBException("FileType cannot be null!!");
			}

			localFileType.serialize(new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "FileType"), xmlWriter);
		}

		if (localGameVesionTracker) {
			namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns";
			Util.writeStartElement(null, namespace, "GameVesion", xmlWriter);

			if (localGameVesion == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localGameVesion);
			}

			xmlWriter.writeEndElement();
		}

		if (localProjectFileIDTracker) {
			namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns";
			Util.writeStartElement(null, namespace, "ProjectFileID", xmlWriter);

			if (localProjectFileID == Integer.MIN_VALUE) {
				throw new ADBException("ProjectFileID cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localProjectFileID));
			}

			xmlWriter.writeEndElement();
		}

		if (localProjectFileNameTracker) {
			namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns";
			Util.writeStartElement(null, namespace, "ProjectFileName", xmlWriter);

			if (localProjectFileName == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localProjectFileName);
			}

			xmlWriter.writeEndElement();
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

		/**
		 * static method to create the object
		 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
		 * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
		 * Postcondition: If this object is an element, the reader is positioned at its end element
		 * If this object is a complex type, the reader is positioned at the end element of its outer element
		 */
		public static GameVersionLatestFile parse(XMLStreamReader reader) throws Exception {
			GameVersionLatestFile object = new GameVersionLatestFile();

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

						if (!"GameVersionLatestFile".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (GameVersionLatestFile) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "FileType").equals(reader.getName())) {
					object.setFileType(FileType.Factory.parse(reader));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "GameVesion").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setGameVesion(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "ProjectFileID").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "ProjectFileID" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setProjectFileID(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setProjectFileID(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "ProjectFileName").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setProjectFileName(ConverterUtil.convertToString(content));
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
