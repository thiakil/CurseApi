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
 * AddOnFile.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package addons.curse;


import com.curse.addonservice.ExtensionMapper;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
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
import org.datacontract.schemas._2004._07.curse_addons.FileStatus;
import org.datacontract.schemas._2004._07.curse_addons.FileType;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;

/**
 * AddOnFile bean class
 */
@SuppressWarnings({"unchecked", "unused"})
public class AddOnFile implements ADBBean {
    /* This type was generated from the piece of schema that had
       name = AddOnFile
       Namespace URI = Curse.AddOns
       Namespace Prefix = ns4
     */

	/**
	 * field for AlternateFileId
	 */
	@SerializedName("FileId")
	@Expose
	protected int localAlternateFileId;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localAlternateFileIdTracker = false;

	/**
	 * field for Dependencies
	 */
	@SerializedName("Dependencies")
	@Expose
	protected List<AddOnFileDependency> localDependencies;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localDependenciesTracker = false;

	/**
	 * field for DownloadURL
	 */
	@SerializedName("DownloadURL")
	@Expose
	protected String localDownloadURL;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localDownloadURLTracker = false;

	/**
	 * field for FileDate
	 */
	@SerializedName("FileDate")
	@Expose
	protected Calendar localFileDate;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localFileDateTracker = false;

	/**
	 * field for FileName
	 */
	@SerializedName("FileName")
	@Expose
	protected String localFileName;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localFileNameTracker = false;

	/**
	 * field for FileNameOnDisk
	 */
	@SerializedName("FileNameOnDisk")
	@Expose
	protected String localFileNameOnDisk;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localFileNameOnDiskTracker = false;

	/**
	 * field for FileStatus
	 */
	@SerializedName("FileStatus")
	@Expose
	protected FileStatus localFileStatus;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localFileStatusTracker = false;

	/**
	 * field for GameVersion
	 */
	@SerializedName("GameVersion")
	@Expose
	protected List<String> localGameVersion;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localGameVersionTracker = false;

	/**
	 * field for Id
	 */
	@SerializedName("Id")
	@Expose
	protected int localId;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localIdTracker = false;

	/**
	 * field for IsAlternate
	 */
	@SerializedName("IsAlternate")
	@Expose
	protected boolean localIsAlternate;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localIsAlternateTracker = false;

	/**
	 * field for IsAvailable
	 */
	@SerializedName("IsAvailable")
	@Expose
	protected boolean localIsAvailable;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localIsAvailableTracker = false;

	/**
	 * field for Modules
	 */
	@SerializedName("Modules")
	@Expose
	protected List<AddOnModule> localModules;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localModulesTracker = false;

	/**
	 * field for PackageFingerprint
	 */
	@SerializedName("PackageFingerprint")
	@Expose
	protected long localPackageFingerprint;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localPackageFingerprintTracker = false;

	/**
	 * field for ReleaseType
	 */
	@SerializedName("ReleaseType")
	@Expose
	protected FileType localReleaseType;

	/*  This tracker boolean wil be used to detect whether the user called the set method
	 *   for this attribute. It will be used to determine whether to include this field
	 *   in the serialized XML
	 */
	protected boolean localReleaseTypeTracker = false;
	
	public AddOnFile() {
	}
	
	public AddOnFile(int alternateFileId, List<AddOnFileDependency> dependencies, String downloadURL, Calendar fileDate, String fileName, String fileNameOnDisk, FileStatus fileStatus, List<String> gameVersion, int id, boolean isAlternate, boolean isAvailable, List<AddOnModule> modules, long packageFingerprint, FileType releaseType) {
		this.setAlternateFileId(alternateFileId);
		this.setDependencies(dependencies);
		this.setDownloadURL(downloadURL);
		this.setFileDate(fileDate);
		this.setFileName(fileName);
		this.setFileNameOnDisk(fileNameOnDisk);
		this.setFileStatus(fileStatus);
		this.setGameVersion(gameVersion);
		this.setId(id);
		this.setIsAlternate(isAlternate);
		this.setIsAvailable(isAvailable);
		this.setModules(modules);
		this.setPackageFingerprint(packageFingerprint);
		this.setReleaseType(releaseType);
	}
	
	public boolean isAlternateFileIdSpecified() {
		return localAlternateFileIdTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return int
	 */
	public int getAlternateFileId() {
		return localAlternateFileId;
	}

	/**
	 * Auto generated setter method
	 *
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
	 *
	 * @return addons.curse.ArrayOfAddOnFileDependency
	 */
	public List<AddOnFileDependency> getDependencies() {
		return localDependencies;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Dependencies
	 */
	public void setDependencies(List<AddOnFileDependency> param) {
		localDependenciesTracker = true;

		this.localDependencies = param;
	}

	public boolean isDownloadURLSpecified() {
		return localDownloadURLTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return java.lang.String
	 */
	public String getDownloadURL() {
		return localDownloadURL;
	}

	/**
	 * Auto generated setter method
	 *
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
	 *
	 * @return java.util.Calendar
	 */
	public Calendar getFileDate() {
		return localFileDate;
	}

	/**
	 * Auto generated setter method
	 *
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
	 *
	 * @return java.lang.String
	 */
	public String getFileName() {
		return localFileName;
	}

	/**
	 * Auto generated setter method
	 *
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
	 *
	 * @return java.lang.String
	 */
	public String getFileNameOnDisk() {
		return localFileNameOnDisk;
	}

	/**
	 * Auto generated setter method
	 *
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
	 *
	 * @return org.datacontract.schemas._2004._07.curse_addons.FileStatus
	 */
	public FileStatus getFileStatus() {
		return localFileStatus;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param FileStatus
	 */
	public void setFileStatus(FileStatus param) {
		localFileStatusTracker = param != null;

		this.localFileStatus = param;
	}

	public boolean isGameVersionSpecified() {
		return localGameVersionTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring
	 */
	public List<String> getGameVersion() {
		return localGameVersion;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param GameVersion
	 */
	public void setGameVersion(List<String> param) {
		localGameVersionTracker = true;

		this.localGameVersion = param;
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

	public boolean isIsAlternateSpecified() {
		return localIsAlternateTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return boolean
	 */
	public boolean getIsAlternate() {
		return localIsAlternate;
	}

	/**
	 * Auto generated setter method
	 *
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
	 *
	 * @return boolean
	 */
	public boolean getIsAvailable() {
		return localIsAvailable;
	}

	/**
	 * Auto generated setter method
	 *
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
	 *
	 * @return addons.curse.ArrayOfAddOnModule
	 */
	public List<AddOnModule> getModules() {
		return localModules;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param Modules
	 */
	public void setModules(List<AddOnModule> param) {
		localModulesTracker = true;

		this.localModules = param;
	}

	public boolean isPackageFingerprintSpecified() {
		return localPackageFingerprintTracker;
	}

	/**
	 * Auto generated getter method
	 *
	 * @return long
	 */
	public long getPackageFingerprint() {
		return localPackageFingerprint;
	}

	/**
	 * Auto generated setter method
	 *
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
	 *
	 * @return org.datacontract.schemas._2004._07.curse_addons.FileType
	 */
	public FileType getReleaseType() {
		return localReleaseType;
	}

	/**
	 * Auto generated setter method
	 *
	 * @param param ReleaseType
	 */
	public void setReleaseType(FileType param) {
		localReleaseTypeTracker = param != null;

		this.localReleaseType = param;
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
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":AddOnFile", xmlWriter);
			} else {
				Util.writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "AddOnFile", xmlWriter);
			}
		}

		if (localAlternateFileIdTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "AlternateFileId", xmlWriter);

			if (localAlternateFileId == Integer.MIN_VALUE) {
				throw new ADBException("AlternateFileId cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localAlternateFileId));
			}

			xmlWriter.writeEndElement();
		}

		if (localDependenciesTracker) {
			if (localDependencies == null) {
				Util.writeStartElement(null, "Curse.AddOns", "Dependencies", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				ArrayOfAddOnFileDependency.serialize(new QName("Curse.AddOns", "Dependencies"), xmlWriter, localDependencies);
			}
		}

		if (localDownloadURLTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "DownloadURL", xmlWriter);

			if (localDownloadURL == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localDownloadURL);
			}

			xmlWriter.writeEndElement();
		}

		if (localFileDateTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "FileDate", xmlWriter);

			if (localFileDate == null) {
				// write the nil attribute
				throw new ADBException("FileDate cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localFileDate));
			}

			xmlWriter.writeEndElement();
		}

		if (localFileNameTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "FileName", xmlWriter);

			if (localFileName == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localFileName);
			}

			xmlWriter.writeEndElement();
		}

		if (localFileNameOnDiskTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "FileNameOnDisk", xmlWriter);

			if (localFileNameOnDisk == null) {
				// write the nil attribute
				Util.writeNil(xmlWriter);
			} else {
				xmlWriter.writeCharacters(localFileNameOnDisk);
			}

			xmlWriter.writeEndElement();
		}

		if (localFileStatusTracker) {
			if (localFileStatus == null) {
				throw new ADBException("FileStatus cannot be null!!");
			}

			localFileStatus.serialize(new QName("Curse.AddOns", "FileStatus"), xmlWriter);
		}

		if (localGameVersionTracker) {
			if (localGameVersion == null) {
				Util.writeStartElement(null, "Curse.AddOns", "GameVersion", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				ArrayOfstring.serialize(new QName("Curse.AddOns", "GameVersion"), xmlWriter, localGameVersion);
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

		if (localIsAlternateTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "IsAlternate", xmlWriter);

			xmlWriter.writeCharacters(ConverterUtil.convertToString(localIsAlternate));

			xmlWriter.writeEndElement();
		}

		if (localIsAvailableTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "IsAvailable", xmlWriter);

			xmlWriter.writeCharacters(ConverterUtil.convertToString(localIsAvailable));

			xmlWriter.writeEndElement();
		}

		if (localModulesTracker) {
			if (localModules == null) {
				Util.writeStartElement(null, "Curse.AddOns", "Modules", xmlWriter);

				// write the nil attribute
				Util.writeNil(xmlWriter);
				xmlWriter.writeEndElement();
			} else {
				ArrayOfAddOnModule.serialize(new QName("Curse.AddOns", "Modules"), xmlWriter, localModules);
			}
		}

		if (localPackageFingerprintTracker) {
			namespace = "Curse.AddOns";
			Util.writeStartElement(null, namespace, "PackageFingerprint", xmlWriter);

			if (localPackageFingerprint == Long.MIN_VALUE) {
				throw new ADBException("PackageFingerprint cannot be null!!");
			} else {
				xmlWriter.writeCharacters(ConverterUtil.convertToString(localPackageFingerprint));
			}

			xmlWriter.writeEndElement();
		}

		if (localReleaseTypeTracker) {
			if (localReleaseType == null) {
				throw new ADBException("ReleaseType cannot be null!!");
			}

			localReleaseType.serialize(new QName("Curse.AddOns", "ReleaseType"), xmlWriter);
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
		public static AddOnFile parse(XMLStreamReader reader) throws Exception {
			AddOnFile object = new AddOnFile();

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

						if (!"AddOnFile".equals(type)) {
							//find namespace for the prefix
							String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

							return (AddOnFile) ExtensionMapper.getTypeObject(nsUri, type, reader);
						}
					}
				}

				// Note all attributes that were handled. Used to differ normal attributes
				// from anyAttributes.
				Vector handledAttributes = new Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "AlternateFileId").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "AlternateFileId" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setAlternateFileId(ConverterUtil.convertToInt(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setAlternateFileId(Integer.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Dependencies").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setDependencies(null);
						reader.next();

						reader.next();
					} else {
						object.setDependencies(ArrayOfAddOnFileDependency.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "DownloadURL").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setDownloadURL(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "FileDate").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "FileDate" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setFileDate(ConverterUtil.convertToDateTime(content));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "FileName").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setFileName(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "FileNameOnDisk").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
						String content = reader.getElementText();

						object.setFileNameOnDisk(ConverterUtil.convertToString(content));
					} else {
						reader.getElementText(); // throw away text nodes if any.
					}

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "FileStatus").equals(reader.getName())) {
					object.setFileStatus(FileStatus.Factory.parse(reader));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "GameVersion").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setGameVersion(null);
						reader.next();

						reader.next();
					} else {
						object.setGameVersion(ArrayOfstring.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

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

				if (reader.isStartElement() && new QName("Curse.AddOns", "IsAlternate").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "IsAlternate" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setIsAlternate(ConverterUtil.convertToBoolean(content));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "IsAvailable").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "IsAvailable" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setIsAvailable(ConverterUtil.convertToBoolean(content));

					reader.next();
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "Modules").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						object.setModules(null);
						reader.next();

						reader.next();
					} else {
						object.setModules(ArrayOfAddOnModule.Factory.parse(reader));

						reader.next();
					}
				} // End of if for expected property start element

				else {
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "PackageFingerprint").equals(reader.getName())) {
					nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

					if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
						throw new ADBException("The element: " + "PackageFingerprint" + "  cannot be null");
					}

					String content = reader.getElementText();

					object.setPackageFingerprint(ConverterUtil.convertToLong(content));

					reader.next();
				} // End of if for expected property start element

				else {
					object.setPackageFingerprint(Long.MIN_VALUE);
				}

				while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

				if (reader.isStartElement() && new QName("Curse.AddOns", "ReleaseType").equals(reader.getName())) {
					object.setReleaseType(FileType.Factory.parse(reader));

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
