package com.blacaz.hubspot.exception;

import org.springframework.http.HttpStatus;

public class GenericException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	private String code;
	private String message;
	private String trackingId;
	private HttpStatus httpStatus;

	public GenericException(String code, String message, String trackingId, HttpStatus httpStatus) {
		this.code = code;
		this.httpStatus = httpStatus;
		this.message = message;
		this.trackingId = trackingId;

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
}
