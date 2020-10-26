
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
    "static-list-id",
    "internal-list-id",
    "timestamp",
    "vid",
    "is-member"
})
public class ListMembership {

    @JsonProperty("static-list-id")
    private BigInteger staticListId;
    @JsonProperty("internal-list-id")
    private BigInteger internalListId;
    @JsonProperty("timestamp")
    private BigInteger timestamp;
    @JsonProperty("vid")
    private BigInteger vid;
    @JsonProperty("is-member")
    private Boolean isMember;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("static-list-id")
    public BigInteger getStaticListId() {
        return staticListId;
    }

    @JsonProperty("static-list-id")
    public void setStaticListId(BigInteger staticListId) {
        this.staticListId = staticListId;
    }

    @JsonProperty("internal-list-id")
    public BigInteger getInternalListId() {
        return internalListId;
    }

    @JsonProperty("internal-list-id")
    public void setInternalListId(BigInteger internalListId) {
        this.internalListId = internalListId;
    }

    @JsonProperty("timestamp")
    public BigInteger getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(BigInteger timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("vid")
    public BigInteger getVid() {
        return vid;
    }

    @JsonProperty("vid")
    public void setVid(BigInteger vid) {
        this.vid = vid;
    }

    @JsonProperty("is-member")
    public Boolean getIsMember() {
        return isMember;
    }

    @JsonProperty("is-member")
    public void setIsMember(Boolean isMember) {
        this.isMember = isMember;
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
