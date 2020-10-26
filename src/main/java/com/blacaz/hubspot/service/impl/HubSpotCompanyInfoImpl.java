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
import com.blacaz.hubspot.models.contact.ContactCompanyInfo;
import com.blacaz.hubspot.service.HubSpotCompanyInfo;
import com.blacaz.hubspot.utility.HubSpotUtility;

@Service
public class HubSpotCompanyInfoImpl implements HubSpotCompanyInfo {

	@Autowired
	RestTemplate restTemplate;

	@Value("${service.hubspot.update.contactby.email.url}")
	private String contactUrl;

	@Value("${service.hubspot.apikey}")
	private String apiKey;

	@Autowired
	HubSpotUtility hubSpotUtility;

	@Override
	public ResponseEntity<ContactResponse> updateCompanyInfo(ContactCompanyInfo contactCompanyInfo, String trackingId)
			throws RemoteServerException, GenericException {
		String url = getFullUrl(contactUrl, "hapikey", apiKey);
		ConactHubspotModel conactHubspotModel = null;
		ResponseEntity<String> resp = null;
		ContacHubspotProperties contacHubspotProperties = null;
		ContactResponse createContactResponse = null;
		List<ContacHubspotProperties> listOfContacHubspotProperties = new ArrayList<>();
		try {
			conactHubspotModel = new ConactHubspotModel();

			contacHubspotProperties = new ContacHubspotProperties();
			contacHubspotProperties.setProperty("n1_name_of_the_company");
			contacHubspotProperties.setValue(contactCompanyInfo.getNameOfCompany());
			listOfContacHubspotProperties.add(contacHubspotProperties);

			contacHubspotProperties = new ContacHubspotProperties();
			contacHubspotProperties.setProperty("n2_address_of_employment");
			contacHubspotProperties.setValue(contactCompanyInfo.getAddressOfEmployement());
			listOfContacHubspotProperties.add(contacHubspotProperties);

			contacHubspotProperties = new ContacHubspotProperties();
			contacHubspotProperties.setProperty("n3_country");
			contacHubspotProperties.setValue(contactCompanyInfo.getCountry());
			listOfContacHubspotProperties.add(contacHubspotProperties);

			contacHubspotProperties = new ContacHubspotProperties();
			contacHubspotProperties.setProperty("n4_industry_code_name");
			contacHubspotProperties.setValue(contactCompanyInfo.getIndustryCodeAndName());
			listOfContacHubspotProperties.add(contacHubspotProperties);

			contacHubspotProperties = new ContacHubspotProperties();
			contacHubspotProperties.setProperty("full_name_of_the_principal");
			contacHubspotProperties.setValue(contactCompanyInfo.getFullNameOfThePrincipal());
			listOfContacHubspotProperties.add(contacHubspotProperties);

			contacHubspotProperties = new ContacHubspotProperties();
			contacHubspotProperties.setProperty("n6_acra_uen_roc");
			contacHubspotProperties.setValue(contactCompanyInfo.getAcraCodes());
			listOfContacHubspotProperties.add(contacHubspotProperties);

			contacHubspotProperties = new ContacHubspotProperties();
			contacHubspotProperties.setProperty("n5_date_established");
			contacHubspotProperties.setValue(hubSpotUtility.getTimestamp(contactCompanyInfo.getDateEstablished()));
			listOfContacHubspotProperties.add(contacHubspotProperties);

			conactHubspotModel.setProperties(listOfContacHubspotProperties);
			HttpEntity<Object> entity = new HttpEntity<>(conactHubspotModel);
			resp = restTemplate.exchange(url, HttpMethod.POST, entity, String.class, contactCompanyInfo.getEmail());

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

		if (resp.getStatusCode().equals(HttpStatus.NO_CONTENT)) {
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
