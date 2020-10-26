
package com.blacaz.hubspot.models.properties;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "hidden", "description", "label", "doubleData", "readOnly", "displayOrder", "value" })
public class Option {

	@JsonProperty("hidden")
	private Boolean hidden;
	@JsonProperty("description")
	private String description;
	@JsonProperty("label")
	private String label;
	@JsonProperty("doubleData")
	private Double doubleData;
	@JsonProperty("readOnly")
	private Boolean readOnly;
	@JsonProperty("displayOrder")
	private BigInteger displayOrder;
	@JsonProperty("value")
	private String value;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("hidden")
	public Boolean getHidden() {
		return hidden;
	}

	@JsonProperty("hidden")
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("label")
	public String getLabel() {
		return label;
	}

	@JsonProperty("label")
	public void setLabel(String label) {
		this.label = label;
	}

	@JsonProperty("doubleData")
	public Double getDoubleData() {
		return doubleData;
	}

	@JsonProperty("doubleData")
	public void setDoubleData(Double doubleData) {
		this.doubleData = doubleData;
	}

	@JsonProperty("readOnly")
	public Boolean getReadOnly() {
		return readOnly;
	}

	@JsonProperty("readOnly")
	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}

	@JsonProperty("displayOrder")
	public BigInteger getDisplayOrder() {
		return displayOrder;
	}

	@JsonProperty("displayOrder")
	public void setDisplayOrder(BigInteger displayOrder) {
		this.displayOrder = displayOrder;
	}

	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
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
