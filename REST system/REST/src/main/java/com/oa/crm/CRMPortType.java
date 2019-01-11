package com.oa.crm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "CRMPortType", targetNamespace = "webservices.services.weaver.com.cn")
public interface CRMPortType {

	/**
	 * 
	 * @param in0
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "ReadOAStatus")
	@WebResult(name = "out", targetNamespace = "webservices.services.weaver.com.cn")
	@RequestWrapper(localName = "ReadOAStatus", targetNamespace = "webservices.services.weaver.com.cn", className = "com.oa.crm.ReadOAStatus")
	@ResponseWrapper(localName = "ReadOAStatusResponse", targetNamespace = "webservices.services.weaver.com.cn", className = "com.oa.crm.ReadOAStatusResponse")
	public String readOAStatus(
			@WebParam(name = "in0", targetNamespace = "webservices.services.weaver.com.cn") String in0);

	/**
	 * 
	 * @param in1
	 * @param in0
	 * @return returns java.lang.String
	 */
	@WebMethod(operationName = "ReadOAEMP")
	@WebResult(name = "out", targetNamespace = "webservices.services.weaver.com.cn")
	@RequestWrapper(localName = "ReadOAEMP", targetNamespace = "webservices.services.weaver.com.cn", className = "com.oa.crm.ReadOAEMP")
	@ResponseWrapper(localName = "ReadOAEMPResponse", targetNamespace = "webservices.services.weaver.com.cn", className = "com.oa.crm.ReadOAEMPResponse")
	public String readOAEMP(
			@WebParam(name = "in0", targetNamespace = "webservices.services.weaver.com.cn") String in0,
			@WebParam(name = "in1", targetNamespace = "webservices.services.weaver.com.cn") String in1);

}