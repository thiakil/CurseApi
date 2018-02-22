/**
 * AddOnCategory.java
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
import java.util.Vector;

/**
 * AddOnCategory bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class AddOnCategory implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = AddOnCategory
       Namespace URI = Curse.AddOns
       Namespace Prefix = ns4
     */

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
	 * field for Name
	 */
	protected String localName;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localNameTracker = false;

	/**
	 * field for URL
	 */
	protected String localURL;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localURLTracker = false;

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

	public boolean isURLSpecified() {
		return localURLTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getURL() {
		return localURL;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param URL
	 */
	public void setURL(String param) {
		localURLTracker = true;

		this.localURL = param;
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
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":AddOnCategory", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "AddOnCategory", xmlWriter);
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

		if (localURLTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "URL", xmlWriter);

			if (localURL == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localURL);
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
		public static AddOnCategory parse(XMLStreamReader reader) throws Exception {
			AddOnCategory object = new AddOnCategory();

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

						if (!"AddOnCategory".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (AddOnCategory) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Id").equals(reader.getName())) {
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

				if (reader.isStartElement() && new QName("Curse.AddOns", "URL").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setURL(ConverterUtil.convertToString(content));
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
