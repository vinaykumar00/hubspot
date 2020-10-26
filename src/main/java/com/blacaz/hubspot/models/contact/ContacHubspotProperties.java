package com.blacaz.hubspot.models.contact;

public class ContacHubspotProperties {

	@Override
	public String toString() {
		return "ContacHubspotProperties [property=" + property + ", value=" + value + ", getProperty()=" + getProperty()
				+ ", getValue()=" + getValue() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	private String property;
	private String value;
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
