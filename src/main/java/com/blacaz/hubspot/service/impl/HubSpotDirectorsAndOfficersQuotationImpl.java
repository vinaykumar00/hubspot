package com.blacaz.hubspot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.blacaz.hubspot.exception.GenericException;
import com.blacaz.hubspot.exception.RemoteServerException;
import com.blacaz.hubspot.models.ContactResponse;
import com.blacaz.hubspot.models.contact.ConactHubspotModel;
import com.blacaz.hubspot.models.contact.ContacHubspotProperties;
import com.blacaz.hubspot.models.dando.DirectorsAndOfficersQuotationRequest;
import com.blacaz.hubspot.service.HubSpotDirectorsAndOfficersQuotation;
import com.blacaz.hubspot.utility.HubSpotUtility;

@Service
public class HubSpotDirectorsAndOfficersQuotationImpl implements HubSpotDirectorsAndOfficersQuotation {

	@Autowired
	RestTemplate restTemplate;

	@Value("${service.hubspot.contact.url}")
	private String contactUrl;

	@Value("${service.hubspot.apikey}")
	private String apiKey;

	@Autowired
	private HubSpotUtility hubSpotUtility;

	@Override
	public ResponseEntity<ContactResponse> updateDirectorsAndOfficersQuestions(
			DirectorsAndOfficersQuotationRequest directorsAndOfficersQuotationRequest, String trackingId)
			throws RemoteServerException, GenericException {
		String url = getFullUrl(contactUrl, "hapikey", apiKey);
		ConactHubspotModel conactHubspotModel = null;
		ResponseEntity<String> resp = null;
		ContacHubspotProperties ContacHubspotProperties = null;
		ContactResponse createContactResponse = null;
		List<ContacHubspotProperties> listOfContacHubspotProperties = new ArrayList<>();
		try {
			conactHubspotModel = new ConactHubspotModel();

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("i_have_acknowledge_the_full_policy_wording");
			ContacHubspotProperties.setValue(directorsAndOfficersQuotationRequest.getAgreeToPolicy());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("desired_limit_of_liability");
			ContacHubspotProperties.setValue(directorsAndOfficersQuotationRequest.getLimitOfLiability());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("starting_date_of_coverage");
			ContacHubspotProperties.setValue(
					hubSpotUtility.getTimestamp(directorsAndOfficersQuotationRequest.getStartingDateOfCoverage()));
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("limit_for_company_employment_practice_liability");
			ContacHubspotProperties.setValue(directorsAndOfficersQuotationRequest.getSubLimitForCompanyEPL());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("total_consolidated_assets_of_companyname");
			ContacHubspotProperties.setValue(directorsAndOfficersQuotationRequest.getTotalConsolidatedAssets());
			listOfContacHubspotProperties.add(ContacHubspotProperties);


			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("total_price_with_gst");
			ContacHubspotProperties.setValue(directorsAndOfficersQuotationRequest.getTotalPriceWithGST().toString());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			
			
			
			conactHubspotModel.setProperties(listOfContacHubspotProperties);
			HttpEntity<Object> entity = new HttpEntity<>(conactHubspotModel);
			resp = restTemplate.exchange(url, HttpMethod.POST, entity, String.class,
					directorsAndOfficersQuotationRequest.getEmail());

		} catch (HttpClientErrorException e) {
			if (e.getStatusCode().equals(HttpStatus.CONFLICT))
				throw new GenericException(e.getStatusCode().toString(), "Duplicate Email", trackingId,
						e.getStatusCode());

			throw new GenericException(e.getStatusCode().toString(), e.getResponseBodyAsString(), trackingId,
					e.getStatusCode());

		} catch (HttpServerErrorException e) {
			throw new GenericException(e.getStatusCode().toString(), e.getResponseBodyAsString(), trackingId,
					e.getStatusCode());

		} catch (Exception e) {
			throw new RemoteServerException("500", "Error calling hubspot API", trackingId,
					HttpStatus.INTERNAL_SERVER_ERROR);

		}

		if (resp.getStatusCode().equals(HttpStatus.OK)) {
			createContactResponse = new ContactResponse();
			createContactResponse.setSuccess(true);
			return new ResponseEntity<ContactResponse>(createContactResponse, HttpStatus.OK);
		}

		return null;
	}

	public String getFullUrl(String url, String queryName, String queryvalue) {
		return url + "?" + queryName + "=" + queryvalue;

	}

}
