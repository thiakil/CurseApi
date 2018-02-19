/**
 * AddOnService.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package com.thiakil.curseapi;


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
import com.curse.addonservice.GetAllFilesForAddOn;
import com.curse.addonservice.GetAllFilesForAddOnResponse;
import com.curse.addonservice.GetChangeLog;
import com.curse.addonservice.GetChangeLogResponse;
import com.curse.addonservice.GetDownloadToken;
import com.curse.addonservice.GetDownloadTokenResponse;
import com.curse.addonservice.GetFingerprintMatches;
import com.curse.addonservice.GetFingerprintMatchesResponse;
import com.curse.addonservice.GetFuzzyMatches;
import com.curse.addonservice.GetFuzzyMatchesResponse;
import com.curse.addonservice.GetRepositoryMatchFromSlug;
import com.curse.addonservice.GetRepositoryMatchFromSlugResponse;
import com.curse.addonservice.GetSecureDownloadToken;
import com.curse.addonservice.GetSecureDownloadTokenResponse;
import com.curse.addonservice.GetSyncProfile;
import com.curse.addonservice.GetSyncProfileResponse;
import com.curse.addonservice.HealthCheck;
import com.curse.addonservice.HealthCheckResponse;
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

import java.rmi.RemoteException;

/*
 *  AddOnService java interface
 */
public interface AddOnService {
	/**
	 * Auto generated method signature
	 *
	 * @param createSyncGroup0
	 */
	public CreateSyncGroupResponse createSyncGroup(
			CreateSyncGroup createSyncGroup0)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param createSyncGroup0
	 */
	public void startcreateSyncGroup(
			CreateSyncGroup createSyncGroup0,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getSecureDownloadToken2
	 */
	public GetSecureDownloadTokenResponse getSecureDownloadToken(
			GetSecureDownloadToken getSecureDownloadToken2)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getSecureDownloadToken2
	 */
	public void startgetSecureDownloadToken(
			GetSecureDownloadToken getSecureDownloadToken2,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param healthCheck4
	 */
	public HealthCheckResponse healthCheck(
			HealthCheck healthCheck4)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param healthCheck4
	 */
	public void starthealthCheck(
			HealthCheck healthCheck4,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getFingerprintMatches6
	 */
	public GetFingerprintMatchesResponse getFingerprintMatches(
			GetFingerprintMatches getFingerprintMatches6)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getFingerprintMatches6
	 */
	public void startgetFingerprintMatches(
			GetFingerprintMatches getFingerprintMatches6,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param saveSyncTransactions8
	 */
	public SaveSyncTransactionsResponse saveSyncTransactions(
			SaveSyncTransactions saveSyncTransactions8)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param saveSyncTransactions8
	 */
	public void startsaveSyncTransactions(
			SaveSyncTransactions saveSyncTransactions8,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getRepositoryMatchFromSlug10
	 */
	public GetRepositoryMatchFromSlugResponse getRepositoryMatchFromSlug(
			GetRepositoryMatchFromSlug getRepositoryMatchFromSlug10)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getRepositoryMatchFromSlug10
	 */
	public void startgetRepositoryMatchFromSlug(
			GetRepositoryMatchFromSlug getRepositoryMatchFromSlug10,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param v2GetFingerprintMatches12
	 */
	public V2GetFingerprintMatchesResponse v2GetFingerprintMatches(
			V2GetFingerprintMatches v2GetFingerprintMatches12)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param v2GetFingerprintMatches12
	 */
	public void startv2GetFingerprintMatches(
			V2GetFingerprintMatches v2GetFingerprintMatches12,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param cacheHealthCheck14
	 */
	public CacheHealthCheckResponse cacheHealthCheck(
			CacheHealthCheck cacheHealthCheck14)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param cacheHealthCheck14
	 */
	public void startcacheHealthCheck(
			CacheHealthCheck cacheHealthCheck14,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAddOnDescription16
	 */
	public GetAddOnDescriptionResponse getAddOnDescription(
			GetAddOnDescription getAddOnDescription16)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOnDescription16
	 */
	public void startgetAddOnDescription(
			GetAddOnDescription getAddOnDescription16,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param resetFeeds18
	 */
	public ResetFeedsResponse resetFeeds(
			ResetFeeds resetFeeds18)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param resetFeeds18
	 */
	public void startresetFeeds(
			ResetFeeds resetFeeds18,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param leaveSyncGroup20
	 */
	public LeaveSyncGroupResponse leaveSyncGroup(
			LeaveSyncGroup leaveSyncGroup20)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param leaveSyncGroup20
	 */
	public void startleaveSyncGroup(
			LeaveSyncGroup leaveSyncGroup20,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param saveSyncSnapshot22
	 */
	public SaveSyncSnapshotResponse saveSyncSnapshot(
			SaveSyncSnapshot saveSyncSnapshot22)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param saveSyncSnapshot22
	 */
	public void startsaveSyncSnapshot(
			SaveSyncSnapshot saveSyncSnapshot22,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAddOnDump24
	 */
	public GetAddOnDumpResponse getAddOnDump(
			GetAddOnDump getAddOnDump24)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOnDump24
	 */
	public void startgetAddOnDump(
			GetAddOnDump getAddOnDump24,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAddOns26
	 */
	public GetAddOnsResponse getAddOns(
			GetAddOns getAddOns26)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOns26
	 */
	public void startgetAddOns(GetAddOns getAddOns26,
							   final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getDownloadToken28
	 */
	public GetDownloadTokenResponse getDownloadToken(
			GetDownloadToken getDownloadToken28)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getDownloadToken28
	 */
	public void startgetDownloadToken(
			GetDownloadToken getDownloadToken28,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param v2GetChangeLog30
	 */
	public V2GetChangeLogResponse v2GetChangeLog(
			V2GetChangeLog v2GetChangeLog30)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param v2GetChangeLog30
	 */
	public void startv2GetChangeLog(
			V2GetChangeLog v2GetChangeLog30,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param v2GetAddOns32
	 */
	public V2GetAddOnsResponse v2GetAddOns(
			V2GetAddOns v2GetAddOns32)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param v2GetAddOns32
	 */
	public void startv2GetAddOns(
			V2GetAddOns v2GetAddOns32,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAddOnFile34
	 */
	public GetAddOnFileResponse getAddOnFile(
			GetAddOnFile getAddOnFile34)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOnFile34
	 */
	public void startgetAddOnFile(
			GetAddOnFile getAddOnFile34,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getChangeLog36
	 */
	public GetChangeLogResponse getChangeLog(
			GetChangeLog getChangeLog36)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getChangeLog36
	 */
	public void startgetChangeLog(
			GetChangeLog getChangeLog36,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getSyncProfile38
	 */
	public GetSyncProfileResponse getSyncProfile(
			GetSyncProfile getSyncProfile38)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getSyncProfile38
	 */
	public void startgetSyncProfile(
			GetSyncProfile getSyncProfile38,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAllFilesForAddOn40
	 */
	public GetAllFilesForAddOnResponse getAllFilesForAddOn(
			GetAllFilesForAddOn getAllFilesForAddOn40)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAllFilesForAddOn40
	 */
	public void startgetAllFilesForAddOn(
			GetAllFilesForAddOn getAllFilesForAddOn40,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getFuzzyMatches42
	 */
	public GetFuzzyMatchesResponse getFuzzyMatches(
			GetFuzzyMatches getFuzzyMatches42)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getFuzzyMatches42
	 */
	public void startgetFuzzyMatches(
			GetFuzzyMatches getFuzzyMatches42,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param joinSyncGroup44
	 */
	public JoinSyncGroupResponse joinSyncGroup(
			JoinSyncGroup joinSyncGroup44)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param joinSyncGroup44
	 */
	public void startjoinSyncGroup(
			JoinSyncGroup joinSyncGroup44,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param listFeeds46
	 */
	public ListFeedsResponse listFeeds(
			ListFeeds listFeeds46)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param listFeeds46
	 */
	public void startlistFeeds(ListFeeds listFeeds46,
							   final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAddOnFiles48
	 */
	public GetAddOnFilesResponse getAddOnFiles(
			GetAddOnFiles getAddOnFiles48)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOnFiles48
	 */
	public void startgetAddOnFiles(
			GetAddOnFiles getAddOnFiles48,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param v2GetAddOnDescription50
	 */
	public V2GetAddOnDescriptionResponse v2GetAddOnDescription(
			V2GetAddOnDescription v2GetAddOnDescription50)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param v2GetAddOnDescription50
	 */
	public void startv2GetAddOnDescription(
			V2GetAddOnDescription v2GetAddOnDescription50,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param resetSingleAddonCache52
	 */
	public ResetSingleAddonCacheResponse resetSingleAddonCache(
			ResetSingleAddonCache resetSingleAddonCache52)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param resetSingleAddonCache52
	 */
	public void startresetSingleAddonCache(
			ResetSingleAddonCache resetSingleAddonCache52,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param getAddOn54
	 */
	public GetAddOnResponse getAddOn(
			GetAddOn getAddOn54)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOn54
	 */
	public void startgetAddOn(GetAddOn getAddOn54,
							  final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param logDump56
	 */
	public LogDumpResponse logDump(
			LogDump logDump56)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param logDump56
	 */
	public void startlogDump(LogDump logDump56,
							 final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param serviceHealthCheck58
	 */
	public ServiceHealthCheckResponse serviceHealthCheck(
			ServiceHealthCheck serviceHealthCheck58)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param serviceHealthCheck58
	 */
	public void startserviceHealthCheck(
			ServiceHealthCheck serviceHealthCheck58,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	/**
	 * Auto generated method signature
	 *
	 * @param resetAllAddonCache60
	 */
	public ResetAllAddonCacheResponse resetAllAddonCache(
			ResetAllAddonCache resetAllAddonCache60)
			throws RemoteException;

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param resetAllAddonCache60
	 */
	public void startresetAllAddonCache(
			ResetAllAddonCache resetAllAddonCache60,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException;

	//
}
