package com.blacaz.hubspot.models.contact;

import java.util.List;

public class ConactHubspotModel {

private List<ContacHubspotProperties> properties;

public List<ContacHubspotProperties> getProperties() {
	return properties;
}

@Override
public String toString() {
	return "ConactHubspotModel [properties=" + properties + "]";
}

public void setProperties(List<ContacHubspotProperties> properties) {
	this.properties = properties;
}
}
