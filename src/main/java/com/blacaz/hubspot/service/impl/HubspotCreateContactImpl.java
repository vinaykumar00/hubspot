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
import com.blacaz.hubspot.models.ContactRequestModel;
import com.blacaz.hubspot.models.ContactResponse;
import com.blacaz.hubspot.models.contact.ConactHubspotModel;
import com.blacaz.hubspot.models.contact.ContacHubspotProperties;
import com.blacaz.hubspot.service.HubspotCreateContact;

@Service
public class HubspotCreateContactImpl implements HubspotCreateContact {
	@Autowired
	RestTemplate restTemplate;

	@Value("${service.hubspot.contact.url}")
	private String contactUrl;

	@Value("${service.hubspot.apikey}")
	private String apiKey;

	@Override
	public ResponseEntity<ContactResponse> createContact(ContactRequestModel contactRequestModel,
			String trackingId) throws GenericException, RemoteServerException {
		String url = getFullUrl(contactUrl, "hapikey", apiKey);
		ConactHubspotModel conactHubspotModel = null;
		ResponseEntity<String> resp = null;
		ContacHubspotProperties ContacHubspotProperties = null;
		ContactResponse createContactResponse = null;
		List<ContacHubspotProperties> listOfContacHubspotProperties = new ArrayList<>();
		try {
			conactHubspotModel = new ConactHubspotModel();

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("email");
			ContacHubspotProperties.setValue(contactRequestModel.getEmail());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

//			
//			ContacHubspotProperties = new ContacHubspotProperties();
//			ContacHubspotProperties.setProperty("country_code");
//			ContacHubspotProperties.setValue(contactRequestModel.getCountry());
//			listOfContacHubspotProperties.add(ContacHubspotProperties);

			
			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("firstname");
			ContacHubspotProperties.setValue(contactRequestModel.getFirstName());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("lastname");
			ContacHubspotProperties.setValue(contactRequestModel.getLastName());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			
			

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("insurancetype");
			ContacHubspotProperties.setValue(contactRequestModel.getInsuranceType());
			listOfContacHubspotProperties.add(ContacHubspotProperties);


			
			

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("insurance_for_country");
			ContacHubspotProperties.setValue(contactRequestModel.getInsuranceFor());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("jobtitle");
			ContacHubspotProperties.setValue(contactRequestModel.getJobTitle());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("phone");
			ContacHubspotProperties.setValue(contactRequestModel.getPhoneNumber());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("salutation");
			ContacHubspotProperties.setValue(contactRequestModel.getSalutation());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			conactHubspotModel.setProperties(listOfContacHubspotProperties);
			HttpEntity<Object> entity = new HttpEntity<>(conactHubspotModel);
			resp = restTemplate.exchange(url, HttpMethod.POST, entity, String.class,contactRequestModel.getEmail());

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
