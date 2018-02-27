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
 * AddOnServiceCallbackHandler.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.thiakil.curseapi.soap;


import com.curse.addonservice.CacheHealthCheckResponse;
import com.curse.addonservice.CreateSyncGroupResponse;
import com.curse.addonservice.GetAddOnDescriptionResponse;
import com.curse.addonservice.GetAddOnDumpResponse;
import com.curse.addonservice.GetAddOnFileResponse;
import com.curse.addonservice.GetAddOnFilesResponse;
import com.curse.addonservice.GetAddOnResponse;
import com.curse.addonservice.GetAddOnsResponse;
import com.curse.addonservice.GetAllFilesForAddOnResponse;
import com.curse.addonservice.GetChangeLogResponse;
import com.curse.addonservice.GetDownloadTokenResponse;
import com.curse.addonservice.GetFingerprintMatchesResponse;
import com.curse.addonservice.GetFuzzyMatchesResponse;
import com.curse.addonservice.GetRepositoryMatchFromSlugResponse;
import com.curse.addonservice.GetSecureDownloadTokenResponse;
import com.curse.addonservice.GetSyncProfileResponse;
import com.curse.addonservice.HealthCheckResponse;
import com.curse.addonservice.JoinSyncGroupResponse;
import com.curse.addonservice.LeaveSyncGroupResponse;
import com.curse.addonservice.ListFeedsResponse;
import com.curse.addonservice.LogDumpResponse;
import com.curse.addonservice.ResetAllAddonCacheResponse;
import com.curse.addonservice.ResetFeedsResponse;
import com.curse.addonservice.ResetSingleAddonCacheResponse;
import com.curse.addonservice.SaveSyncSnapshotResponse;
import com.curse.addonservice.SaveSyncTransactionsResponse;
import com.curse.addonservice.ServiceHealthCheckResponse;
import com.curse.addonservice.V2GetAddOnDescriptionResponse;
import com.curse.addonservice.V2GetAddOnsResponse;
import com.curse.addonservice.V2GetChangeLogResponse;
import com.curse.addonservice.V2GetFingerprintMatchesResponse;

/**
 * AddOnServiceCallbackHandler Callback class, Users can extend this class and implement
 * their own receiveResult and receiveError methods.
 */
public abstract class AddOnServiceCallbackHandler {
	protected Object clientData;

	/**
	 * User can pass in any object that needs to be accessed once the NonBlocking
	 * Web service call is finished and appropriate method of this CallBack is called.
	 *
	 * @param clientData Object mechanism by which the user can pass in user data
	 *                   that will be avilable at the time this callback is called.
	 */
	public AddOnServiceCallbackHandler(Object clientData) {
		this.clientData = clientData;
	}

	/**
	 * Please use this constructor if you don't want to set any clientData
	 */
	public AddOnServiceCallbackHandler() {
		this.clientData = null;
	}

	/**
	 * Get the client data
	 */
	public Object getClientData() {
		return clientData;
	}

	/**
	 * auto generated Axis2 call back method for createSyncGroup method
	 * override this method for handling normal response from createSyncGroup operation
	 */
	public void receiveResultcreateSyncGroup(CreateSyncGroupResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from createSyncGroup operation
	 */
	public void receiveErrorcreateSyncGroup(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getSecureDownloadToken method
	 * override this method for handling normal response from getSecureDownloadToken operation
	 */
	public void receiveResultgetSecureDownloadToken(GetSecureDownloadTokenResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getSecureDownloadToken operation
	 */
	public void receiveErrorgetSecureDownloadToken(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for healthCheck method
	 * override this method for handling normal response from healthCheck operation
	 */
	public void receiveResulthealthCheck(HealthCheckResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from healthCheck operation
	 */
	public void receiveErrorhealthCheck(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getFingerprintMatches method
	 * override this method for handling normal response from getFingerprintMatches operation
	 */
	public void receiveResultgetFingerprintMatches(GetFingerprintMatchesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getFingerprintMatches operation
	 */
	public void receiveErrorgetFingerprintMatches(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for saveSyncTransactions method
	 * override this method for handling normal response from saveSyncTransactions operation
	 */
	public void receiveResultsaveSyncTransactions(SaveSyncTransactionsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from saveSyncTransactions operation
	 */
	public void receiveErrorsaveSyncTransactions(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getRepositoryMatchFromSlug method
	 * override this method for handling normal response from getRepositoryMatchFromSlug operation
	 */
	public void receiveResultgetRepositoryMatchFromSlug(GetRepositoryMatchFromSlugResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getRepositoryMatchFromSlug operation
	 */
	public void receiveErrorgetRepositoryMatchFromSlug(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for v2GetFingerprintMatches method
	 * override this method for handling normal response from v2GetFingerprintMatches operation
	 */
	public void receiveResultv2GetFingerprintMatches(V2GetFingerprintMatchesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from v2GetFingerprintMatches operation
	 */
	public void receiveErrorv2GetFingerprintMatches(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for cacheHealthCheck method
	 * override this method for handling normal response from cacheHealthCheck operation
	 */
	public void receiveResultcacheHealthCheck(CacheHealthCheckResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from cacheHealthCheck operation
	 */
	public void receiveErrorcacheHealthCheck(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getAddOnDescription method
	 * override this method for handling normal response from getAddOnDescription operation
	 */
	public void receiveResultgetAddOnDescription(GetAddOnDescriptionResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getAddOnDescription operation
	 */
	public void receiveErrorgetAddOnDescription(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for resetFeeds method
	 * override this method for handling normal response from resetFeeds operation
	 */
	public void receiveResultresetFeeds(ResetFeedsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from resetFeeds operation
	 */
	public void receiveErrorresetFeeds(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for leaveSyncGroup method
	 * override this method for handling normal response from leaveSyncGroup operation
	 */
	public void receiveResultleaveSyncGroup(LeaveSyncGroupResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from leaveSyncGroup operation
	 */
	public void receiveErrorleaveSyncGroup(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for saveSyncSnapshot method
	 * override this method for handling normal response from saveSyncSnapshot operation
	 */
	public void receiveResultsaveSyncSnapshot(SaveSyncSnapshotResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from saveSyncSnapshot operation
	 */
	public void receiveErrorsaveSyncSnapshot(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getAddOnDump method
	 * override this method for handling normal response from getAddOnDump operation
	 */
	public void receiveResultgetAddOnDump(GetAddOnDumpResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getAddOnDump operation
	 */
	public void receiveErrorgetAddOnDump(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getAddOns method
	 * override this method for handling normal response from getAddOns operation
	 */
	public void receiveResultgetAddOns(GetAddOnsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getAddOns operation
	 */
	public void receiveErrorgetAddOns(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getDownloadToken method
	 * override this method for handling normal response from getDownloadToken operation
	 */
	public void receiveResultgetDownloadToken(GetDownloadTokenResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getDownloadToken operation
	 */
	public void receiveErrorgetDownloadToken(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for v2GetChangeLog method
	 * override this method for handling normal response from v2GetChangeLog operation
	 */
	public void receiveResultv2GetChangeLog(V2GetChangeLogResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from v2GetChangeLog operation
	 */
	public void receiveErrorv2GetChangeLog(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for v2GetAddOns method
	 * override this method for handling normal response from v2GetAddOns operation
	 */
	public void receiveResultv2GetAddOns(V2GetAddOnsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from v2GetAddOns operation
	 */
	public void receiveErrorv2GetAddOns(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getAddOnFile method
	 * override this method for handling normal response from getAddOnFile operation
	 */
	public void receiveResultgetAddOnFile(GetAddOnFileResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getAddOnFile operation
	 */
	public void receiveErrorgetAddOnFile(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getChangeLog method
	 * override this method for handling normal response from getChangeLog operation
	 */
	public void receiveResultgetChangeLog(GetChangeLogResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getChangeLog operation
	 */
	public void receiveErrorgetChangeLog(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getSyncProfile method
	 * override this method for handling normal response from getSyncProfile operation
	 */
	public void receiveResultgetSyncProfile(GetSyncProfileResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getSyncProfile operation
	 */
	public void receiveErrorgetSyncProfile(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getAllFilesForAddOn method
	 * override this method for handling normal response from getAllFilesForAddOn operation
	 */
	public void receiveResultgetAllFilesForAddOn(GetAllFilesForAddOnResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getAllFilesForAddOn operation
	 */
	public void receiveErrorgetAllFilesForAddOn(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getFuzzyMatches method
	 * override this method for handling normal response from getFuzzyMatches operation
	 */
	public void receiveResultgetFuzzyMatches(GetFuzzyMatchesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getFuzzyMatches operation
	 */
	public void receiveErrorgetFuzzyMatches(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for joinSyncGroup method
	 * override this method for handling normal response from joinSyncGroup operation
	 */
	public void receiveResultjoinSyncGroup(JoinSyncGroupResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from joinSyncGroup operation
	 */
	public void receiveErrorjoinSyncGroup(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for listFeeds method
	 * override this method for handling normal response from listFeeds operation
	 */
	public void receiveResultlistFeeds(ListFeedsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from listFeeds operation
	 */
	public void receiveErrorlistFeeds(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getAddOnFiles method
	 * override this method for handling normal response from getAddOnFiles operation
	 */
	public void receiveResultgetAddOnFiles(GetAddOnFilesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getAddOnFiles operation
	 */
	public void receiveErrorgetAddOnFiles(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for v2GetAddOnDescription method
	 * override this method for handling normal response from v2GetAddOnDescription operation
	 */
	public void receiveResultv2GetAddOnDescription(V2GetAddOnDescriptionResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from v2GetAddOnDescription operation
	 */
	public void receiveErrorv2GetAddOnDescription(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for resetSingleAddonCache method
	 * override this method for handling normal response from resetSingleAddonCache operation
	 */
	public void receiveResultresetSingleAddonCache(ResetSingleAddonCacheResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from resetSingleAddonCache operation
	 */
	public void receiveErrorresetSingleAddonCache(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for getAddOn method
	 * override this method for handling normal response from getAddOn operation
	 */
	public void receiveResultgetAddOn(GetAddOnResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from getAddOn operation
	 */
	public void receiveErrorgetAddOn(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for logDump method
	 * override this method for handling normal response from logDump operation
	 */
	public void receiveResultlogDump(LogDumpResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from logDump operation
	 */
	public void receiveErrorlogDump(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for serviceHealthCheck method
	 * override this method for handling normal response from serviceHealthCheck operation
	 */
	public void receiveResultserviceHealthCheck(ServiceHealthCheckResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from serviceHealthCheck operation
	 */
	public void receiveErrorserviceHealthCheck(Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for resetAllAddonCache method
	 * override this method for handling normal response from resetAllAddonCache operation
	 */
	public void receiveResultresetAllAddonCache(ResetAllAddonCacheResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler
	 * override this method for handling error response from resetAllAddonCache operation
	 */
	public void receiveErrorresetAllAddonCache(Exception e) {
	}
}
