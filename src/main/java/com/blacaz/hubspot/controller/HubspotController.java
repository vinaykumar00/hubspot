package com.blacaz.hubspot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blacaz.hubspot.exception.GenericException;
import com.blacaz.hubspot.exception.RemoteServerException;
import com.blacaz.hubspot.models.ContactDetailsResponse;
import com.blacaz.hubspot.models.ContactRequestModel;
import com.blacaz.hubspot.models.ContactResponse;
import com.blacaz.hubspot.models.TermsAndConditionsRequest;
import com.blacaz.hubspot.models.contact.ContactCompanyInfo;
import com.blacaz.hubspot.models.dando.DirectorsAndOfficersQuestionsRequest;
import com.blacaz.hubspot.models.dando.DirectorsAndOfficersQuotationRequest;
import com.blacaz.hubspot.models.industries.IndustriesResponse;
import com.blacaz.hubspot.service.GetContactByEmail;
import com.blacaz.hubspot.service.HubSpotAcceptTermsAndConditions;
import com.blacaz.hubspot.service.HubSpotCompanyInfo;
import com.blacaz.hubspot.service.HubSpotDirectorsAndOfficersQuotation;
import com.blacaz.hubspot.service.HubspotCreateContact;
import com.blacaz.hubspot.service.HubspotDirectorsAndOfficersQuestions;
import com.blacaz.hubspot.service.HubspotIndustriesService;
import com.blacaz.hubspot.utility.HubSpotUtility;

@RestController
@RequestMapping("v1/hubspot")
public class HubspotController {
	Logger logger = LoggerFactory.getLogger(HubspotController.class);

	@Autowired
	HubSpotUtility hubSpotUtility;

	@Autowired
	GetContactByEmail getContactByEmail;

	@Autowired
	HubspotIndustriesService hubspotIndustriesService;

	@Autowired
	HubspotCreateContact hubspotCreateContact;

	@Autowired
	HubspotDirectorsAndOfficersQuestions hubspotDirectorsAndOfficersQuestions;

	@Autowired
	HubSpotCompanyInfo hubSpotCompanyInfo;

	@Autowired
	HubSpotDirectorsAndOfficersQuotation hubSpotDirectorsAndOfficersQuotation;

	@Autowired
	HubSpotAcceptTermsAndConditions hubSpotAcceptTermsAndConditions;
	
	
	/**
	 * API endpoint to fetch Industries supported for BLACAZ
	 * 
	 * @return
	 * @throws RemoteServerException
	 * @throws GenericException
	 */
	@GetMapping("/industries")
	public ResponseEntity<IndustriesResponse> getIndustry() throws RemoteServerException, GenericException {

		String trackingID = hubSpotUtility.getTrackingID();
		logger.info("Fetch industries for TrackingID=" + trackingID);
		return hubspotIndustriesService.getIndustries(trackingID);
	}

	/**
	 * API to save contact basic info
	 * 
	 * @param contctRequest
	 * @return
	 * @throws RemoteServerException
	 * @throws GenericException
	 */
	@PostMapping("/contact/basicinfo")
	public ResponseEntity<ContactResponse> createContact(@RequestBody ContactRequestModel contctRequest)
			throws RemoteServerException, GenericException {
		String trackingID = hubSpotUtility.getTrackingID();

		return hubspotCreateContact.createContact(contctRequest, trackingID);
	}

	/**
	 * API to fetch questions for Directors and officers
	 * 
	 * @param directorsAndOfficersQuestionsRequest
	 * @return
	 * @throws RemoteServerException
	 * @throws GenericException
	 */
	@PostMapping("/contact/directorsandofficers/questions")
	public ResponseEntity<ContactResponse> createContact(
			@RequestBody DirectorsAndOfficersQuestionsRequest directorsAndOfficersQuestionsRequest)
			throws RemoteServerException, GenericException {
		String trackingID = hubSpotUtility.getTrackingID();

		return hubspotDirectorsAndOfficersQuestions
				.updateDirectorsAndOfficersQuestions(directorsAndOfficersQuestionsRequest, trackingID);
	}

	/**
	 * API to show quotation for directors and officers
	 * 
	 * @param directorsAndOfficersQuotationRequest
	 * @return
	 * @throws RemoteServerException
	 * @throws GenericException
	 */
	@PostMapping("/contact/directorsandofficers/quotation")
	public ResponseEntity<ContactResponse> addQuotation(
			@RequestBody DirectorsAndOfficersQuotationRequest directorsAndOfficersQuotationRequest)
			throws RemoteServerException, GenericException {
		String trackingID = hubSpotUtility.getTrackingID();

		return hubSpotDirectorsAndOfficersQuotation
				.updateDirectorsAndOfficersQuestions(directorsAndOfficersQuotationRequest, trackingID);
	}

	/**
	 * API to save contact info
	 * 
	 * @param ContactCompanyInfo
	 * @return
	 * @throws RemoteServerException
	 * @throws GenericException
	 */
	@PostMapping("/contact/companyinfo")
	public ResponseEntity<ContactResponse> updateContactCompanyInfo(@RequestBody ContactCompanyInfo ContactCompanyInfo)
			throws RemoteServerException, GenericException {
		String trackingID = hubSpotUtility.getTrackingID();
		return hubSpotCompanyInfo.updateCompanyInfo(ContactCompanyInfo, trackingID);
	}

	@GetMapping("/contact/{email}")
	public ResponseEntity<ContactDetailsResponse> getContactDetails(@PathVariable("email") String email)
			throws RemoteServerException, GenericException {
		String trackingID = hubSpotUtility.getTrackingID();
		return getContactByEmail.getContactDetails(email, trackingID);
	}

	@PostMapping("/termsandconditions")
	public ResponseEntity<ContactResponse> acceptTermsAndConditions(@RequestBody TermsAndConditionsRequest termsAndConditionsRequest)
			throws RemoteServerException, GenericException {
		String trackingID = hubSpotUtility.getTrackingID();
		return hubSpotAcceptTermsAndConditions.acceptTermsAndConditions(termsAndConditionsRequest, trackingID);
	}

}
