package com.blacaz.hubspot.models.dando;

public class DirectorsAndOfficersQuotationRequest {

	private String email;

	private String agreeToPolicy;
	private String limitOfLiability;
	private String startingDateOfCoverage;
	private String subLimitForCompanyEPL;
	private String totalConsolidatedAssets;
	private Integer totalPriceWithGST;
	
	public Integer getTotalPriceWithGST() {
		return totalPriceWithGST;
	}

	public void setTotalPriceWithGST(Integer totalPriceWithGST) {
		this.totalPriceWithGST = totalPriceWithGST;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAgreeToPolicy() {
		return agreeToPolicy;
	}

	public void setAgreeToPolicy(String agreeToPolicy) {
		this.agreeToPolicy = agreeToPolicy;
	}

	public String getLimitOfLiability() {
		return limitOfLiability;
	}

	public void setLimitOfLiability(String limitOfLiability) {
		this.limitOfLiability = limitOfLiability;
	}

	public String getStartingDateOfCoverage() {
		return startingDateOfCoverage;
	}

	public void setStartingDateOfCoverage(String startingDateOfCoverage) {
		this.startingDateOfCoverage = startingDateOfCoverage;
	}

	public String getSubLimitForCompanyEPL() {
		return subLimitForCompanyEPL;
	}

	public void setSubLimitForCompanyEPL(String subLimitForCompanyEPL) {
		this.subLimitForCompanyEPL = subLimitForCompanyEPL;
	}

	public String getTotalConsolidatedAssets() {
		return totalConsolidatedAssets;
	}

	public void setTotalConsolidatedAssets(String totalConsolidatedAssets) {
		this.totalConsolidatedAssets = totalConsolidatedAssets;
	}

}
