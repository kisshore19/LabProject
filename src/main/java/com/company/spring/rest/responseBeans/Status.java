/**
 * 
 */
package com.company.spring.rest.responseBeans;

/**
 * @author ogvkisshorre
 * 
 */

public class Status {
	private String reference;
	private String responseMessage;
	private String responseCode;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

}
