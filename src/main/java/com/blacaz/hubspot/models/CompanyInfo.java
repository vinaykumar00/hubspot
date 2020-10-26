
package com.blacaz.hubspot.models;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "addressOfEmployement", "country", "dateEstablished", "nameOfCompany", "industryCodeAndName",
		"fullNameOfThePrincipal", "acraCodes", "email" })
public class CompanyInfo {

	@JsonProperty("addressOfEmployement")
	private String addressOfEmployement;
	@JsonProperty("country")
	private String country;
	@JsonProperty("dateEstablished")
	private String dateEstablished;
	@JsonProperty("nameOfCompany")
	private String nameOfCompany;
	@JsonProperty("industryCodeAndName")
	private String industryCodeAndName;
	@JsonProperty("fullNameOfThePrincipal")
	private String fullNameOfThePrincipal;
	@JsonProperty("acraCodes")
	private String acraCodes;
	@JsonProperty("email")
	private String email;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("addressOfEmployement")
	public String getAddressOfEmployement() {
		return addressOfEmployement;
	}

	@JsonProperty("addressOfEmployement")
	public void setAddressOfEmployement(String addressOfEmployement) {
		this.addressOfEmployement = addressOfEmployement;
	}

	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty("dateEstablished")
	public String getDateEstablished() {
		return dateEstablished;
	}

	@JsonProperty("dateEstablished")
	public void setDateEstablished(String dateEstablished) {
		this.dateEstablished = dateEstablished;
	}

	@JsonProperty("nameOfCompany")
	public String getNameOfCompany() {
		return nameOfCompany;
	}

	@JsonProperty("nameOfCompany")
	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}

	@JsonProperty("industryCodeAndName")
	public String getIndustryCodeAndName() {
		return industryCodeAndName;
	}

	@JsonProperty("industryCodeAndName")
	public void setIndustryCodeAndName(String industryCodeAndName) {
		this.industryCodeAndName = industryCodeAndName;
	}

	@JsonProperty("fullNameOfThePrincipal")
	public String getFullNameOfThePrincipal() {
		return fullNameOfThePrincipal;
	}

	@JsonProperty("fullNameOfThePrincipal")
	public void setFullNameOfThePrincipal(String fullNameOfThePrincipal) {
		this.fullNameOfThePrincipal = fullNameOfThePrincipal;
	}

	@JsonProperty("acraCodes")
	public String getAcraCodes() {
		return acraCodes;
	}

	@JsonProperty("acraCodes")
	public void setAcraCodes(String acraCodes) {
		this.acraCodes = acraCodes;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
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
