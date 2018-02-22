/**
 * ArrayOfAddOnModule.java
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
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * ArrayOfAddOnModule bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class ArrayOfAddOnModule implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = ArrayOfAddOnModule
       Namespace URI = Curse.AddOns
       Namespace Prefix = ns4
     */

	/**
	 * field for AddOnModule
	 * This was an Array!
	 */
	protected AddOnModule[] localAddOnModule;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localAddOnModuleTracker = false;

	public boolean isAddOnModuleSpecified() {
		return localAddOnModuleTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return addons.curse.AddOnModule[]
	 */
	public AddOnModule[] getAddOnModule() {
		return localAddOnModule;
	}

	/**
	 * validate the array for AddOnModule
	 */
	protected void validateAddOnModule(AddOnModule[] param) {
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param AddOnModule
	 */
	public void setAddOnModule(AddOnModule[] param) {
		validateAddOnModule(param);

		localAddOnModuleTracker = true;

		this.localAddOnModule = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 *
	 * @param param addons.curse.AddOnModule
	 */
	public void addAddOnModule(AddOnModule param) {
		if (localAddOnModule == null) {
			localAddOnModule = new AddOnModule[]{};
		}

		//update the setting tracker
		localAddOnModuleTracker = true;

		List list = ConverterUtil.toList(localAddOnModule);
		list.add(param);
		this.localAddOnModule = (AddOnModule[]) list.toArray(new AddOnModule[list.size()]);
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

	public static void serialize(final QName parentQName, XMLStreamWriter xmlWriter, List<AddOnModule> list) throws XMLStreamException {
		String prefix = null;
		String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		Util.writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

		if (list != null) {
			for (AddOnModule aLocalAddOnModule : list) {
				if (aLocalAddOnModule != null) {
					aLocalAddOnModule.serialize(new QName("Curse.AddOns", "AddOnModule"), xmlWriter);
				} else {
					Util.writeStartElement(null, "Curse.AddOns", "AddOnModule", xmlWriter);

					// write the nil attribute
					Util.writeNil(xmlWriter);
					xmlWriter.writeEndElement();
				}
			}
		} else {
			Util.writeStartElement(null, "Curse.AddOns", "AddOnModule", xmlWriter);

			// write the nil attribute
			Util.writeNil(xmlWriter);
			xmlWriter.writeEndElement();
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
			String namespacePrefix = Util.registerPrefix(xmlWriter, "Curse.AddOns");

			if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":ArrayOfAddOnModule", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ArrayOfAddOnModule", xmlWriter);
			}
		}

		if (localAddOnModuleTracker) {
			if (localAddOnModule != null) {
				for (AddOnModule aLocalAddOnModule : localAddOnModule) {
					if (aLocalAddOnModule != null) {
						aLocalAddOnModule.serialize(new QName("Curse.AddOns", "AddOnModule"), xmlWriter);
					} else {
						Util.writeStartElement(null, "Curse.AddOns", "AddOnModule", xmlWriter);

						// write the nil attribute
						Util.writeNil(xmlWriter);
						xmlWriter.writeEndElement();
					}
				}
			} else {
				Util.writeStartElement(null, "Curse.AddOns", "AddOnModule", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
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
		public static List<AddOnModule> parse(XMLStreamReader reader) throws Exception {

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

						if (!"ArrayOfAddOnModule".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (List<AddOnModule>) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				ArrayList list1 = new ArrayList();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "AddOnModule").equals(reader.getName())) {
					// Process the array and step past its final element's end.
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						list1.add(null);
						reader.next();
					} else {
						list1.add(AddOnModule.Factory.parse(reader));
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
							if (new QName("Curse.AddOns", "AddOnModule").equals(reader.getName())) {
								nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

								if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
									list1.add(null);
									reader.next();
								} else {
									list1.add(AddOnModule.Factory.parse(reader));
								}
							} else {
								loopDone1 = true;
							}
						}
					}

				} // End of if for expected property start element

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement()) {
					// 2 - A start element we are not expecting indicates a trailing invalid property
					throw new ADBException("Unexpected subelement " + reader.getName());
				}
				return list1;
			} catch (XMLStreamException e) {
				throw new Exception(e);
			}
		}
	} //end of factory class
}
