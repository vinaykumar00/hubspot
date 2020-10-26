
package com.blacaz.hubspot.models;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "currentPage", "basicInfo", "quotation", "quotationValues", "companyInfo" })
public class ContactDetailsResponse {

	@JsonProperty("currentPage")
	private String currentPage;
	@JsonProperty("basicInfo")
	private BasicInfo basicInfo;

	@JsonProperty("quotation")
	private Quotation quotation;

	@JsonProperty("quotationValues")
	private Quotation quotationValues;

	@JsonProperty("companyInfo")
	private CompanyInfo companyInfo;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("currentPage")
	public String getCurrentPage() {
		return currentPage;
	}

	@JsonProperty("currentPage")
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	@JsonProperty("basicInfo")
	public BasicInfo getBasicInfo() {
		return basicInfo;
	}

	public Quotation getQuotationValues() {
		return quotationValues;
	}

	public void setQuotationValues(Quotation quotationValues) {
		this.quotationValues = quotationValues;
	}

	@JsonProperty("basicInfo")
	public void setBasicInfo(BasicInfo basicInfo) {
		this.basicInfo = basicInfo;
	}

	@JsonProperty("quotation")
	public Quotation getQuotation() {
		return quotation;
	}

	@JsonProperty("quotation")
	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
	}

	@JsonProperty("companyInfo")
	public CompanyInfo getCompanyInfo() {
		return companyInfo;
	}

	@JsonProperty("companyInfo")
	public void setCompanyInfo(CompanyInfo companyInfo) {
		this.companyInfo = companyInfo;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
