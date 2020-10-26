package com.blacaz.hubspot.service;

import org.springframework.http.ResponseEntity;

import com.blacaz.hubspot.exception.GenericException;
import com.blacaz.hubspot.exception.RemoteServerException;
import com.blacaz.hubspot.models.ContactResponse;
import com.blacaz.hubspot.models.dando.DirectorsAndOfficersQuotationRequest;

public interface HubSpotDirectorsAndOfficersQuotation {

	public ResponseEntity<ContactResponse> updateDirectorsAndOfficersQuestions(
			DirectorsAndOfficersQuotationRequest directorsAndOfficersQuotationRequest, String trackingId)
			throws RemoteServerException, GenericException;

}
