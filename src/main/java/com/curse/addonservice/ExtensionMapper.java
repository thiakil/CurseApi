/**
 * ExtensionMapper.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package com.curse.addonservice;


import addons.curse.AddOn;
import addons.curse.AddOnAttachment;
import addons.curse.AddOnAuthor;
import addons.curse.AddOnCategory;
import addons.curse.AddOnFile;
import addons.curse.AddOnFileDependency;
import addons.curse.AddOnModule;
import addons.curse.ArrayOfAddOn;
import addons.curse.ArrayOfAddOnAttachment;
import addons.curse.ArrayOfAddOnAuthor;
import addons.curse.ArrayOfAddOnCategory;
import addons.curse.ArrayOfAddOnFile;
import addons.curse.ArrayOfAddOnFileDependency;
import addons.curse.ArrayOfAddOnModule;
import addons.curse.ArrayOfFingerprintMatch;
import addons.curse.ArrayOfFuzzyMatch;
import addons.curse.CategorySection;
import addons.curse.DownloadToken;
import addons.curse.FingerprintMatch;
import addons.curse.FingerprintMatchResult;
import addons.curse.FuzzyMatch;
import com.microsoft.schemas._2003._10.serialization.Duration;
import com.microsoft.schemas._2003._10.serialization.Guid;
import com.microsoft.schemas._2003._10.serialization._char;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.microsoft.schemas._2003._10.serialization.arrays.KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0;
import com.microsoft.schemas.message.StreamBody;
import org.apache.axis2.databinding.ADBException;
import org.datacontract.schemas._2004._07.curse_addons.ArrayOfFolderFingerprint;
import org.datacontract.schemas._2004._07.curse_addons.ArrayOfGameVersionLatestFile;
import org.datacontract.schemas._2004._07.curse_addons.DependencyType;
import org.datacontract.schemas._2004._07.curse_addons.FileStatus;
import org.datacontract.schemas._2004._07.curse_addons.FileType;
import org.datacontract.schemas._2004._07.curse_addons.FolderFingerprint;
import org.datacontract.schemas._2004._07.curse_addons.GameVersionLatestFile;
import org.datacontract.schemas._2004._07.curse_addons.PackageTypes;
import org.datacontract.schemas._2004._07.curse_addons.ProjectStage;
import org.datacontract.schemas._2004._07.curse_addons.ProjectStatus;
import org.datacontract.schemas._2004._07.curse_addons.RepositoryMatch;
import org.datacontract.schemas._2004._07.curse_addonservice_requests.AddOnFileKey;
import org.datacontract.schemas._2004._07.curse_addonservice_requests.ArrayOfAddOnFileKey;
import org.datacontract.schemas._2004._07.curse_clientservice_models.ArrayOfSyncTransaction;
import org.datacontract.schemas._2004._07.curse_clientservice_models.ArrayOfSyncedAddon;
import org.datacontract.schemas._2004._07.curse_clientservice_models.ArrayOfSyncedComputer;
import org.datacontract.schemas._2004._07.curse_clientservice_models.ArrayOfSyncedGameInstance;
import org.datacontract.schemas._2004._07.curse_clientservice_models.ServiceResponse;
import org.datacontract.schemas._2004._07.curse_clientservice_models.ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4;
import org.datacontract.schemas._2004._07.curse_clientservice_models.ServiceResponseOfSyncedGameInstanceeheogrl4;
import org.datacontract.schemas._2004._07.curse_clientservice_models.ServiceResponseStatus;
import org.datacontract.schemas._2004._07.curse_clientservice_models.SyncTransaction;
import org.datacontract.schemas._2004._07.curse_clientservice_models.SyncTransactionType;
import org.datacontract.schemas._2004._07.curse_clientservice_models.SyncedAddon;
import org.datacontract.schemas._2004._07.curse_clientservice_models.SyncedComputer;
import org.datacontract.schemas._2004._07.curse_clientservice_models.SyncedGameInstance;
import org.datacontract.schemas._2004._07.system_io.ArrayOfDirectoryInfo;
import org.datacontract.schemas._2004._07.system_io.DirectoryInfo;
import org.datacontract.schemas._2004._07.system_io.FileSystemInfo;

import javax.xml.stream.XMLStreamReader;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({"unchecked", "unused"})
public class ExtensionMapper {
	public static Object getTypeObject(String namespaceURI, String typeName, XMLStreamReader reader) throws Exception {
		if ("http://schemas.datacontract.org/2004/07/Curse.AddOns".equals(namespaceURI) && "PackageTypes".equals(typeName)) {
			return PackageTypes.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.AddOns".equals(namespaceURI) && "ProjectStage".equals(typeName)) {
			return ProjectStage.Factory.parse(reader);
		}

		if ("http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) && "duration".equals(typeName)) {
			return Duration.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "AddOnAttachment".equals(typeName)) {
			return AddOnAttachment.Factory.parse(reader);
		}

		if ("http://schemas.microsoft.com/2003/10/Serialization/Arrays".equals(namespaceURI) && "ArrayOflong".equals(typeName)) {
			return ArrayOflong.Factory.parse(reader);
		}

		if ("http://schemas.microsoft.com/2003/10/Serialization/Arrays".equals(namespaceURI) && "ArrayOfstring".equals(typeName)) {
			return ArrayOfstring.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "AddOnFileDependency".equals(typeName)) {
			return AddOnFileDependency.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "FingerprintMatch".equals(typeName)) {
			return FingerprintMatch.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models".equals(namespaceURI) && "ArrayOfSyncedComputer".equals(typeName)) {
			return ArrayOfSyncedComputer.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.AddOns".equals(namespaceURI) && "FileStatus".equals(typeName)) {
			return FileStatus.Factory.parse(reader);
		}

		if ("http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) && "char".equals(typeName)) {
			return _char.Factory.parse(reader);
		}

		if ("http://schemas.microsoft.com/2003/10/Serialization/Arrays".equals(namespaceURI) && "ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp".equals(typeName)) {
			return ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/System.IO".equals(namespaceURI) && "ArrayOfDirectoryInfo".equals(typeName)) {
			return ArrayOfDirectoryInfo.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "DownloadToken".equals(typeName)) {
			return DownloadToken.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "AddOnModule".equals(typeName)) {
			return AddOnModule.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models".equals(namespaceURI) && "SyncedAddon".equals(typeName)) {
			return SyncedAddon.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models".equals(namespaceURI) && "ServiceResponse".equals(typeName)) {
			return ServiceResponse.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "ArrayOfAddOnCategory".equals(typeName)) {
			return ArrayOfAddOnCategory.Factory.parse(reader);
		}

		if ("http://schemas.microsoft.com/2003/10/Serialization/Arrays".equals(namespaceURI) && "ArrayOfint".equals(typeName)) {
			return ArrayOfint.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.AddOns".equals(namespaceURI) && "DependencyType".equals(typeName)) {
			return DependencyType.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.AddOns".equals(namespaceURI) && "GameVersionLatestFile".equals(typeName)) {
			return GameVersionLatestFile.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "ArrayOfAddOnFile".equals(typeName)) {
			return ArrayOfAddOnFile.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models".equals(namespaceURI) && "SyncTransaction".equals(typeName)) {
			return SyncTransaction.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models".equals(namespaceURI) && "SyncedComputer".equals(typeName)) {
			return SyncedComputer.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models".equals(namespaceURI) && "ServiceResponseOfSyncedGameInstanceeheogrl4".equals(typeName)) {
			return ServiceResponseOfSyncedGameInstanceeheogrl4.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests".equals(namespaceURI) && "ArrayOfAddOnFileKey".equals(typeName)) {
			return ArrayOfAddOnFileKey.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/System.IO".equals(namespaceURI) && "DirectoryInfo".equals(typeName)) {
			return DirectoryInfo.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.AddOns".equals(namespaceURI) && "FolderFingerprint".equals(typeName)) {
			return FolderFingerprint.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.AddOns".equals(namespaceURI) && "ProjectStatus".equals(typeName)) {
			return ProjectStatus.Factory.parse(reader);
		}

		if ("http://schemas.microsoft.com/2003/10/Serialization/Arrays".equals(namespaceURI) && "KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0".equals(typeName)) {
			return KeyValueOfintArrayOfAddOnFileHlmYZPzp_type0.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models".equals(namespaceURI) && "ServiceResponseStatus".equals(typeName)) {
			return ServiceResponseStatus.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models".equals(namespaceURI) && "ArrayOfSyncedAddon".equals(typeName)) {
			return ArrayOfSyncedAddon.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.AddOns".equals(namespaceURI) && "FileType".equals(typeName)) {
			return FileType.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.AddOns".equals(namespaceURI) && "RepositoryMatch".equals(typeName)) {
			return RepositoryMatch.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.AddOns".equals(namespaceURI) && "ArrayOfGameVersionLatestFile".equals(typeName)) {
			return ArrayOfGameVersionLatestFile.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "ArrayOfAddOnAuthor".equals(typeName)) {
			return ArrayOfAddOnAuthor.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "CategorySection".equals(typeName)) {
			return CategorySection.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "ArrayOfAddOn".equals(typeName)) {
			return ArrayOfAddOn.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "AddOnCategory".equals(typeName)) {
			return AddOnCategory.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "FuzzyMatch".equals(typeName)) {
			return FuzzyMatch.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "ArrayOfFingerprintMatch".equals(typeName)) {
			return ArrayOfFingerprintMatch.Factory.parse(reader);
		}

		if ("http://schemas.microsoft.com/Message".equals(namespaceURI) && "StreamBody".equals(typeName)) {
			return StreamBody.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "ArrayOfAddOnModule".equals(typeName)) {
			return ArrayOfAddOnModule.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/System.IO".equals(namespaceURI) && "FileSystemInfo".equals(typeName)) {
			return FileSystemInfo.Factory.parse(reader);
		}

		if ("http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) && "guid".equals(typeName)) {
			return Guid.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models".equals(namespaceURI) && "ArrayOfSyncTransaction".equals(typeName)) {
			return ArrayOfSyncTransaction.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "FingerprintMatchResult".equals(typeName)) {
			return FingerprintMatchResult.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models".equals(namespaceURI) && "SyncTransactionType".equals(typeName)) {
			return SyncTransactionType.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models".equals(namespaceURI) && "SyncedGameInstance".equals(typeName)) {
			return SyncedGameInstance.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "AddOn".equals(typeName)) {
			return AddOn.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.AddOns".equals(namespaceURI) && "ArrayOfFolderFingerprint".equals(typeName)) {
			return ArrayOfFolderFingerprint.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "ArrayOfAddOnAttachment".equals(typeName)) {
			return ArrayOfAddOnAttachment.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models".equals(namespaceURI) && "ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4".equals(typeName)) {
			return ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.ClientService.Models".equals(namespaceURI) && "ArrayOfSyncedGameInstance".equals(typeName)) {
			return ArrayOfSyncedGameInstance.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "AddOnFile".equals(typeName)) {
			return AddOnFile.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "ArrayOfAddOnFileDependency".equals(typeName)) {
			return ArrayOfAddOnFileDependency.Factory.parse(reader);
		}

		if ("http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests".equals(namespaceURI) && "AddOnFileKey".equals(typeName)) {
			return AddOnFileKey.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "AddOnAuthor".equals(typeName)) {
			return AddOnAuthor.Factory.parse(reader);
		}

		if ("Curse.AddOns".equals(namespaceURI) && "ArrayOfFuzzyMatch".equals(typeName)) {
			return ArrayOfFuzzyMatch.Factory.parse(reader);
		}

		throw new ADBException("Unsupported type " + namespaceURI + " " + typeName);
	}
}
