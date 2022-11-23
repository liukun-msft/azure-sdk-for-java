// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** chatMessagePolicyViolationPolicyTip. */
@Fluent
public final class MicrosoftGraphChatMessagePolicyViolationPolicyTip {
    /*
     * The URL a user can visit to read about the data loss prevention policies for the organization. (ie, policies
     * about what users shouldn't say in chats)
     */
    @JsonProperty(value = "complianceUrl")
    private String complianceUrl;

    /*
     * Explanatory text shown to the sender of the message.
     */
    @JsonProperty(value = "generalText")
    private String generalText;

    /*
     * The list of improper data in the message that was detected by the data loss prevention app. Each DLP app defines
     * its own conditions, examples include 'Credit Card Number' and 'Social Security Number'.
     */
    @JsonProperty(value = "matchedConditionDescriptions")
    private List<String> matchedConditionDescriptions;

    /*
     * chatMessagePolicyViolationPolicyTip
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphChatMessagePolicyViolationPolicyTip class. */
    public MicrosoftGraphChatMessagePolicyViolationPolicyTip() {
    }

    /**
     * Get the complianceUrl property: The URL a user can visit to read about the data loss prevention policies for the
     * organization. (ie, policies about what users shouldn't say in chats).
     *
     * @return the complianceUrl value.
     */
    public String complianceUrl() {
        return this.complianceUrl;
    }

    /**
     * Set the complianceUrl property: The URL a user can visit to read about the data loss prevention policies for the
     * organization. (ie, policies about what users shouldn't say in chats).
     *
     * @param complianceUrl the complianceUrl value to set.
     * @return the MicrosoftGraphChatMessagePolicyViolationPolicyTip object itself.
     */
    public MicrosoftGraphChatMessagePolicyViolationPolicyTip withComplianceUrl(String complianceUrl) {
        this.complianceUrl = complianceUrl;
        return this;
    }

    /**
     * Get the generalText property: Explanatory text shown to the sender of the message.
     *
     * @return the generalText value.
     */
    public String generalText() {
        return this.generalText;
    }

    /**
     * Set the generalText property: Explanatory text shown to the sender of the message.
     *
     * @param generalText the generalText value to set.
     * @return the MicrosoftGraphChatMessagePolicyViolationPolicyTip object itself.
     */
    public MicrosoftGraphChatMessagePolicyViolationPolicyTip withGeneralText(String generalText) {
        this.generalText = generalText;
        return this;
    }

    /**
     * Get the matchedConditionDescriptions property: The list of improper data in the message that was detected by the
     * data loss prevention app. Each DLP app defines its own conditions, examples include 'Credit Card Number' and
     * 'Social Security Number'.
     *
     * @return the matchedConditionDescriptions value.
     */
    public List<String> matchedConditionDescriptions() {
        return this.matchedConditionDescriptions;
    }

    /**
     * Set the matchedConditionDescriptions property: The list of improper data in the message that was detected by the
     * data loss prevention app. Each DLP app defines its own conditions, examples include 'Credit Card Number' and
     * 'Social Security Number'.
     *
     * @param matchedConditionDescriptions the matchedConditionDescriptions value to set.
     * @return the MicrosoftGraphChatMessagePolicyViolationPolicyTip object itself.
     */
    public MicrosoftGraphChatMessagePolicyViolationPolicyTip withMatchedConditionDescriptions(
        List<String> matchedConditionDescriptions) {
        this.matchedConditionDescriptions = matchedConditionDescriptions;
        return this;
    }

    /**
     * Get the additionalProperties property: chatMessagePolicyViolationPolicyTip.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: chatMessagePolicyViolationPolicyTip.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphChatMessagePolicyViolationPolicyTip object itself.
     */
    public MicrosoftGraphChatMessagePolicyViolationPolicyTip withAdditionalProperties(
        Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
