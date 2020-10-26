
package com.blacaz.hubspot.models.contact;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vid",
    "saved-at-timestamp",
    "deleted-changed-timestamp",
    "identities"
})
public class IdentityProfile {

    @JsonProperty("vid")
    private BigInteger vid;
    @JsonProperty("saved-at-timestamp")
    private BigInteger savedAtTimestamp;
    @JsonProperty("deleted-changed-timestamp")
    private BigInteger deletedChangedTimestamp;
    @JsonProperty("identities")
    private List<Identity> identities = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("vid")
    public BigInteger getVid() {
        return vid;
    }

    @JsonProperty("vid")
    public void setVid(BigInteger vid) {
        this.vid = vid;
    }

    @JsonProperty("saved-at-timestamp")
    public BigInteger getSavedAtTimestamp() {
        return savedAtTimestamp;
    }

    @JsonProperty("saved-at-timestamp")
    public void setSavedAtTimestamp(BigInteger savedAtTimestamp) {
        this.savedAtTimestamp = savedAtTimestamp;
    }

    @JsonProperty("deleted-changed-timestamp")
    public BigInteger getDeletedChangedTimestamp() {
        return deletedChangedTimestamp;
    }

    @JsonProperty("deleted-changed-timestamp")
    public void setDeletedChangedTimestamp(BigInteger deletedChangedTimestamp) {
        this.deletedChangedTimestamp = deletedChangedTimestamp;
    }

    @JsonProperty("identities")
    public List<Identity> getIdentities() {
        return identities;
    }

    @JsonProperty("identities")
    public void setIdentities(List<Identity> identities) {
        this.identities = identities;
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
