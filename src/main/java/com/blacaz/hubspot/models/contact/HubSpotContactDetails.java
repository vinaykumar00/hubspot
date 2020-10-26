
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
    "canonical-vid",
    "merged-vids",
    "portal-id",
    "is-contact",
    "profile-token",
    "profile-url",
    "properties",
    "form-submissions",
    "list-memberships",
    "identity-profiles",
    "merge-audits"
})
public class HubSpotContactDetails {

    @JsonProperty("vid")
    private BigInteger vid;
    @JsonProperty("canonical-vid")
    private BigInteger canonicalVid;
    @JsonProperty("merged-vids")
    private List<Object> mergedVids = null;
    @JsonProperty("portal-id")
    private BigInteger portalId;
    @JsonProperty("is-contact")
    private Boolean isContact;
    @JsonProperty("profile-token")
    private String profileToken;
    @JsonProperty("profile-url")
    private String profileUrl;
    @JsonProperty("properties")
    private Properties properties;
    @JsonProperty("form-submissions")
    private List<Object> formSubmissions = null;
    @JsonProperty("list-memberships")
    private List<ListMembership> listMemberships = null;
    @JsonProperty("identity-profiles")
    private List<IdentityProfile> identityProfiles = null;
    @JsonProperty("merge-audits")
    private List<Object> mergeAudits = null;
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

    public HubSpotContactDetails withVid(BigInteger vid) {
        this.vid = vid;
        return this;
    }

    @JsonProperty("canonical-vid")
    public BigInteger getCanonicalVid() {
        return canonicalVid;
    }

    @JsonProperty("canonical-vid")
    public void setCanonicalVid(BigInteger canonicalVid) {
        this.canonicalVid = canonicalVid;
    }

    public HubSpotContactDetails withCanonicalVid(BigInteger canonicalVid) {
        this.canonicalVid = canonicalVid;
        return this;
    }

    @JsonProperty("merged-vids")
    public List<Object> getMergedVids() {
        return mergedVids;
    }

    @JsonProperty("merged-vids")
    public void setMergedVids(List<Object> mergedVids) {
        this.mergedVids = mergedVids;
    }

    public HubSpotContactDetails withMergedVids(List<Object> mergedVids) {
        this.mergedVids = mergedVids;
        return this;
    }

    @JsonProperty("portal-id")
    public BigInteger getPortalId() {
        return portalId;
    }

    @JsonProperty("portal-id")
    public void setPortalId(BigInteger portalId) {
        this.portalId = portalId;
    }

    public HubSpotContactDetails withPortalId(BigInteger portalId) {
        this.portalId = portalId;
        return this;
    }

    @JsonProperty("is-contact")
    public Boolean getIsContact() {
        return isContact;
    }

    @JsonProperty("is-contact")
    public void setIsContact(Boolean isContact) {
        this.isContact = isContact;
    }

    public HubSpotContactDetails withIsContact(Boolean isContact) {
        this.isContact = isContact;
        return this;
    }

    @JsonProperty("profile-token")
    public String getProfileToken() {
        return profileToken;
    }

    @JsonProperty("profile-token")
    public void setProfileToken(String profileToken) {
        this.profileToken = profileToken;
    }

    public HubSpotContactDetails withProfileToken(String profileToken) {
        this.profileToken = profileToken;
        return this;
    }

    @JsonProperty("profile-url")
    public String getProfileUrl() {
        return profileUrl;
    }

    @JsonProperty("profile-url")
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public HubSpotContactDetails withProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
        return this;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public HubSpotContactDetails withProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    @JsonProperty("form-submissions")
    public List<Object> getFormSubmissions() {
        return formSubmissions;
    }

    @JsonProperty("form-submissions")
    public void setFormSubmissions(List<Object> formSubmissions) {
        this.formSubmissions = formSubmissions;
    }

    public HubSpotContactDetails withFormSubmissions(List<Object> formSubmissions) {
        this.formSubmissions = formSubmissions;
        return this;
    }

    @JsonProperty("list-memberships")
    public List<ListMembership> getListMemberships() {
        return listMemberships;
    }

    @JsonProperty("list-memberships")
    public void setListMemberships(List<ListMembership> listMemberships) {
        this.listMemberships = listMemberships;
    }

    public HubSpotContactDetails withListMemberships(List<ListMembership> listMemberships) {
        this.listMemberships = listMemberships;
        return this;
    }

    @JsonProperty("identity-profiles")
    public List<IdentityProfile> getIdentityProfiles() {
        return identityProfiles;
    }

    @JsonProperty("identity-profiles")
    public void setIdentityProfiles(List<IdentityProfile> identityProfiles) {
        this.identityProfiles = identityProfiles;
    }

    public HubSpotContactDetails withIdentityProfiles(List<IdentityProfile> identityProfiles) {
        this.identityProfiles = identityProfiles;
        return this;
    }

    @JsonProperty("merge-audits")
    public List<Object> getMergeAudits() {
        return mergeAudits;
    }

    @JsonProperty("merge-audits")
    public void setMergeAudits(List<Object> mergeAudits) {
        this.mergeAudits = mergeAudits;
    }

    public HubSpotContactDetails withMergeAudits(List<Object> mergeAudits) {
        this.mergeAudits = mergeAudits;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public HubSpotContactDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
