package com.blacaz.hubspot.service;

import org.springframework.http.ResponseEntity;

import com.blacaz.hubspot.exception.GenericException;
import com.blacaz.hubspot.exception.RemoteServerException;
import com.blacaz.hubspot.models.industries.IndustriesResponse;

public interface HubspotIndustriesService {

	public ResponseEntity<IndustriesResponse> getIndustries(String trackingId) throws RemoteServerException, GenericException;
}
