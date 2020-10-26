package com.blacaz.hubspot.service;

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
import com.blacaz.hubspot.models.BasicInfo;
import com.blacaz.hubspot.models.CompanyInfo;
import com.blacaz.hubspot.models.ContactDetailsResponse;
import com.blacaz.hubspot.models.Quotation;
import com.blacaz.hubspot.models.QuoteRequest;
import com.blacaz.hubspot.models.QuoteResponse;
import com.blacaz.hubspot.models.contact.HubSpotContactDetails;

@Service
public class GetContactByEmail {

	@Autowired
	RestTemplate restTemplate;

	@Value("${service.hubspot.apikey}")
	private String apiKey;

	@Value("${service.hubspot.update.contactby.email.url}")
	private String contactUrl;

	@Value("${service.hubspot.quote.url}")
	private String quoteUrl;

	public ResponseEntity<ContactDetailsResponse> getContactDetails(String email, String trackingId)
			throws RemoteServerException, GenericException {

		String url = getFullUrl(contactUrl, "hapikey", apiKey);
		ResponseEntity<HubSpotContactDetails> resp = null;
		ResponseEntity<QuoteResponse> response = null;
		ContactDetailsResponse contactDetailsResponse = new ContactDetailsResponse();
		BasicInfo basicInfo = new BasicInfo();
		CompanyInfo companyInfo = new CompanyInfo();
		Quotation quotation = new Quotation();
		QuoteRequest quoteRequest = new QuoteRequest();
		try {
			resp = restTemplate.getForEntity(url, HubSpotContactDetails.class, email);

			basicInfo.setEmail(email);
			basicInfo.setFirstName(resp.getBody().getProperties().getFirstname().getValue());
			basicInfo.setInsuranceFor(resp.getBody().getProperties().getInsuranceForCountry().getValue());
			basicInfo.setLastName(resp.getBody().getProperties().getLastname().getValue());
			basicInfo.setPhoneNumber(resp.getBody().getProperties().getPhone().getValue());
			basicInfo.setSalutation(resp.getBody().getProperties().getSalutation().getValue());
			basicInfo.setJobTitle(resp.getBody().getProperties().getJobtitle().getValue());
			companyInfo.setCountry(resp.getBody().getProperties().getN3Country().getValue());

			companyInfo.setNameOfCompany(resp.getBody().getProperties().getN1NameOfTheCompany().getValue());

			companyInfo.setAcraCodes(resp.getBody().getProperties().getN6AcraUenRoc().getValue());

			companyInfo.setAddressOfEmployement(resp.getBody().getProperties().getN2AddressOfEmployment().getValue());
			companyInfo.setDateEstablished(resp.getBody().getProperties().getN5DateEstablished().getValue());
			companyInfo.setFullNameOfThePrincipal(null);
			companyInfo.setIndustryCodeAndName(resp.getBody().getProperties().getN4IndustryCodeName().getValue());
			companyInfo.setEmail(email);
			
			quoteRequest.setLimitOfLiability(resp.getBody().getProperties().getDesiredLimitOfLiability().getValue());
			quoteRequest.setSubLimitOfLiability(
					resp.getBody().getProperties().getLimitForCompanyEmploymentPracticeLiability().getValue());
			quoteRequest.setTotalConsolidatedAssetsLimit(
					resp.getBody().getProperties().getTotalConsolidatedAssetsOfCompanyname().getValue());

			response = restTemplate.postForEntity(quoteUrl, quoteRequest, QuoteResponse.class);
			quotation.setLimitOfLiabilityFor(resp.getBody().getProperties().getDesiredLimitOfLiability().getValue());

			quotation.setSubLimitFor(response.getBody().getLimitOfLiabilityFor());
			quotation.setGstPercent(response.getBody().getGstPercent());
			quotation.setLimitOfLiabilityFor(response.getBody().getLimitOfLiabilityFor());
			quotation.setLimitOfLiabilityPrice(response.getBody().getLimitOfLiabilityPrice());
			quotation.setSubLimitFor(response.getBody().getSubLimitFor());
			quotation.setSubLimitForPrice(response.getBody().getSubLimitForPrice());
			quotation.setTotalPriceWithGst(response.getBody().getTotalPriceWithGst());
			quotation.setTotalPriceWithoutGst(response.getBody().getTotalPriceWithoutGst());
			quotation.setGstValue(response.getBody().getGstValue());
			contactDetailsResponse.setBasicInfo(basicInfo);
			contactDetailsResponse.setCompanyInfo(companyInfo);
			contactDetailsResponse.setQuotation(quotation);
			contactDetailsResponse.setQuotationValues(quotation);
			
		} catch (HttpClientErrorException e) {
			if (e.getStatusCode().equals(HttpStatus.CONFLICT))
				throw new GenericException(e.getStatusCode().toString(), "Duplicate Email", trackingId,
						e.getStatusCode());

			throw new GenericException(e.getStatusCode().toString(), e.getResponseBodyAsString(), trackingId,
					e.getStatusCode());

		} catch (HttpServerErrorException e) {
e.printStackTrace();
			throw new GenericException(e.getStatusCode().toString(), e.getResponseBodyAsString(), trackingId,
					e.getStatusCode());

		} catch (Exception e) {
e.printStackTrace();
			throw new RemoteServerException("500", "Error calling hubspot API", trackingId,
					HttpStatus.INTERNAL_SERVER_ERROR);

		}
		return new ResponseEntity<ContactDetailsResponse>(contactDetailsResponse, HttpStatus.OK);
	}

	public String getFullUrl(String url, String queryName, String queryvalue) {
		return url + "?" + queryName + "=" + queryvalue;

	}

}
