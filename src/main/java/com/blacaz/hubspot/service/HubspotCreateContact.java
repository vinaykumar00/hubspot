package com.blacaz.hubspot.service;

import org.springframework.http.ResponseEntity;

import com.blacaz.hubspot.exception.GenericException;
import com.blacaz.hubspot.exception.RemoteServerException;
import com.blacaz.hubspot.models.ContactRequestModel;
import com.blacaz.hubspot.models.ContactResponse;

public interface HubspotCreateContact {
	public ResponseEntity<ContactResponse> createContact(ContactRequestModel contactRequestModel,String trackingId) throws RemoteServerException, GenericException;
}
