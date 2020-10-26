package com.blacaz.hubspot.service;

import org.springframework.http.ResponseEntity;

import com.blacaz.hubspot.exception.GenericException;
import com.blacaz.hubspot.exception.RemoteServerException;
import com.blacaz.hubspot.models.ContactResponse;
import com.blacaz.hubspot.models.TermsAndConditionsRequest;

public interface HubSpotAcceptTermsAndConditions {

	ResponseEntity<ContactResponse> acceptTermsAndConditions(TermsAndConditionsRequest termsAndConditionsRequest,String trackingId) throws GenericException, RemoteServerException;
}
