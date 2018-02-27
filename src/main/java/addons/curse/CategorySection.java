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
 * CategorySection.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package addons.curse;


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
import org.datacontract.schemas._2004._07.curse_addons.PackageTypes;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import java.util.Vector;

/**
 * CategorySection bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class CategorySection implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = CategorySection
       Namespace URI = Curse.AddOns
       Namespace Prefix = ns4
     */
	
    /* Valid IDs for Minecraft */
	public static final int ID_MODS = 6;
	public static final int ID_WORLDS = 17;
	public static final int ID_MODPACKS = 4471;
	public static final int ID_TEXTURE_PACKS = 12;

	/**
	 * field for ExtraIncludePattern
	 */
	@SerializedName("ExtraIncludePattern")
	@Expose
	protected String localExtraIncludePattern;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localExtraIncludePatternTracker = false;

	/**
	 * field for GameID
	 */
	@SerializedName("GameID")
	@Expose
	protected int localGameID;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localGameIDTracker = false;

	/**
	 * field for ID
	 */
	@SerializedName("ID")
	@Expose
	protected int localID;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localIDTracker = false;

	/**
	 * field for InitialInclusionPattern
	 */
	@SerializedName("InitialInclusionPattern")
	@Expose
	protected String localInitialInclusionPattern;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localInitialInclusionPatternTracker = false;

	/**
	 * field for Name
	 */
	@SerializedName("Name")
	@Expose
	protected String localName;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localNameTracker = false;

	/**
	 * field for PackageType
	 */
	@SerializedName("PackageType")
	@Expose
	protected PackageTypes localPackageType;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localPackageTypeTracker = false;

	/**
	 * field for Path
	 */
	@SerializedName("Path")
	@Expose
	protected String localPath;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localPathTracker = false;

	public boolean isExtraIncludePatternSpecified() {
		return localExtraIncludePatternTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getExtraIncludePattern() {
		return localExtraIncludePattern;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param ExtraIncludePattern
	 */
	public void setExtraIncludePattern(String param) {
		localExtraIncludePatternTracker = true;

		this.localExtraIncludePattern = param;
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

	public boolean isIDSpecified() {
		return localIDTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getID() {
		return localID;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param ID
	 */
	public void setID(int param) {
		// setting primitive attribute tracker to true
		localIDTracker = param != Integer.MIN_VALUE;

		this.localID = param;
	}

	public boolean isInitialInclusionPatternSpecified() {
		return localInitialInclusionPatternTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getInitialInclusionPattern() {
		return localInitialInclusionPattern;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param InitialInclusionPattern
	 */
	public void setInitialInclusionPattern(String param) {
		localInitialInclusionPatternTracker = true;

		this.localInitialInclusionPattern = param;
	}

	public boolean isNameSpecified() {
		return localNameTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getName() {
		return localName;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Name
	 */
	public void setName(String param) {
		localNameTracker = true;

		this.localName = param;
	}

	public boolean isPackageTypeSpecified() {
		return localPackageTypeTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return org.datacontract.schemas._2004._07.curse_addons.PackageTypes
	 */
	public PackageTypes getPackageType() {
		return localPackageType;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param PackageType
	 */
	public void setPackageType(PackageTypes param) {
		localPackageTypeTracker = param != null;

		this.localPackageType = param;
	}

	public boolean isPathSpecified() {
		return localPathTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getPath() {
		return localPath;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Path
	 */
	public void setPath(String param) {
		localPathTracker = true;

		this.localPath = param;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) || (obj instanceof CategorySection && localID == ((CategorySection) obj).localID);
	}
	
	@Override
	public int hashCode() {
		return this.localID;
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
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":CategorySection", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "CategorySection", xmlWriter);
			}
		}

		if (localExtraIncludePatternTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "ExtraIncludePattern", xmlWriter);

			if (localExtraIncludePattern == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localExtraIncludePattern);
			}

			xmlWriter.writeEndElement();
		}

		if (localGameIDTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "GameID", xmlWriter);

			if (localGameID == Integer.MIN_VALUE) {
				throw new ADBException("GameID cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localGameID));
			}

			xmlWriter.writeEndElement();
		}

		if (localIDTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "ID", xmlWriter);

			if (localID == Integer.MIN_VALUE) {
				throw new ADBException("ID cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localID));
			}

			xmlWriter.writeEndElement();
		}

		if (localInitialInclusionPatternTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "InitialInclusionPattern", xmlWriter);

			if (localInitialInclusionPattern == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localInitialInclusionPattern);
			}

			xmlWriter.writeEndElement();
		}

		if (localNameTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "Name", xmlWriter);

			if (localName == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localName);
			}

			xmlWriter.writeEndElement();
		}

		if (localPackageTypeTracker) {
			if (localPackageType == null) {
				throw new ADBException("PackageType cannot be null!!");
			}

			localPackageType.serialize(new QName("Curse.AddOns", "PackageType"), xmlWriter);
		}

		if (localPathTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "Path", xmlWriter);

			if (localPath == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localPath);
			}

			xmlWriter.writeEndElement();
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
		public static CategorySection parse(XMLStreamReader reader) throws Exception {
			CategorySection object = new CategorySection();

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

						if (!"CategorySection".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (CategorySection) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "ExtraIncludePattern").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setExtraIncludePattern(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "GameID").equals(reader.getName())) {
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

				if (reader.isStartElement() && new QName("Curse.AddOns", "ID").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "ID" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setID(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setID(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "InitialInclusionPattern").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setInitialInclusionPattern(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Name").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setName(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "PackageType").equals(reader.getName())) {
					object.setPackageType(PackageTypes.Factory.parse(reader));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Path").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setPath(ConverterUtil.convertToString(content));
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
