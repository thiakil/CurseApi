/**
 * ProjectStage.java
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
 * ProjectStage bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class ProjectStage implements ADBBean {
	public static final QName MY_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOns", "ProjectStage", "ns1");
	private static HashMap _table_ = new HashMap();
	public static final String _Alpha = ConverterUtil.convertToString("Alpha");
	public static final String _Beta = ConverterUtil.convertToString("Beta");
	public static final String _Deleted = ConverterUtil.convertToString("Deleted");
	public static final String _Inactive = ConverterUtil.convertToString("Inactive");
	public static final String _Mature = ConverterUtil.convertToString("Mature");
	public static final String _Planning = ConverterUtil.convertToString("Planning");
	public static final String _Release = ConverterUtil.convertToString("Release");
	public static final String _Abandoned = ConverterUtil.convertToString("Abandoned");
	public static final ProjectStage Alpha = new ProjectStage(_Alpha, true);
	public static final ProjectStage Beta = new ProjectStage(_Beta, true);
	public static final ProjectStage Deleted = new ProjectStage(_Deleted, true);
	public static final ProjectStage Inactive = new ProjectStage(_Inactive, true);
	public static final ProjectStage Mature = new ProjectStage(_Mature, true);
	public static final ProjectStage Planning = new ProjectStage(_Planning, true);
	public static final ProjectStage Release = new ProjectStage(_Release, true);
	public static final ProjectStage Abandoned = new ProjectStage(_Abandoned, true);

	/**
	 * field for ProjectStage
	 */
	protected String localProjectStage;

	// Constructor
	protected ProjectStage(String value, boolean isRegisterValue) {
		localProjectStage = value;

		if (isRegisterValue) {
			_table_.put(localProjectStage, this);
		}
	}

	public String getValue() {
		return localProjectStage;
	}

	public boolean equals(Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public String toString() {
		return localProjectStage;
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
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":ProjectStage", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ProjectStage", xmlWriter);
			}
		}

		if (localProjectStage == null) {
			throw new ADBException("ProjectStage cannot be null !!");
		} else {
			xmlWriter.writeCharacters(localProjectStage);
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

		public static ProjectStage fromValue(String value) throws IllegalArgumentException {
			ProjectStage enumeration = (ProjectStage) _table_.get(value);

			// handle unexpected enumeration values properly
			if (enumeration == null) {
				throw new IllegalArgumentException();
			}

			return enumeration;
		}

		public static ProjectStage fromString(String value, String namespaceURI) throws IllegalArgumentException {
			try {
				return fromValue(ConverterUtil.convertToString(value));
			} catch (Exception e) {
				throw new IllegalArgumentException();
			}
		}

		public static ProjectStage fromString(XMLStreamReader xmlStreamReader, String content) {
			if (content.contains(":")) {
				String prefix = content.substring(0, content.indexOf(":"));
				String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);

				return ProjectStage.Factory.fromString(content, namespaceUri);
			} else {
				return ProjectStage.Factory.fromString(content, "");
			}
		}

		/**
		 * static method to create the object
		 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
		 * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
		 * Postcondition: If this object is an element, the reader is positioned at its end element
		 * If this object is a complex type, the reader is positioned at the end element of its outer element
		 */
		public static ProjectStage parse(XMLStreamReader reader) throws Exception {
			ProjectStage object = null;

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
							throw new ADBException("The element: " + "ProjectStage" + "  cannot be null");
						}

						String content = reader.getElementText();

						if (content.indexOf(":") > 0) {
							// this seems to be a Qname so find the namespace and send
							prefix = content.substring(0, content.indexOf(":"));
							namespaceuri = reader.getNamespaceURI(prefix);
							object = ProjectStage.Factory.fromString(content, namespaceuri);
						} else {
							// this seems to be not a qname send and empty namespace incase of it is
							// check is done in fromString method
							object = ProjectStage.Factory.fromString(content, "");
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
