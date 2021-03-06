/**
 * Copyright (C) 2012 KRM Associates, Inc. healtheme@krminc.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.krminc.phr.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CCRServiceSoap12", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CCRServiceSoap12 {


    /**
     * 
     * @param verify
     * @param access
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "CCRServiceLogin", action = "CCRServiceLogin")
    @WebResult(targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
    @RequestWrapper(localName = "CCRServiceLogin", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.CCRServiceLogin")
    @ResponseWrapper(localName = "CCRServiceLoginResponse", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.CCRServiceLoginResponse")
    public boolean ccrServiceLogin(
        @WebParam(name = "access", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String access,
        @WebParam(name = "verify", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String verify);

    /**
     * 
     * @param verify
     * @param access
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Ping", action = "Ping")
    @WebResult(targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
    @RequestWrapper(localName = "Ping", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.Ping")
    @ResponseWrapper(localName = "PingResponse", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.PingResponse")
    public String ping(
        @WebParam(name = "access", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String access,
        @WebParam(name = "verify", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String verify);

    /**
     * 
     * @param verify
     * @param ien
     * @param access
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCCRForPatientDFN", action = "GetCCRForPatientDFN")
    @WebResult(targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
    @RequestWrapper(localName = "GetCCRForPatientDFN", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.GetCCRForPatientDFN")
    @ResponseWrapper(localName = "GetCCRForPatientDFNResponse", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.GetCCRForPatientDFNResponse")
    public String getCCRForPatientDFN(
        @WebParam(name = "access", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String access,
        @WebParam(name = "verify", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String verify,
        @WebParam(name = "IEN", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String ien);

    /**
     * 
     * @param verify
     * @param ien
     * @param access
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCCDForPatientDFN", action = "GetCCDForPatientDFN")
    @WebResult(targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
    @RequestWrapper(localName = "GetCCDForPatientDFN", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.GetCCDForPatientDFN")
    @ResponseWrapper(localName = "GetCCDForPatientDFNResponse", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.GetCCDForPatientDFNResponse")
    public String getCCDForPatientDFN(
        @WebParam(name = "access", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String access,
        @WebParam(name = "verify", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String verify,
        @WebParam(name = "IEN", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String ien);

    /**
     * 
     * @param verify
     * @param ien
     * @param access
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetXSLFormattedCCRForPatientDFN", action = "GetXSLFormattedCCRForPatientDFN")
    @WebResult(targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
    @RequestWrapper(localName = "GetXSLFormattedCCRForPatientDFN", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.GetXSLFormattedCCRForPatientDFN")
    @ResponseWrapper(localName = "GetXSLFormattedCCRForPatientDFNResponse", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.GetXSLFormattedCCRForPatientDFNResponse")
    public String getXSLFormattedCCRForPatientDFN(
        @WebParam(name = "access", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String access,
        @WebParam(name = "verify", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String verify,
        @WebParam(name = "IEN", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String ien);

    /**
     * 
     * @param verify
     * @param ien
     * @param access
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetXSLFormattedCCDForPatientDFN", action = "GetXSLFormattedCCDForPatientDFN")
    @WebResult(targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
    @RequestWrapper(localName = "GetXSLFormattedCCDForPatientDFN", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.GetXSLFormattedCCDForPatientDFN")
    @ResponseWrapper(localName = "GetXSLFormattedCCDForPatientDFNResponse", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.GetXSLFormattedCCDForPatientDFNResponse")
    public String getXSLFormattedCCDForPatientDFN(
        @WebParam(name = "access", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String access,
        @WebParam(name = "verify", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String verify,
        @WebParam(name = "IEN", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String ien);

    /**
     * 
     * @return
     *     returns java.util.List<com.krminc.phr.ws.FMPatient>
     */
    @WebMethod(operationName = "GetAllPatients", action = "GetAllPatients")
    @WebResult(targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
    @RequestWrapper(localName = "GetAllPatients", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.GetAllPatients")
    @ResponseWrapper(localName = "GetAllPatientsResponse", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.GetAllPatientsResponse")
    public List<FMPatient> getAllPatients();

    /**
     * 
     * @param id
     * @param verify
     * @param access
     * @return
     *     returns java.util.List<com.krminc.phr.ws.FMPatient>
     */
    @WebMethod(operationName = "LookupPatientsByID", action = "LookupPatientsByID")
    @WebResult(targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
    @RequestWrapper(localName = "LookupPatientsByID", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.LookupPatientsByID")
    @ResponseWrapper(localName = "LookupPatientsByIDResponse", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.LookupPatientsByIDResponse")
    public List<FMPatient> lookupPatientsByID(
        @WebParam(name = "access", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String access,
        @WebParam(name = "verify", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String verify,
        @WebParam(name = "ID", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String id);

    /**
     * 
     * @param verify
     * @param name
     * @param access
     * @return
     *     returns java.util.List<com.krminc.phr.ws.FMPatient>
     */
    @WebMethod(operationName = "LookupPatientsByName", action = "LookupPatientsByName")
    @WebResult(targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
    @RequestWrapper(localName = "LookupPatientsByName", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.LookupPatientsByName")
    @ResponseWrapper(localName = "LookupPatientsByNameResponse", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/", className = "com.krminc.phr.ws.LookupPatientsByNameResponse")
    public List<FMPatient> lookupPatientsByName(
        @WebParam(name = "access", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String access,
        @WebParam(name = "verify", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String verify,
        @WebParam(name = "name", targetNamespace = "http://service.ws.ovid.ccr.medsphere.com/")
        String name);

}
