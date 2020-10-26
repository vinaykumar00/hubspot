
package com.blacaz.hubspot.models.contact;

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
@JsonPropertyOrder({
    "value",
    "source-type",
    "source-id",
    "source-label",
    "timestamp",
    "selected"
})
public class Version {

    @JsonProperty("value")
    private String value;
    @JsonProperty("source-type")
    private String sourceType;
    @JsonProperty("source-id")
    private String sourceId;
    @JsonProperty("source-label")
    private Object sourceLabel;
    @JsonProperty("timestamp")
    private BigInteger timestamp;
    @JsonProperty("selected")
    private Boolean selected;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("source-type")
    public String getSourceType() {
        return sourceType;
    }

    @JsonProperty("source-type")
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    @JsonProperty("source-id")
    public String getSourceId() {
        return sourceId;
    }

    @JsonProperty("source-id")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @JsonProperty("source-label")
    public Object getSourceLabel() {
        return sourceLabel;
    }

    @JsonProperty("source-label")
    public void setSourceLabel(Object sourceLabel) {
        this.sourceLabel = sourceLabel;
    }

    @JsonProperty("timestamp")
    public BigInteger getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(BigInteger timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("selected")
    public Boolean getSelected() {
        return selected;
    }

    @JsonProperty("selected")
    public void setSelected(Boolean selected) {
        this.selected = selected;
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
