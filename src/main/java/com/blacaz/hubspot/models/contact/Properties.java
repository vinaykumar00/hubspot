
package com.blacaz.hubspot.models.contact;
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
    "hs_all_accessible_team_ids",
    "total_price_with_gst",
    "num_unique_conVersionevents",
    "hs_analytics_revenue",
    "n7_d_o_compliance",
    "createdate",
    "n3_country",
    "n1_d_o_liability",
    "insurance_for_country",
    "hubspot_owner_id",
    "n2_employment_practice_liability_compliance",
    "n5_date_established",
    "hs_analytics_num_page_views",
    "n4_d_o_compliance",
    "starting_date_of_coverage",
    "hs_lifecyclestage_subscriber_date",
    "lead_status_change",
    "hs_analytics_average_page_views",
    "n5_d_o_compliance",
    "lastname",
    "n1_name_of_the_company",
    "hs_is_contact",
    "total_consolidated_assets_of_companyname",
    "phone",
    "num_conVersionevents",
    "desired_limit_of_liability",
    "hs_object_id",
    "currentlyinworkflow",
    "hs_analytics_num_event_completions",
    "salutation",
    "hs_lifecyclestage_lead_date",
    "n6_d_o_compliance",
    "n6_acra_uen_roc",
    "hs_is_unworked",
    "firstname",
    "gender",
    "n1_d_o_compliance",
    "hs_all_team_ids",
    "hs_social_num_broadcast_clicks",
    "n1_your_claim_history",
    "hs_analytics_num_visits",
    "initial_starting_date",
    "hubspot_team_id",
    "hs_social_linkedin_clicks",
    "hs_analytics_source",
    "hs_searchable_calculated_phone_number",
    "limit_for_company_employment_practice_liability",
    "hs_email_domain",
    "n2_address_of_employment",
    "hs_all_owner_ids",
    "email",
    "i_have_acknowledge_the_full_policy_wording",
    "expiring_date",
    "jobtitle",
    "lastmodifieddate",
    "n1_employment_practice_liability_compliance",
    "hs_analytics_first_timestamp",
    "hs_social_google_plus_clicks",
    "n3_d_o_compliance",
    "hs_user_ids_of_all_owners",
    "i_accept_all_terms_conditions_from_blacaz",
    "hs_social_facebook_clicks",
    "hubspot_owner_assigneddate",
    "hs_lead_status",
    "n4_industry_code_name",
    "hs_social_twitter_clicks",
    "hs_analytics_source_data_1",
    "n2_d_o_compliance",
    "lifecyclestage"
})
public class Properties {

    @JsonProperty("hs_all_accessible_team_ids")
    private HsAllAccessibleTeamIds hsAllAccessibleTeamIds;
    @JsonProperty("total_price_with_gst")
    private TotalPriceWithGst totalPriceWithGst;
    @JsonProperty("num_unique_conVersionevents")
    private NumUniqueConversionEvents numUniqueConversionEvents;
    @JsonProperty("hs_analytics_revenue")
    private HsAnalyticsRevenue hsAnalyticsRevenue;
    @JsonProperty("n7_d_o_compliance")
    private N7DOCompliance n7DOCompliance;
    @JsonProperty("createdate")
    private Createdate createdate;
    @JsonProperty("n3_country")
    private N3Country n3Country;
    @JsonProperty("n1_d_o_liability")
    private N1DOLiability n1DOLiability;
    @JsonProperty("insurance_for_country")
    private InsuranceForCountry insuranceForCountry;
    @JsonProperty("hubspot_owner_id")
    private HubspotOwnerId hubspotOwnerId;
    @JsonProperty("n2_employment_practice_liability_compliance")
    private N2EmploymentPracticeLiabilityCompliance n2EmploymentPracticeLiabilityCompliance;
    @JsonProperty("n5_date_established")
    private N5DateEstablished n5DateEstablished;
    @JsonProperty("hs_analytics_num_page_views")
    private HsAnalyticsNumPageViews hsAnalyticsNumPageViews;
    @JsonProperty("n4_d_o_compliance")
    private N4DOCompliance n4DOCompliance;
    @JsonProperty("starting_date_of_coverage")
    private StartingDateOfCoverage startingDateOfCoverage;
    @JsonProperty("hs_lifecyclestage_subscriber_date")
    private HsLifecyclestageSubscriberDate hsLifecyclestageSubscriberDate;
    @JsonProperty("lead_status_change")
    private LeadStatusChange leadStatusChange;
    @JsonProperty("hs_analytics_average_page_views")
    private HsAnalyticsAveragePageViews hsAnalyticsAveragePageViews;
    @JsonProperty("n5_d_o_compliance")
    private N5DOCompliance n5DOCompliance;
    @JsonProperty("lastname")
    private Lastname lastname;
    @JsonProperty("n1_name_of_the_company")
    private N1NameOfTheCompany n1NameOfTheCompany;
    @JsonProperty("hs_is_contact")
    private HsIsContact hsIsContact;
    @JsonProperty("total_consolidated_assets_of_companyname")
    private TotalConsolidatedAssetsOfCompanyname totalConsolidatedAssetsOfCompanyname;
    @JsonProperty("phone")
    private Phone phone;
    @JsonProperty("num_conVersionevents")
    private NumConversionEvents numConversionEvents;
    @JsonProperty("desired_limit_of_liability")
    private DesiredLimitOfLiability desiredLimitOfLiability;
    @JsonProperty("hs_object_id")
    private HsObjectId hsObjectId;
    @JsonProperty("currentlyinworkflow")
    private Currentlyinworkflow currentlyinworkflow;
    @JsonProperty("hs_analytics_num_event_completions")
    private HsAnalyticsNumEventCompletions hsAnalyticsNumEventCompletions;
    @JsonProperty("salutation")
    private Salutation salutation;
    @JsonProperty("hs_lifecyclestage_lead_date")
    private HsLifecyclestageLeadDate hsLifecyclestageLeadDate;
    @JsonProperty("n6_d_o_compliance")
    private N6DOCompliance n6DOCompliance;
    @JsonProperty("n6_acra_uen_roc")
    private N6AcraUenRoc n6AcraUenRoc;
    @JsonProperty("hs_is_unworked")
    private HsIsUnworked hsIsUnworked;
    @JsonProperty("firstname")
    private Firstname firstname;
    @JsonProperty("gender")
    private Gender gender;
    @JsonProperty("n1_d_o_compliance")
    private N1DOCompliance n1DOCompliance;
    @JsonProperty("hs_all_team_ids")
    private HsAllTeamIds hsAllTeamIds;
    @JsonProperty("hs_social_num_broadcast_clicks")
    private HsSocialNumBroadcastClicks hsSocialNumBroadcastClicks;
    @JsonProperty("n1_your_claim_history")
    private N1YourClaimHistory n1YourClaimHistory;
    @JsonProperty("hs_analytics_num_visits")
    private HsAnalyticsNumVisits hsAnalyticsNumVisits;
    @JsonProperty("initial_starting_date")
    private InitialStartingDate initialStartingDate;
    @JsonProperty("hubspot_team_id")
    private HubspotTeamId hubspotTeamId;
    @JsonProperty("hs_social_linkedin_clicks")
    private HsSocialLinkedinClicks hsSocialLinkedinClicks;
    @JsonProperty("hs_analytics_source")
    private HsAnalyticsSource hsAnalyticsSource;
    @JsonProperty("hs_searchable_calculated_phone_number")
    private HsSearchableCalculatedPhoneNumber hsSearchableCalculatedPhoneNumber;
    @JsonProperty("limit_for_company_employment_practice_liability")
    private LimitForCompanyEmploymentPracticeLiability limitForCompanyEmploymentPracticeLiability;
    @JsonProperty("hs_email_domain")
    private HsEmailDomain hsEmailDomain;
    @JsonProperty("n2_address_of_employment")
    private N2AddressOfEmployment n2AddressOfEmployment;
    @JsonProperty("hs_all_owner_ids")
    private HsAllOwnerIds hsAllOwnerIds;
    @JsonProperty("email")
    private Email email;
    @JsonProperty("i_have_acknowledge_the_full_policy_wording")
    private IHaveAcknowledgeTheFullPolicyWording iHaveAcknowledgeTheFullPolicyWording;
    @JsonProperty("expiring_date")
    private ExpiringDate expiringDate;
    @JsonProperty("jobtitle")
    private Jobtitle jobtitle;
    @JsonProperty("lastmodifieddate")
    private Lastmodifieddate lastmodifieddate;
    @JsonProperty("n1_employment_practice_liability_compliance")
    private N1EmploymentPracticeLiabilityCompliance n1EmploymentPracticeLiabilityCompliance;
    @JsonProperty("hs_analytics_first_timestamp")
    private HsAnalyticsFirstTimestamp hsAnalyticsFirstTimestamp;
    @JsonProperty("hs_social_google_plus_clicks")
    private HsSocialGooglePlusClicks hsSocialGooglePlusClicks;
    @JsonProperty("n3_d_o_compliance")
    private N3DOCompliance n3DOCompliance;
    @JsonProperty("hs_user_ids_of_all_owners")
    private HsUserIdsOfAllOwners hsUserIdsOfAllOwners;
    @JsonProperty("i_accept_all_terms_conditions_from_blacaz")
    private IAcceptAllTermsConditionsFromBlacaz iAcceptAllTermsConditionsFromBlacaz;
    @JsonProperty("hs_social_facebook_clicks")
    private HsSocialFacebookClicks hsSocialFacebookClicks;
    @JsonProperty("hubspot_owner_assigneddate")
    private HubspotOwnerAssigneddate hubspotOwnerAssigneddate;
    @JsonProperty("hs_lead_status")
    private HsLeadStatus hsLeadStatus;
    @JsonProperty("n4_industry_code_name")
    private N4IndustryCodeName n4IndustryCodeName;
    @JsonProperty("hs_social_twitter_clicks")
    private HsSocialTwitterClicks hsSocialTwitterClicks;
    @JsonProperty("hs_analytics_source_data_1")
    private HsAnalyticsSourceData1 hsAnalyticsSourceData1;
    @JsonProperty("n2_d_o_compliance")
    private N2DOCompliance n2DOCompliance;
    @JsonProperty("lifecyclestage")
    private Lifecyclestage lifecyclestage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hs_all_accessible_team_ids")
    public HsAllAccessibleTeamIds getHsAllAccessibleTeamIds() {
        return hsAllAccessibleTeamIds;
    }

    @JsonProperty("hs_all_accessible_team_ids")
    public void setHsAllAccessibleTeamIds(HsAllAccessibleTeamIds hsAllAccessibleTeamIds) {
        this.hsAllAccessibleTeamIds = hsAllAccessibleTeamIds;
    }

    @JsonProperty("total_price_with_gst")
    public TotalPriceWithGst getTotalPriceWithGst() {
        return totalPriceWithGst;
    }

    @JsonProperty("total_price_with_gst")
    public void setTotalPriceWithGst(TotalPriceWithGst totalPriceWithGst) {
        this.totalPriceWithGst = totalPriceWithGst;
    }

    @JsonProperty("num_unique_conVersionevents")
    public NumUniqueConversionEvents getNumUniqueConversionEvents() {
        return numUniqueConversionEvents;
    }

    @JsonProperty("num_unique_conVersionevents")
    public void setNumUniqueConversionEvents(NumUniqueConversionEvents numUniqueConversionEvents) {
        this.numUniqueConversionEvents = numUniqueConversionEvents;
    }

    @JsonProperty("hs_analytics_revenue")
    public HsAnalyticsRevenue getHsAnalyticsRevenue() {
        return hsAnalyticsRevenue;
    }

    @JsonProperty("hs_analytics_revenue")
    public void setHsAnalyticsRevenue(HsAnalyticsRevenue hsAnalyticsRevenue) {
        this.hsAnalyticsRevenue = hsAnalyticsRevenue;
    }

    @JsonProperty("n7_d_o_compliance")
    public N7DOCompliance getN7DOCompliance() {
        return n7DOCompliance;
    }

    @JsonProperty("n7_d_o_compliance")
    public void setN7DOCompliance(N7DOCompliance n7DOCompliance) {
        this.n7DOCompliance = n7DOCompliance;
    }

    @JsonProperty("createdate")
    public Createdate getCreatedate() {
        return createdate;
    }

    @JsonProperty("createdate")
    public void setCreatedate(Createdate createdate) {
        this.createdate = createdate;
    }

    @JsonProperty("n3_country")
    public N3Country getN3Country() {
        return n3Country;
    }

    @JsonProperty("n3_country")
    public void setN3Country(N3Country n3Country) {
        this.n3Country = n3Country;
    }

    @JsonProperty("n1_d_o_liability")
    public N1DOLiability getN1DOLiability() {
        return n1DOLiability;
    }

    @JsonProperty("n1_d_o_liability")
    public void setN1DOLiability(N1DOLiability n1DOLiability) {
        this.n1DOLiability = n1DOLiability;
    }

    @JsonProperty("insurance_for_country")
    public InsuranceForCountry getInsuranceForCountry() {
        return insuranceForCountry;
    }

    @JsonProperty("insurance_for_country")
    public void setInsuranceForCountry(InsuranceForCountry insuranceForCountry) {
        this.insuranceForCountry = insuranceForCountry;
    }

    @JsonProperty("hubspot_owner_id")
    public HubspotOwnerId getHubspotOwnerId() {
        return hubspotOwnerId;
    }

    @JsonProperty("hubspot_owner_id")
    public void setHubspotOwnerId(HubspotOwnerId hubspotOwnerId) {
        this.hubspotOwnerId = hubspotOwnerId;
    }

    @JsonProperty("n2_employment_practice_liability_compliance")
    public N2EmploymentPracticeLiabilityCompliance getN2EmploymentPracticeLiabilityCompliance() {
        return n2EmploymentPracticeLiabilityCompliance;
    }

    @JsonProperty("n2_employment_practice_liability_compliance")
    public void setN2EmploymentPracticeLiabilityCompliance(N2EmploymentPracticeLiabilityCompliance n2EmploymentPracticeLiabilityCompliance) {
        this.n2EmploymentPracticeLiabilityCompliance = n2EmploymentPracticeLiabilityCompliance;
    }

    @JsonProperty("n5_date_established")
    public N5DateEstablished getN5DateEstablished() {
        return n5DateEstablished;
    }

    @JsonProperty("n5_date_established")
    public void setN5DateEstablished(N5DateEstablished n5DateEstablished) {
        this.n5DateEstablished = n5DateEstablished;
    }

    @JsonProperty("hs_analytics_num_page_views")
    public HsAnalyticsNumPageViews getHsAnalyticsNumPageViews() {
        return hsAnalyticsNumPageViews;
    }

    @JsonProperty("hs_analytics_num_page_views")
    public void setHsAnalyticsNumPageViews(HsAnalyticsNumPageViews hsAnalyticsNumPageViews) {
        this.hsAnalyticsNumPageViews = hsAnalyticsNumPageViews;
    }

    @JsonProperty("n4_d_o_compliance")
    public N4DOCompliance getN4DOCompliance() {
        return n4DOCompliance;
    }

    @JsonProperty("n4_d_o_compliance")
    public void setN4DOCompliance(N4DOCompliance n4DOCompliance) {
        this.n4DOCompliance = n4DOCompliance;
    }

    @JsonProperty("starting_date_of_coverage")
    public StartingDateOfCoverage getStartingDateOfCoverage() {
        return startingDateOfCoverage;
    }

    @JsonProperty("starting_date_of_coverage")
    public void setStartingDateOfCoverage(StartingDateOfCoverage startingDateOfCoverage) {
        this.startingDateOfCoverage = startingDateOfCoverage;
    }

    @JsonProperty("hs_lifecyclestage_subscriber_date")
    public HsLifecyclestageSubscriberDate getHsLifecyclestageSubscriberDate() {
        return hsLifecyclestageSubscriberDate;
    }

    @JsonProperty("hs_lifecyclestage_subscriber_date")
    public void setHsLifecyclestageSubscriberDate(HsLifecyclestageSubscriberDate hsLifecyclestageSubscriberDate) {
        this.hsLifecyclestageSubscriberDate = hsLifecyclestageSubscriberDate;
    }

    @JsonProperty("lead_status_change")
    public LeadStatusChange getLeadStatusChange() {
        return leadStatusChange;
    }

    @JsonProperty("lead_status_change")
    public void setLeadStatusChange(LeadStatusChange leadStatusChange) {
        this.leadStatusChange = leadStatusChange;
    }

    @JsonProperty("hs_analytics_average_page_views")
    public HsAnalyticsAveragePageViews getHsAnalyticsAveragePageViews() {
        return hsAnalyticsAveragePageViews;
    }

    @JsonProperty("hs_analytics_average_page_views")
    public void setHsAnalyticsAveragePageViews(HsAnalyticsAveragePageViews hsAnalyticsAveragePageViews) {
        this.hsAnalyticsAveragePageViews = hsAnalyticsAveragePageViews;
    }

    @JsonProperty("n5_d_o_compliance")
    public N5DOCompliance getN5DOCompliance() {
        return n5DOCompliance;
    }

    @JsonProperty("n5_d_o_compliance")
    public void setN5DOCompliance(N5DOCompliance n5DOCompliance) {
        this.n5DOCompliance = n5DOCompliance;
    }

    @JsonProperty("lastname")
    public Lastname getLastname() {
        return lastname;
    }

    @JsonProperty("lastname")
    public void setLastname(Lastname lastname) {
        this.lastname = lastname;
    }

    @JsonProperty("n1_name_of_the_company")
    public N1NameOfTheCompany getN1NameOfTheCompany() {
        return n1NameOfTheCompany;
    }

    @JsonProperty("n1_name_of_the_company")
    public void setN1NameOfTheCompany(N1NameOfTheCompany n1NameOfTheCompany) {
        this.n1NameOfTheCompany = n1NameOfTheCompany;
    }

    @JsonProperty("hs_is_contact")
    public HsIsContact getHsIsContact() {
        return hsIsContact;
    }

    @JsonProperty("hs_is_contact")
    public void setHsIsContact(HsIsContact hsIsContact) {
        this.hsIsContact = hsIsContact;
    }

    @JsonProperty("total_consolidated_assets_of_companyname")
    public TotalConsolidatedAssetsOfCompanyname getTotalConsolidatedAssetsOfCompanyname() {
        return totalConsolidatedAssetsOfCompanyname;
    }

    @JsonProperty("total_consolidated_assets_of_companyname")
    public void setTotalConsolidatedAssetsOfCompanyname(TotalConsolidatedAssetsOfCompanyname totalConsolidatedAssetsOfCompanyname) {
        this.totalConsolidatedAssetsOfCompanyname = totalConsolidatedAssetsOfCompanyname;
    }

    @JsonProperty("phone")
    public Phone getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @JsonProperty("num_conVersionevents")
    public NumConversionEvents getNumConversionEvents() {
        return numConversionEvents;
    }

    @JsonProperty("num_conVersionevents")
    public void setNumConversionEvents(NumConversionEvents numConversionEvents) {
        this.numConversionEvents = numConversionEvents;
    }

    @JsonProperty("desired_limit_of_liability")
    public DesiredLimitOfLiability getDesiredLimitOfLiability() {
        return desiredLimitOfLiability;
    }

    @JsonProperty("desired_limit_of_liability")
    public void setDesiredLimitOfLiability(DesiredLimitOfLiability desiredLimitOfLiability) {
        this.desiredLimitOfLiability = desiredLimitOfLiability;
    }

    @JsonProperty("hs_object_id")
    public HsObjectId getHsObjectId() {
        return hsObjectId;
    }

    @JsonProperty("hs_object_id")
    public void setHsObjectId(HsObjectId hsObjectId) {
        this.hsObjectId = hsObjectId;
    }

    @JsonProperty("currentlyinworkflow")
    public Currentlyinworkflow getCurrentlyinworkflow() {
        return currentlyinworkflow;
    }

    @JsonProperty("currentlyinworkflow")
    public void setCurrentlyinworkflow(Currentlyinworkflow currentlyinworkflow) {
        this.currentlyinworkflow = currentlyinworkflow;
    }

    @JsonProperty("hs_analytics_num_event_completions")
    public HsAnalyticsNumEventCompletions getHsAnalyticsNumEventCompletions() {
        return hsAnalyticsNumEventCompletions;
    }

    @JsonProperty("hs_analytics_num_event_completions")
    public void setHsAnalyticsNumEventCompletions(HsAnalyticsNumEventCompletions hsAnalyticsNumEventCompletions) {
        this.hsAnalyticsNumEventCompletions = hsAnalyticsNumEventCompletions;
    }

    @JsonProperty("salutation")
    public Salutation getSalutation() {
        return salutation;
    }

    @JsonProperty("salutation")
    public void setSalutation(Salutation salutation) {
        this.salutation = salutation;
    }

    @JsonProperty("hs_lifecyclestage_lead_date")
    public HsLifecyclestageLeadDate getHsLifecyclestageLeadDate() {
        return hsLifecyclestageLeadDate;
    }

    @JsonProperty("hs_lifecyclestage_lead_date")
    public void setHsLifecyclestageLeadDate(HsLifecyclestageLeadDate hsLifecyclestageLeadDate) {
        this.hsLifecyclestageLeadDate = hsLifecyclestageLeadDate;
    }

    @JsonProperty("n6_d_o_compliance")
    public N6DOCompliance getN6DOCompliance() {
        return n6DOCompliance;
    }

    @JsonProperty("n6_d_o_compliance")
    public void setN6DOCompliance(N6DOCompliance n6DOCompliance) {
        this.n6DOCompliance = n6DOCompliance;
    }

    @JsonProperty("n6_acra_uen_roc")
    public N6AcraUenRoc getN6AcraUenRoc() {
        return n6AcraUenRoc;
    }

    @JsonProperty("n6_acra_uen_roc")
    public void setN6AcraUenRoc(N6AcraUenRoc n6AcraUenRoc) {
        this.n6AcraUenRoc = n6AcraUenRoc;
    }

    @JsonProperty("hs_is_unworked")
    public HsIsUnworked getHsIsUnworked() {
        return hsIsUnworked;
    }

    @JsonProperty("hs_is_unworked")
    public void setHsIsUnworked(HsIsUnworked hsIsUnworked) {
        this.hsIsUnworked = hsIsUnworked;
    }

    @JsonProperty("firstname")
    public Firstname getFirstname() {
        return firstname;
    }

    @JsonProperty("firstname")
    public void setFirstname(Firstname firstname) {
        this.firstname = firstname;
    }

    @JsonProperty("gender")
    public Gender getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @JsonProperty("n1_d_o_compliance")
    public N1DOCompliance getN1DOCompliance() {
        return n1DOCompliance;
    }

    @JsonProperty("n1_d_o_compliance")
    public void setN1DOCompliance(N1DOCompliance n1DOCompliance) {
        this.n1DOCompliance = n1DOCompliance;
    }

    @JsonProperty("hs_all_team_ids")
    public HsAllTeamIds getHsAllTeamIds() {
        return hsAllTeamIds;
    }

    @JsonProperty("hs_all_team_ids")
    public void setHsAllTeamIds(HsAllTeamIds hsAllTeamIds) {
        this.hsAllTeamIds = hsAllTeamIds;
    }

    @JsonProperty("hs_social_num_broadcast_clicks")
    public HsSocialNumBroadcastClicks getHsSocialNumBroadcastClicks() {
        return hsSocialNumBroadcastClicks;
    }

    @JsonProperty("hs_social_num_broadcast_clicks")
    public void setHsSocialNumBroadcastClicks(HsSocialNumBroadcastClicks hsSocialNumBroadcastClicks) {
        this.hsSocialNumBroadcastClicks = hsSocialNumBroadcastClicks;
    }

    @JsonProperty("n1_your_claim_history")
    public N1YourClaimHistory getN1YourClaimHistory() {
        return n1YourClaimHistory;
    }

    @JsonProperty("n1_your_claim_history")
    public void setN1YourClaimHistory(N1YourClaimHistory n1YourClaimHistory) {
        this.n1YourClaimHistory = n1YourClaimHistory;
    }

    @JsonProperty("hs_analytics_num_visits")
    public HsAnalyticsNumVisits getHsAnalyticsNumVisits() {
        return hsAnalyticsNumVisits;
    }

    @JsonProperty("hs_analytics_num_visits")
    public void setHsAnalyticsNumVisits(HsAnalyticsNumVisits hsAnalyticsNumVisits) {
        this.hsAnalyticsNumVisits = hsAnalyticsNumVisits;
    }

    @JsonProperty("initial_starting_date")
    public InitialStartingDate getInitialStartingDate() {
        return initialStartingDate;
    }

    @JsonProperty("initial_starting_date")
    public void setInitialStartingDate(InitialStartingDate initialStartingDate) {
        this.initialStartingDate = initialStartingDate;
    }

    @JsonProperty("hubspot_team_id")
    public HubspotTeamId getHubspotTeamId() {
        return hubspotTeamId;
    }

    @JsonProperty("hubspot_team_id")
    public void setHubspotTeamId(HubspotTeamId hubspotTeamId) {
        this.hubspotTeamId = hubspotTeamId;
    }

    @JsonProperty("hs_social_linkedin_clicks")
    public HsSocialLinkedinClicks getHsSocialLinkedinClicks() {
        return hsSocialLinkedinClicks;
    }

    @JsonProperty("hs_social_linkedin_clicks")
    public void setHsSocialLinkedinClicks(HsSocialLinkedinClicks hsSocialLinkedinClicks) {
        this.hsSocialLinkedinClicks = hsSocialLinkedinClicks;
    }

    @JsonProperty("hs_analytics_source")
    public HsAnalyticsSource getHsAnalyticsSource() {
        return hsAnalyticsSource;
    }

    @JsonProperty("hs_analytics_source")
    public void setHsAnalyticsSource(HsAnalyticsSource hsAnalyticsSource) {
        this.hsAnalyticsSource = hsAnalyticsSource;
    }

    @JsonProperty("hs_searchable_calculated_phone_number")
    public HsSearchableCalculatedPhoneNumber getHsSearchableCalculatedPhoneNumber() {
        return hsSearchableCalculatedPhoneNumber;
    }

    @JsonProperty("hs_searchable_calculated_phone_number")
    public void setHsSearchableCalculatedPhoneNumber(HsSearchableCalculatedPhoneNumber hsSearchableCalculatedPhoneNumber) {
        this.hsSearchableCalculatedPhoneNumber = hsSearchableCalculatedPhoneNumber;
    }

    @JsonProperty("limit_for_company_employment_practice_liability")
    public LimitForCompanyEmploymentPracticeLiability getLimitForCompanyEmploymentPracticeLiability() {
        return limitForCompanyEmploymentPracticeLiability;
    }

    @JsonProperty("limit_for_company_employment_practice_liability")
    public void setLimitForCompanyEmploymentPracticeLiability(LimitForCompanyEmploymentPracticeLiability limitForCompanyEmploymentPracticeLiability) {
        this.limitForCompanyEmploymentPracticeLiability = limitForCompanyEmploymentPracticeLiability;
    }

    @JsonProperty("hs_email_domain")
    public HsEmailDomain getHsEmailDomain() {
        return hsEmailDomain;
    }

    @JsonProperty("hs_email_domain")
    public void setHsEmailDomain(HsEmailDomain hsEmailDomain) {
        this.hsEmailDomain = hsEmailDomain;
    }

    @JsonProperty("n2_address_of_employment")
    public N2AddressOfEmployment getN2AddressOfEmployment() {
        return n2AddressOfEmployment;
    }

    @JsonProperty("n2_address_of_employment")
    public void setN2AddressOfEmployment(N2AddressOfEmployment n2AddressOfEmployment) {
        this.n2AddressOfEmployment = n2AddressOfEmployment;
    }

    @JsonProperty("hs_all_owner_ids")
    public HsAllOwnerIds getHsAllOwnerIds() {
        return hsAllOwnerIds;
    }

    @JsonProperty("hs_all_owner_ids")
    public void setHsAllOwnerIds(HsAllOwnerIds hsAllOwnerIds) {
        this.hsAllOwnerIds = hsAllOwnerIds;
    }

    @JsonProperty("email")
    public Email getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Email email) {
        this.email = email;
    }

    @JsonProperty("i_have_acknowledge_the_full_policy_wording")
    public IHaveAcknowledgeTheFullPolicyWording getIHaveAcknowledgeTheFullPolicyWording() {
        return iHaveAcknowledgeTheFullPolicyWording;
    }

    @JsonProperty("i_have_acknowledge_the_full_policy_wording")
    public void setIHaveAcknowledgeTheFullPolicyWording(IHaveAcknowledgeTheFullPolicyWording iHaveAcknowledgeTheFullPolicyWording) {
        this.iHaveAcknowledgeTheFullPolicyWording = iHaveAcknowledgeTheFullPolicyWording;
    }

    @JsonProperty("expiring_date")
    public ExpiringDate getExpiringDate() {
        return expiringDate;
    }

    @JsonProperty("expiring_date")
    public void setExpiringDate(ExpiringDate expiringDate) {
        this.expiringDate = expiringDate;
    }

    @JsonProperty("jobtitle")
    public Jobtitle getJobtitle() {
        return jobtitle;
    }

    @JsonProperty("jobtitle")
    public void setJobtitle(Jobtitle jobtitle) {
        this.jobtitle = jobtitle;
    }

    @JsonProperty("lastmodifieddate")
    public Lastmodifieddate getLastmodifieddate() {
        return lastmodifieddate;
    }

    @JsonProperty("lastmodifieddate")
    public void setLastmodifieddate(Lastmodifieddate lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    @JsonProperty("n1_employment_practice_liability_compliance")
    public N1EmploymentPracticeLiabilityCompliance getN1EmploymentPracticeLiabilityCompliance() {
        return n1EmploymentPracticeLiabilityCompliance;
    }

    @JsonProperty("n1_employment_practice_liability_compliance")
    public void setN1EmploymentPracticeLiabilityCompliance(N1EmploymentPracticeLiabilityCompliance n1EmploymentPracticeLiabilityCompliance) {
        this.n1EmploymentPracticeLiabilityCompliance = n1EmploymentPracticeLiabilityCompliance;
    }

    @JsonProperty("hs_analytics_first_timestamp")
    public HsAnalyticsFirstTimestamp getHsAnalyticsFirstTimestamp() {
        return hsAnalyticsFirstTimestamp;
    }

    @JsonProperty("hs_analytics_first_timestamp")
    public void setHsAnalyticsFirstTimestamp(HsAnalyticsFirstTimestamp hsAnalyticsFirstTimestamp) {
        this.hsAnalyticsFirstTimestamp = hsAnalyticsFirstTimestamp;
    }

    @JsonProperty("hs_social_google_plus_clicks")
    public HsSocialGooglePlusClicks getHsSocialGooglePlusClicks() {
        return hsSocialGooglePlusClicks;
    }

    @JsonProperty("hs_social_google_plus_clicks")
    public void setHsSocialGooglePlusClicks(HsSocialGooglePlusClicks hsSocialGooglePlusClicks) {
        this.hsSocialGooglePlusClicks = hsSocialGooglePlusClicks;
    }

    @JsonProperty("n3_d_o_compliance")
    public N3DOCompliance getN3DOCompliance() {
        return n3DOCompliance;
    }

    @JsonProperty("n3_d_o_compliance")
    public void setN3DOCompliance(N3DOCompliance n3DOCompliance) {
        this.n3DOCompliance = n3DOCompliance;
    }

    @JsonProperty("hs_user_ids_of_all_owners")
    public HsUserIdsOfAllOwners getHsUserIdsOfAllOwners() {
        return hsUserIdsOfAllOwners;
    }

    @JsonProperty("hs_user_ids_of_all_owners")
    public void setHsUserIdsOfAllOwners(HsUserIdsOfAllOwners hsUserIdsOfAllOwners) {
        this.hsUserIdsOfAllOwners = hsUserIdsOfAllOwners;
    }

    @JsonProperty("i_accept_all_terms_conditions_from_blacaz")
    public IAcceptAllTermsConditionsFromBlacaz getIAcceptAllTermsConditionsFromBlacaz() {
        return iAcceptAllTermsConditionsFromBlacaz;
    }

    @JsonProperty("i_accept_all_terms_conditions_from_blacaz")
    public void setIAcceptAllTermsConditionsFromBlacaz(IAcceptAllTermsConditionsFromBlacaz iAcceptAllTermsConditionsFromBlacaz) {
        this.iAcceptAllTermsConditionsFromBlacaz = iAcceptAllTermsConditionsFromBlacaz;
    }

    @JsonProperty("hs_social_facebook_clicks")
    public HsSocialFacebookClicks getHsSocialFacebookClicks() {
        return hsSocialFacebookClicks;
    }

    @JsonProperty("hs_social_facebook_clicks")
    public void setHsSocialFacebookClicks(HsSocialFacebookClicks hsSocialFacebookClicks) {
        this.hsSocialFacebookClicks = hsSocialFacebookClicks;
    }

    @JsonProperty("hubspot_owner_assigneddate")
    public HubspotOwnerAssigneddate getHubspotOwnerAssigneddate() {
        return hubspotOwnerAssigneddate;
    }

    @JsonProperty("hubspot_owner_assigneddate")
    public void setHubspotOwnerAssigneddate(HubspotOwnerAssigneddate hubspotOwnerAssigneddate) {
        this.hubspotOwnerAssigneddate = hubspotOwnerAssigneddate;
    }

    @JsonProperty("hs_lead_status")
    public HsLeadStatus getHsLeadStatus() {
        return hsLeadStatus;
    }

    @JsonProperty("hs_lead_status")
    public void setHsLeadStatus(HsLeadStatus hsLeadStatus) {
        this.hsLeadStatus = hsLeadStatus;
    }

    @JsonProperty("n4_industry_code_name")
    public N4IndustryCodeName getN4IndustryCodeName() {
        return n4IndustryCodeName;
    }

    @JsonProperty("n4_industry_code_name")
    public void setN4IndustryCodeName(N4IndustryCodeName n4IndustryCodeName) {
        this.n4IndustryCodeName = n4IndustryCodeName;
    }

    @JsonProperty("hs_social_twitter_clicks")
    public HsSocialTwitterClicks getHsSocialTwitterClicks() {
        return hsSocialTwitterClicks;
    }

    @JsonProperty("hs_social_twitter_clicks")
    public void setHsSocialTwitterClicks(HsSocialTwitterClicks hsSocialTwitterClicks) {
        this.hsSocialTwitterClicks = hsSocialTwitterClicks;
    }

    @JsonProperty("hs_analytics_source_data_1")
    public HsAnalyticsSourceData1 getHsAnalyticsSourceData1() {
        return hsAnalyticsSourceData1;
    }

    @JsonProperty("hs_analytics_source_data_1")
    public void setHsAnalyticsSourceData1(HsAnalyticsSourceData1 hsAnalyticsSourceData1) {
        this.hsAnalyticsSourceData1 = hsAnalyticsSourceData1;
    }

    @JsonProperty("n2_d_o_compliance")
    public N2DOCompliance getN2DOCompliance() {
        return n2DOCompliance;
    }

    @JsonProperty("n2_d_o_compliance")
    public void setN2DOCompliance(N2DOCompliance n2DOCompliance) {
        this.n2DOCompliance = n2DOCompliance;
    }

    @JsonProperty("lifecyclestage")
    public Lifecyclestage getLifecyclestage() {
        return lifecyclestage;
    }

    @JsonProperty("lifecyclestage")
    public void setLifecyclestage(Lifecyclestage lifecyclestage) {
        this.lifecyclestage = lifecyclestage;
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
