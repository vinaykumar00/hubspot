package com.blacaz.hubspot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.blacaz.hubspot.exception.GenericException;
import com.blacaz.hubspot.exception.RemoteServerException;
import com.blacaz.hubspot.models.industries.Industries;
import com.blacaz.hubspot.models.industries.IndustriesResponse;
import com.blacaz.hubspot.models.industries.IndustriesResponseValues;
import com.blacaz.hubspot.service.HubspotIndustriesService;

@Service
public class HubspotIndustriesServiceImpl implements HubspotIndustriesService {

	@Autowired
	RestTemplate restTemplate;

	@Value("${service.hubspot.industries.url}")
	private String industriesUrl;

	@Value("${service.hubspot.apikey}")
	private String apiKey;

	@Value("#{'${service.hubspot.properties.supported}'.split(',')}")
	ArrayList<String> products;

	@Override
	public ResponseEntity<IndustriesResponse> getIndustries(String trackingId)
			throws RemoteServerException, GenericException {

		IndustriesResponse industriesResponse = new IndustriesResponse();
		List<IndustriesResponseValues> listOfIndustries = new ArrayList<>();
		try {
			String url = getFullUrl(industriesUrl, "hapikey", apiKey);
			products.forEach(property -> {
				ResponseEntity<Industries> entry = restTemplate.getForEntity(url, Industries.class, property);

				entry.getBody().getOptions()
						.forEach(a -> listOfIndustries.add(new IndustriesResponseValues(a.getLabel(), a.getValue())));

			});
			industriesResponse.setIndustryCodes(listOfIndustries);

		} catch (HttpClientErrorException e) {
			throw new GenericException(e.getStatusCode().toString(), "Error calling hubspot API", trackingId,
					e.getStatusCode());
		} catch (HttpServerErrorException e) {
			throw new GenericException(e.getStatusCode().toString(), "Error calling hubspot API", trackingId,
					e.getStatusCode());

		} catch (Exception e) {
			throw new RemoteServerException("500", "Error calling hubspot API", trackingId,
					HttpStatus.INTERNAL_SERVER_ERROR);

		}

		return new ResponseEntity<IndustriesResponse>(industriesResponse, HttpStatus.OK);
	}

	public String getFullUrl(String url, String queryName, String queryvalue) {
		return url + "?" + queryName + "=" + queryvalue;

	}
}
