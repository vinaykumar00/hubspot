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
import com.blacaz.hubspot.models.dando.DirectorsAndOfficersQuestionsRequest;
import com.blacaz.hubspot.service.HubspotDirectorsAndOfficersQuestions;
import com.blacaz.hubspot.utility.HubSpotUtility;

@Service
public class HubspotDirectorsAndOfficersQuestionsImpl implements HubspotDirectorsAndOfficersQuestions {

	@Autowired
	RestTemplate restTemplate;

	@Value("${service.hubspot.update.contactby.email.url}")
	private String updateContactByUrl;

	@Value("${service.hubspot.apikey}")
	private String apiKey;

	@Autowired
	private HubSpotUtility hubSpotUtility;

	@Override
	public ResponseEntity<ContactResponse> updateDirectorsAndOfficersQuestions(
			DirectorsAndOfficersQuestionsRequest directorsAndOfficersQuestionsRequest, String trackingId)
			throws RemoteServerException, GenericException {
		String url = getFullUrl(updateContactByUrl, "hapikey", apiKey);
		ConactHubspotModel conactHubspotModel = null;
		ResponseEntity<String> resp = null;
		ContacHubspotProperties ContacHubspotProperties = null;
		ContactResponse createContactResponse = null;
		List<ContacHubspotProperties> listOfContacHubspotProperties = new ArrayList<>();
		try {
			conactHubspotModel = new ConactHubspotModel();

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty("current_d_o_liability_insurance_policy_holders");
			ContacHubspotProperties
					.setValue(directorsAndOfficersQuestionsRequest.getCurrent_d_o_liability_insurance_policy_holders());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			System.out.println("=========" + directorsAndOfficersQuestionsRequest.getInitial_starting_date());
			if (null != directorsAndOfficersQuestionsRequest.getInitial_starting_date()
					&& !"".equals(directorsAndOfficersQuestionsRequest.getInitial_starting_date())) {
				ContacHubspotProperties = new ContacHubspotProperties();
				ContacHubspotProperties.setProperty("initial_starting_date");
				ContacHubspotProperties.setValue(
						hubSpotUtility.getTimestamp(directorsAndOfficersQuestionsRequest.getInitial_starting_date()));
				listOfContacHubspotProperties.add(ContacHubspotProperties);
			}

			if (null != directorsAndOfficersQuestionsRequest.getExpiring_date()
					&& !"".equals(directorsAndOfficersQuestionsRequest.getExpiring_date())) {
				ContacHubspotProperties = new ContacHubspotProperties();
				ContacHubspotProperties.setProperty("expiring_date");
				ContacHubspotProperties
						.setValue(hubSpotUtility.getTimestamp(directorsAndOfficersQuestionsRequest.getExpiring_date()));
				listOfContacHubspotProperties.add(ContacHubspotProperties);

			}

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties
					.setProperty("are_you_aware_of_any_ongoing_or_arising_claim_regarding_your_d_o_liability");
			ContacHubspotProperties.setValue(directorsAndOfficersQuestionsRequest
					.getAre_you_aware_of_any_ongoing_or_arising_claim_regarding_your_d_o_liability());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties
					.setProperty("the_company_and_its_subsidiaries_are_not_domiciled_or_incorporated_in_the_usa");
			ContacHubspotProperties.setValue(directorsAndOfficersQuestionsRequest
					.getThe_company_and_its_subsidiaries_are_not_domiciled_or_incorporated_in_the_usa());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty(
					"the_company_and_its_subsidiaries_are_not_involved_in_the_following_sectors_airlines_biotechnology_m");
			ContacHubspotProperties.setValue(directorsAndOfficersQuestionsRequest
					.getThe_company_and_its_subsidiaries_are_not_involved_in_the_following_sectors_airlines_biotechnology_m());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty(
					"the_company_and_its_subsidiaries_do_not_have_any_securities_including_equities_debt_shares_notes_bo");
			ContacHubspotProperties.setValue(directorsAndOfficersQuestionsRequest
					.getThe_company_and_its_subsidiaries_do_not_have_any_securities_including_equities_debt_shares_notes_bo());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty(
					"the_company_and_its_subsidiaries_have_been_in_continuous_operations_for_the_past_2_years_");
			ContacHubspotProperties.setValue(directorsAndOfficersQuestionsRequest
					.getThe_company_and_its_subsidiaries_have_been_in_continuous_operations_for_the_past_2_years_());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty(
					"the_company_and_its_subsidiaries_have_no_business_operations_assets_or_revenues_derived_from_busine");
			ContacHubspotProperties.setValue(directorsAndOfficersQuestionsRequest
					.getThe_company_and_its_subsidiaries_have_no_business_operations_assets_or_revenues_derived_from_busine());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty(
					"the_company_and_its_subsidiaries_have_total_assets_that_exceed_total_liabilities_and_that_there_is_");
			ContacHubspotProperties.setValue(directorsAndOfficersQuestionsRequest
					.getThe_company_and_its_subsidiaries_have_total_assets_that_exceed_total_liabilities_and_that_there_is_());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty(
					"the_company_its_subsidiaries_and_its_directors_or_officers_after_full_enquiries_have_never_been_the");
			ContacHubspotProperties.setValue(directorsAndOfficersQuestionsRequest
					.getThe_company_its_subsidiaries_and_its_directors_or_officers_after_full_enquiries_have_never_been_the());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			
			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty(
					"the_current_number_of_employees_does_not_exceed_120_employees");
			ContacHubspotProperties.setValue(directorsAndOfficersQuestionsRequest
					.getThe_current_number_of_employees_does_not_exceed_120_employees());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			
			ContacHubspotProperties = new ContacHubspotProperties();
			ContacHubspotProperties.setProperty(
					"there_have_been_no_retrenchments_in_the_past_1_year_and_none_are_expected_over_the_next_1_year");
			ContacHubspotProperties.setValue(directorsAndOfficersQuestionsRequest
					.getThere_have_been_no_retrenchments_in_the_past_1_year_and_none_are_expected_over_the_next_1_year());
			listOfContacHubspotProperties.add(ContacHubspotProperties);

			
			
			
			
			
			conactHubspotModel.setProperties(listOfContacHubspotProperties);
			HttpEntity<Object> entity = new HttpEntity<>(conactHubspotModel);
			resp = restTemplate.exchange(url, HttpMethod.POST, entity, String.class,
					directorsAndOfficersQuestionsRequest.getEmail());

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
