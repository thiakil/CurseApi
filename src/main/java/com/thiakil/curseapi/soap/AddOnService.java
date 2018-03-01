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
 * AddOnService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.thiakil.curseapi.soap;


import addons.curse.AddOn;
import addons.curse.AddOnFile;
import addons.curse.FingerprintMatchResult;
import com.curse.addonservice.CacheHealthCheck;
import com.curse.addonservice.CacheHealthCheckResponse;
import com.curse.addonservice.CreateSyncGroup;
import com.curse.addonservice.CreateSyncGroupResponse;
import com.curse.addonservice.GetAddOnDescription;
import com.curse.addonservice.GetAddOnDescriptionResponse;
import com.curse.addonservice.GetAddOnDump;
import com.curse.addonservice.GetAddOnDumpResponse;
import com.curse.addonservice.GetDownloadToken;
import com.curse.addonservice.GetDownloadTokenResponse;
import com.curse.addonservice.GetFuzzyMatches;
import com.curse.addonservice.GetFuzzyMatchesResponse;
import com.curse.addonservice.GetRepositoryMatchFromSlug;
import com.curse.addonservice.GetRepositoryMatchFromSlugResponse;
import com.curse.addonservice.GetSecureDownloadToken;
import com.curse.addonservice.GetSecureDownloadTokenResponse;
import com.curse.addonservice.GetSyncProfile;
import com.curse.addonservice.GetSyncProfileResponse;
import com.curse.addonservice.JoinSyncGroup;
import com.curse.addonservice.JoinSyncGroupResponse;
import com.curse.addonservice.LeaveSyncGroup;
import com.curse.addonservice.LeaveSyncGroupResponse;
import com.curse.addonservice.LogDump;
import com.curse.addonservice.LogDumpResponse;
import com.curse.addonservice.ResetAllAddonCache;
import com.curse.addonservice.ResetAllAddonCacheResponse;
import com.curse.addonservice.ResetFeeds;
import com.curse.addonservice.ResetFeedsResponse;
import com.curse.addonservice.ResetSingleAddonCache;
import com.curse.addonservice.ResetSingleAddonCacheResponse;
import com.curse.addonservice.SaveSyncSnapshot;
import com.curse.addonservice.SaveSyncSnapshotResponse;
import com.curse.addonservice.SaveSyncTransactions;
import com.curse.addonservice.SaveSyncTransactionsResponse;
import com.curse.addonservice.ServiceHealthCheck;
import com.curse.addonservice.ServiceHealthCheckResponse;
import com.thiakil.curseapi.Murmur2Hash;
import com.thiakil.curseapi.login.CurseToken;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import org.apache.axis2.AxisFault;
import org.datacontract.schemas._2004._07.curse_addonservice_requests.AddOnFileKey;
import org.datacontract.schemas._2004._07.system_io.DirectoryInfo;

import java.rmi.RemoteException;
import java.util.List;

/*
 *  AddOnService java interface
 */
public interface AddOnService {
	/**
	 * Unknown usage
	 *
	 * @param createSyncGroup0 Sync Group params
	 */
	CreateSyncGroupResponse createSyncGroup(CreateSyncGroup createSyncGroup0) throws RemoteException;
	
	/**
	 * Gets some sort of download token?
	 *
	 * @param getSecureDownloadToken2 req params
	 */
	GetSecureDownloadTokenResponse getSecureDownloadToken(GetSecureDownloadToken getSecureDownloadToken2) throws RemoteException;
	
	/**
	 * Some kind of health check. "Success" is a known value.
	 *
	 */
	String healthCheck() throws RemoteException;
	
	/**
	 * Find file matches for a series of {@link Murmur2Hash#computeNormalizedFileHash(java.lang.String)} fingerprints/hashes
	 *
	 * @param fingerprints fingerprints to check.
	 * @return {@link FingerprintMatchResult} with the resulting matches
	 *
	 * @deprecated See {@link #v2GetFingerprintMatches(long...)}
	 */
	@Deprecated
	FingerprintMatchResult getFingerprintMatches(long... fingerprints) throws RemoteException;
	
	/**
	 * Unknown method
	 */
	SaveSyncTransactionsResponse saveSyncTransactions(SaveSyncTransactions saveSyncTransactions8) throws RemoteException;
	
	/**
	 * Unknown method
	 */
	GetRepositoryMatchFromSlugResponse getRepositoryMatchFromSlug(GetRepositoryMatchFromSlug getRepositoryMatchFromSlug10) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param fingerprints
	 */
	FingerprintMatchResult v2GetFingerprintMatches(long... fingerprints) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param cacheHealthCheck14
	 */
	CacheHealthCheckResponse cacheHealthCheck(CacheHealthCheck cacheHealthCheck14) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param getAddOnDescription16
	 *
	 * @deprecated see {@link #v2GetAddOnDescription(int)}
	 */
	@Deprecated
	GetAddOnDescriptionResponse getAddOnDescription(GetAddOnDescription getAddOnDescription16) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param resetFeeds18
	 */
	ResetFeedsResponse resetFeeds(ResetFeeds resetFeeds18) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param leaveSyncGroup20
	 */
	LeaveSyncGroupResponse leaveSyncGroup(LeaveSyncGroup leaveSyncGroup20) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param saveSyncSnapshot22
	 */
	SaveSyncSnapshotResponse saveSyncSnapshot(SaveSyncSnapshot saveSyncSnapshot22) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param getAddOnDump24
	 */
	GetAddOnDumpResponse getAddOnDump(GetAddOnDump getAddOnDump24) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param addonIDs
	 *
	 * @deprecated see {@link #v2GetAddOns(int...)}
	 */
	@Deprecated
	List<AddOn> getAddOns(int... addonIDs) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param getDownloadToken28
	 */
	GetDownloadTokenResponse getDownloadToken(GetDownloadToken getDownloadToken28) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param addonID
	 * @param fileID
	 */
	String v2GetChangeLog(int addonID, int fileID) throws RemoteException;
	
	/**
	 * Get a list of addons by IDs
	 *
	 * @param addonIDs the addons you want
	 */
	List<AddOn> v2GetAddOns(int... addonIDs) throws RemoteException;
	
	/**
	 * Retrieve a single AddOnFile by IDs
	 *
	 * @param addonID addon's ID
	 * @param fileID file's ID
	 */
	AddOnFile getAddOnFile(int addonID, int fileID) throws RemoteException;
	
	/**
	 * Get the changelog for a single file
	 *
	 * @param addonID addon's ID
	 * @param fileID file's ID
	 *
	 * @deprecated See {@link #v2GetChangeLog(int, int)}
	 */
	@Deprecated
	String getChangeLog(int addonID, int fileID) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param getSyncProfile38
	 */
	GetSyncProfileResponse getSyncProfile(GetSyncProfile getSyncProfile38) throws RemoteException;
	
	/**
	 * Get a list of all the file for an addon
	 *
	 * @param addonID
	 */
	List<AddOnFile> getAllFilesForAddOn(int addonID) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param getFuzzyMatches42
	 */
	GetFuzzyMatchesResponse getFuzzyMatches(GetFuzzyMatches getFuzzyMatches42) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param joinSyncGroup44
	 */
	JoinSyncGroupResponse joinSyncGroup(JoinSyncGroup joinSyncGroup44) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 */
	DirectoryInfo[] listFeeds() throws RemoteException;
	
	/**
	 * Get a map of addonID -> AddOnFile List for the ids supplied
	 *
	 * @param addOnFileKeys int id pairs of addon & file
	 */
	Int2ObjectMap<List<AddOnFile>> getAddOnFiles(AddOnFileKey... addOnFileKeys) throws RemoteException;
	
	/**
	 * Get description for addon
	 *
	 * @param addonID id for which to retrieve the description
	 * @return the description
	 */
	String v2GetAddOnDescription(int addonID) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param resetSingleAddonCache52
	 */
	ResetSingleAddonCacheResponse resetSingleAddonCache(ResetSingleAddonCache resetSingleAddonCache52) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param addonID
	 */
	AddOn getAddOn(int addonID) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param logDump56
	 */
	LogDumpResponse logDump(LogDump logDump56) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param serviceHealthCheck58
	 */
	ServiceHealthCheckResponse serviceHealthCheck(ServiceHealthCheck serviceHealthCheck58) throws RemoteException;
	
	/**
	 * Auto generated method signature
	 *
	 * @param resetAllAddonCache60
	 */
	ResetAllAddonCacheResponse resetAllAddonCache(ResetAllAddonCache resetAllAddonCache60) throws RemoteException;
	
	/**
	 * Note that the provided service implements BOTH Sync and Async interfaces
	 */
	static AddOnService initialise(CurseToken auth) throws AxisFault {
		return new AddOnServiceStub(auth);
	}
	
	/**
	 * Note that the provided service implements BOTH Sync and Async interfaces
	 */
	static AddOnService initialise(CurseToken auth, String targetEndpoint) throws AxisFault {
		return new AddOnServiceStub(auth, targetEndpoint);
	}
}
