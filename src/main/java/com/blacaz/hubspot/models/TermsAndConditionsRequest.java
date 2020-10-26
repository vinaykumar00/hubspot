package com.blacaz.hubspot.models;

public class TermsAndConditionsRequest {

	private String acceptTermsAndConditions;
	private String email;
	public String getAcceptTermsAndConditions() {
		return acceptTermsAndConditions;
	}
	public void setAcceptTermsAndConditions(String acceptTermsAndConditions) {
		this.acceptTermsAndConditions = acceptTermsAndConditions;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
