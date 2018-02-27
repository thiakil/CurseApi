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
 * FingerprintMatchResult.java
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
 * FingerprintMatchResult bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class FingerprintMatchResult implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = FingerprintMatchResult
       Namespace URI = Curse.AddOns
       Namespace Prefix = ns4
     */

	/**
	 * field for ExactMatches
	 */
	protected List<FingerprintMatch> localExactMatches;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localExactMatchesTracker = false;

	/**
	 * field for IsCacheBuilt
	 */
	protected boolean localIsCacheBuilt;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localIsCacheBuiltTracker = false;

	/**
	 * field for PartialMatches
	 */
	protected List<FingerprintMatch> localPartialMatches;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localPartialMatchesTracker = false;

	public FingerprintMatchResult() {
	}

	public FingerprintMatchResult(List<FingerprintMatch> exactMatches, boolean isCacheBuilt, List<FingerprintMatch> partialMatches) {
		this.setExactMatches(exactMatches);
		this.setIsCacheBuilt(isCacheBuilt);
		this.setPartialMatches(partialMatches);
	}

	public boolean isExactMatchesSpecified() {
		return localExactMatchesTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return addons.curse.ArrayOfFingerprintMatch
	 */
	public List<FingerprintMatch> getExactMatches() {
		return localExactMatches;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param ExactMatches
	 */
	public void setExactMatches(List<FingerprintMatch> param) {
		localExactMatchesTracker = true;

		this.localExactMatches = param;
	}

	public boolean isIsCacheBuiltSpecified() {
		return localIsCacheBuiltTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return boolean
	 */
	public boolean getIsCacheBuilt() {
		return localIsCacheBuilt;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param IsCacheBuilt
	 */
	public void setIsCacheBuilt(boolean param) {
		// setting primitive attribute tracker to true
		localIsCacheBuiltTracker = true;

		this.localIsCacheBuilt = param;
	}

	public boolean isPartialMatchesSpecified() {
		return localPartialMatchesTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return addons.curse.ArrayOfFingerprintMatch
	 */
	public List<FingerprintMatch> getPartialMatches() {
		return localPartialMatches;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param PartialMatches
	 */
	public void setPartialMatches(List<FingerprintMatch> param) {
		localPartialMatchesTracker = true;

		this.localPartialMatches = param;
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
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":FingerprintMatchResult", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "FingerprintMatchResult", xmlWriter);
			}
		}

		if (localExactMatchesTracker) {
			if (localExactMatches == null) {
				Util.writeStartElement(null, "Curse.AddOns", "ExactMatches", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				ArrayOfFingerprintMatch.serialize(new QName("Curse.AddOns", "ExactMatches"), xmlWriter, localExactMatches);
			}
		}

		if (localIsCacheBuiltTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "IsCacheBuilt", xmlWriter);

			xmlWriter.writeCharacters(ConverterUtil.convertToString(localIsCacheBuilt));

			xmlWriter.writeEndElement();
		}

		if (localPartialMatchesTracker) {
			if (localPartialMatches == null) {
				Util.writeStartElement(null, "Curse.AddOns", "PartialMatches", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				ArrayOfFingerprintMatch.serialize(new QName("Curse.AddOns", "PartialMatches"), xmlWriter, localPartialMatches);
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
		public static FingerprintMatchResult parse(XMLStreamReader reader) throws Exception {
			FingerprintMatchResult object = new FingerprintMatchResult();

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

						if (!"FingerprintMatchResult".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (FingerprintMatchResult) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "ExactMatches").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setExactMatches(null);
						reader.next();

						reader.next();
					} else {
						object.setExactMatches(ArrayOfFingerprintMatch.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "IsCacheBuilt").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "IsCacheBuilt" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setIsCacheBuilt(ConverterUtil.convertToBoolean(content));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "PartialMatches").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setPartialMatches(null);
						reader.next();

						reader.next();
					} else {
						object.setPartialMatches(ArrayOfFingerprintMatch.Factory.parse(reader));

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
