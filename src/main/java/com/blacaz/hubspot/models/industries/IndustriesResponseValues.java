package com.blacaz.hubspot.models.industries;

public class IndustriesResponseValues {

	private String value;
	private String name;

	public IndustriesResponseValues(String name,String value) {
		this.name=name;
		this.value=value;
	}
	
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
