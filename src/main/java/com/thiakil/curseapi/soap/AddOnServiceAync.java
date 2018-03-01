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


import com.curse.addonservice.CacheHealthCheck;
import com.curse.addonservice.CreateSyncGroup;
import com.curse.addonservice.GetAddOnDescription;
import com.curse.addonservice.GetAddOnDump;
import com.curse.addonservice.GetDownloadToken;
import com.curse.addonservice.GetFuzzyMatches;
import com.curse.addonservice.GetRepositoryMatchFromSlug;
import com.curse.addonservice.GetSecureDownloadToken;
import com.curse.addonservice.GetSyncProfile;
import com.curse.addonservice.JoinSyncGroup;
import com.curse.addonservice.LeaveSyncGroup;
import com.curse.addonservice.ListFeeds;
import com.curse.addonservice.LogDump;
import com.curse.addonservice.ResetAllAddonCache;
import com.curse.addonservice.ResetFeeds;
import com.curse.addonservice.ResetSingleAddonCache;
import com.curse.addonservice.SaveSyncSnapshot;
import com.curse.addonservice.SaveSyncTransactions;
import com.curse.addonservice.ServiceHealthCheck;
import com.thiakil.curseapi.login.CurseToken;
import org.apache.axis2.AxisFault;
import org.datacontract.schemas._2004._07.curse_addonservice_requests.AddOnFileKey;

import java.rmi.RemoteException;

/*
 *  AddOnService java interface (Async calls)
 */
public interface AddOnServiceAync {
	
	/**
	 * Async. Unknown usage
	 *
	 * @param createSyncGroup0 Sync Group params
	 * @param callback - Async callback handler
	 */
	void startcreateSyncGroup(CreateSyncGroup createSyncGroup0, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * See {@link AddOnService#getSecureDownloadToken(GetSecureDownloadToken)}
	 *
	 * @param getSecureDownloadToken2 req params
	 */
	void startgetSecureDownloadToken(GetSecureDownloadToken getSecureDownloadToken2, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * See {@link AddOnService#healthCheck())
	 *
	 */
	void starthealthCheck(final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Async version of {@link AddOnService#getFingerprintMatches(long...)}
	 *
	 * @param fingerprints fingerprints to check.
	 *
	 * @param callback async callback handler
	 * @deprecated See {@link #startv2GetFingerprintMatches(long[], AddOnServiceCallbackHandler)}
	 */
	@Deprecated
	void startgetFingerprintMatches(long[] fingerprints, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Unknown method
	 */
	void startsaveSyncTransactions(SaveSyncTransactions saveSyncTransactions8, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Unknown method
	 */
	void startgetRepositoryMatchFromSlug(GetRepositoryMatchFromSlug getRepositoryMatchFromSlug10, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param fingerprints
	 */
	void startv2GetFingerprintMatches(long[] fingerprints, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param cacheHealthCheck14
	 */
	void startcacheHealthCheck(CacheHealthCheck cacheHealthCheck14, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOnDescription16
	 *
	 * @deprecated See {@link #startv2GetAddOnDescription(int, AddOnServiceCallbackHandler)}
	 */
	@Deprecated
	void startgetAddOnDescription(GetAddOnDescription getAddOnDescription16, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param resetFeeds18
	 */
	void startresetFeeds(ResetFeeds resetFeeds18, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param leaveSyncGroup20
	 */
	void startleaveSyncGroup(LeaveSyncGroup leaveSyncGroup20, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param saveSyncSnapshot22
	 */
	void startsaveSyncSnapshot(SaveSyncSnapshot saveSyncSnapshot22, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOnDump24
	 */
	void startgetAddOnDump(GetAddOnDump getAddOnDump24, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param addonIDs
	 *
	 * @deprecated see {@link #startv2GetAddOns(int[], AddOnServiceCallbackHandler)}
	 */
	@Deprecated
	void startgetAddOns(int[] addonIDs, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getDownloadToken28
	 */
	void startgetDownloadToken(GetDownloadToken getDownloadToken28, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param addonID
	 * @param fileID
	 */
	void startv2GetChangeLog(int addonID, int fileID, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Get a list of addons by IDs
	 *
	 * @param addonIDs the addons you want
	 */
	void startv2GetAddOns(int[] addonIDs, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Retrieve a single AddOnFile by IDs
	 *
	 * @param addonID addon's ID
	 * @param fileID file's ID
	 */
	void startgetAddOnFile(int addonID, int fileID, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Get the changelog for a single file
	 *
	 * @param addonID addon's ID
	 * @param fileID file's ID
	 *
	 * @deprecated See {@link #startv2GetChangeLog(int, int, AddOnServiceCallbackHandler)}
	 */
	@Deprecated
	void startgetChangeLog(int addonID, int fileID, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getSyncProfile38
	 */
	void startgetSyncProfile(GetSyncProfile getSyncProfile38, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Get a list of all the file for an addon
	 *
	 * @param addonID
	 */
	void startgetAllFilesForAddOn(int addonID, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getFuzzyMatches42
	 */
	void startgetFuzzyMatches(GetFuzzyMatches getFuzzyMatches42, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param joinSyncGroup44
	 */
	void startjoinSyncGroup(JoinSyncGroup joinSyncGroup44, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param listFeeds46
	 */
	void startlistFeeds(ListFeeds listFeeds46, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param addOnFileKeys
	 */
	void startgetAddOnFiles(AddOnFileKey[] addOnFileKeys, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Get description for addon
	 *
	 * @param addonID id for which to retrieve the description
	 */
	void startv2GetAddOnDescription(int addonID, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param resetSingleAddonCache52
	 */
	void startresetSingleAddonCache(ResetSingleAddonCache resetSingleAddonCache52, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param addonID
	 */
	void startgetAddOn(int addonID, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param logDump56
	 */
	void startlogDump(LogDump logDump56, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param serviceHealthCheck58
	 */
	void startserviceHealthCheck(ServiceHealthCheck serviceHealthCheck58, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param resetAllAddonCache60
	 */
	void startresetAllAddonCache(ResetAllAddonCache resetAllAddonCache60, final AddOnServiceCallbackHandler callback) throws RemoteException;
	
	/**
	 * Note that the provided service implements BOTH Sync and Async interfaces
	 */
	static AddOnServiceAync initialise(CurseToken auth) throws AxisFault {
		return new AddOnServiceStub(auth);
	}
	
	/**
	 * Note that the provided service implements BOTH Sync and Async interfaces
	 */
	static AddOnServiceAync initialise(CurseToken auth, String targetEndpoint) throws AxisFault {
		return new AddOnServiceStub(auth, targetEndpoint);
	}
}
