package com.blacaz.hubspot.service;

import org.springframework.http.ResponseEntity;

import com.blacaz.hubspot.exception.GenericException;
import com.blacaz.hubspot.exception.RemoteServerException;
import com.blacaz.hubspot.models.ContactResponse;
import com.blacaz.hubspot.models.contact.ContactCompanyInfo;

public interface HubSpotCompanyInfo {

	public ResponseEntity<ContactResponse> updateCompanyInfo(ContactCompanyInfo contactCompanyInfo,String trackingId) throws RemoteServerException, GenericException;

}
