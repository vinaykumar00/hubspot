package com.blacaz.hubspot.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.blacaz.hubspot.models.ErrorResponse;


@ControllerAdvice
public class HubspotExceptionHandler {

	@ExceptionHandler(value = GenericException.class)
	public ResponseEntity<Object> exception(GenericException exception) {
		ErrorResponse ErrorResponse = new ErrorResponse();

		ErrorResponse.setCode(exception.getHttpStatus().toString());
		ErrorResponse.setMessage(exception.getMessage());
		return new ResponseEntity<Object>(ErrorResponse, exception.getHttpStatus());
	}

	
	
	@ExceptionHandler(value = RemoteServerException.class)
	public ResponseEntity<Object> exception(RemoteServerException exception) {
		ErrorResponse ErrorResponse = new ErrorResponse();

		ErrorResponse.setCode(exception.getHttpStatus().toString());
		ErrorResponse.setMessage(exception.getMessage());
		return new ResponseEntity<Object>(ErrorResponse, exception.getHttpStatus());
	}

}
