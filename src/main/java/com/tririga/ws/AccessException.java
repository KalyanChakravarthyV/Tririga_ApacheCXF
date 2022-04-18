
package com.tririga.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.0
 * 2022-04-11T17:47:51.297+05:30
 * Generated source version: 3.5.0
 */

@WebFault(name = "AccessException", targetNamespace = "http://ws.tririga.com")
public class AccessException extends java.lang.Exception {

    private com.tririga.ws.errors.AccessException faultInfo;

    public AccessException() {
        super();
    }

    public AccessException(String message) {
        super(message);
    }

    public AccessException(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public AccessException(String message, com.tririga.ws.errors.AccessException accessException) {
        super(message);
        this.faultInfo = accessException;
    }

    public AccessException(String message, com.tririga.ws.errors.AccessException accessException, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = accessException;
    }

    public com.tririga.ws.errors.AccessException getFaultInfo() {
        return this.faultInfo;
    }
}