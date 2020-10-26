
package com.blacaz.hubspot.models;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "limitOfLiabilityFor",
    "limitOfLiabilityPrice",
    "subLimitFor",
    "subLimitForPrice",
    "gstPercent",
    "gstValue",
    "totalPriceWithGst",
    "totalPriceWithoutGst"
})
public class Quotation {

    @JsonProperty("limitOfLiabilityFor")
    private String limitOfLiabilityFor;
    @JsonProperty("limitOfLiabilityPrice")
    private Integer limitOfLiabilityPrice;
    @JsonProperty("subLimitFor")
    private String subLimitFor;
    @JsonProperty("subLimitForPrice")
    private Integer subLimitForPrice;
    @JsonProperty("gstPercent")
    private String gstPercent;
    @JsonProperty("gstValue")
    private Integer gstValue;
    @JsonProperty("totalPriceWithGst")
    private Integer totalPriceWithGst;
    @JsonProperty("totalPriceWithoutGst")
    private Integer totalPriceWithoutGst;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("limitOfLiabilityFor")
    public String getLimitOfLiabilityFor() {
        return limitOfLiabilityFor;
    }

    @JsonProperty("limitOfLiabilityFor")
    public void setLimitOfLiabilityFor(String limitOfLiabilityFor) {
        this.limitOfLiabilityFor = limitOfLiabilityFor;
    }

    @JsonProperty("limitOfLiabilityPrice")
    public Integer getLimitOfLiabilityPrice() {
        return limitOfLiabilityPrice;
    }

    @JsonProperty("limitOfLiabilityPrice")
    public void setLimitOfLiabilityPrice(Integer limitOfLiabilityPrice) {
        this.limitOfLiabilityPrice = limitOfLiabilityPrice;
    }

    @JsonProperty("subLimitFor")
    public String getSubLimitFor() {
        return subLimitFor;
    }

    @JsonProperty("subLimitFor")
    public void setSubLimitFor(String subLimitFor) {
        this.subLimitFor = subLimitFor;
    }

    @JsonProperty("subLimitForPrice")
    public Integer getSubLimitForPrice() {
        return subLimitForPrice;
    }

    @JsonProperty("subLimitForPrice")
    public void setSubLimitForPrice(Integer subLimitForPrice) {
        this.subLimitForPrice = subLimitForPrice;
    }

    @JsonProperty("gstPercent")
    public String getGstPercent() {
        return gstPercent;
    }

    @JsonProperty("gstPercent")
    public void setGstPercent(String gstPercent) {
        this.gstPercent = gstPercent;
    }

    @JsonProperty("gstValue")
    public Integer getGstValue() {
        return gstValue;
    }

    @JsonProperty("gstValue")
    public void setGstValue(Integer gstValue) {
        this.gstValue = gstValue;
    }

    @JsonProperty("totalPriceWithGst")
    public Integer getTotalPriceWithGst() {
        return totalPriceWithGst;
    }

    @JsonProperty("totalPriceWithGst")
    public void setTotalPriceWithGst(Integer totalPriceWithGst) {
        this.totalPriceWithGst = totalPriceWithGst;
    }

    @JsonProperty("totalPriceWithoutGst")
    public Integer getTotalPriceWithoutGst() {
        return totalPriceWithoutGst;
    }

    @JsonProperty("totalPriceWithoutGst")
    public void setTotalPriceWithoutGst(Integer totalPriceWithoutGst) {
        this.totalPriceWithoutGst = totalPriceWithoutGst;
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
