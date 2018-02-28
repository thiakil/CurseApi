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
 * AddOnServiceStub.java
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
import com.thiakil.curseapi.login.CurseToken;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
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
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.description.AxisOperation;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.description.OutInAxisOperation;
import org.apache.axis2.description.WSDL2Constants;
import org.apache.axis2.util.CallbackReceiver;
import org.apache.axis2.util.Utils;
import org.apache.axis2.wsdl.WSDLConstants;
import org.apache.neethi.Policy;
import org.apache.neethi.PolicyEngine;
import org.datacontract.schemas._2004._07.curse_addonservice_requests.AddOnFileKey;

import javax.xml.namespace.QName;
import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;

/*
 *  AddOnServiceStub java implementation
 */
public class AddOnServiceStub extends Stub implements AddOnService {
	private static int counter = 0;
	protected AxisOperation[] _operations;

	//hashmaps to keep the fault mapping
	private HashMap faultExceptionNameMap = new HashMap();
	private HashMap<FaultMapKey, String> faultExceptionClassNameMap = new HashMap<>();
	private HashMap<FaultMapKey, String> faultMessageMap = new HashMap<>();

	/////////////////////////////////////////////////////////////////////////
	private QName[] opNameArray = null;

	/**
	 * Constructor that takes in a configContext
	 */
	AddOnServiceStub(CurseToken auth, ConfigurationContext configurationContext, String targetEndpoint) throws AxisFault {
		this(auth, configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext  and useseperate listner
	 */
	AddOnServiceStub(CurseToken auth, ConfigurationContext configurationContext, String targetEndpoint, boolean useSeparateListener) throws AxisFault {
		//To populate AxisService
		populateAxisService();
		populateFaults();

		if (configurationContext == null) {
			configurationContext = ConfigurationContextFactory.createConfigurationContextFromURIs(AddOnServiceStub.class.getResource("/curseclient-axis2.xml"), null);
		}

		_serviceClient = new ServiceClient(configurationContext, _service);

		_service.applyPolicy();

		_serviceClient.getOptions().setTo(new EndpointReference(targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

		//Set the soap version
		_serviceClient.getOptions().setSoapVersionURI(SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
		_serviceClient.engageModule("addressing");

		OMFactory factory = OMAbstractFactory.getOMFactory();
		OMNamespace ns = factory.createOMNamespace("urn:Curse.FriendsService:v1", "");
		OMNamespace ns2 = factory.createOMNamespace("http://www.w3.org/2001/XMLSchema-instance", "i");
		OMElement header = factory.createOMElement("AuthenticationToken", ns);
		OMElement apikey = factory.createOMElement("ApiKey", ns, header);
		if (auth.apiKey == null) {
			header.declareNamespace(ns2);
			apikey.addAttribute(factory.createOMAttribute("nil", ns2, "true"));
		} else {
			apikey.setText(auth.apiKey);
		}
		OMElement token = factory.createOMElement("Token", ns, header);
		token.setText(auth.token);
		OMElement id = factory.createOMElement("UserID", ns, header);
		id.setText(String.valueOf(auth.userID));
		_serviceClient.addHeader(header);
	}

	AddOnServiceStub(CurseToken auth) throws AxisFault {
		this(auth, "https://addons.forgesvc.net/AddOnService.svc/soap12");
	}

	/**
	 * Constructor taking the target endpoint
	 */
	AddOnServiceStub(CurseToken auth, String targetEndpoint) throws AxisFault {
		this(auth, null, targetEndpoint);
	}

	private static synchronized String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}

		counter = counter + 1;

		return Long.toString(System.currentTimeMillis()) + "_" + counter;
	}

	private void populateAxisService() {
		//creating the Service with a unique name
		_service = new AxisService("AddOnService" + getUniqueSuffix());
		addAnonymousOperations();

		//creating the operations
		AxisOperation __operation;

		_operations = new AxisOperation[31];

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "createSyncGroup"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[0] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getSecureDownloadToken"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[1] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "healthCheck"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[2] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getFingerprintMatches"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[3] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "saveSyncTransactions"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[4] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getRepositoryMatchFromSlug"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[5] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "v2GetFingerprintMatches"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[6] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "cacheHealthCheck"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[7] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getAddOnDescription"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[8] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "resetFeeds"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[9] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "leaveSyncGroup"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[10] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "saveSyncSnapshot"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[11] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getAddOnDump"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[12] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getAddOns"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[13] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getDownloadToken"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[14] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "v2GetChangeLog"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[15] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "v2GetAddOns"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[16] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getAddOnFile"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[17] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getChangeLog"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[18] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getSyncProfile"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[19] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getAllFilesForAddOn"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[20] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getFuzzyMatches"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[21] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "joinSyncGroup"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[22] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "listFeeds"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[23] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getAddOnFiles"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[24] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "v2GetAddOnDescription"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[25] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "resetSingleAddonCache"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[26] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "getAddOn"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[27] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "logDump"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[28] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "serviceHealthCheck"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[29] = __operation;

		__operation = new OutInAxisOperation();

		__operation.setName(new QName("http://addonservice.curse.com/", "resetAllAddonCache"));
		_service.addOperation(__operation);

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy());

		(__operation).getMessage(WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy());

		_operations[30] = __operation;
	}

	//populates the faults
	private void populateFaults() {
	}

	/**
	 * Auto generated method signature
	 *
	 * @param createSyncGroup62
	 * @see AddOnService#createSyncGroup
	 */
	public CreateSyncGroupResponse createSyncGroup(CreateSyncGroup createSyncGroup62) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/CreateSyncGroup");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createSyncGroup62, optimizeContent(new QName("http://addonservice.curse.com/", "createSyncGroup")), new QName("http://addonservice.curse.com/", "CreateSyncGroup"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), CreateSyncGroupResponse.class);

			return (CreateSyncGroupResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "CreateSyncGroup"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "CreateSyncGroup"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "CreateSyncGroup"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param createSyncGroup62
	 * @see AddOnService#startcreateSyncGroup
	 */
	public void startcreateSyncGroup(CreateSyncGroup createSyncGroup62, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/CreateSyncGroup");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), createSyncGroup62, optimizeContent(new QName("http://addonservice.curse.com/", "createSyncGroup")), new QName("http://addonservice.curse.com/", "CreateSyncGroup"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), CreateSyncGroupResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "CreateSyncGroup"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "CreateSyncGroup"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "CreateSyncGroup"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorcreateSyncGroup(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorcreateSyncGroup(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[0].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param getSecureDownloadToken64
	 * @see AddOnService#getSecureDownloadToken
	 */
	public GetSecureDownloadTokenResponse getSecureDownloadToken(GetSecureDownloadToken getSecureDownloadToken64) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetSecureDownloadToken");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getSecureDownloadToken64, optimizeContent(new QName("http://addonservice.curse.com/", "getSecureDownloadToken")), new QName("http://addonservice.curse.com/", "GetSecureDownloadToken"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetSecureDownloadTokenResponse.class);

			return (GetSecureDownloadTokenResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetSecureDownloadToken"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetSecureDownloadToken"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetSecureDownloadToken"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getSecureDownloadToken64
	 * @see AddOnService#startgetSecureDownloadToken
	 */
	public void startgetSecureDownloadToken(GetSecureDownloadToken getSecureDownloadToken64, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetSecureDownloadToken");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getSecureDownloadToken64, optimizeContent(new QName("http://addonservice.curse.com/", "getSecureDownloadToken")), new QName("http://addonservice.curse.com/", "GetSecureDownloadToken"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), GetSecureDownloadTokenResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetSecureDownloadToken"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetSecureDownloadToken"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetSecureDownloadToken"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetSecureDownloadToken(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetSecureDownloadToken(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[1].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
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
	 */
	public String healthCheck() throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/HealthCheck");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new HealthCheck(), optimizeContent(new QName("http://addonservice.curse.com/", "healthCheck")), new QName("http://addonservice.curse.com/", "HealthCheck"));

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

			HealthCheckResponse object = fromOM(_returnEnv.getBody().getFirstElement(), HealthCheckResponse.class);

			return object.getHealthCheckResult();
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "HealthCheck"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "HealthCheck"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "HealthCheck"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @see AddOnService#starthealthCheck
	 */
	public void starthealthCheck(final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/HealthCheck");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new HealthCheck(), optimizeContent(new QName("http://addonservice.curse.com/", "healthCheck")), new QName("http://addonservice.curse.com/", "HealthCheck"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), HealthCheckResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "HealthCheck"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "HealthCheck"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "HealthCheck"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorhealthCheck(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorhealthCheck(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[2].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[2].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	@Deprecated
	public FingerprintMatchResult getFingerprintMatches(long... fingerprints) throws RemoteException {

		if (fingerprints.length == 0){
			throw new IllegalArgumentException("fingerprints are required");
		}

		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetFingerprintMatches");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetFingerprintMatches(fingerprints), optimizeContent(new QName("http://addonservice.curse.com/", "getFingerprintMatches")), new QName("http://addonservice.curse.com/", "GetFingerprintMatches"));

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

			GetFingerprintMatchesResponse object = fromOM(_returnEnv.getBody().getFirstElement(), GetFingerprintMatchesResponse.class);

			return object.isGetFingerprintMatchesResultSpecified() ? object.getGetFingerprintMatchesResult() : new FingerprintMatchResult();
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetFingerprintMatches"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetFingerprintMatches"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetFingerprintMatches"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	@Deprecated
	public void startgetFingerprintMatches(long[] fingerprints, final AddOnServiceCallbackHandler callback) throws RemoteException {
		if (fingerprints.length == 0){
			throw new IllegalArgumentException("fingerprints are required");
		}

		OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetFingerprintMatches");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetFingerprintMatches(fingerprints), optimizeContent(new QName("http://addonservice.curse.com/", "getFingerprintMatches")), new QName("http://addonservice.curse.com/", "GetFingerprintMatches"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), GetFingerprintMatchesResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetFingerprintMatches"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetFingerprintMatches"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetFingerprintMatches"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetFingerprintMatches(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetFingerprintMatches(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[3].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[3].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param saveSyncTransactions70
	 * @see AddOnService#saveSyncTransactions
	 */
	public SaveSyncTransactionsResponse saveSyncTransactions(SaveSyncTransactions saveSyncTransactions70) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/SaveSyncTransactions");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), saveSyncTransactions70, optimizeContent(new QName("http://addonservice.curse.com/", "saveSyncTransactions")), new QName("http://addonservice.curse.com/", "SaveSyncTransactions"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), SaveSyncTransactionsResponse.class);

			return (SaveSyncTransactionsResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "SaveSyncTransactions"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "SaveSyncTransactions"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "SaveSyncTransactions"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param saveSyncTransactions70
	 * @see AddOnService#startsaveSyncTransactions
	 */
	public void startsaveSyncTransactions(SaveSyncTransactions saveSyncTransactions70, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/SaveSyncTransactions");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), saveSyncTransactions70, optimizeContent(new QName("http://addonservice.curse.com/", "saveSyncTransactions")), new QName("http://addonservice.curse.com/", "SaveSyncTransactions"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), SaveSyncTransactionsResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "SaveSyncTransactions"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "SaveSyncTransactions"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "SaveSyncTransactions"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorsaveSyncTransactions(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorsaveSyncTransactions(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[4].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[4].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param getRepositoryMatchFromSlug72
	 * @see AddOnService#getRepositoryMatchFromSlug
	 */
	public GetRepositoryMatchFromSlugResponse getRepositoryMatchFromSlug(GetRepositoryMatchFromSlug getRepositoryMatchFromSlug72) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetRepositoryMatchFromSlug");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getRepositoryMatchFromSlug72, optimizeContent(new QName("http://addonservice.curse.com/", "getRepositoryMatchFromSlug")), new QName("http://addonservice.curse.com/", "GetRepositoryMatchFromSlug"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetRepositoryMatchFromSlugResponse.class);

			return (GetRepositoryMatchFromSlugResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetRepositoryMatchFromSlug"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetRepositoryMatchFromSlug"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetRepositoryMatchFromSlug"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getRepositoryMatchFromSlug72
	 * @see AddOnService#startgetRepositoryMatchFromSlug
	 */
	public void startgetRepositoryMatchFromSlug(GetRepositoryMatchFromSlug getRepositoryMatchFromSlug72, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetRepositoryMatchFromSlug");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getRepositoryMatchFromSlug72, optimizeContent(new QName("http://addonservice.curse.com/", "getRepositoryMatchFromSlug")), new QName("http://addonservice.curse.com/", "GetRepositoryMatchFromSlug"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), GetRepositoryMatchFromSlugResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetRepositoryMatchFromSlug"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetRepositoryMatchFromSlug"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetRepositoryMatchFromSlug"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetRepositoryMatchFromSlug(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetRepositoryMatchFromSlug(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[5].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[5].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param fingerprints
	 * @see AddOnService#v2GetFingerprintMatches
	 */
	public FingerprintMatchResult v2GetFingerprintMatches(long... fingerprints) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/v2GetFingerprintMatches");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new V2GetFingerprintMatches(fingerprints), optimizeContent(new QName("http://addonservice.curse.com/", "v2GetFingerprintMatches")), new QName("http://addonservice.curse.com/", "v2GetFingerprintMatches"));

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

			V2GetFingerprintMatchesResponse object = fromOM(_returnEnv.getBody().getFirstElement(), V2GetFingerprintMatchesResponse.class);

			return object.getV2GetFingerprintMatchesResult();
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "v2GetFingerprintMatches"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "v2GetFingerprintMatches"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "v2GetFingerprintMatches"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param fingerprints
	 * @see AddOnService#startv2GetFingerprintMatches
	 */
	public void startv2GetFingerprintMatches(long[] fingerprints, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/v2GetFingerprintMatches");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new V2GetFingerprintMatches(fingerprints), optimizeContent(new QName("http://addonservice.curse.com/", "v2GetFingerprintMatches")), new QName("http://addonservice.curse.com/", "v2GetFingerprintMatches"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), V2GetFingerprintMatchesResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "v2GetFingerprintMatches"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "v2GetFingerprintMatches"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "v2GetFingerprintMatches"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorv2GetFingerprintMatches(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorv2GetFingerprintMatches(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[6].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[6].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param cacheHealthCheck76
	 * @see AddOnService#cacheHealthCheck
	 */
	public CacheHealthCheckResponse cacheHealthCheck(CacheHealthCheck cacheHealthCheck76) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/CacheHealthCheck");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), cacheHealthCheck76, optimizeContent(new QName("http://addonservice.curse.com/", "cacheHealthCheck")), new QName("http://addonservice.curse.com/", "CacheHealthCheck"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), CacheHealthCheckResponse.class);

			return (CacheHealthCheckResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "CacheHealthCheck"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "CacheHealthCheck"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "CacheHealthCheck"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param cacheHealthCheck76
	 * @see AddOnService#startcacheHealthCheck
	 */
	public void startcacheHealthCheck(CacheHealthCheck cacheHealthCheck76, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/CacheHealthCheck");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), cacheHealthCheck76, optimizeContent(new QName("http://addonservice.curse.com/", "cacheHealthCheck")), new QName("http://addonservice.curse.com/", "CacheHealthCheck"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), CacheHealthCheckResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "CacheHealthCheck"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "CacheHealthCheck"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "CacheHealthCheck"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorcacheHealthCheck(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorcacheHealthCheck(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[7].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[7].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	@Deprecated
	public GetAddOnDescriptionResponse getAddOnDescription(GetAddOnDescription getAddOnDescription78) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAddOnDescription");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAddOnDescription78, optimizeContent(new QName("http://addonservice.curse.com/", "getAddOnDescription")), new QName("http://addonservice.curse.com/", "GetAddOnDescription"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetAddOnDescriptionResponse.class);

			return (GetAddOnDescriptionResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAddOnDescription"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnDescription"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnDescription"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	@Deprecated
	public void startgetAddOnDescription(GetAddOnDescription getAddOnDescription78, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAddOnDescription");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAddOnDescription78, optimizeContent(new QName("http://addonservice.curse.com/", "getAddOnDescription")), new QName("http://addonservice.curse.com/", "GetAddOnDescription"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), GetAddOnDescriptionResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAddOnDescription"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnDescription"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnDescription"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetAddOnDescription(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAddOnDescription(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[8].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[8].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param resetFeeds80
	 * @see AddOnService#resetFeeds
	 */
	public ResetFeedsResponse resetFeeds(ResetFeeds resetFeeds80) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/ResetFeeds");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), resetFeeds80, optimizeContent(new QName("http://addonservice.curse.com/", "resetFeeds")), new QName("http://addonservice.curse.com/", "ResetFeeds"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), ResetFeedsResponse.class);

			return (ResetFeedsResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "ResetFeeds"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "ResetFeeds"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "ResetFeeds"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param resetFeeds80
	 * @see AddOnService#startresetFeeds
	 */
	public void startresetFeeds(ResetFeeds resetFeeds80, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/ResetFeeds");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), resetFeeds80, optimizeContent(new QName("http://addonservice.curse.com/", "resetFeeds")), new QName("http://addonservice.curse.com/", "ResetFeeds"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), ResetFeedsResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "ResetFeeds"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "ResetFeeds"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "ResetFeeds"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorresetFeeds(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorresetFeeds(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[9].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[9].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param leaveSyncGroup82
	 * @see AddOnService#leaveSyncGroup
	 */
	public LeaveSyncGroupResponse leaveSyncGroup(LeaveSyncGroup leaveSyncGroup82) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/LeaveSyncGroup");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), leaveSyncGroup82, optimizeContent(new QName("http://addonservice.curse.com/", "leaveSyncGroup")), new QName("http://addonservice.curse.com/", "LeaveSyncGroup"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), LeaveSyncGroupResponse.class);

			return (LeaveSyncGroupResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "LeaveSyncGroup"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "LeaveSyncGroup"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "LeaveSyncGroup"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param leaveSyncGroup82
	 * @see AddOnService#startleaveSyncGroup
	 */
	public void startleaveSyncGroup(LeaveSyncGroup leaveSyncGroup82, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/LeaveSyncGroup");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), leaveSyncGroup82, optimizeContent(new QName("http://addonservice.curse.com/", "leaveSyncGroup")), new QName("http://addonservice.curse.com/", "LeaveSyncGroup"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), LeaveSyncGroupResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "LeaveSyncGroup"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "LeaveSyncGroup"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "LeaveSyncGroup"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorleaveSyncGroup(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorleaveSyncGroup(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[10].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[10].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param saveSyncSnapshot84
	 * @see AddOnService#saveSyncSnapshot
	 */
	public SaveSyncSnapshotResponse saveSyncSnapshot(SaveSyncSnapshot saveSyncSnapshot84) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/SaveSyncSnapshot");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), saveSyncSnapshot84, optimizeContent(new QName("http://addonservice.curse.com/", "saveSyncSnapshot")), new QName("http://addonservice.curse.com/", "SaveSyncSnapshot"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), SaveSyncSnapshotResponse.class);

			return (SaveSyncSnapshotResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "SaveSyncSnapshot"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "SaveSyncSnapshot"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "SaveSyncSnapshot"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param saveSyncSnapshot84
	 * @see AddOnService#startsaveSyncSnapshot
	 */
	public void startsaveSyncSnapshot(SaveSyncSnapshot saveSyncSnapshot84, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/SaveSyncSnapshot");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), saveSyncSnapshot84, optimizeContent(new QName("http://addonservice.curse.com/", "saveSyncSnapshot")), new QName("http://addonservice.curse.com/", "SaveSyncSnapshot"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), SaveSyncSnapshotResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "SaveSyncSnapshot"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "SaveSyncSnapshot"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "SaveSyncSnapshot"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorsaveSyncSnapshot(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorsaveSyncSnapshot(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[11].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[11].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param getAddOnDump86
	 * @see AddOnService#getAddOnDump
	 */
	public GetAddOnDumpResponse getAddOnDump(GetAddOnDump getAddOnDump86) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAddOnDump");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAddOnDump86, optimizeContent(new QName("http://addonservice.curse.com/", "getAddOnDump")), new QName("http://addonservice.curse.com/", "GetAddOnDump"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetAddOnDumpResponse.class);

			return (GetAddOnDumpResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAddOnDump"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnDump"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnDump"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getAddOnDump86
	 * @see AddOnService#startgetAddOnDump
	 */
	public void startgetAddOnDump(GetAddOnDump getAddOnDump86, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAddOnDump");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getAddOnDump86, optimizeContent(new QName("http://addonservice.curse.com/", "getAddOnDump")), new QName("http://addonservice.curse.com/", "GetAddOnDump"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), GetAddOnDumpResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAddOnDump"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnDump"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnDump"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetAddOnDump(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAddOnDump(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[12].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[12].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	@Deprecated
	public List<AddOn> getAddOns(int... addonIDs) throws RemoteException {
		if (addonIDs==null || addonIDs.length == 0){
			throw new IllegalArgumentException("addonIDs");
		}
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAddOns");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetAddOns(addonIDs), optimizeContent(new QName("http://addonservice.curse.com/", "getAddOns")), new QName("http://addonservice.curse.com/", "GetAddOns"));

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

			GetAddOnsResponse object = fromOM(_returnEnv.getBody().getFirstElement(), GetAddOnsResponse.class);

			return  object.getGetAddOnsResult();
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAddOns"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOns"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOns"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	@Deprecated
	public void startgetAddOns(int[] addonIDs, final AddOnServiceCallbackHandler callback) throws RemoteException {
		if (addonIDs==null || addonIDs.length == 0){
			throw new IllegalArgumentException("addonIDs");
		}

		OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAddOns");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetAddOns(addonIDs), optimizeContent(new QName("http://addonservice.curse.com/", "getAddOns")), new QName("http://addonservice.curse.com/", "GetAddOns"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					GetAddOnsResponse object = fromOM(resultEnv.getBody().getFirstElement(), GetAddOnsResponse.class);
					callback.receiveResultgetAddOns(object);
				} catch (AxisFault e) {
					callback.receiveErrorgetAddOns(e);
				}
			}

			public void onError(Exception error) {
				if (error instanceof AxisFault) {
					AxisFault f = (AxisFault) error;
					OMElement faultElt = f.getDetail();

					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAddOns"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOns"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOns"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetAddOns(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAddOns(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[13].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[13].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param getDownloadToken90
	 * @see AddOnService#getDownloadToken
	 */
	public GetDownloadTokenResponse getDownloadToken(GetDownloadToken getDownloadToken90) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetDownloadToken");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getDownloadToken90, optimizeContent(new QName("http://addonservice.curse.com/", "getDownloadToken")), new QName("http://addonservice.curse.com/", "GetDownloadToken"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetDownloadTokenResponse.class);

			return (GetDownloadTokenResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetDownloadToken"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetDownloadToken"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetDownloadToken"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getDownloadToken90
	 * @see AddOnService#startgetDownloadToken
	 */
	public void startgetDownloadToken(GetDownloadToken getDownloadToken90, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetDownloadToken");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getDownloadToken90, optimizeContent(new QName("http://addonservice.curse.com/", "getDownloadToken")), new QName("http://addonservice.curse.com/", "GetDownloadToken"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), GetDownloadTokenResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetDownloadToken"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetDownloadToken"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetDownloadToken"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetDownloadToken(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetDownloadToken(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[14].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[14].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	public String v2GetChangeLog(int addonID, int fileID) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/v2GetChangeLog");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new V2GetChangeLog(addonID, fileID), optimizeContent(new QName("http://addonservice.curse.com/", "v2GetChangeLog")), new QName("http://addonservice.curse.com/", "v2GetChangeLog"));

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

			V2GetChangeLogResponse object = fromOM(_returnEnv.getBody().getFirstElement(), V2GetChangeLogResponse.class);

			return object.getV2GetChangeLogResult();
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "v2GetChangeLog"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "v2GetChangeLog"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "v2GetChangeLog"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	public void startv2GetChangeLog(int addonID, int fileID, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/v2GetChangeLog");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new V2GetChangeLog(addonID, fileID), optimizeContent(new QName("http://addonservice.curse.com/", "v2GetChangeLog")), new QName("http://addonservice.curse.com/", "v2GetChangeLog"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), V2GetChangeLogResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "v2GetChangeLog"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "v2GetChangeLog"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "v2GetChangeLog"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorv2GetChangeLog(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorv2GetChangeLog(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[15].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[15].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param addonIDs
	 * @see AddOnService#v2GetAddOns
	 */
	public List<AddOn> v2GetAddOns(int... addonIDs) throws RemoteException {
		if (addonIDs == null || addonIDs.length == 0){
			throw new IllegalArgumentException("addonIDs");
		}
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/v2GetAddOns");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new V2GetAddOns(addonIDs), optimizeContent(new QName("http://addonservice.curse.com/", "v2GetAddOns")), new QName("http://addonservice.curse.com/", "v2GetAddOns"));

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

			V2GetAddOnsResponse object = fromOM(_returnEnv.getBody().getFirstElement(), V2GetAddOnsResponse.class);

			return object.getV2GetAddOnsResult();
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "v2GetAddOns"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "v2GetAddOns"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "v2GetAddOns"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param addonIDs
	 * @see AddOnService#startv2GetAddOns
	 */
	public void startv2GetAddOns(int[] addonIDs, final AddOnServiceCallbackHandler callback) throws RemoteException {
		if (addonIDs == null || addonIDs.length == 0){
			throw new IllegalArgumentException("addonIDs");
		}

		OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/v2GetAddOns");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new V2GetAddOns(addonIDs), optimizeContent(new QName("http://addonservice.curse.com/", "v2GetAddOns")), new QName("http://addonservice.curse.com/", "v2GetAddOns"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), V2GetAddOnsResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "v2GetAddOns"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "v2GetAddOns"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "v2GetAddOns"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorv2GetAddOns(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorv2GetAddOns(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[16].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[16].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param addonID
	 * @param fileID
	 * @see AddOnService#getAddOnFile
	 */
	public AddOnFile getAddOnFile(int addonID, int fileID) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAddOnFile");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetAddOnFile(addonID, fileID), optimizeContent(new QName("http://addonservice.curse.com/", "getAddOnFile")), new QName("http://addonservice.curse.com/", "GetAddOnFile"));

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

			GetAddOnFileResponse object = fromOM(_returnEnv.getBody().getFirstElement(), GetAddOnFileResponse.class);

			return object.getGetAddOnFileResult();
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAddOnFile"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnFile"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnFile"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param addonID
	 * @param fileID
	 * @see AddOnService#startgetAddOnFile
	 */
	public void startgetAddOnFile(int addonID, int fileID, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAddOnFile");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetAddOnFile(addonID, fileID), optimizeContent(new QName("http://addonservice.curse.com/", "getAddOnFile")), new QName("http://addonservice.curse.com/", "GetAddOnFile"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), GetAddOnFileResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAddOnFile"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnFile"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnFile"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetAddOnFile(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAddOnFile(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[17].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[17].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	@Deprecated
	public String getChangeLog(int addonID, int fileID) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetChangeLog");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetChangeLog(addonID, fileID), optimizeContent(new QName("http://addonservice.curse.com/", "getChangeLog")), new QName("http://addonservice.curse.com/", "GetChangeLog"));

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

			GetChangeLogResponse object = fromOM(_returnEnv.getBody().getFirstElement(), GetChangeLogResponse.class);

			return object.getGetChangeLogResult();
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetChangeLog"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetChangeLog"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetChangeLog"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	@Deprecated
	public void startgetChangeLog(int addonID, int fileID, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetChangeLog");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetChangeLog(addonID, fileID), optimizeContent(new QName("http://addonservice.curse.com/", "getChangeLog")), new QName("http://addonservice.curse.com/", "GetChangeLog"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), GetChangeLogResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetChangeLog"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetChangeLog"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetChangeLog"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetChangeLog(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetChangeLog(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[18].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[18].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param getSyncProfile100
	 * @see AddOnService#getSyncProfile
	 */
	public GetSyncProfileResponse getSyncProfile(GetSyncProfile getSyncProfile100) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetSyncProfile");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getSyncProfile100, optimizeContent(new QName("http://addonservice.curse.com/", "getSyncProfile")), new QName("http://addonservice.curse.com/", "GetSyncProfile"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetSyncProfileResponse.class);

			return (GetSyncProfileResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetSyncProfile"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetSyncProfile"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetSyncProfile"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getSyncProfile100
	 * @see AddOnService#startgetSyncProfile
	 */
	public void startgetSyncProfile(GetSyncProfile getSyncProfile100, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetSyncProfile");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getSyncProfile100, optimizeContent(new QName("http://addonservice.curse.com/", "getSyncProfile")), new QName("http://addonservice.curse.com/", "GetSyncProfile"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), GetSyncProfileResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetSyncProfile"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetSyncProfile"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetSyncProfile"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetSyncProfile(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetSyncProfile(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[19].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[19].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param addonID
	 * @see AddOnService#getAllFilesForAddOn
	 */
	public List<AddOnFile> getAllFilesForAddOn(int addonID) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAllFilesForAddOn");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetAllFilesForAddOn(addonID), optimizeContent(new QName("http://addonservice.curse.com/", "getAllFilesForAddOn")), new QName("http://addonservice.curse.com/", "GetAllFilesForAddOn"));

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
			
			GetAllFilesForAddOnResponse object = fromOM(_returnEnv.getBody().getFirstElement(), GetAllFilesForAddOnResponse.class);

			return object.getGetAllFilesForAddOnResult();
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAllFilesForAddOn"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAllFilesForAddOn"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAllFilesForAddOn"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param addonID
	 * @see AddOnService#startgetAllFilesForAddOn
	 */
	public void startgetAllFilesForAddOn(int addonID, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAllFilesForAddOn");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetAllFilesForAddOn(addonID), optimizeContent(new QName("http://addonservice.curse.com/", "getAllFilesForAddOn")), new QName("http://addonservice.curse.com/", "GetAllFilesForAddOn"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), GetAllFilesForAddOnResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAllFilesForAddOn"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAllFilesForAddOn"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAllFilesForAddOn"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetAllFilesForAddOn(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAllFilesForAddOn(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[20].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[20].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param getFuzzyMatches104
	 * @see AddOnService#getFuzzyMatches
	 */
	public GetFuzzyMatchesResponse getFuzzyMatches(GetFuzzyMatches getFuzzyMatches104) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetFuzzyMatches");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getFuzzyMatches104, optimizeContent(new QName("http://addonservice.curse.com/", "getFuzzyMatches")), new QName("http://addonservice.curse.com/", "GetFuzzyMatches"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetFuzzyMatchesResponse.class);

			return (GetFuzzyMatchesResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetFuzzyMatches"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetFuzzyMatches"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetFuzzyMatches"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param getFuzzyMatches104
	 * @see AddOnService#startgetFuzzyMatches
	 */
	public void startgetFuzzyMatches(GetFuzzyMatches getFuzzyMatches104, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetFuzzyMatches");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getFuzzyMatches104, optimizeContent(new QName("http://addonservice.curse.com/", "getFuzzyMatches")), new QName("http://addonservice.curse.com/", "GetFuzzyMatches"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), GetFuzzyMatchesResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetFuzzyMatches"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetFuzzyMatches"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetFuzzyMatches"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetFuzzyMatches(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetFuzzyMatches(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[21].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[21].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param joinSyncGroup106
	 * @see AddOnService#joinSyncGroup
	 */
	public JoinSyncGroupResponse joinSyncGroup(JoinSyncGroup joinSyncGroup106) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/JoinSyncGroup");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), joinSyncGroup106, optimizeContent(new QName("http://addonservice.curse.com/", "joinSyncGroup")), new QName("http://addonservice.curse.com/", "JoinSyncGroup"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), JoinSyncGroupResponse.class);

			return (JoinSyncGroupResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "JoinSyncGroup"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "JoinSyncGroup"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "JoinSyncGroup"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param joinSyncGroup106
	 * @see AddOnService#startjoinSyncGroup
	 */
	public void startjoinSyncGroup(JoinSyncGroup joinSyncGroup106, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/JoinSyncGroup");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), joinSyncGroup106, optimizeContent(new QName("http://addonservice.curse.com/", "joinSyncGroup")), new QName("http://addonservice.curse.com/", "JoinSyncGroup"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), JoinSyncGroupResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "JoinSyncGroup"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "JoinSyncGroup"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "JoinSyncGroup"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorjoinSyncGroup(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorjoinSyncGroup(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[22].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[22].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param listFeeds108
	 * @see AddOnService#listFeeds
	 */
	public ListFeedsResponse listFeeds(ListFeeds listFeeds108) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/ListFeeds");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), listFeeds108, optimizeContent(new QName("http://addonservice.curse.com/", "listFeeds")), new QName("http://addonservice.curse.com/", "ListFeeds"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), ListFeedsResponse.class);

			return (ListFeedsResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "ListFeeds"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "ListFeeds"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "ListFeeds"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param listFeeds108
	 * @see AddOnService#startlistFeeds
	 */
	public void startlistFeeds(ListFeeds listFeeds108, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/ListFeeds");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), listFeeds108, optimizeContent(new QName("http://addonservice.curse.com/", "listFeeds")), new QName("http://addonservice.curse.com/", "ListFeeds"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), ListFeedsResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "ListFeeds"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "ListFeeds"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "ListFeeds"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorlistFeeds(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorlistFeeds(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[23].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[23].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param addOnFileKeys
	 * @see AddOnService#getAddOnFiles
	 */
	public Int2ObjectMap<List<AddOnFile>> getAddOnFiles(AddOnFileKey... addOnFileKeys) throws RemoteException {
		if (addOnFileKeys == null || addOnFileKeys.length == 0){
			throw new IllegalArgumentException("addOnFileKeys");
		}

		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAddOnFiles");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetAddOnFiles(addOnFileKeys), optimizeContent(new QName("http://addonservice.curse.com/", "getAddOnFiles")), new QName("http://addonservice.curse.com/", "GetAddOnFiles"));

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

			GetAddOnFilesResponse object = fromOM(_returnEnv.getBody().getFirstElement(), GetAddOnFilesResponse.class);

			return object.getGetAddOnFilesResult();
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAddOnFiles"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnFiles"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnFiles"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param addOnFileKeys
	 * @see AddOnService#startgetAddOnFiles
	 */
	public void startgetAddOnFiles(AddOnFileKey[] addOnFileKeys, final AddOnServiceCallbackHandler callback) throws RemoteException {
		if (addOnFileKeys == null || addOnFileKeys.length == 0){
			throw new IllegalArgumentException("addOnFileKeys");
		}

		OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAddOnFiles");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetAddOnFiles(addOnFileKeys), optimizeContent(new QName("http://addonservice.curse.com/", "getAddOnFiles")), new QName("http://addonservice.curse.com/", "GetAddOnFiles"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), GetAddOnFilesResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAddOnFiles"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnFiles"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOnFiles"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetAddOnFiles(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAddOnFiles(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[24].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[24].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param addonID
	 * @see AddOnService#v2GetAddOnDescription
	 */
	public String v2GetAddOnDescription(int addonID) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/v2GetAddOnDescription");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new V2GetAddOnDescription(addonID), optimizeContent(new QName("http://addonservice.curse.com/", "v2GetAddOnDescription")), new QName("http://addonservice.curse.com/", "v2GetAddOnDescription"));

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

			V2GetAddOnDescriptionResponse object = fromOM(_returnEnv.getBody().getFirstElement(), V2GetAddOnDescriptionResponse.class);

			return object.getV2GetAddOnDescriptionResult();
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "v2GetAddOnDescription"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "v2GetAddOnDescription"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "v2GetAddOnDescription"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param addonID
	 * @see AddOnService#startv2GetAddOnDescription
	 */
	public void startv2GetAddOnDescription(int addonID, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/v2GetAddOnDescription");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new V2GetAddOnDescription(addonID), optimizeContent(new QName("http://addonservice.curse.com/", "v2GetAddOnDescription")), new QName("http://addonservice.curse.com/", "v2GetAddOnDescription"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), V2GetAddOnDescriptionResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "v2GetAddOnDescription"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "v2GetAddOnDescription"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "v2GetAddOnDescription"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorv2GetAddOnDescription(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorv2GetAddOnDescription(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[25].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[25].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param resetSingleAddonCache114
	 * @see AddOnService#resetSingleAddonCache
	 */
	public ResetSingleAddonCacheResponse resetSingleAddonCache(ResetSingleAddonCache resetSingleAddonCache114) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/ResetSingleAddonCache");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), resetSingleAddonCache114, optimizeContent(new QName("http://addonservice.curse.com/", "resetSingleAddonCache")), new QName("http://addonservice.curse.com/", "ResetSingleAddonCache"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), ResetSingleAddonCacheResponse.class);

			return (ResetSingleAddonCacheResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "ResetSingleAddonCache"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "ResetSingleAddonCache"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "ResetSingleAddonCache"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param resetSingleAddonCache114
	 * @see AddOnService#startresetSingleAddonCache
	 */
	public void startresetSingleAddonCache(ResetSingleAddonCache resetSingleAddonCache114, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/ResetSingleAddonCache");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), resetSingleAddonCache114, optimizeContent(new QName("http://addonservice.curse.com/", "resetSingleAddonCache")), new QName("http://addonservice.curse.com/", "ResetSingleAddonCache"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), ResetSingleAddonCacheResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "ResetSingleAddonCache"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "ResetSingleAddonCache"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "ResetSingleAddonCache"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorresetSingleAddonCache(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorresetSingleAddonCache(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[26].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[26].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param addonID
	 * @see AddOnService#getAddOn
	 */
	public AddOn getAddOn(int addonID) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAddOn");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetAddOn(addonID), optimizeContent(new QName("http://addonservice.curse.com/", "getAddOn")), new QName("http://addonservice.curse.com/", "GetAddOn"));

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

			GetAddOnResponse object = fromOM(_returnEnv.getBody().getFirstElement(), GetAddOnResponse.class);

			return object.getGetAddOnResult();
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAddOn"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOn"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOn"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param addonID
	 * @see AddOnService#startgetAddOn
	 */
	public void startgetAddOn(int addonID, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/GetAddOn");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), new GetAddOn(addonID), optimizeContent(new QName("http://addonservice.curse.com/", "getAddOn")), new QName("http://addonservice.curse.com/", "GetAddOn"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), GetAddOnResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "GetAddOn"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOn"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "GetAddOn"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorgetAddOn(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorgetAddOn(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[27].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[27].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param logDump118
	 * @see AddOnService#logDump
	 */
	public LogDumpResponse logDump(LogDump logDump118) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/LogDump");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), logDump118, optimizeContent(new QName("http://addonservice.curse.com/", "logDump")), new QName("http://addonservice.curse.com/", "LogDump"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), LogDumpResponse.class);

			return (LogDumpResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "LogDump"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "LogDump"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "LogDump"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param logDump118
	 * @see AddOnService#startlogDump
	 */
	public void startlogDump(LogDump logDump118, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/LogDump");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), logDump118, optimizeContent(new QName("http://addonservice.curse.com/", "logDump")), new QName("http://addonservice.curse.com/", "LogDump"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), LogDumpResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "LogDump"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "LogDump"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "LogDump"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorlogDump(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorlogDump(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[28].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[28].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param serviceHealthCheck120
	 * @see AddOnService#serviceHealthCheck
	 */
	public ServiceHealthCheckResponse serviceHealthCheck(ServiceHealthCheck serviceHealthCheck120) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/ServiceHealthCheck");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), serviceHealthCheck120, optimizeContent(new QName("http://addonservice.curse.com/", "serviceHealthCheck")), new QName("http://addonservice.curse.com/", "ServiceHealthCheck"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), ServiceHealthCheckResponse.class);

			return (ServiceHealthCheckResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "ServiceHealthCheck"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "ServiceHealthCheck"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "ServiceHealthCheck"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param serviceHealthCheck120
	 * @see AddOnService#startserviceHealthCheck
	 */
	public void startserviceHealthCheck(ServiceHealthCheck serviceHealthCheck120, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/ServiceHealthCheck");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), serviceHealthCheck120, optimizeContent(new QName("http://addonservice.curse.com/", "serviceHealthCheck")), new QName("http://addonservice.curse.com/", "ServiceHealthCheck"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), ServiceHealthCheckResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "ServiceHealthCheck"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "ServiceHealthCheck"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "ServiceHealthCheck"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorserviceHealthCheck(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorserviceHealthCheck(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[29].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[29].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	/**
	 * Auto generated method signature
	 *
	 * @param resetAllAddonCache122
	 * @see AddOnService#resetAllAddonCache
	 */
	public ResetAllAddonCacheResponse resetAllAddonCache(ResetAllAddonCache resetAllAddonCache122) throws RemoteException {
		MessageContext _messageContext = new MessageContext();

		try {
			OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
			_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/ResetAllAddonCache");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create SOAP envelope with that payload
			SOAPEnvelope env;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), resetAllAddonCache122, optimizeContent(new QName("http://addonservice.curse.com/", "resetAllAddonCache")), new QName("http://addonservice.curse.com/", "ResetAllAddonCache"));

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

			Object object = fromOM(_returnEnv.getBody().getFirstElement(), ResetAllAddonCacheResponse.class);

			return (ResetAllAddonCacheResponse) object;
		} catch (AxisFault f) {
			OMElement faultElt = f.getDetail();

			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "ResetAllAddonCache"))) {
					//make the fault by reflection
					try {
						String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "ResetAllAddonCache"));
						Class<?> exceptionClass = Class.forName(exceptionClassName);
						Constructor constructor = exceptionClass.getConstructor(String.class);
						Exception ex = (Exception) constructor.newInstance(f.getMessage());

						//message class
						String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "ResetAllAddonCache"));
						Class<?> messageClass = Class.forName(messageClassName);
						Object messageObject = fromOM(faultElt, messageClass);
						Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
						m.invoke(ex, messageObject);

						throw new RemoteException(ex.getMessage(), ex);
					} catch (ClassCastException | ReflectiveOperationException e) {
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
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 *
	 * @param resetAllAddonCache122
	 * @see AddOnService#startresetAllAddonCache
	 */
	public void startresetAllAddonCache(ResetAllAddonCache resetAllAddonCache122, final AddOnServiceCallbackHandler callback) throws RemoteException {
		OperationClient _operationClient = _serviceClient.createClient(_operations[30].getName());
		_operationClient.getOptions().setAction("http://addonservice.curse.com/IAddOnService/ResetAllAddonCache");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(_operationClient, WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

		// create SOAP envelope with that payload
		SOAPEnvelope env;
		final MessageContext _messageContext = new MessageContext();

		//Style is Doc.
		env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), resetAllAddonCache122, optimizeContent(new QName("http://addonservice.curse.com/", "resetAllAddonCache")), new QName("http://addonservice.curse.com/", "ResetAllAddonCache"));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient.setCallback(new AxisCallback() {
			public void onMessage(MessageContext resultContext) {
				try {
					SOAPEnvelope resultEnv = resultContext.getEnvelope();

					Object object = fromOM(resultEnv.getBody().getFirstElement(), ResetAllAddonCacheResponse.class);
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
						if (faultExceptionNameMap.containsKey(new FaultMapKey(faultElt.getQName(), "ResetAllAddonCache"))) {
							//make the fault by reflection
							try {
								String exceptionClassName = faultExceptionClassNameMap.get(new FaultMapKey(faultElt.getQName(), "ResetAllAddonCache"));
								Class<?> exceptionClass = Class.forName(exceptionClassName);
								Constructor constructor = exceptionClass.getConstructor(String.class);
								Exception ex = (Exception) constructor.newInstance(f.getMessage());

								//message class
								String messageClassName = faultMessageMap.get(new FaultMapKey(faultElt.getQName(), "ResetAllAddonCache"));
								Class<?> messageClass = Class.forName(messageClassName);
								Object messageObject = fromOM(faultElt, messageClass);
								Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
								m.invoke(ex, messageObject);

								callback.receiveErrorresetAllAddonCache(new RemoteException(ex.getMessage(), ex));
							} catch (ClassCastException | AxisFault | ReflectiveOperationException e) {
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

			public void onFault(MessageContext faultContext) {
				AxisFault fault = Utils.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender().cleanup(_messageContext);
				} catch (AxisFault axisFault) {
					callback.receiveErrorresetAllAddonCache(axisFault);
				}
			}
		});

		CallbackReceiver _callbackReceiver;

		if ((_operations[30].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new CallbackReceiver();
			_operations[30].setMessageReceiver(_callbackReceiver);
		}

		//execute the operation client
		_operationClient.execute(false);
	}

	////////////////////////////////////////////////////////////////////////
	private static Policy POLICY = PolicyEngine.getPolicy(OMXMLBuilderFactory.createOMBuilder(new StringReader("<wsp:Policy wsu:Id=\"BinaryHttpAddOnServiceEndpoint_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><msb:BinaryEncoding xmlns:msb=\"http://schemas.microsoft.com/ws/06/2004/mspolicy/netbinary1\"></msb:BinaryEncoding><wsaw:UsingAddressing xmlns:wsaw=\"http://www.w3.org/2006/05/addressing/wsdl\"></wsaw:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>")).getDocument().getXMLStreamReader(false));
	private static Policy getPolicy() {
		return POLICY;
	}

	private boolean optimizeContent(QName opName) {
		if (opNameArray == null) {
			return false;
		}

		for (QName anOpNameArray : opNameArray) {
			if (opName.equals(anOpNameArray)) {
				return true;
			}
		}

		return false;
	}

	private SOAPEnvelope toEnvelope(SOAPFactory factory, CreateSyncGroup param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(CreateSyncGroup.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetSecureDownloadToken param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetSecureDownloadToken.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, HealthCheck param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(HealthCheck.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetFingerprintMatches param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetFingerprintMatches.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, SaveSyncTransactions param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(SaveSyncTransactions.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetRepositoryMatchFromSlug param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetRepositoryMatchFromSlug.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, V2GetFingerprintMatches param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(V2GetFingerprintMatches.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, CacheHealthCheck param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(CacheHealthCheck.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetAddOnDescription param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetAddOnDescription.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, ResetFeeds param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(ResetFeeds.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, LeaveSyncGroup param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(LeaveSyncGroup.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, SaveSyncSnapshot param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(SaveSyncSnapshot.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetAddOnDump param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetAddOnDump.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetAddOns param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetAddOns.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetDownloadToken param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetDownloadToken.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, V2GetChangeLog param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(V2GetChangeLog.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, V2GetAddOns param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(V2GetAddOns.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetAddOnFile param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetAddOnFile.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetChangeLog param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetChangeLog.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetSyncProfile param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetSyncProfile.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetAllFilesForAddOn param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetAllFilesForAddOn.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetFuzzyMatches param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetFuzzyMatches.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, JoinSyncGroup param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(JoinSyncGroup.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, ListFeeds param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(ListFeeds.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetAddOnFiles param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetAddOnFiles.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, V2GetAddOnDescription param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(V2GetAddOnDescription.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, ResetSingleAddonCache param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(ResetSingleAddonCache.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, GetAddOn param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(GetAddOn.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, LogDump param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(LogDump.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, ServiceHealthCheck param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(ServiceHealthCheck.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */
	private SOAPEnvelope toEnvelope(SOAPFactory factory, ResetAllAddonCache param, boolean optimizeContent, QName elementQName) throws AxisFault {
		SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
		emptyEnvelope.getBody().addChild(param.getOMElement(ResetAllAddonCache.MY_QNAME, factory));

		return emptyEnvelope;
	}

	/* methods to provide back word compatibility */

	/**
	 * get the default envelope
	 */
	private SOAPEnvelope toEnvelope(SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private <T> T fromOM(OMElement param, Class<T> type) throws AxisFault {
		try {
			if (CacheHealthCheck.class == type) {
				return type.cast(CacheHealthCheck.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (CacheHealthCheckResponse.class.equals(type)) {
				return type.cast(CacheHealthCheckResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (CreateSyncGroup.class.equals(type)) {
				return type.cast(CreateSyncGroup.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (CreateSyncGroupResponse.class.equals(type)) {
				return type.cast(CreateSyncGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAddOn.class.equals(type)) {
				return type.cast(GetAddOn.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAddOnDescription.class.equals(type)) {
				return type.cast(GetAddOnDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAddOnDescriptionResponse.class.equals(type)) {
				return type.cast(GetAddOnDescriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAddOnDump.class.equals(type)) {
				return type.cast(GetAddOnDump.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAddOnDumpResponse.class.equals(type)) {
				return type.cast(GetAddOnDumpResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAddOnFile.class.equals(type)) {
				return type.cast(GetAddOnFile.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAddOnFileResponse.class.equals(type)) {
				return type.cast(GetAddOnFileResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAddOnFiles.class.equals(type)) {
				return type.cast(GetAddOnFiles.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAddOnFilesResponse.class.equals(type)) {
				return type.cast(GetAddOnFilesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAddOnResponse.class.equals(type)) {
				return type.cast(GetAddOnResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAddOns.class.equals(type)) {
				return type.cast(GetAddOns.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAddOnsResponse.class.equals(type)) {
				return type.cast(GetAddOnsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAllFilesForAddOn.class.equals(type)) {
				return type.cast(GetAllFilesForAddOn.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetAllFilesForAddOnResponse.class.equals(type)) {
				return type.cast(GetAllFilesForAddOnResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetChangeLog.class.equals(type)) {
				return type.cast(GetChangeLog.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetChangeLogResponse.class.equals(type)) {
				return type.cast(GetChangeLogResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetDownloadToken.class.equals(type)) {
				return type.cast(GetDownloadToken.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetDownloadTokenResponse.class.equals(type)) {
				return type.cast(GetDownloadTokenResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetFingerprintMatches.class.equals(type)) {
				return type.cast(GetFingerprintMatches.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetFingerprintMatchesResponse.class.equals(type)) {
				return type.cast(GetFingerprintMatchesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetFuzzyMatches.class.equals(type)) {
				return type.cast(GetFuzzyMatches.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetFuzzyMatchesResponse.class.equals(type)) {
				return type.cast(GetFuzzyMatchesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetRepositoryMatchFromSlug.class.equals(type)) {
				return type.cast(GetRepositoryMatchFromSlug.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetRepositoryMatchFromSlugResponse.class.equals(type)) {
				return type.cast(GetRepositoryMatchFromSlugResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetSecureDownloadToken.class.equals(type)) {
				return type.cast(GetSecureDownloadToken.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetSecureDownloadTokenResponse.class.equals(type)) {
				return type.cast(GetSecureDownloadTokenResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetSyncProfile.class.equals(type)) {
				return type.cast(GetSyncProfile.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (GetSyncProfileResponse.class.equals(type)) {
				return type.cast(GetSyncProfileResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (HealthCheck.class.equals(type)) {
				return type.cast(HealthCheck.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (HealthCheckResponse.class.equals(type)) {
				return type.cast(HealthCheckResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (JoinSyncGroup.class.equals(type)) {
				return type.cast(JoinSyncGroup.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (JoinSyncGroupResponse.class.equals(type)) {
				return type.cast(JoinSyncGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (LeaveSyncGroup.class.equals(type)) {
				return type.cast(LeaveSyncGroup.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (LeaveSyncGroupResponse.class.equals(type)) {
				return type.cast(LeaveSyncGroupResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (ListFeeds.class.equals(type)) {
				return type.cast(ListFeeds.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (ListFeedsResponse.class.equals(type)) {
				return type.cast(ListFeedsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (LogDump.class.equals(type)) {
				return type.cast(LogDump.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (LogDumpResponse.class.equals(type)) {
				return type.cast(LogDumpResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (ResetAllAddonCache.class.equals(type)) {
				return type.cast(ResetAllAddonCache.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (ResetAllAddonCacheResponse.class.equals(type)) {
				return type.cast(ResetAllAddonCacheResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (ResetFeeds.class.equals(type)) {
				return type.cast(ResetFeeds.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (ResetFeedsResponse.class.equals(type)) {
				return type.cast(ResetFeedsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (ResetSingleAddonCache.class.equals(type)) {
				return type.cast(ResetSingleAddonCache.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (ResetSingleAddonCacheResponse.class.equals(type)) {
				return type.cast(ResetSingleAddonCacheResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (SaveSyncSnapshot.class.equals(type)) {
				return type.cast(SaveSyncSnapshot.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (SaveSyncSnapshotResponse.class.equals(type)) {
				return type.cast(SaveSyncSnapshotResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (SaveSyncTransactions.class.equals(type)) {
				return type.cast(SaveSyncTransactions.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (SaveSyncTransactionsResponse.class.equals(type)) {
				return type.cast(SaveSyncTransactionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (ServiceHealthCheck.class.equals(type)) {
				return type.cast(ServiceHealthCheck.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (ServiceHealthCheckResponse.class.equals(type)) {
				return type.cast(ServiceHealthCheckResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (V2GetAddOnDescription.class.equals(type)) {
				return type.cast(V2GetAddOnDescription.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (V2GetAddOnDescriptionResponse.class.equals(type)) {
				return type.cast(V2GetAddOnDescriptionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (V2GetAddOns.class.equals(type)) {
				return type.cast(V2GetAddOns.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (V2GetAddOnsResponse.class.equals(type)) {
				return type.cast(V2GetAddOnsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (V2GetChangeLog.class.equals(type)) {
				return type.cast(V2GetChangeLog.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (V2GetChangeLogResponse.class.equals(type)) {
				return type.cast(V2GetChangeLogResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (V2GetFingerprintMatches.class.equals(type)) {
				return type.cast(V2GetFingerprintMatches.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}

			if (V2GetFingerprintMatchesResponse.class.equals(type)) {
				return type.cast(V2GetFingerprintMatchesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching()));
			}
		} catch (Exception e) {
			throw AxisFault.makeFault(e);
		}

		throw new IllegalArgumentException("type is unknown");
	}
}
