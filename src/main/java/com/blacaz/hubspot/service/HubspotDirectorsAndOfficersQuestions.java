package com.blacaz.hubspot.service;

import org.springframework.http.ResponseEntity;

import com.blacaz.hubspot.exception.GenericException;
import com.blacaz.hubspot.exception.RemoteServerException;
import com.blacaz.hubspot.models.ContactResponse;
import com.blacaz.hubspot.models.dando.DirectorsAndOfficersQuestionsRequest;

public interface HubspotDirectorsAndOfficersQuestions {

	public ResponseEntity<ContactResponse> updateDirectorsAndOfficersQuestions(DirectorsAndOfficersQuestionsRequest directorsAndOfficersQuestionsRequest,String trackingId) throws RemoteServerException, GenericException;

}
