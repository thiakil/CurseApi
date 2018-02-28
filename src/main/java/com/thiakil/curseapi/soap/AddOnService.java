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


import addons.curse.AddOnFile;
import addons.curse.FingerprintMatchResult;
import com.curse.addonservice.CacheHealthCheck;
import com.curse.addonservice.CacheHealthCheckResponse;
import com.curse.addonservice.CreateSyncGroup;
import com.curse.addonservice.CreateSyncGroupResponse;
import com.curse.addonservice.GetAddOn;
import com.curse.addonservice.GetAddOnDescription;
import com.curse.addonservice.GetAddOnDescriptionResponse;
import com.curse.addonservice.GetAddOnDump;
import com.curse.addonservice.GetAddOnDumpResponse;
import com.curse.addonservice.GetAddOnFile;
import com.curse.addonservice.GetAddOnFileResponse;
import com.curse.addonservice.GetAddOnFiles;
import com.curse.addonservice.GetAddOnFilesResponse;
import com.curse.addonservice.GetAddOnResponse;
import com.curse.addonservice.GetAddOns;
import com.curse.addonservice.GetAddOnsResponse;
import com.curse.addonservice.GetChangeLog;
import com.curse.addonservice.GetChangeLogResponse;
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
import com.curse.addonservice.ListFeeds;
import com.curse.addonservice.ListFeedsResponse;
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
import com.curse.addonservice.V2GetAddOnDescription;
import com.curse.addonservice.V2GetAddOnDescriptionResponse;
import com.curse.addonservice.V2GetAddOns;
import com.curse.addonservice.V2GetAddOnsResponse;
import com.curse.addonservice.V2GetChangeLog;
import com.curse.addonservice.V2GetChangeLogResponse;
import com.curse.addonservice.V2GetFingerprintMatches;
import com.curse.addonservice.V2GetFingerprintMatchesResponse;
import com.thiakil.curseapi.Murmur2Hash;

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
	 * Async. Unknown usage
	 *
	 * @param createSyncGroup0 Sync Group params
	 * @param callback - Async callback handler
	 */
	void startcreateSyncGroup(CreateSyncGroup createSyncGroup0, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Gets some sort of download token?
	 *
	 * @param getSecureDownloadToken2 req params
	 */
	GetSecureDownloadTokenResponse getSecureDownloadToken(GetSecureDownloadToken getSecureDownloadToken2) throws RemoteException;

	/**
	 * See {@link #getSecureDownloadToken(com.curse.addonservice.GetSecureDownloadToken)}
	 *
	 * @param getSecureDownloadToken2 req params
	 */
	void startgetSecureDownloadToken(GetSecureDownloadToken getSecureDownloadToken2, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Some kind of health check. "Success" is a known value.
	 *
	 */
	String healthCheck() throws RemoteException;

	/**
	 * See {@link #healthCheck())
	 *
	 */
	void starthealthCheck(final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Find file matches for a series of {@link Murmur2Hash#computeNormalizedFileHash(java.lang.String)} fingerprints/hashes
	 *
	 * @param fingerprints fingerprints to check.
	 * @return {@link FingerprintMatchResult} with the resulting matches
	 */
	FingerprintMatchResult getFingerprintMatches(long... fingerprints) throws RemoteException;

	/**
	 * Async version of {@link #getFingerprintMatches(long...)}
	 *
	 * @param callback async callback handler
	 * @param fingerprints fingerprints to check.
	 */
	void startgetFingerprintMatches(final AddOnServiceCallbackHandler callback, long... fingerprints) throws RemoteException;

	/**
	 * Unknown method
	 */
	SaveSyncTransactionsResponse saveSyncTransactions(SaveSyncTransactions saveSyncTransactions8) throws RemoteException;

	/**
	 * Unknown method
	 */
	void startsaveSyncTransactions(SaveSyncTransactions saveSyncTransactions8, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Unknown method
	 */
	GetRepositoryMatchFromSlugResponse getRepositoryMatchFromSlug(GetRepositoryMatchFromSlug getRepositoryMatchFromSlug10) throws RemoteException;

	/**
	 * Unknown method
	 */
	void startgetRepositoryMatchFromSlug(GetRepositoryMatchFromSlug getRepositoryMatchFromSlug10, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param v2GetFingerprintMatches12
	 */
	V2GetFingerprintMatchesResponse v2GetFingerprintMatches(V2GetFingerprintMatches v2GetFingerprintMatches12) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param v2GetFingerprintMatches12
	 */
	void startv2GetFingerprintMatches(V2GetFingerprintMatches v2GetFingerprintMatches12, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param cacheHealthCheck14
	 */
	CacheHealthCheckResponse cacheHealthCheck(CacheHealthCheck cacheHealthCheck14) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param cacheHealthCheck14
	 */
	void startcacheHealthCheck(CacheHealthCheck cacheHealthCheck14, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAddOnDescription16
	 */
	GetAddOnDescriptionResponse getAddOnDescription(GetAddOnDescription getAddOnDescription16) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOnDescription16
	 */
	void startgetAddOnDescription(GetAddOnDescription getAddOnDescription16, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param resetFeeds18
	 */
	ResetFeedsResponse resetFeeds(ResetFeeds resetFeeds18) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param resetFeeds18
	 */
	void startresetFeeds(ResetFeeds resetFeeds18, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param leaveSyncGroup20
	 */
	LeaveSyncGroupResponse leaveSyncGroup(LeaveSyncGroup leaveSyncGroup20) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param leaveSyncGroup20
	 */
	void startleaveSyncGroup(LeaveSyncGroup leaveSyncGroup20, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param saveSyncSnapshot22
	 */
	SaveSyncSnapshotResponse saveSyncSnapshot(SaveSyncSnapshot saveSyncSnapshot22) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param saveSyncSnapshot22
	 */
	void startsaveSyncSnapshot(SaveSyncSnapshot saveSyncSnapshot22, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAddOnDump24
	 */
	GetAddOnDumpResponse getAddOnDump(GetAddOnDump getAddOnDump24) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOnDump24
	 */
	void startgetAddOnDump(GetAddOnDump getAddOnDump24, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAddOns26
	 */
	GetAddOnsResponse getAddOns(GetAddOns getAddOns26) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOns26
	 */
	void startgetAddOns(GetAddOns getAddOns26, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getDownloadToken28
	 */
	GetDownloadTokenResponse getDownloadToken(GetDownloadToken getDownloadToken28) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getDownloadToken28
	 */
	void startgetDownloadToken(GetDownloadToken getDownloadToken28, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param v2GetChangeLog30
	 */
	V2GetChangeLogResponse v2GetChangeLog(V2GetChangeLog v2GetChangeLog30) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param v2GetChangeLog30
	 */
	void startv2GetChangeLog(V2GetChangeLog v2GetChangeLog30, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param v2GetAddOns32
	 */
	V2GetAddOnsResponse v2GetAddOns(V2GetAddOns v2GetAddOns32) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param v2GetAddOns32
	 */
	void startv2GetAddOns(V2GetAddOns v2GetAddOns32, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAddOnFile34
	 */
	GetAddOnFileResponse getAddOnFile(GetAddOnFile getAddOnFile34) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOnFile34
	 */
	void startgetAddOnFile(GetAddOnFile getAddOnFile34, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getChangeLog36
	 */
	GetChangeLogResponse getChangeLog(GetChangeLog getChangeLog36) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getChangeLog36
	 */
	void startgetChangeLog(GetChangeLog getChangeLog36, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getSyncProfile38
	 */
	GetSyncProfileResponse getSyncProfile(GetSyncProfile getSyncProfile38) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getSyncProfile38
	 */
	void startgetSyncProfile(GetSyncProfile getSyncProfile38, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAllFilesForAddOn40
	 */
	List<AddOnFile> getAllFilesForAddOn(int getAllFilesForAddOn40) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAllFilesForAddOn40
	 */
	void startgetAllFilesForAddOn(int getAllFilesForAddOn40, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getFuzzyMatches42
	 */
	GetFuzzyMatchesResponse getFuzzyMatches(GetFuzzyMatches getFuzzyMatches42) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getFuzzyMatches42
	 */
	void startgetFuzzyMatches(GetFuzzyMatches getFuzzyMatches42, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param joinSyncGroup44
	 */
	JoinSyncGroupResponse joinSyncGroup(JoinSyncGroup joinSyncGroup44) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param joinSyncGroup44
	 */
	void startjoinSyncGroup(JoinSyncGroup joinSyncGroup44, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param listFeeds46
	 */
	ListFeedsResponse listFeeds(ListFeeds listFeeds46) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param listFeeds46
	 */
	void startlistFeeds(ListFeeds listFeeds46, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAddOnFiles48
	 */
	GetAddOnFilesResponse getAddOnFiles(GetAddOnFiles getAddOnFiles48) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOnFiles48
	 */
	void startgetAddOnFiles(GetAddOnFiles getAddOnFiles48, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param v2GetAddOnDescription50
	 */
	V2GetAddOnDescriptionResponse v2GetAddOnDescription(V2GetAddOnDescription v2GetAddOnDescription50) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param v2GetAddOnDescription50
	 */
	void startv2GetAddOnDescription(V2GetAddOnDescription v2GetAddOnDescription50, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param resetSingleAddonCache52
	 */
	ResetSingleAddonCacheResponse resetSingleAddonCache(ResetSingleAddonCache resetSingleAddonCache52) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param resetSingleAddonCache52
	 */
	void startresetSingleAddonCache(ResetSingleAddonCache resetSingleAddonCache52, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAddOn54
	 */
	GetAddOnResponse getAddOn(GetAddOn getAddOn54) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOn54
	 */
	void startgetAddOn(GetAddOn getAddOn54, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param logDump56
	 */
	LogDumpResponse logDump(LogDump logDump56) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param logDump56
	 */
	void startlogDump(LogDump logDump56, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param serviceHealthCheck58
	 */
	ServiceHealthCheckResponse serviceHealthCheck(ServiceHealthCheck serviceHealthCheck58) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param serviceHealthCheck58
	 */
	void startserviceHealthCheck(ServiceHealthCheck serviceHealthCheck58, final AddOnServiceCallbackHandler callback) throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param resetAllAddonCache60
	 */
	ResetAllAddonCacheResponse resetAllAddonCache(ResetAllAddonCache resetAllAddonCache60) throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param resetAllAddonCache60
	 */
	void startresetAllAddonCache(ResetAllAddonCache resetAllAddonCache60, final AddOnServiceCallbackHandler callback) throws RemoteException;

	//
}
