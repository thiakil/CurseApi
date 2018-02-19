/**
 * AddOnServiceStub.java
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
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMXMLBuilderFactory;
import org.apache.axiom.soap.SOAP12Constants;
import org.apache.axiom.soap.SOAPEnvelope;
import org.apache.axiom.soap.SOAPFactory;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.FaultMapKey;
import org.apache.axis2.client.OperationClient;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.client.Stub;
import org.apache.axis2.client.async.AxisCallback;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.databinding.ADBException;
import org.apache.axis2.description.AxisOperation;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.description.OutInAxisOperation;
import org.apache.axis2.description.WSDL2Constants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.apache.axis2.transport.http.impl.httpclient3.HttpTransportPropertiesImpl;
import org.apache.axis2.util.CallbackReceiver;
import org.apache.axis2.util.Utils;
import org.apache.axis2.wsdl.WSDLConstants;
import org.apache.neethi.Policy;
import org.apache.neethi.PolicyEngine;

import javax.xml.namespace.QName;
import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.HashMap;

/*
 *  AddOnServiceStub java implementation
 */
public class AddOnServiceStub extends Stub
		implements AddOnService {
	private static int counter = 0;
	protected AxisOperation[] _operations;

	//hashmaps to keep the fault mapping
	private HashMap faultExceptionNameMap = new HashMap();
	private HashMap faultExceptionClassNameMap = new HashMap();
	private HashMap faultMessageMap = new HashMap();

	/////////////////////////////////////////////////////////////////////////
	private QName[] opNameArray = null;

	/**
	 *Constructor that takes in a configContext
	 */
	public AddOnServiceStub(
			ConfigurationContext configurationContext,
			String targetEndpoint) throws AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext  and useseperate listner
	 */
	public AddOnServiceStub(
			ConfigurationContext configurationContext,
			String targetEndpoint, boolean useSeparateListener)
			throws AxisFault {
		//To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new ServiceClient(configurationContext,
				_service);

		_service.applyPolicy();

		_serviceClient.getOptions()
				.setTo(new EndpointReference(
						targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

		//Set the soap version
		_serviceClient.getOptions()
				.setSoapVersionURI(SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
		_serviceClient.engageModule("addressing");

        /*HttpTransportPropertiesImpl.Authenticator
                auth = new HttpTransportPropertiesImpl.Authenticator();
        auth.setUsername("thiakil");
        auth.setPassword("????");
        auth.setPreemptiveAuthentication(true);
        _serviceClient.getOptions().setProperty(org.apache.axis2.transport.http.HTTPConstants.AUTHENTICATE, auth);*/
	}

	/**
	 * Default Constructor
	 */
	public AddOnServiceStub(
			ConfigurationContext configurationContext)
			throws AxisFault {
		this(configurationContext,
				"https://addons.forgesvc.net/AddOnService.svc/soap12");
	}

	/**
	 * Default Constructor
	 */
	public AddOnServiceStub() throws AxisFault {
		this("https://addons.forgesvc.net/AddOnService.svc/soap12");
	}

	/**
	 * Constructor taking the target endpoint
	 */
	public AddOnServiceStub(String targetEndpoint)
			throws AxisFault {
		this(null, targetEndpoint);
	}

	private static synchronized String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}

		counter = counter + 1;

		return Long.toString(System.currentTimeMillis()) +
				"_" + counter;
	}

	private void populateAxisService() throws AxisFault {
		//creating the Service with a unique name
		_service = new AxisService("AddOnService" +
				getUniqueSuffix());
		addAnonymousOperations();

		//creating the operations
		AxisOperation __operation;

		_operations = new AxisOperation[31];

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "createSyncGroup"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[0] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getSecureDownloadToken"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[1] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "healthCheck"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[2] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getFingerprintMatches"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[3] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "saveSyncTransactions"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[4] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getRepositoryMatchFromSlug"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[5] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "v2GetFingerprintMatches"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[6] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "cacheHealthCheck"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[7] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getAddOnDescription"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[8] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "resetFeeds"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[9] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "leaveSyncGroup"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[10] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "saveSyncSnapshot"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[11] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getAddOnDump"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[12] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getAddOns"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[13] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getDownloadToken"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[14] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "v2GetChangeLog"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[15] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "v2GetAddOns"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[16] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getAddOnFile"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[17] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getChangeLog"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[18] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getSyncProfile"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[19] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getAllFilesForAddOn"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[20] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getFuzzyMatches"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[21] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "joinSyncGroup"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[22] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "listFeeds"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[23] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getAddOnFiles"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[24] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "v2GetAddOnDescription"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[25] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "resetSingleAddonCache"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[26] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "getAddOn"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[27] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "logDump"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[28] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "serviceHealthCheck"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[29] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName(
				"http://addonservice.curse.com/", "resetAllAddonCache"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE)
				.getPolicySubject()
				.attachPolicy(getPolicy(
						"<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

		_operations[30] = __operation;
	}

	//populates the faults
	private void populateFaults() {
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#createSyncGroup
	 * @param createSyncGroup62
	 */
	public CreateSyncGroupResponse createSyncGroup(
			CreateSyncGroup createSyncGroup62)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/CreateSyncGroup");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					createSyncGroup62,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "createSyncGroup")),
					new QName(
							"http://addonservice.curse.com/", "CreateSyncGroup"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					CreateSyncGroupResponse.class);

			return (CreateSyncGroupResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "CreateSyncGroup"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "CreateSyncGroup"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "CreateSyncGroup"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startcreateSyncGroup
	 * @param createSyncGroup62
	 */
	public void startcreateSyncGroup(
			CreateSyncGroup createSyncGroup62,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/CreateSyncGroup");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				createSyncGroup62,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "createSyncGroup")),
				new QName(
						"http://addonservice.curse.com/", "CreateSyncGroup"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							CreateSyncGroupResponse.class);
					callback.receiveResultcreateSyncGroup((CreateSyncGroupResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorcreateSyncGroup(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"CreateSyncGroup"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"CreateSyncGroup"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"CreateSyncGroup"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorcreateSyncGroup(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateSyncGroup(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateSyncGroup(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateSyncGroup(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateSyncGroup(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateSyncGroup(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateSyncGroup(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcreateSyncGroup(f);
							}
						} else {
							callback.receiveErrorcreateSyncGroup(f);
						}
					} else {
						callback.receiveErrorcreateSyncGroup(f);
					}
				} else {
					callback.receiveErrorcreateSyncGroup(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorcreateSyncGroup(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[0].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getSecureDownloadToken
	 * @param getSecureDownloadToken64
	 */
	public GetSecureDownloadTokenResponse getSecureDownloadToken(
			GetSecureDownloadToken getSecureDownloadToken64)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetSecureDownloadToken");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getSecureDownloadToken64,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/",
									"getSecureDownloadToken")),
					new QName(
							"http://addonservice.curse.com/",
							"GetSecureDownloadToken"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetSecureDownloadTokenResponse.class);

			return (GetSecureDownloadTokenResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "GetSecureDownloadToken"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(),
								"GetSecureDownloadToken"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(),
								"GetSecureDownloadToken"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetSecureDownloadToken
	 * @param getSecureDownloadToken64
	 */
	public void startgetSecureDownloadToken(
			GetSecureDownloadToken getSecureDownloadToken64,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetSecureDownloadToken");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getSecureDownloadToken64,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/",
								"getSecureDownloadToken")),
				new QName(
						"http://addonservice.curse.com/", "GetSecureDownloadToken"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetSecureDownloadTokenResponse.class);
					callback.receiveResultgetSecureDownloadToken((GetSecureDownloadTokenResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetSecureDownloadToken(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"GetSecureDownloadToken"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetSecureDownloadToken"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetSecureDownloadToken"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetSecureDownloadToken(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSecureDownloadToken(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSecureDownloadToken(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSecureDownloadToken(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSecureDownloadToken(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSecureDownloadToken(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSecureDownloadToken(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSecureDownloadToken(f);
							}
						} else {
							callback.receiveErrorgetSecureDownloadToken(f);
						}
					} else {
						callback.receiveErrorgetSecureDownloadToken(f);
					}
				} else {
					callback.receiveErrorgetSecureDownloadToken(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetSecureDownloadToken(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[1].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[1].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#healthCheck
	 * @param healthCheck66
	 */
	public HealthCheckResponse healthCheck(
			HealthCheck healthCheck66)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/HealthCheck");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					healthCheck66,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "healthCheck")),
					new QName(
							"http://addonservice.curse.com/", "HealthCheck"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					HealthCheckResponse.class);

			return (HealthCheckResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "HealthCheck"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "HealthCheck"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "HealthCheck"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#starthealthCheck
	 * @param healthCheck66
	 */
	public void starthealthCheck(
			HealthCheck healthCheck66,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/HealthCheck");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				healthCheck66,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "healthCheck")),
				new QName(
						"http://addonservice.curse.com/", "HealthCheck"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							HealthCheckResponse.class);
					callback.receiveResulthealthCheck((HealthCheckResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorhealthCheck(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(), "HealthCheck"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"HealthCheck"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"HealthCheck"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorhealthCheck(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorhealthCheck(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorhealthCheck(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorhealthCheck(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorhealthCheck(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorhealthCheck(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorhealthCheck(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorhealthCheck(f);
							}
						} else {
							callback.receiveErrorhealthCheck(f);
						}
					} else {
						callback.receiveErrorhealthCheck(f);
					}
				} else {
					callback.receiveErrorhealthCheck(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorhealthCheck(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[2].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[2].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getFingerprintMatches
	 * @param getFingerprintMatches68
	 */
	public GetFingerprintMatchesResponse getFingerprintMatches(
			GetFingerprintMatches getFingerprintMatches68)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetFingerprintMatches");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getFingerprintMatches68,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/",
									"getFingerprintMatches")),
					new QName(
							"http://addonservice.curse.com/",
							"GetFingerprintMatches"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetFingerprintMatchesResponse.class);

			return (GetFingerprintMatchesResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "GetFingerprintMatches"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "GetFingerprintMatches"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "GetFingerprintMatches"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetFingerprintMatches
	 * @param getFingerprintMatches68
	 */
	public void startgetFingerprintMatches(
			GetFingerprintMatches getFingerprintMatches68,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetFingerprintMatches");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getFingerprintMatches68,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/",
								"getFingerprintMatches")),
				new QName(
						"http://addonservice.curse.com/", "GetFingerprintMatches"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetFingerprintMatchesResponse.class);
					callback.receiveResultgetFingerprintMatches((GetFingerprintMatchesResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetFingerprintMatches(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"GetFingerprintMatches"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetFingerprintMatches"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetFingerprintMatches"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetFingerprintMatches(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFingerprintMatches(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFingerprintMatches(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFingerprintMatches(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFingerprintMatches(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFingerprintMatches(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFingerprintMatches(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFingerprintMatches(f);
							}
						} else {
							callback.receiveErrorgetFingerprintMatches(f);
						}
					} else {
						callback.receiveErrorgetFingerprintMatches(f);
					}
				} else {
					callback.receiveErrorgetFingerprintMatches(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetFingerprintMatches(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[3].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[3].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#saveSyncTransactions
	 * @param saveSyncTransactions70
	 */
	public SaveSyncTransactionsResponse saveSyncTransactions(
			SaveSyncTransactions saveSyncTransactions70)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/SaveSyncTransactions");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					saveSyncTransactions70,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/",
									"saveSyncTransactions")),
					new QName(
							"http://addonservice.curse.com/", "SaveSyncTransactions"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					SaveSyncTransactionsResponse.class);

			return (SaveSyncTransactionsResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "SaveSyncTransactions"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "SaveSyncTransactions"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "SaveSyncTransactions"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startsaveSyncTransactions
	 * @param saveSyncTransactions70
	 */
	public void startsaveSyncTransactions(
			SaveSyncTransactions saveSyncTransactions70,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/SaveSyncTransactions");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				saveSyncTransactions70,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "saveSyncTransactions")),
				new QName(
						"http://addonservice.curse.com/", "SaveSyncTransactions"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							SaveSyncTransactionsResponse.class);
					callback.receiveResultsaveSyncTransactions((SaveSyncTransactionsResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorsaveSyncTransactions(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"SaveSyncTransactions"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"SaveSyncTransactions"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"SaveSyncTransactions"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorsaveSyncTransactions(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncTransactions(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncTransactions(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncTransactions(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncTransactions(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncTransactions(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncTransactions(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncTransactions(f);
							}
						} else {
							callback.receiveErrorsaveSyncTransactions(f);
						}
					} else {
						callback.receiveErrorsaveSyncTransactions(f);
					}
				} else {
					callback.receiveErrorsaveSyncTransactions(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorsaveSyncTransactions(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[4].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[4].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getRepositoryMatchFromSlug
	 * @param getRepositoryMatchFromSlug72
	 */
	public GetRepositoryMatchFromSlugResponse getRepositoryMatchFromSlug(
			GetRepositoryMatchFromSlug getRepositoryMatchFromSlug72)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetRepositoryMatchFromSlug");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getRepositoryMatchFromSlug72,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/",
									"getRepositoryMatchFromSlug")),
					new QName(
							"http://addonservice.curse.com/",
							"GetRepositoryMatchFromSlug"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetRepositoryMatchFromSlugResponse.class);

			return (GetRepositoryMatchFromSlugResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(),
								"GetRepositoryMatchFromSlug"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(),
								"GetRepositoryMatchFromSlug"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(),
								"GetRepositoryMatchFromSlug"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetRepositoryMatchFromSlug
	 * @param getRepositoryMatchFromSlug72
	 */
	public void startgetRepositoryMatchFromSlug(
			GetRepositoryMatchFromSlug getRepositoryMatchFromSlug72,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetRepositoryMatchFromSlug");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getRepositoryMatchFromSlug72,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/",
								"getRepositoryMatchFromSlug")),
				new QName(
						"http://addonservice.curse.com/",
						"GetRepositoryMatchFromSlug"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetRepositoryMatchFromSlugResponse.class);
					callback.receiveResultgetRepositoryMatchFromSlug((GetRepositoryMatchFromSlugResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetRepositoryMatchFromSlug(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"GetRepositoryMatchFromSlug"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetRepositoryMatchFromSlug"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetRepositoryMatchFromSlug"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetRepositoryMatchFromSlug(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetRepositoryMatchFromSlug(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetRepositoryMatchFromSlug(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetRepositoryMatchFromSlug(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetRepositoryMatchFromSlug(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetRepositoryMatchFromSlug(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetRepositoryMatchFromSlug(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetRepositoryMatchFromSlug(f);
							}
						} else {
							callback.receiveErrorgetRepositoryMatchFromSlug(f);
						}
					} else {
						callback.receiveErrorgetRepositoryMatchFromSlug(f);
					}
				} else {
					callback.receiveErrorgetRepositoryMatchFromSlug(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetRepositoryMatchFromSlug(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[5].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[5].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#v2GetFingerprintMatches
	 * @param v2GetFingerprintMatches74
	 */
	public V2GetFingerprintMatchesResponse v2GetFingerprintMatches(
			V2GetFingerprintMatches v2GetFingerprintMatches74)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/v2GetFingerprintMatches");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					v2GetFingerprintMatches74,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/",
									"v2GetFingerprintMatches")),
					new QName(
							"http://addonservice.curse.com/",
							"v2GetFingerprintMatches"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					V2GetFingerprintMatchesResponse.class);

			return (V2GetFingerprintMatchesResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "v2GetFingerprintMatches"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(),
								"v2GetFingerprintMatches"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(),
								"v2GetFingerprintMatches"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startv2GetFingerprintMatches
	 * @param v2GetFingerprintMatches74
	 */
	public void startv2GetFingerprintMatches(
			V2GetFingerprintMatches v2GetFingerprintMatches74,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/v2GetFingerprintMatches");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				v2GetFingerprintMatches74,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/",
								"v2GetFingerprintMatches")),
				new QName(
						"http://addonservice.curse.com/", "v2GetFingerprintMatches"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							V2GetFingerprintMatchesResponse.class);
					callback.receiveResultv2GetFingerprintMatches((V2GetFingerprintMatchesResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorv2GetFingerprintMatches(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"v2GetFingerprintMatches"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"v2GetFingerprintMatches"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"v2GetFingerprintMatches"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorv2GetFingerprintMatches(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetFingerprintMatches(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetFingerprintMatches(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetFingerprintMatches(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetFingerprintMatches(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetFingerprintMatches(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetFingerprintMatches(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetFingerprintMatches(f);
							}
						} else {
							callback.receiveErrorv2GetFingerprintMatches(f);
						}
					} else {
						callback.receiveErrorv2GetFingerprintMatches(f);
					}
				} else {
					callback.receiveErrorv2GetFingerprintMatches(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorv2GetFingerprintMatches(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[6].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[6].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#cacheHealthCheck
	 * @param cacheHealthCheck76
	 */
	public CacheHealthCheckResponse cacheHealthCheck(
			CacheHealthCheck cacheHealthCheck76)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/CacheHealthCheck");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					cacheHealthCheck76,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "cacheHealthCheck")),
					new QName(
							"http://addonservice.curse.com/", "CacheHealthCheck"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					CacheHealthCheckResponse.class);

			return (CacheHealthCheckResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "CacheHealthCheck"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "CacheHealthCheck"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "CacheHealthCheck"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startcacheHealthCheck
	 * @param cacheHealthCheck76
	 */
	public void startcacheHealthCheck(
			CacheHealthCheck cacheHealthCheck76,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/CacheHealthCheck");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				cacheHealthCheck76,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "cacheHealthCheck")),
				new QName(
						"http://addonservice.curse.com/", "CacheHealthCheck"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							CacheHealthCheckResponse.class);
					callback.receiveResultcacheHealthCheck((CacheHealthCheckResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorcacheHealthCheck(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"CacheHealthCheck"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"CacheHealthCheck"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"CacheHealthCheck"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorcacheHealthCheck(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcacheHealthCheck(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcacheHealthCheck(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcacheHealthCheck(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcacheHealthCheck(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcacheHealthCheck(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcacheHealthCheck(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorcacheHealthCheck(f);
							}
						} else {
							callback.receiveErrorcacheHealthCheck(f);
						}
					} else {
						callback.receiveErrorcacheHealthCheck(f);
					}
				} else {
					callback.receiveErrorcacheHealthCheck(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorcacheHealthCheck(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[7].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[7].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getAddOnDescription
	 * @param getAddOnDescription78
	 */
	public GetAddOnDescriptionResponse getAddOnDescription(
			GetAddOnDescription getAddOnDescription78)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetAddOnDescription");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getAddOnDescription78,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/",
									"getAddOnDescription")),
					new QName(
							"http://addonservice.curse.com/", "GetAddOnDescription"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetAddOnDescriptionResponse.class);

			return (GetAddOnDescriptionResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "GetAddOnDescription"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAddOnDescription"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAddOnDescription"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetAddOnDescription
	 * @param getAddOnDescription78
	 */
	public void startgetAddOnDescription(
			GetAddOnDescription getAddOnDescription78,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetAddOnDescription");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getAddOnDescription78,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "getAddOnDescription")),
				new QName(
						"http://addonservice.curse.com/", "GetAddOnDescription"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetAddOnDescriptionResponse.class);
					callback.receiveResultgetAddOnDescription((GetAddOnDescriptionResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetAddOnDescription(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"GetAddOnDescription"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetAddOnDescription"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetAddOnDescription"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetAddOnDescription(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDescription(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDescription(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDescription(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDescription(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDescription(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDescription(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDescription(f);
							}
						} else {
							callback.receiveErrorgetAddOnDescription(f);
						}
					} else {
						callback.receiveErrorgetAddOnDescription(f);
					}
				} else {
					callback.receiveErrorgetAddOnDescription(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAddOnDescription(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[8].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[8].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#resetFeeds
	 * @param resetFeeds80
	 */
	public ResetFeedsResponse resetFeeds(
			ResetFeeds resetFeeds80)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/ResetFeeds");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					resetFeeds80,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "resetFeeds")),
					new QName(
							"http://addonservice.curse.com/", "ResetFeeds"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					ResetFeedsResponse.class);

			return (ResetFeedsResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "ResetFeeds"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "ResetFeeds"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "ResetFeeds"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startresetFeeds
	 * @param resetFeeds80
	 */
	public void startresetFeeds(
			ResetFeeds resetFeeds80,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/ResetFeeds");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				resetFeeds80,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "resetFeeds")),
				new QName(
						"http://addonservice.curse.com/", "ResetFeeds"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							ResetFeedsResponse.class);
					callback.receiveResultresetFeeds((ResetFeedsResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorresetFeeds(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(), "ResetFeeds"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"ResetFeeds"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"ResetFeeds"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorresetFeeds(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetFeeds(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetFeeds(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetFeeds(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetFeeds(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetFeeds(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetFeeds(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetFeeds(f);
							}
						} else {
							callback.receiveErrorresetFeeds(f);
						}
					} else {
						callback.receiveErrorresetFeeds(f);
					}
				} else {
					callback.receiveErrorresetFeeds(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorresetFeeds(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[9].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[9].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#leaveSyncGroup
	 * @param leaveSyncGroup82
	 */
	public LeaveSyncGroupResponse leaveSyncGroup(
			LeaveSyncGroup leaveSyncGroup82)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/LeaveSyncGroup");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					leaveSyncGroup82,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "leaveSyncGroup")),
					new QName(
							"http://addonservice.curse.com/", "LeaveSyncGroup"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					LeaveSyncGroupResponse.class);

			return (LeaveSyncGroupResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "LeaveSyncGroup"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "LeaveSyncGroup"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "LeaveSyncGroup"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startleaveSyncGroup
	 * @param leaveSyncGroup82
	 */
	public void startleaveSyncGroup(
			LeaveSyncGroup leaveSyncGroup82,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/LeaveSyncGroup");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				leaveSyncGroup82,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "leaveSyncGroup")),
				new QName(
						"http://addonservice.curse.com/", "LeaveSyncGroup"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							LeaveSyncGroupResponse.class);
					callback.receiveResultleaveSyncGroup((LeaveSyncGroupResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorleaveSyncGroup(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"LeaveSyncGroup"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"LeaveSyncGroup"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"LeaveSyncGroup"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorleaveSyncGroup(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorleaveSyncGroup(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorleaveSyncGroup(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorleaveSyncGroup(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorleaveSyncGroup(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorleaveSyncGroup(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorleaveSyncGroup(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorleaveSyncGroup(f);
							}
						} else {
							callback.receiveErrorleaveSyncGroup(f);
						}
					} else {
						callback.receiveErrorleaveSyncGroup(f);
					}
				} else {
					callback.receiveErrorleaveSyncGroup(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorleaveSyncGroup(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[10].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[10].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#saveSyncSnapshot
	 * @param saveSyncSnapshot84
	 */
	public SaveSyncSnapshotResponse saveSyncSnapshot(
			SaveSyncSnapshot saveSyncSnapshot84)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/SaveSyncSnapshot");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					saveSyncSnapshot84,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "saveSyncSnapshot")),
					new QName(
							"http://addonservice.curse.com/", "SaveSyncSnapshot"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					SaveSyncSnapshotResponse.class);

			return (SaveSyncSnapshotResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "SaveSyncSnapshot"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "SaveSyncSnapshot"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "SaveSyncSnapshot"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startsaveSyncSnapshot
	 * @param saveSyncSnapshot84
	 */
	public void startsaveSyncSnapshot(
			SaveSyncSnapshot saveSyncSnapshot84,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/SaveSyncSnapshot");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				saveSyncSnapshot84,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "saveSyncSnapshot")),
				new QName(
						"http://addonservice.curse.com/", "SaveSyncSnapshot"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							SaveSyncSnapshotResponse.class);
					callback.receiveResultsaveSyncSnapshot((SaveSyncSnapshotResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorsaveSyncSnapshot(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"SaveSyncSnapshot"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"SaveSyncSnapshot"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"SaveSyncSnapshot"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorsaveSyncSnapshot(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncSnapshot(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncSnapshot(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncSnapshot(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncSnapshot(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncSnapshot(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncSnapshot(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorsaveSyncSnapshot(f);
							}
						} else {
							callback.receiveErrorsaveSyncSnapshot(f);
						}
					} else {
						callback.receiveErrorsaveSyncSnapshot(f);
					}
				} else {
					callback.receiveErrorsaveSyncSnapshot(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorsaveSyncSnapshot(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[11].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[11].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getAddOnDump
	 * @param getAddOnDump86
	 */
	public GetAddOnDumpResponse getAddOnDump(
			GetAddOnDump getAddOnDump86)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetAddOnDump");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getAddOnDump86,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "getAddOnDump")),
					new QName(
							"http://addonservice.curse.com/", "GetAddOnDump"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetAddOnDumpResponse.class);

			return (GetAddOnDumpResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "GetAddOnDump"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAddOnDump"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAddOnDump"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetAddOnDump
	 * @param getAddOnDump86
	 */
	public void startgetAddOnDump(
			GetAddOnDump getAddOnDump86,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetAddOnDump");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getAddOnDump86,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "getAddOnDump")),
				new QName(
						"http://addonservice.curse.com/", "GetAddOnDump"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetAddOnDumpResponse.class);
					callback.receiveResultgetAddOnDump((GetAddOnDumpResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetAddOnDump(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(), "GetAddOnDump"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetAddOnDump"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetAddOnDump"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetAddOnDump(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDump(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDump(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDump(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDump(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDump(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDump(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnDump(f);
							}
						} else {
							callback.receiveErrorgetAddOnDump(f);
						}
					} else {
						callback.receiveErrorgetAddOnDump(f);
					}
				} else {
					callback.receiveErrorgetAddOnDump(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAddOnDump(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[12].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[12].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getAddOns
	 * @param getAddOns88
	 */
	public GetAddOnsResponse getAddOns(
			GetAddOns getAddOns88)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetAddOns");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getAddOns88,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "getAddOns")),
					new QName(
							"http://addonservice.curse.com/", "GetAddOns"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetAddOnsResponse.class);

			return (GetAddOnsResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "GetAddOns"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAddOns"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAddOns"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetAddOns
	 * @param getAddOns88
	 */
	public void startgetAddOns(GetAddOns getAddOns88,
							   final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetAddOns");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getAddOns88,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "getAddOns")),
				new QName(
						"http://addonservice.curse.com/", "GetAddOns"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetAddOnsResponse.class);
					callback.receiveResultgetAddOns((GetAddOnsResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetAddOns(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(), "GetAddOns"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(), "GetAddOns"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(), "GetAddOns"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetAddOns(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOns(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOns(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOns(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOns(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOns(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOns(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOns(f);
							}
						} else {
							callback.receiveErrorgetAddOns(f);
						}
					} else {
						callback.receiveErrorgetAddOns(f);
					}
				} else {
					callback.receiveErrorgetAddOns(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAddOns(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[13].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[13].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getDownloadToken
	 * @param getDownloadToken90
	 */
	public GetDownloadTokenResponse getDownloadToken(
			GetDownloadToken getDownloadToken90)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetDownloadToken");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getDownloadToken90,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "getDownloadToken")),
					new QName(
							"http://addonservice.curse.com/", "GetDownloadToken"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetDownloadTokenResponse.class);

			return (GetDownloadTokenResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "GetDownloadToken"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "GetDownloadToken"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "GetDownloadToken"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetDownloadToken
	 * @param getDownloadToken90
	 */
	public void startgetDownloadToken(
			GetDownloadToken getDownloadToken90,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetDownloadToken");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getDownloadToken90,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "getDownloadToken")),
				new QName(
						"http://addonservice.curse.com/", "GetDownloadToken"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetDownloadTokenResponse.class);
					callback.receiveResultgetDownloadToken((GetDownloadTokenResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetDownloadToken(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"GetDownloadToken"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetDownloadToken"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetDownloadToken"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetDownloadToken(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDownloadToken(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDownloadToken(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDownloadToken(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDownloadToken(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDownloadToken(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDownloadToken(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetDownloadToken(f);
							}
						} else {
							callback.receiveErrorgetDownloadToken(f);
						}
					} else {
						callback.receiveErrorgetDownloadToken(f);
					}
				} else {
					callback.receiveErrorgetDownloadToken(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetDownloadToken(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[14].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[14].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#v2GetChangeLog
	 * @param v2GetChangeLog92
	 */
	public V2GetChangeLogResponse v2GetChangeLog(
			V2GetChangeLog v2GetChangeLog92)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/v2GetChangeLog");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					v2GetChangeLog92,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "v2GetChangeLog")),
					new QName(
							"http://addonservice.curse.com/", "v2GetChangeLog"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					V2GetChangeLogResponse.class);

			return (V2GetChangeLogResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "v2GetChangeLog"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "v2GetChangeLog"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "v2GetChangeLog"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startv2GetChangeLog
	 * @param v2GetChangeLog92
	 */
	public void startv2GetChangeLog(
			V2GetChangeLog v2GetChangeLog92,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/v2GetChangeLog");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				v2GetChangeLog92,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "v2GetChangeLog")),
				new QName(
						"http://addonservice.curse.com/", "v2GetChangeLog"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							V2GetChangeLogResponse.class);
					callback.receiveResultv2GetChangeLog((V2GetChangeLogResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorv2GetChangeLog(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"v2GetChangeLog"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"v2GetChangeLog"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"v2GetChangeLog"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorv2GetChangeLog(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetChangeLog(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetChangeLog(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetChangeLog(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetChangeLog(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetChangeLog(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetChangeLog(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetChangeLog(f);
							}
						} else {
							callback.receiveErrorv2GetChangeLog(f);
						}
					} else {
						callback.receiveErrorv2GetChangeLog(f);
					}
				} else {
					callback.receiveErrorv2GetChangeLog(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorv2GetChangeLog(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[15].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[15].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#v2GetAddOns
	 * @param v2GetAddOns94
	 */
	public V2GetAddOnsResponse v2GetAddOns(
			V2GetAddOns v2GetAddOns94)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/v2GetAddOns");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					v2GetAddOns94,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "v2GetAddOns")),
					new QName(
							"http://addonservice.curse.com/", "v2GetAddOns"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					V2GetAddOnsResponse.class);

			return (V2GetAddOnsResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "v2GetAddOns"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "v2GetAddOns"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "v2GetAddOns"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startv2GetAddOns
	 * @param v2GetAddOns94
	 */
	public void startv2GetAddOns(
			V2GetAddOns v2GetAddOns94,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/v2GetAddOns");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				v2GetAddOns94,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "v2GetAddOns")),
				new QName(
						"http://addonservice.curse.com/", "v2GetAddOns"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							V2GetAddOnsResponse.class);
					callback.receiveResultv2GetAddOns((V2GetAddOnsResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorv2GetAddOns(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(), "v2GetAddOns"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"v2GetAddOns"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"v2GetAddOns"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorv2GetAddOns(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOns(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOns(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOns(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOns(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOns(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOns(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOns(f);
							}
						} else {
							callback.receiveErrorv2GetAddOns(f);
						}
					} else {
						callback.receiveErrorv2GetAddOns(f);
					}
				} else {
					callback.receiveErrorv2GetAddOns(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorv2GetAddOns(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[16].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[16].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getAddOnFile
	 * @param getAddOnFile96
	 */
	public GetAddOnFileResponse getAddOnFile(
			GetAddOnFile getAddOnFile96)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetAddOnFile");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getAddOnFile96,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "getAddOnFile")),
					new QName(
							"http://addonservice.curse.com/", "GetAddOnFile"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetAddOnFileResponse.class);

			return (GetAddOnFileResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "GetAddOnFile"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAddOnFile"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAddOnFile"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetAddOnFile
	 * @param getAddOnFile96
	 */
	public void startgetAddOnFile(
			GetAddOnFile getAddOnFile96,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetAddOnFile");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getAddOnFile96,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "getAddOnFile")),
				new QName(
						"http://addonservice.curse.com/", "GetAddOnFile"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetAddOnFileResponse.class);
					callback.receiveResultgetAddOnFile((GetAddOnFileResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetAddOnFile(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(), "GetAddOnFile"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetAddOnFile"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetAddOnFile"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetAddOnFile(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFile(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFile(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFile(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFile(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFile(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFile(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFile(f);
							}
						} else {
							callback.receiveErrorgetAddOnFile(f);
						}
					} else {
						callback.receiveErrorgetAddOnFile(f);
					}
				} else {
					callback.receiveErrorgetAddOnFile(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAddOnFile(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[17].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[17].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getChangeLog
	 * @param getChangeLog98
	 */
	public GetChangeLogResponse getChangeLog(
			GetChangeLog getChangeLog98)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetChangeLog");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getChangeLog98,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "getChangeLog")),
					new QName(
							"http://addonservice.curse.com/", "GetChangeLog"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetChangeLogResponse.class);

			return (GetChangeLogResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "GetChangeLog"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "GetChangeLog"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "GetChangeLog"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetChangeLog
	 * @param getChangeLog98
	 */
	public void startgetChangeLog(
			GetChangeLog getChangeLog98,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetChangeLog");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getChangeLog98,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "getChangeLog")),
				new QName(
						"http://addonservice.curse.com/", "GetChangeLog"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetChangeLogResponse.class);
					callback.receiveResultgetChangeLog((GetChangeLogResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetChangeLog(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(), "GetChangeLog"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetChangeLog"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetChangeLog"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetChangeLog(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetChangeLog(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetChangeLog(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetChangeLog(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetChangeLog(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetChangeLog(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetChangeLog(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetChangeLog(f);
							}
						} else {
							callback.receiveErrorgetChangeLog(f);
						}
					} else {
						callback.receiveErrorgetChangeLog(f);
					}
				} else {
					callback.receiveErrorgetChangeLog(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetChangeLog(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[18].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[18].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getSyncProfile
	 * @param getSyncProfile100
	 */
	public GetSyncProfileResponse getSyncProfile(
			GetSyncProfile getSyncProfile100)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetSyncProfile");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getSyncProfile100,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "getSyncProfile")),
					new QName(
							"http://addonservice.curse.com/", "GetSyncProfile"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetSyncProfileResponse.class);

			return (GetSyncProfileResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "GetSyncProfile"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "GetSyncProfile"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "GetSyncProfile"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetSyncProfile
	 * @param getSyncProfile100
	 */
	public void startgetSyncProfile(
			GetSyncProfile getSyncProfile100,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetSyncProfile");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getSyncProfile100,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "getSyncProfile")),
				new QName(
						"http://addonservice.curse.com/", "GetSyncProfile"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetSyncProfileResponse.class);
					callback.receiveResultgetSyncProfile((GetSyncProfileResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetSyncProfile(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"GetSyncProfile"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetSyncProfile"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetSyncProfile"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetSyncProfile(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSyncProfile(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSyncProfile(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSyncProfile(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSyncProfile(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSyncProfile(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSyncProfile(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetSyncProfile(f);
							}
						} else {
							callback.receiveErrorgetSyncProfile(f);
						}
					} else {
						callback.receiveErrorgetSyncProfile(f);
					}
				} else {
					callback.receiveErrorgetSyncProfile(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetSyncProfile(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[19].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[19].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getAllFilesForAddOn
	 * @param getAllFilesForAddOn102
	 */
	public GetAllFilesForAddOnResponse getAllFilesForAddOn(
			GetAllFilesForAddOn getAllFilesForAddOn102)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetAllFilesForAddOn");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getAllFilesForAddOn102,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/",
									"getAllFilesForAddOn")),
					new QName(
							"http://addonservice.curse.com/", "GetAllFilesForAddOn"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetAllFilesForAddOnResponse.class);

			return (GetAllFilesForAddOnResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "GetAllFilesForAddOn"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAllFilesForAddOn"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAllFilesForAddOn"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetAllFilesForAddOn
	 * @param getAllFilesForAddOn102
	 */
	public void startgetAllFilesForAddOn(
			GetAllFilesForAddOn getAllFilesForAddOn102,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetAllFilesForAddOn");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getAllFilesForAddOn102,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "getAllFilesForAddOn")),
				new QName(
						"http://addonservice.curse.com/", "GetAllFilesForAddOn"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetAllFilesForAddOnResponse.class);
					callback.receiveResultgetAllFilesForAddOn((GetAllFilesForAddOnResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetAllFilesForAddOn(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"GetAllFilesForAddOn"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetAllFilesForAddOn"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetAllFilesForAddOn"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetAllFilesForAddOn(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAllFilesForAddOn(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAllFilesForAddOn(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAllFilesForAddOn(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAllFilesForAddOn(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAllFilesForAddOn(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAllFilesForAddOn(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAllFilesForAddOn(f);
							}
						} else {
							callback.receiveErrorgetAllFilesForAddOn(f);
						}
					} else {
						callback.receiveErrorgetAllFilesForAddOn(f);
					}
				} else {
					callback.receiveErrorgetAllFilesForAddOn(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAllFilesForAddOn(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[20].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[20].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getFuzzyMatches
	 * @param getFuzzyMatches104
	 */
	public GetFuzzyMatchesResponse getFuzzyMatches(
			GetFuzzyMatches getFuzzyMatches104)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetFuzzyMatches");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getFuzzyMatches104,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "getFuzzyMatches")),
					new QName(
							"http://addonservice.curse.com/", "GetFuzzyMatches"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetFuzzyMatchesResponse.class);

			return (GetFuzzyMatchesResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "GetFuzzyMatches"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "GetFuzzyMatches"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "GetFuzzyMatches"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetFuzzyMatches
	 * @param getFuzzyMatches104
	 */
	public void startgetFuzzyMatches(
			GetFuzzyMatches getFuzzyMatches104,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetFuzzyMatches");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getFuzzyMatches104,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "getFuzzyMatches")),
				new QName(
						"http://addonservice.curse.com/", "GetFuzzyMatches"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetFuzzyMatchesResponse.class);
					callback.receiveResultgetFuzzyMatches((GetFuzzyMatchesResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetFuzzyMatches(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"GetFuzzyMatches"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetFuzzyMatches"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetFuzzyMatches"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetFuzzyMatches(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFuzzyMatches(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFuzzyMatches(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFuzzyMatches(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFuzzyMatches(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFuzzyMatches(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFuzzyMatches(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetFuzzyMatches(f);
							}
						} else {
							callback.receiveErrorgetFuzzyMatches(f);
						}
					} else {
						callback.receiveErrorgetFuzzyMatches(f);
					}
				} else {
					callback.receiveErrorgetFuzzyMatches(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetFuzzyMatches(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[21].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[21].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#joinSyncGroup
	 * @param joinSyncGroup106
	 */
	public JoinSyncGroupResponse joinSyncGroup(
			JoinSyncGroup joinSyncGroup106)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/JoinSyncGroup");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					joinSyncGroup106,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "joinSyncGroup")),
					new QName(
							"http://addonservice.curse.com/", "JoinSyncGroup"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					JoinSyncGroupResponse.class);

			return (JoinSyncGroupResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "JoinSyncGroup"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "JoinSyncGroup"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "JoinSyncGroup"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startjoinSyncGroup
	 * @param joinSyncGroup106
	 */
	public void startjoinSyncGroup(
			JoinSyncGroup joinSyncGroup106,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/JoinSyncGroup");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				joinSyncGroup106,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "joinSyncGroup")),
				new QName(
						"http://addonservice.curse.com/", "JoinSyncGroup"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							JoinSyncGroupResponse.class);
					callback.receiveResultjoinSyncGroup((JoinSyncGroupResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorjoinSyncGroup(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(), "JoinSyncGroup"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"JoinSyncGroup"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"JoinSyncGroup"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorjoinSyncGroup(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorjoinSyncGroup(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorjoinSyncGroup(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorjoinSyncGroup(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorjoinSyncGroup(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorjoinSyncGroup(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorjoinSyncGroup(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorjoinSyncGroup(f);
							}
						} else {
							callback.receiveErrorjoinSyncGroup(f);
						}
					} else {
						callback.receiveErrorjoinSyncGroup(f);
					}
				} else {
					callback.receiveErrorjoinSyncGroup(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorjoinSyncGroup(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[22].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[22].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#listFeeds
	 * @param listFeeds108
	 */
	public ListFeedsResponse listFeeds(
			ListFeeds listFeeds108)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/ListFeeds");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					listFeeds108,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "listFeeds")),
					new QName(
							"http://addonservice.curse.com/", "ListFeeds"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					ListFeedsResponse.class);

			return (ListFeedsResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "ListFeeds"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "ListFeeds"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "ListFeeds"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startlistFeeds
	 * @param listFeeds108
	 */
	public void startlistFeeds(ListFeeds listFeeds108,
							   final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/ListFeeds");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				listFeeds108,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "listFeeds")),
				new QName(
						"http://addonservice.curse.com/", "ListFeeds"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							ListFeedsResponse.class);
					callback.receiveResultlistFeeds((ListFeedsResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorlistFeeds(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(), "ListFeeds"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(), "ListFeeds"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(), "ListFeeds"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorlistFeeds(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlistFeeds(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlistFeeds(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlistFeeds(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlistFeeds(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlistFeeds(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlistFeeds(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlistFeeds(f);
							}
						} else {
							callback.receiveErrorlistFeeds(f);
						}
					} else {
						callback.receiveErrorlistFeeds(f);
					}
				} else {
					callback.receiveErrorlistFeeds(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorlistFeeds(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[23].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[23].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getAddOnFiles
	 * @param getAddOnFiles110
	 */
	public GetAddOnFilesResponse getAddOnFiles(
			GetAddOnFiles getAddOnFiles110)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetAddOnFiles");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getAddOnFiles110,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "getAddOnFiles")),
					new QName(
							"http://addonservice.curse.com/", "GetAddOnFiles"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetAddOnFilesResponse.class);

			return (GetAddOnFilesResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "GetAddOnFiles"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAddOnFiles"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAddOnFiles"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetAddOnFiles
	 * @param getAddOnFiles110
	 */
	public void startgetAddOnFiles(
			GetAddOnFiles getAddOnFiles110,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetAddOnFiles");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getAddOnFiles110,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "getAddOnFiles")),
				new QName(
						"http://addonservice.curse.com/", "GetAddOnFiles"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetAddOnFilesResponse.class);
					callback.receiveResultgetAddOnFiles((GetAddOnFilesResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetAddOnFiles(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(), "GetAddOnFiles"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetAddOnFiles"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"GetAddOnFiles"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetAddOnFiles(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFiles(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFiles(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFiles(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFiles(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFiles(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFiles(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOnFiles(f);
							}
						} else {
							callback.receiveErrorgetAddOnFiles(f);
						}
					} else {
						callback.receiveErrorgetAddOnFiles(f);
					}
				} else {
					callback.receiveErrorgetAddOnFiles(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAddOnFiles(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[24].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[24].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#v2GetAddOnDescription
	 * @param v2GetAddOnDescription112
	 */
	public V2GetAddOnDescriptionResponse v2GetAddOnDescription(
			V2GetAddOnDescription v2GetAddOnDescription112)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/v2GetAddOnDescription");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					v2GetAddOnDescription112,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/",
									"v2GetAddOnDescription")),
					new QName(
							"http://addonservice.curse.com/",
							"v2GetAddOnDescription"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					V2GetAddOnDescriptionResponse.class);

			return (V2GetAddOnDescriptionResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "v2GetAddOnDescription"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "v2GetAddOnDescription"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "v2GetAddOnDescription"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startv2GetAddOnDescription
	 * @param v2GetAddOnDescription112
	 */
	public void startv2GetAddOnDescription(
			V2GetAddOnDescription v2GetAddOnDescription112,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/v2GetAddOnDescription");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				v2GetAddOnDescription112,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/",
								"v2GetAddOnDescription")),
				new QName(
						"http://addonservice.curse.com/", "v2GetAddOnDescription"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							V2GetAddOnDescriptionResponse.class);
					callback.receiveResultv2GetAddOnDescription((V2GetAddOnDescriptionResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorv2GetAddOnDescription(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"v2GetAddOnDescription"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"v2GetAddOnDescription"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"v2GetAddOnDescription"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorv2GetAddOnDescription(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOnDescription(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOnDescription(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOnDescription(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOnDescription(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOnDescription(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOnDescription(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorv2GetAddOnDescription(f);
							}
						} else {
							callback.receiveErrorv2GetAddOnDescription(f);
						}
					} else {
						callback.receiveErrorv2GetAddOnDescription(f);
					}
				} else {
					callback.receiveErrorv2GetAddOnDescription(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorv2GetAddOnDescription(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[25].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[25].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#resetSingleAddonCache
	 * @param resetSingleAddonCache114
	 */
	public ResetSingleAddonCacheResponse resetSingleAddonCache(
			ResetSingleAddonCache resetSingleAddonCache114)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/ResetSingleAddonCache");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					resetSingleAddonCache114,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/",
									"resetSingleAddonCache")),
					new QName(
							"http://addonservice.curse.com/",
							"ResetSingleAddonCache"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					ResetSingleAddonCacheResponse.class);

			return (ResetSingleAddonCacheResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "ResetSingleAddonCache"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "ResetSingleAddonCache"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "ResetSingleAddonCache"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startresetSingleAddonCache
	 * @param resetSingleAddonCache114
	 */
	public void startresetSingleAddonCache(
			ResetSingleAddonCache resetSingleAddonCache114,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/ResetSingleAddonCache");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				resetSingleAddonCache114,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/",
								"resetSingleAddonCache")),
				new QName(
						"http://addonservice.curse.com/", "ResetSingleAddonCache"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							ResetSingleAddonCacheResponse.class);
					callback.receiveResultresetSingleAddonCache((ResetSingleAddonCacheResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorresetSingleAddonCache(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"ResetSingleAddonCache"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"ResetSingleAddonCache"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"ResetSingleAddonCache"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorresetSingleAddonCache(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetSingleAddonCache(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetSingleAddonCache(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetSingleAddonCache(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetSingleAddonCache(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetSingleAddonCache(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetSingleAddonCache(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetSingleAddonCache(f);
							}
						} else {
							callback.receiveErrorresetSingleAddonCache(f);
						}
					} else {
						callback.receiveErrorresetSingleAddonCache(f);
					}
				} else {
					callback.receiveErrorresetSingleAddonCache(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorresetSingleAddonCache(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[26].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[26].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#getAddOn
	 * @param getAddOn116
	 */
	public GetAddOnResponse getAddOn(
			GetAddOn getAddOn116)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/GetAddOn");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					getAddOn116,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "getAddOn")),
					new QName(
							"http://addonservice.curse.com/", "GetAddOn"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					GetAddOnResponse.class);

			return (GetAddOnResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "GetAddOn"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAddOn"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "GetAddOn"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startgetAddOn
	 * @param getAddOn116
	 */
	public void startgetAddOn(GetAddOn getAddOn116,
							  final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/GetAddOn");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				getAddOn116,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "getAddOn")),
				new QName(
						"http://addonservice.curse.com/", "GetAddOn"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							GetAddOnResponse.class);
					callback.receiveResultgetAddOn((GetAddOnResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorgetAddOn(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(), "GetAddOn"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(), "GetAddOn"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(), "GetAddOn"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorgetAddOn(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOn(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOn(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOn(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOn(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOn(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOn(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorgetAddOn(f);
							}
						} else {
							callback.receiveErrorgetAddOn(f);
						}
					} else {
						callback.receiveErrorgetAddOn(f);
					}
				} else {
					callback.receiveErrorgetAddOn(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAddOn(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[27].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[27].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#logDump
	 * @param logDump118
	 */
	public LogDumpResponse logDump(
			LogDump logDump118)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/LogDump");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					logDump118,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/", "logDump")),
					new QName(
							"http://addonservice.curse.com/", "LogDump"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					LogDumpResponse.class);

			return (LogDumpResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "LogDump"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "LogDump"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "LogDump"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startlogDump
	 * @param logDump118
	 */
	public void startlogDump(LogDump logDump118,
							 final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/LogDump");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				logDump118,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "logDump")),
				new QName(
						"http://addonservice.curse.com/", "LogDump"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							LogDumpResponse.class);
					callback.receiveResultlogDump((LogDumpResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorlogDump(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(), "LogDump"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(), "LogDump"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(), "LogDump"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorlogDump(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogDump(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogDump(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogDump(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogDump(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogDump(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogDump(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorlogDump(f);
							}
						} else {
							callback.receiveErrorlogDump(f);
						}
					} else {
						callback.receiveErrorlogDump(f);
					}
				} else {
					callback.receiveErrorlogDump(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorlogDump(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[28].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[28].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#serviceHealthCheck
	 * @param serviceHealthCheck120
	 */
	public ServiceHealthCheckResponse serviceHealthCheck(
			ServiceHealthCheck serviceHealthCheck120)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/ServiceHealthCheck");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					serviceHealthCheck120,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/",
									"serviceHealthCheck")),
					new QName(
							"http://addonservice.curse.com/", "ServiceHealthCheck"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					ServiceHealthCheckResponse.class);

			return (ServiceHealthCheckResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "ServiceHealthCheck"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "ServiceHealthCheck"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "ServiceHealthCheck"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startserviceHealthCheck
	 * @param serviceHealthCheck120
	 */
	public void startserviceHealthCheck(
			ServiceHealthCheck serviceHealthCheck120,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/ServiceHealthCheck");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				serviceHealthCheck120,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "serviceHealthCheck")),
				new QName(
						"http://addonservice.curse.com/", "ServiceHealthCheck"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							ServiceHealthCheckResponse.class);
					callback.receiveResultserviceHealthCheck((ServiceHealthCheckResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorserviceHealthCheck(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"ServiceHealthCheck"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"ServiceHealthCheck"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"ServiceHealthCheck"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorserviceHealthCheck(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorserviceHealthCheck(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorserviceHealthCheck(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorserviceHealthCheck(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorserviceHealthCheck(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorserviceHealthCheck(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorserviceHealthCheck(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorserviceHealthCheck(f);
							}
						} else {
							callback.receiveErrorserviceHealthCheck(f);
						}
					} else {
						callback.receiveErrorserviceHealthCheck(f);
					}
				} else {
					callback.receiveErrorserviceHealthCheck(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorserviceHealthCheck(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[29].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[29].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @see AddOnService#resetAllAddonCache
	 * @param resetAllAddonCache122
	 */
	public ResetAllAddonCacheResponse resetAllAddonCache(
			ResetAllAddonCache resetAllAddonCache122)
			throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
			_operationClient.getOptions()
					.setAction("http://addonservice.curse.com/IAddOnService/ResetAllAddonCache");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create SOAP envelope with that payload
			SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
					resetAllAddonCache122,
					optimizeContent(
							new QName(
									"http://addonservice.curse.com/",
									"resetAllAddonCache")),
					new QName(
							"http://addonservice.curse.com/", "ResetAllAddonCache"));

			//adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			//execute the operation client
			_operationClient.execute(true);

			MessageContext _returnMessageContext = _operationClient.getMessageContext(WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			Object object = fromOM(_returnEnv.getBody()
							.getFirstElement(),
					ResetAllAddonCacheResponse.class);

			return (ResetAllAddonCacheResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(
						new FaultMapKey(
								faultElt.getQName(), "ResetAllAddonCache"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
								faultElt.getQName(), "ResetAllAddonCache"));
						Class exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
								faultElt.getQName(), "ResetAllAddonCache"));
						Class messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt,
								messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage",
								new Class[]{messageClass});
						m.invoke(ex, new Object[]{messageObject});

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender()
						.cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#startresetAllAddonCache
	 * @param resetAllAddonCache122
	 */
	public void startresetAllAddonCache(
			ResetAllAddonCache resetAllAddonCache122,
			final AddOnServiceCallbackHandler callback)
			throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
		_operationClient.getOptions()
				.setAction("http://addonservice.curse.com/IAddOnService/ResetAllAddonCache");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient,
				WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		SOAPEnvelope env = null;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions()
						.getSoapVersionURI()),
				resetAllAddonCache122,
				optimizeContent(
						new QName(
								"http://addonservice.curse.com/", "resetAllAddonCache")),
				new QName(
						"http://addonservice.curse.com/", "ResetAllAddonCache"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(
					MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody()
									.getFirstElement(),
							ResetAllAddonCacheResponse.class);
					callback.receiveResultresetAllAddonCache((ResetAllAddonCacheResponse) object);
				} catch (AxisFault e) {
					callback.receiveErrorresetAllAddonCache(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(
								new FaultMapKey(
										faultElt.getQName(),
										"ResetAllAddonCache"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = (String) faultExceptionClassNameMap.get(new FaultMapKey(
										faultElt.getQName(),
										"ResetAllAddonCache"));
								Class exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = (String) faultMessageMap.get(new FaultMapKey(
										faultElt.getQName(),
										"ResetAllAddonCache"));
								Class messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt,
										messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage",
										new Class[]{messageClass});
								m.invoke(ex,
										new Object[]{messageObject});

								callback.receiveErrorresetAllAddonCache(new RemoteException(
										ex.getMessage(), ex));
							} catch (ClassCastException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetAllAddonCache(f);
							} catch (ClassNotFoundException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetAllAddonCache(f);
							} catch (NoSuchMethodException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetAllAddonCache(f);
							} catch (InvocationTargetException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetAllAddonCache(f);
							} catch (IllegalAccessException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetAllAddonCache(f);
							} catch (InstantiationException e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetAllAddonCache(f);
							} catch (AxisFault e) {
								// we cannot intantiate the class - throw the original Axis fault
								callback.receiveErrorresetAllAddonCache(f);
							}
						} else {
							callback.receiveErrorresetAllAddonCache(f);
						}
					} else {
						callback.receiveErrorresetAllAddonCache(f);
					}
				} else {
					callback.receiveErrorresetAllAddonCache(error);
				}
			}

			public void onFault(
					MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
							.cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorresetAllAddonCache(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver = null;

		if ((_operations[30].getMessageReceiver() == null) &&
				_operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[30].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	////////////////////////////////////////////////////////////////////////
	private static Policy getPolicy(
			String policyString) {
		return PolicyEngine.getPolicy(OMXMLBuilderFactory.createOMBuilder(
				new StringReader(policyString)).getDocument()
				.getXMLStreamReader(false));
	}

	private boolean optimizeContent(QName opName) {
		if (opNameArray == null) {
			return false;
		}

		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}

		return false;
	}

	//http://addons.forgesvc.net/AddOnService.svc/binary
	private OMElement toOM(
			CreateSyncGroup param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(CreateSyncGroup.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			CreateSyncGroupResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(CreateSyncGroupResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetSecureDownloadToken param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetSecureDownloadToken.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetSecureDownloadTokenResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetSecureDownloadTokenResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			HealthCheck param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(HealthCheck.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			HealthCheckResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(HealthCheckResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetFingerprintMatches param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetFingerprintMatches.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetFingerprintMatchesResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetFingerprintMatchesResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			SaveSyncTransactions param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(SaveSyncTransactions.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			SaveSyncTransactionsResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(SaveSyncTransactionsResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetRepositoryMatchFromSlug param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetRepositoryMatchFromSlug.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetRepositoryMatchFromSlugResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetRepositoryMatchFromSlugResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			V2GetFingerprintMatches param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(V2GetFingerprintMatches.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			V2GetFingerprintMatchesResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(V2GetFingerprintMatchesResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			CacheHealthCheck param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(CacheHealthCheck.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			CacheHealthCheckResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(CacheHealthCheckResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAddOnDescription param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetAddOnDescription.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAddOnDescriptionResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetAddOnDescriptionResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			ResetFeeds param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(ResetFeeds.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			ResetFeedsResponse param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(ResetFeedsResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			LeaveSyncGroup param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(LeaveSyncGroup.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			LeaveSyncGroupResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(LeaveSyncGroupResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			SaveSyncSnapshot param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(SaveSyncSnapshot.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			SaveSyncSnapshotResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(SaveSyncSnapshotResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAddOnDump param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(GetAddOnDump.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAddOnDumpResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetAddOnDumpResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAddOns param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(GetAddOns.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAddOnsResponse param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(GetAddOnsResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetDownloadToken param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(GetDownloadToken.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetDownloadTokenResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetDownloadTokenResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			V2GetChangeLog param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(V2GetChangeLog.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			V2GetChangeLogResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(V2GetChangeLogResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			V2GetAddOns param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(V2GetAddOns.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			V2GetAddOnsResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(V2GetAddOnsResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAddOnFile param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(GetAddOnFile.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAddOnFileResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetAddOnFileResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetChangeLog param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(GetChangeLog.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetChangeLogResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetChangeLogResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetSyncProfile param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(GetSyncProfile.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetSyncProfileResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetSyncProfileResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAllFilesForAddOn param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetAllFilesForAddOn.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAllFilesForAddOnResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetAllFilesForAddOnResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetFuzzyMatches param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(GetFuzzyMatches.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetFuzzyMatchesResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetFuzzyMatchesResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			JoinSyncGroup param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(JoinSyncGroup.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			JoinSyncGroupResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(JoinSyncGroupResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			ListFeeds param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(ListFeeds.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			ListFeedsResponse param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(ListFeedsResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAddOnFiles param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(GetAddOnFiles.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAddOnFilesResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(GetAddOnFilesResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			V2GetAddOnDescription param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(V2GetAddOnDescription.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			V2GetAddOnDescriptionResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(V2GetAddOnDescriptionResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			ResetSingleAddonCache param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(ResetSingleAddonCache.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			ResetSingleAddonCacheResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(ResetSingleAddonCacheResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAddOn param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(GetAddOn.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			GetAddOnResponse param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(GetAddOnResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			LogDump param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(LogDump.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			LogDumpResponse param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(LogDumpResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			ServiceHealthCheck param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(ServiceHealthCheck.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			ServiceHealthCheckResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(ServiceHealthCheckResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			ResetAllAddonCache param, boolean optimizeContent)
			throws AxisFault {
		try {
			return param.getOMElement(ResetAllAddonCache.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private OMElement toOM(
			ResetAllAddonCacheResponse param,
			boolean optimizeContent) throws AxisFault {
		try {
			return param.getOMElement(ResetAllAddonCacheResponse.MY_QNAME,
					OMAbstractFactory.getOMFactory());
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			CreateSyncGroup param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							CreateSyncGroup.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetSecureDownloadToken param,
			boolean optimizeContent, QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetSecureDownloadToken.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			HealthCheck param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							HealthCheck.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetFingerprintMatches param,
			boolean optimizeContent, QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetFingerprintMatches.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			SaveSyncTransactions param,
			boolean optimizeContent, QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							SaveSyncTransactions.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetRepositoryMatchFromSlug param,
			boolean optimizeContent, QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetRepositoryMatchFromSlug.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			V2GetFingerprintMatches param,
			boolean optimizeContent, QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							V2GetFingerprintMatches.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			CacheHealthCheck param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							CacheHealthCheck.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetAddOnDescription param,
			boolean optimizeContent, QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetAddOnDescription.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			ResetFeeds param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							ResetFeeds.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			LeaveSyncGroup param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							LeaveSyncGroup.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			SaveSyncSnapshot param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							SaveSyncSnapshot.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetAddOnDump param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetAddOnDump.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetAddOns param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetAddOns.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetDownloadToken param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetDownloadToken.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			V2GetChangeLog param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							V2GetChangeLog.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			V2GetAddOns param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							V2GetAddOns.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetAddOnFile param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetAddOnFile.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetChangeLog param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetChangeLog.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetSyncProfile param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetSyncProfile.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetAllFilesForAddOn param,
			boolean optimizeContent, QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetAllFilesForAddOn.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetFuzzyMatches param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetFuzzyMatches.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			JoinSyncGroup param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							JoinSyncGroup.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			ListFeeds param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							ListFeeds.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetAddOnFiles param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetAddOnFiles.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			V2GetAddOnDescription param,
			boolean optimizeContent, QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							V2GetAddOnDescription.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			ResetSingleAddonCache param,
			boolean optimizeContent, QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							ResetSingleAddonCache.MY_QNAME,
							factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			GetAddOn param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							GetAddOn.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			LogDump param, boolean optimizeContent,
			QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							LogDump.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			ServiceHealthCheck param,
			boolean optimizeContent, QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							ServiceHealthCheck.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory,
			ResetAllAddonCache param,
			boolean optimizeContent, QName elementQName)
			throws AxisFault {
		try {
			SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope.getBody()
					.addChild(param.getOMElement(
							ResetAllAddonCache.MY_QNAME, factory));

			return emptyEnvelope;
		} catch (ADBException e) {
			throw AxisFault.makeFault(e);
		}
	}

	/* methods to provide back word compatibility */

	/**
	 *  get the default envelope
	 */
	private SOAPEnvelope toEnvelope(
			SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private Object fromOM(OMElement param,
						  Class type) throws AxisFault {
		try {
			if (CacheHealthCheck.class.equals(type)) {
				return CacheHealthCheck.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (CacheHealthCheckResponse.class.equals(
					type)) {
				return CacheHealthCheckResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (CreateSyncGroup.class.equals(type)) {
				return CreateSyncGroup.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (CreateSyncGroupResponse.class.equals(
					type)) {
				return CreateSyncGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAddOn.class.equals(type)) {
				return GetAddOn.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAddOnDescription.class.equals(type)) {
				return GetAddOnDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAddOnDescriptionResponse.class.equals(
					type)) {
				return GetAddOnDescriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAddOnDump.class.equals(type)) {
				return GetAddOnDump.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAddOnDumpResponse.class.equals(type)) {
				return GetAddOnDumpResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAddOnFile.class.equals(type)) {
				return GetAddOnFile.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAddOnFileResponse.class.equals(type)) {
				return GetAddOnFileResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAddOnFiles.class.equals(type)) {
				return GetAddOnFiles.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAddOnFilesResponse.class.equals(type)) {
				return GetAddOnFilesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAddOnResponse.class.equals(type)) {
				return GetAddOnResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAddOns.class.equals(type)) {
				return GetAddOns.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAddOnsResponse.class.equals(type)) {
				return GetAddOnsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAllFilesForAddOn.class.equals(type)) {
				return GetAllFilesForAddOn.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetAllFilesForAddOnResponse.class.equals(
					type)) {
				return GetAllFilesForAddOnResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetChangeLog.class.equals(type)) {
				return GetChangeLog.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetChangeLogResponse.class.equals(type)) {
				return GetChangeLogResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetDownloadToken.class.equals(type)) {
				return GetDownloadToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetDownloadTokenResponse.class.equals(
					type)) {
				return GetDownloadTokenResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetFingerprintMatches.class.equals(type)) {
				return GetFingerprintMatches.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetFingerprintMatchesResponse.class.equals(
					type)) {
				return GetFingerprintMatchesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetFuzzyMatches.class.equals(type)) {
				return GetFuzzyMatches.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetFuzzyMatchesResponse.class.equals(
					type)) {
				return GetFuzzyMatchesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetRepositoryMatchFromSlug.class.equals(
					type)) {
				return GetRepositoryMatchFromSlug.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetRepositoryMatchFromSlugResponse.class.equals(
					type)) {
				return GetRepositoryMatchFromSlugResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetSecureDownloadToken.class.equals(type)) {
				return GetSecureDownloadToken.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetSecureDownloadTokenResponse.class.equals(
					type)) {
				return GetSecureDownloadTokenResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetSyncProfile.class.equals(type)) {
				return GetSyncProfile.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (GetSyncProfileResponse.class.equals(type)) {
				return GetSyncProfileResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (HealthCheck.class.equals(type)) {
				return HealthCheck.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (HealthCheckResponse.class.equals(type)) {
				return HealthCheckResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (JoinSyncGroup.class.equals(type)) {
				return JoinSyncGroup.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (JoinSyncGroupResponse.class.equals(type)) {
				return JoinSyncGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (LeaveSyncGroup.class.equals(type)) {
				return LeaveSyncGroup.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (LeaveSyncGroupResponse.class.equals(type)) {
				return LeaveSyncGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (ListFeeds.class.equals(type)) {
				return ListFeeds.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (ListFeedsResponse.class.equals(type)) {
				return ListFeedsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (LogDump.class.equals(type)) {
				return LogDump.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (LogDumpResponse.class.equals(type)) {
				return LogDumpResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (ResetAllAddonCache.class.equals(type)) {
				return ResetAllAddonCache.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (ResetAllAddonCacheResponse.class.equals(
					type)) {
				return ResetAllAddonCacheResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (ResetFeeds.class.equals(type)) {
				return ResetFeeds.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (ResetFeedsResponse.class.equals(type)) {
				return ResetFeedsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (ResetSingleAddonCache.class.equals(type)) {
				return ResetSingleAddonCache.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (ResetSingleAddonCacheResponse.class.equals(
					type)) {
				return ResetSingleAddonCacheResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (SaveSyncSnapshot.class.equals(type)) {
				return SaveSyncSnapshot.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (SaveSyncSnapshotResponse.class.equals(
					type)) {
				return SaveSyncSnapshotResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (SaveSyncTransactions.class.equals(type)) {
				return SaveSyncTransactions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (SaveSyncTransactionsResponse.class.equals(
					type)) {
				return SaveSyncTransactionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (ServiceHealthCheck.class.equals(type)) {
				return ServiceHealthCheck.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (ServiceHealthCheckResponse.class.equals(
					type)) {
				return ServiceHealthCheckResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (V2GetAddOnDescription.class.equals(type)) {
				return V2GetAddOnDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (V2GetAddOnDescriptionResponse.class.equals(
					type)) {
				return V2GetAddOnDescriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (V2GetAddOns.class.equals(type)) {
				return V2GetAddOns.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (V2GetAddOnsResponse.class.equals(type)) {
				return V2GetAddOnsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (V2GetChangeLog.class.equals(type)) {
				return V2GetChangeLog.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (V2GetChangeLogResponse.class.equals(type)) {
				return V2GetChangeLogResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (V2GetFingerprintMatches.class.equals(
					type)) {
				return V2GetFingerprintMatches.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}

			if (V2GetFingerprintMatchesResponse.class.equals(
					type)) {
				return V2GetFingerprintMatchesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
			}
		} catch (Exception e) {
			throw AxisFault.makeFault(e);
		}

		return null;
	}
}
