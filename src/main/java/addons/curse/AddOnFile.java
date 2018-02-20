/**
 * AddOnFile.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package addons.curse;


import com.curse.addonservice.ExtensionMapper;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axis2.databinding.ADBBean;
import org.apache.axis2.databinding.ADBDataSource;
import org.apache.axis2.databinding.ADBException;
import org.apache.axis2.databinding.utils.BeanUtil;
import org.apache.axis2.databinding.utils.ConverterUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.datacontract.schemas._2004._07.curse_addons.FileStatus;
import org.datacontract.schemas._2004._07.curse_addons.FileType;

import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import java.util.Calendar;
import java.util.Vector;

/**
 *  AddOnFile bean class
 */
@SuppressWarnings({"unchecked",
		"unused"
})
public class AddOnFile implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = AddOnFile
       Namespace URI = Curse.AddOns
       Namespace Prefix = ns4
     */

	/**
	 * field for AlternateFileId
	 */
	protected int localAlternateFileId;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localAlternateFileIdTracker = false;

	/**
	 * field for Dependencies
	 */
	protected ArrayOfAddOnFileDependency localDependencies;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localDependenciesTracker = false;

	/**
	 * field for DownloadURL
	 */
	protected String localDownloadURL;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localDownloadURLTracker = false;

	/**
	 * field for FileDate
	 */
	protected Calendar localFileDate;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localFileDateTracker = false;

	/**
	 * field for FileName
	 */
	protected String localFileName;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localFileNameTracker = false;

	/**
	 * field for FileNameOnDisk
	 */
	protected String localFileNameOnDisk;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localFileNameOnDiskTracker = false;

	/**
	 * field for FileStatus
	 */
	protected FileStatus localFileStatus;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localFileStatusTracker = false;

	/**
	 * field for GameVersion
	 */
	protected ArrayOfstring localGameVersion;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localGameVersionTracker = false;

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
	 * field for IsAlternate
	 */
	protected boolean localIsAlternate;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localIsAlternateTracker = false;

	/**
	 * field for IsAvailable
	 */
	protected boolean localIsAvailable;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localIsAvailableTracker = false;

	/**
	 * field for Modules
	 */
	protected ArrayOfAddOnModule localModules;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localModulesTracker = false;

	/**
	 * field for PackageFingerprint
	 */
	protected long localPackageFingerprint;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localPackageFingerprintTracker = false;

	/**
	 * field for ReleaseType
	 */
	protected FileType localReleaseType;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localReleaseTypeTracker = false;

	public boolean isAlternateFileIdSpecified() {
		return localAlternateFileIdTracker;
	}

	/**
	 * Auto generated getter method
	 * @return int
	 */
	public int getAlternateFileId() {
		return localAlternateFileId;
	}

	/**
	 * Auto generated setter method
	 * @param param AlternateFileId
	 */
	public void setAlternateFileId(int param) {
		// setting primitive attribute tracker to true
		localAlternateFileIdTracker = param != Integer.MIN_VALUE;

		this.localAlternateFileId = param;
	}

	public boolean isDependenciesSpecified() {
		return localDependenciesTracker;
	}

	/**
	 * Auto generated getter method
	 * @return addons.curse.ArrayOfAddOnFileDependency
	 */
	public ArrayOfAddOnFileDependency getDependencies() {
		return localDependencies;
	}

	/**
	 * Auto generated setter method
	 * @param param Dependencies
	 */
	public void setDependencies(ArrayOfAddOnFileDependency param) {
		localDependenciesTracker = true;

		this.localDependencies = param;
	}

	public boolean isDownloadURLSpecified() {
		return localDownloadURLTracker;
	}

	/**
	 * Auto generated getter method
	 * @return java.lang.String
	 */
	public String getDownloadURL() {
		return localDownloadURL;
	}

	/**
	 * Auto generated setter method
	 * @param param DownloadURL
	 */
	public void setDownloadURL(String param) {
		localDownloadURLTracker = true;

		this.localDownloadURL = param;
	}

	public boolean isFileDateSpecified() {
		return localFileDateTracker;
	}

	/**
	 * Auto generated getter method
	 * @return java.util.Calendar
	 */
	public Calendar getFileDate() {
		return localFileDate;
	}

	/**
	 * Auto generated setter method
	 * @param param FileDate
	 */
	public void setFileDate(Calendar param) {
		localFileDateTracker = param != null;

		this.localFileDate = param;
	}

	public boolean isFileNameSpecified() {
		return localFileNameTracker;
	}

	/**
	 * Auto generated getter method
	 * @return java.lang.String
	 */
	public String getFileName() {
		return localFileName;
	}

	/**
	 * Auto generated setter method
	 * @param param FileName
	 */
	public void setFileName(String param) {
		localFileNameTracker = true;

		this.localFileName = param;
	}

	public boolean isFileNameOnDiskSpecified() {
		return localFileNameOnDiskTracker;
	}

	/**
	 * Auto generated getter method
	 * @return java.lang.String
	 */
	public String getFileNameOnDisk() {
		return localFileNameOnDisk;
	}

	/**
	 * Auto generated setter method
	 * @param param FileNameOnDisk
	 */
	public void setFileNameOnDisk(String param) {
		localFileNameOnDiskTracker = true;

		this.localFileNameOnDisk = param;
	}

	public boolean isFileStatusSpecified() {
		return localFileStatusTracker;
	}

	/**
	 * Auto generated getter method
	 * @return org.datacontract.schemas._2004._07.curse_addons.FileStatus
	 */
	public FileStatus getFileStatus() {
		return localFileStatus;
	}

	/**
	 * Auto generated setter method
	 * @param param FileStatus
	 */
	public void setFileStatus(
			FileStatus param) {
		localFileStatusTracker = param != null;

		this.localFileStatus = param;
	}

	public boolean isGameVersionSpecified() {
		return localGameVersionTracker;
	}

	/**
	 * Auto generated getter method
	 * @return com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring
	 */
	public ArrayOfstring getGameVersion() {
		return localGameVersion;
	}

	/**
	 * Auto generated setter method
	 * @param param GameVersion
	 */
	public void setGameVersion(
			ArrayOfstring param) {
		localGameVersionTracker = true;

		this.localGameVersion = param;
	}

	public boolean isIdSpecified() {
		return localIdTracker;
	}

	/**
	 * Auto generated getter method
	 * @return int
	 */
	public int getId() {
		return localId;
	}

	/**
	 * Auto generated setter method
	 * @param param Id
	 */
	public void setId(int param) {
		// setting primitive attribute tracker to true
		localIdTracker = param != Integer.MIN_VALUE;

		this.localId = param;
	}

	public boolean isIsAlternateSpecified() {
		return localIsAlternateTracker;
	}

	/**
	 * Auto generated getter method
	 * @return boolean
	 */
	public boolean getIsAlternate() {
		return localIsAlternate;
	}

	/**
	 * Auto generated setter method
	 * @param param IsAlternate
	 */
	public void setIsAlternate(boolean param) {
		// setting primitive attribute tracker to true
		localIsAlternateTracker = true;

		this.localIsAlternate = param;
	}

	public boolean isIsAvailableSpecified() {
		return localIsAvailableTracker;
	}

	/**
	 * Auto generated getter method
	 * @return boolean
	 */
	public boolean getIsAvailable() {
		return localIsAvailable;
	}

	/**
	 * Auto generated setter method
	 * @param param IsAvailable
	 */
	public void setIsAvailable(boolean param) {
		// setting primitive attribute tracker to true
		localIsAvailableTracker = true;

		this.localIsAvailable = param;
	}

	public boolean isModulesSpecified() {
		return localModulesTracker;
	}

	/**
	 * Auto generated getter method
	 * @return addons.curse.ArrayOfAddOnModule
	 */
	public ArrayOfAddOnModule getModules() {
		return localModules;
	}

	/**
	 * Auto generated setter method
	 * @param param Modules
	 */
	public void setModules(ArrayOfAddOnModule param) {
		localModulesTracker = true;

		this.localModules = param;
	}

	public boolean isPackageFingerprintSpecified() {
		return localPackageFingerprintTracker;
	}

	/**
	 * Auto generated getter method
	 * @return long
	 */
	public long getPackageFingerprint() {
		return localPackageFingerprint;
	}

	/**
	 * Auto generated setter method
	 * @param param PackageFingerprint
	 */
	public void setPackageFingerprint(long param) {
		// setting primitive attribute tracker to true
		localPackageFingerprintTracker = param != Long.MIN_VALUE;

		this.localPackageFingerprint = param;
	}

	public boolean isReleaseTypeSpecified() {
		return localReleaseTypeTracker;
	}

	/**
	 * Auto generated getter method
	 * @return org.datacontract.schemas._2004._07.curse_addons.FileType
	 */
	public FileType getReleaseType() {
		return localReleaseType;
	}

	/**
	 * Auto generated setter method
	 * @param param ReleaseType
	 */
	public void setReleaseType(
			FileType param) {
		localReleaseTypeTracker = param != null;

		this.localReleaseType = param;
	}

	/**
	 *
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public OMElement getOMElement(
			final QName parentQName,
			final OMFactory factory)
			throws ADBException {
		return factory.createOMElement(new ADBDataSource(
				this, parentQName));
	}

	public void serialize(final QName parentQName,
						  XMLStreamWriter xmlWriter)
			throws XMLStreamException,
			ADBException {
		serialize(parentQName, xmlWriter, false);
	}

	public void serialize(final QName parentQName,
						  XMLStreamWriter xmlWriter, boolean serializeType)
			throws XMLStreamException,
			ADBException {
		String prefix = null;
		String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();
		writeStartElement(prefix, namespace, parentQName.getLocalPart(),
				xmlWriter);

		if (serializeType) {
			String namespacePrefix = registerPrefix(xmlWriter,
					"Curse.AddOns");

			if ((namespacePrefix != null) &&
					(namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":AddOnFile", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"AddOnFile", xmlWriter);
			}
		}

		if (localAlternateFileIdTracker) {
			namespace = "Curse.AddOns";
			writeStartElement(null, namespace, "AlternateFileId", xmlWriter);

			if (localAlternateFileId == Integer.MIN_VALUE) {
				throw new ADBException(
						"AlternateFileId cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(
						localAlternateFileId));
			}

			xmlWriter.writeEndElement();
		}

		if (localDependenciesTracker) {
			if (localDependencies == null) {
				writeStartElement(null, "Curse.AddOns", "Dependencies",
						xmlWriter);

				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
						xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localDependencies.serialize(new QName(
						"Curse.AddOns", "Dependencies"), xmlWriter);
			}
		}

		if (localDownloadURLTracker) {
			namespace = "Curse.AddOns";
			writeStartElement(null, namespace, "DownloadURL", xmlWriter);

			if (localDownloadURL == null) {
				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
						xmlWriter);
			} else {
				xmlWriter.writeCharacters(localDownloadURL);
			}

			xmlWriter.writeEndElement();
		}

		if (localFileDateTracker) {
			namespace = "Curse.AddOns";
			writeStartElement(null, namespace, "FileDate", xmlWriter);

			if (localFileDate == null) {
				// write the nil attribute
				throw new ADBException(
						"FileDate cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(
						localFileDate));
			}

			xmlWriter.writeEndElement();
		}

		if (localFileNameTracker) {
			namespace = "Curse.AddOns";
			writeStartElement(null, namespace, "FileName", xmlWriter);

			if (localFileName == null) {
				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
						xmlWriter);
			} else {
				xmlWriter.writeCharacters(localFileName);
			}

			xmlWriter.writeEndElement();
		}

		if (localFileNameOnDiskTracker) {
			namespace = "Curse.AddOns";
			writeStartElement(null, namespace, "FileNameOnDisk", xmlWriter);

			if (localFileNameOnDisk == null) {
				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
						xmlWriter);
			} else {
				xmlWriter.writeCharacters(localFileNameOnDisk);
			}

			xmlWriter.writeEndElement();
		}

		if (localFileStatusTracker) {
			if (localFileStatus == null) {
				throw new ADBException(
						"FileStatus cannot be null!!");
			}

			localFileStatus.serialize(new QName(
					"Curse.AddOns", "FileStatus"), xmlWriter);
		}

		if (localGameVersionTracker) {
			if (localGameVersion == null) {
				writeStartElement(null, "Curse.AddOns", "GameVersion", xmlWriter);

				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
						xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localGameVersion.serialize(new QName(
						"Curse.AddOns", "GameVersion"), xmlWriter);
			}
		}

		if (localIdTracker) {
			namespace = "Curse.AddOns";
			writeStartElement(null, namespace, "Id", xmlWriter);

			if (localId == Integer.MIN_VALUE) {
				throw new ADBException(
						"Id cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(
						localId));
			}

			xmlWriter.writeEndElement();
		}

		if (localIsAlternateTracker) {
			namespace = "Curse.AddOns";
			writeStartElement(null, namespace, "IsAlternate", xmlWriter);

			if (false) {
				throw new ADBException(
						"IsAlternate cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(
						localIsAlternate));
			}

			xmlWriter.writeEndElement();
		}

		if (localIsAvailableTracker) {
			namespace = "Curse.AddOns";
			writeStartElement(null, namespace, "IsAvailable", xmlWriter);

			if (false) {
				throw new ADBException(
						"IsAvailable cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(
						localIsAvailable));
			}

			xmlWriter.writeEndElement();
		}

		if (localModulesTracker) {
			if (localModules == null) {
				writeStartElement(null, "Curse.AddOns", "Modules", xmlWriter);

				// write the nil attribute
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
						xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				localModules.serialize(new QName(
						"Curse.AddOns", "Modules"), xmlWriter);
			}
		}

		if (localPackageFingerprintTracker) {
			namespace = "Curse.AddOns";
			writeStartElement(null, namespace, "PackageFingerprint", xmlWriter);

			if (localPackageFingerprint == Long.MIN_VALUE) {
				throw new ADBException(
						"PackageFingerprint cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(
						localPackageFingerprint));
			}

			xmlWriter.writeEndElement();
		}

		if (localReleaseTypeTracker) {
			if (localReleaseType == null) {
				throw new ADBException(
						"ReleaseType cannot be null!!");
			}

			localReleaseType.serialize(new QName(
					"Curse.AddOns", "ReleaseType"), xmlWriter);
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
	 * Utility method to write an element start tag.
	 */
	private void writeStartElement(String prefix,
								   String namespace, String localPart,
								   XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		String writerPrefix = xmlWriter.getPrefix(namespace);

		if (writerPrefix != null) {
			xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
		} else {
			if (namespace.length() == 0) {
				prefix = "";
			} else if (prefix == null) {
				prefix = generatePrefix(namespace);
			}

			xmlWriter.writeStartElement(prefix, localPart, namespace);
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}
	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(String prefix,
								String namespace, String attName,
								String attValue, XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		String writerPrefix = xmlWriter.getPrefix(namespace);

		if (writerPrefix != null) {
			xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
		} else {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
			xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(String namespace,
								String attName, String attValue,
								XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
					namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(String namespace,
									 String attName, QName qname,
									 XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		String attributeNamespace = qname.getNamespaceURI();
		String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}

		String attributeValue;

		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(attributePrefix, namespace, attName,
					attributeValue);
		}
	}

	/**
	 *  method to handle Qnames
	 */
	private void writeQName(QName qname,
							XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		String namespaceURI = qname.getNamespaceURI();

		if (namespaceURI != null) {
			String prefix = xmlWriter.getPrefix(namespaceURI);

			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(prefix + ":" +
						ConverterUtil.convertToString(
								qname));
			} else {
				// i.e this is the default namespace
				xmlWriter.writeCharacters(ConverterUtil.convertToString(
						qname));
			}
		} else {
			xmlWriter.writeCharacters(ConverterUtil.convertToString(
					qname));
		}
	}

	private void writeQNames(QName[] qnames,
							 XMLStreamWriter xmlWriter)
			throws XMLStreamException {
		if (qnames != null) {
			// we have to store this data until last moment since it is not possible to write any
			// namespace data after writing the charactor data
			StringBuffer stringToWrite = new StringBuffer();
			String namespaceURI = null;
			String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}

				namespaceURI = qnames[i].getNamespaceURI();

				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);

					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite.append(prefix).append(":")
								.append(ConverterUtil.convertToString(
										qnames[i]));
					} else {
						stringToWrite.append(ConverterUtil.convertToString(
								qnames[i]));
					}
				} else {
					stringToWrite.append(ConverterUtil.convertToString(
							qnames[i]));
				}
			}

			xmlWriter.writeCharacters(stringToWrite.toString());
		}
	}

	/**
	 * Register a namespace prefix
	 */
	private String registerPrefix(
			XMLStreamWriter xmlWriter, String namespace)
			throws XMLStreamException {
		String prefix = xmlWriter.getPrefix(namespace);

		if (prefix == null) {
			prefix = generatePrefix(namespace);

			NamespaceContext nsContext = xmlWriter.getNamespaceContext();

			while (true) {
				String uri = nsContext.getNamespaceURI(prefix);

				if ((uri == null) || (uri.length() == 0)) {
					break;
				}

				prefix = BeanUtil.getUniquePrefix();
			}

			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}

		return prefix;
	}

	/**
	 *  Factory class that keeps the parse method
	 */
	public static class Factory {
		private static Log log = LogFactory.getLog(Factory.class);

		/**
		 * static method to create the object
		 * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
		 *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
		 * Postcondition: If this object is an element, the reader is positioned at its end element
		 *                If this object is a complex type, the reader is positioned at the end element of its outer element
		 */
		public static AddOnFile parse(XMLStreamReader reader)
				throws Exception {
			AddOnFile object = new AddOnFile();

			int event;
			QName currentQName = null;
			String nillableValue = null;
			String prefix = "";
			String namespaceuri = "";

			try {
				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				currentQName = reader.getName();

				if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"type");

					if (fullTypeName != null) {
						String nsPrefix = null;

						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0,
									fullTypeName.indexOf(":"));
						}

						nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

						String type = fullTypeName.substring(fullTypeName.indexOf(
								":") + 1);

						if (!"AddOnFile".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext()
									.getNamespaceURI(nsPrefix);

							return (AddOnFile) ExtensionMapper.getTypeObject(nsUri,
									type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns",
								"AlternateFileId").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

					if ("true".equals(nillableValue) ||
							"1".equals(nillableValue)) {
						throw new ADBException(
								"The element: " + "AlternateFileId" +
										"  cannot be null");
					}

					String content = reader.getElementText();

					object.setAlternateFileId(ConverterUtil.convertToInt(
							content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setAlternateFileId(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns",
								"Dependencies").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

					if ("true".equals(nillableValue) ||
							"1".equals(nillableValue)) {
						object.setDependencies(null);
						reader.next();

						reader.next();
					} else {
						object.setDependencies(ArrayOfAddOnFileDependency.Factory.parse(
								reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns",
								"DownloadURL").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

					if (!"true".equals(nillableValue) &&
							!"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setDownloadURL(ConverterUtil.convertToString(
								content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns", "FileDate").equals(
								reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

					if ("true".equals(nillableValue) ||
							"1".equals(nillableValue)) {
						throw new ADBException(
								"The element: " + "FileDate" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setFileDate(ConverterUtil.convertToDateTime(
							content));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns", "FileName").equals(
								reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

					if (!"true".equals(nillableValue) &&
							!"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setFileName(ConverterUtil.convertToString(
								content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns",
								"FileNameOnDisk").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

					if (!"true".equals(nillableValue) &&
							!"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setFileNameOnDisk(ConverterUtil.convertToString(
								content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns",
								"FileStatus").equals(reader.getName())) {
					object.setFileStatus(FileStatus.Factory.parse(
							reader));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns",
								"GameVersion").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

					if ("true".equals(nillableValue) ||
							"1".equals(nillableValue)) {
						object.setGameVersion(null);
						reader.next();

						reader.next();
					} else {
						object.setGameVersion(ArrayOfstring.Factory.parse(
								reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns", "Id").equals(
								reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

					if ("true".equals(nillableValue) ||
							"1".equals(nillableValue)) {
						throw new ADBException(
								"The element: " + "Id" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setId(ConverterUtil.convertToInt(
							content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setId(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns",
								"IsAlternate").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

					if ("true".equals(nillableValue) ||
							"1".equals(nillableValue)) {
						throw new ADBException(
								"The element: " + "IsAlternate" +
										"  cannot be null");
					}

					String content = reader.getElementText();

					object.setIsAlternate(ConverterUtil.convertToBoolean(
							content));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns",
								"IsAvailable").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

					if ("true".equals(nillableValue) ||
							"1".equals(nillableValue)) {
						throw new ADBException(
								"The element: " + "IsAvailable" +
										"  cannot be null");
					}

					String content = reader.getElementText();

					object.setIsAvailable(ConverterUtil.convertToBoolean(
							content));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns", "Modules").equals(
								reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

					if ("true".equals(nillableValue) ||
							"1".equals(nillableValue)) {
						object.setModules(null);
						reader.next();

						reader.next();
					} else {
						object.setModules(ArrayOfAddOnModule.Factory.parse(
								reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns",
								"PackageFingerprint").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
							"nil");

					if ("true".equals(nillableValue) ||
							"1".equals(nillableValue)) {
						throw new ADBException(
								"The element: " + "PackageFingerprint" +
										"  cannot be null");
					}

					String content = reader.getElementText();

					object.setPackageFingerprint(ConverterUtil.convertToLong(
							content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setPackageFingerprint(Long.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement() &&
						new QName("Curse.AddOns",
								"ReleaseType").equals(reader.getName())) {
					object.setReleaseType(FileType.Factory.parse(
							reader));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()) {
					// 2 - A start element we are not expecting indicates a trailing invalid property
					throw new ADBException(
							"Unexpected subelement " + reader.getName());
				}
			} catch (XMLStreamException e) {
				throw new Exception(e);
			}

			return object;
		}
	} //end of factory class
}