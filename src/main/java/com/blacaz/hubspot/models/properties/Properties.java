
package com.blacaz.hubspot.models.properties;

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
    "name",
    "label",
    "description",
    "groupName",
    "type",
    "fieldType",
    "referencedObjectType",
    "hasUniqueValue",
    "createdUserId",
    "searchableInGlobalSearch",
    "optionSortStrategy",
    "numberDisplayHint",
    "searchTextAnalysisMode",
    "textDisplayHint",
    "currencyPropertyName",
    "optionsAreMutable",
    "isCustomizedDefault",
    "updatedUserId",
    "hidden",
    "deleted",
    "options",
    "createdAt",
    "updatedAt",
    "displayOrder",
    "formField",
    "readOnlyValue",
    "readOnlyDefinition",
    "mutableDefinitionNotDeletable",
    "favorited",
    "favoritedOrder",
    "calculated",
    "externalOptions",
    "displayMode",
    "showCurrencySymbol",
    "hubspotDefined"
})
public class Properties {

    @JsonProperty("name")
    private String name;
    @JsonProperty("label")
    private String label;
    @JsonProperty("description")
    private String description;
    @JsonProperty("groupName")
    private String groupName;
    @JsonProperty("type")
    private String type;
    @JsonProperty("fieldType")
    private String fieldType;
    @JsonProperty("referencedObjectType")
    private Object referencedObjectType;
    @JsonProperty("hasUniqueValue")
    private Boolean hasUniqueValue;
    @JsonProperty("createdUserId")
    private BigInteger createdUserId;
    @JsonProperty("searchableInGlobalSearch")
    private Boolean searchableInGlobalSearch;
    @JsonProperty("optionSortStrategy")
    private Object optionSortStrategy;
    @JsonProperty("numberDisplayHint")
    private String numberDisplayHint;
    @JsonProperty("searchTextAnalysisMode")
    private Object searchTextAnalysisMode;
    @JsonProperty("textDisplayHint")
    private Object textDisplayHint;
    @JsonProperty("currencyPropertyName")
    private Object currencyPropertyName;
    @JsonProperty("optionsAreMutable")
    private Object optionsAreMutable;
    @JsonProperty("isCustomizedDefault")
    private Boolean isCustomizedDefault;
    @JsonProperty("updatedUserId")
    private BigInteger updatedUserId;
    @JsonProperty("hidden")
    private Boolean hidden;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("options")
    private List<Option> options = null;
    @JsonProperty("createdAt")
    private BigInteger createdAt;
    @JsonProperty("updatedAt")
    private BigInteger updatedAt;
    @JsonProperty("displayOrder")
    private BigInteger displayOrder;
    @JsonProperty("formField")
    private Boolean formField;
    @JsonProperty("readOnlyValue")
    private Boolean readOnlyValue;
    @JsonProperty("readOnlyDefinition")
    private Boolean readOnlyDefinition;
    @JsonProperty("mutableDefinitionNotDeletable")
    private Boolean mutableDefinitionNotDeletable;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("favoritedOrder")
    private BigInteger favoritedOrder;
    @JsonProperty("calculated")
    private Boolean calculated;
    @JsonProperty("externalOptions")
    private Boolean externalOptions;
    @JsonProperty("displayMode")
    private String displayMode;
    @JsonProperty("showCurrencySymbol")
    private Boolean showCurrencySymbol;
    @JsonProperty("hubspotDefined")
    private Object hubspotDefined;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("groupName")
    public String getGroupName() {
        return groupName;
    }

    @JsonProperty("groupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("fieldType")
    public String getFieldType() {
        return fieldType;
    }

    @JsonProperty("fieldType")
    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    @JsonProperty("referencedObjectType")
    public Object getReferencedObjectType() {
        return referencedObjectType;
    }

    @JsonProperty("referencedObjectType")
    public void setReferencedObjectType(Object referencedObjectType) {
        this.referencedObjectType = referencedObjectType;
    }

    @JsonProperty("hasUniqueValue")
    public Boolean getHasUniqueValue() {
        return hasUniqueValue;
    }

    @JsonProperty("hasUniqueValue")
    public void setHasUniqueValue(Boolean hasUniqueValue) {
        this.hasUniqueValue = hasUniqueValue;
    }

    @JsonProperty("createdUserId")
    public BigInteger getCreatedUserId() {
        return createdUserId;
    }

    @JsonProperty("createdUserId")
    public void setCreatedUserId(BigInteger createdUserId) {
        this.createdUserId = createdUserId;
    }

    @JsonProperty("searchableInGlobalSearch")
    public Boolean getSearchableInGlobalSearch() {
        return searchableInGlobalSearch;
    }

    @JsonProperty("searchableInGlobalSearch")
    public void setSearchableInGlobalSearch(Boolean searchableInGlobalSearch) {
        this.searchableInGlobalSearch = searchableInGlobalSearch;
    }

    @JsonProperty("optionSortStrategy")
    public Object getOptionSortStrategy() {
        return optionSortStrategy;
    }

    @JsonProperty("optionSortStrategy")
    public void setOptionSortStrategy(Object optionSortStrategy) {
        this.optionSortStrategy = optionSortStrategy;
    }

    @JsonProperty("numberDisplayHint")
    public String getNumberDisplayHint() {
        return numberDisplayHint;
    }

    @JsonProperty("numberDisplayHint")
    public void setNumberDisplayHint(String numberDisplayHint) {
        this.numberDisplayHint = numberDisplayHint;
    }

    @JsonProperty("searchTextAnalysisMode")
    public Object getSearchTextAnalysisMode() {
        return searchTextAnalysisMode;
    }

    @JsonProperty("searchTextAnalysisMode")
    public void setSearchTextAnalysisMode(Object searchTextAnalysisMode) {
        this.searchTextAnalysisMode = searchTextAnalysisMode;
    }

    @JsonProperty("textDisplayHint")
    public Object getTextDisplayHint() {
        return textDisplayHint;
    }

    @JsonProperty("textDisplayHint")
    public void setTextDisplayHint(Object textDisplayHint) {
        this.textDisplayHint = textDisplayHint;
    }

    @JsonProperty("currencyPropertyName")
    public Object getCurrencyPropertyName() {
        return currencyPropertyName;
    }

    @JsonProperty("currencyPropertyName")
    public void setCurrencyPropertyName(Object currencyPropertyName) {
        this.currencyPropertyName = currencyPropertyName;
    }

    @JsonProperty("optionsAreMutable")
    public Object getOptionsAreMutable() {
        return optionsAreMutable;
    }

    @JsonProperty("optionsAreMutable")
    public void setOptionsAreMutable(Object optionsAreMutable) {
        this.optionsAreMutable = optionsAreMutable;
    }

    @JsonProperty("isCustomizedDefault")
    public Boolean getIsCustomizedDefault() {
        return isCustomizedDefault;
    }

    @JsonProperty("isCustomizedDefault")
    public void setIsCustomizedDefault(Boolean isCustomizedDefault) {
        this.isCustomizedDefault = isCustomizedDefault;
    }

    @JsonProperty("updatedUserId")
    public BigInteger getUpdatedUserId() {
        return updatedUserId;
    }

    @JsonProperty("updatedUserId")
    public void setUpdatedUserId(BigInteger updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    @JsonProperty("hidden")
    public Boolean getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @JsonProperty("createdAt")
    public BigInteger getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(BigInteger createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updatedAt")
    public BigInteger getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updatedAt")
    public void setUpdatedAt(BigInteger updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("displayOrder")
    public BigInteger getDisplayOrder() {
        return displayOrder;
    }

    @JsonProperty("displayOrder")
    public void setDisplayOrder(BigInteger displayOrder) {
        this.displayOrder = displayOrder;
    }

    @JsonProperty("formField")
    public Boolean getFormField() {
        return formField;
    }

    @JsonProperty("formField")
    public void setFormField(Boolean formField) {
        this.formField = formField;
    }

    @JsonProperty("readOnlyValue")
    public Boolean getReadOnlyValue() {
        return readOnlyValue;
    }

    @JsonProperty("readOnlyValue")
    public void setReadOnlyValue(Boolean readOnlyValue) {
        this.readOnlyValue = readOnlyValue;
    }

    @JsonProperty("readOnlyDefinition")
    public Boolean getReadOnlyDefinition() {
        return readOnlyDefinition;
    }

    @JsonProperty("readOnlyDefinition")
    public void setReadOnlyDefinition(Boolean readOnlyDefinition) {
        this.readOnlyDefinition = readOnlyDefinition;
    }

    @JsonProperty("mutableDefinitionNotDeletable")
    public Boolean getMutableDefinitionNotDeletable() {
        return mutableDefinitionNotDeletable;
    }

    @JsonProperty("mutableDefinitionNotDeletable")
    public void setMutableDefinitionNotDeletable(Boolean mutableDefinitionNotDeletable) {
        this.mutableDefinitionNotDeletable = mutableDefinitionNotDeletable;
    }

    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    @JsonProperty("favoritedOrder")
    public BigInteger getFavoritedOrder() {
        return favoritedOrder;
    }

    @JsonProperty("favoritedOrder")
    public void setFavoritedOrder(BigInteger favoritedOrder) {
        this.favoritedOrder = favoritedOrder;
    }

    @JsonProperty("calculated")
    public Boolean getCalculated() {
        return calculated;
    }

    @JsonProperty("calculated")
    public void setCalculated(Boolean calculated) {
        this.calculated = calculated;
    }

    @JsonProperty("externalOptions")
    public Boolean getExternalOptions() {
        return externalOptions;
    }

    @JsonProperty("externalOptions")
    public void setExternalOptions(Boolean externalOptions) {
        this.externalOptions = externalOptions;
    }

    @JsonProperty("displayMode")
    public String getDisplayMode() {
        return displayMode;
    }

    @JsonProperty("displayMode")
    public void setDisplayMode(String displayMode) {
        this.displayMode = displayMode;
    }

    @JsonProperty("showCurrencySymbol")
    public Boolean getShowCurrencySymbol() {
        return showCurrencySymbol;
    }

    @JsonProperty("showCurrencySymbol")
    public void setShowCurrencySymbol(Boolean showCurrencySymbol) {
        this.showCurrencySymbol = showCurrencySymbol;
    }

    @JsonProperty("hubspotDefined")
    public Object getHubspotDefined() {
        return hubspotDefined;
    }

    @JsonProperty("hubspotDefined")
    public void setHubspotDefined(Object hubspotDefined) {
        this.hubspotDefined = hubspotDefined;
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
