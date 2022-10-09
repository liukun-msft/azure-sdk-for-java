// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Recommended actions based on discovered issues. */
@Fluent
public final class TroubleshootingRecommendedActions {
    /*
     * ID of the recommended action.
     */
    @JsonProperty(value = "actionId")
    private String actionId;

    /*
     * Description of recommended actions.
     */
    @JsonProperty(value = "actionText")
    private String actionText;

    /*
     * The uri linking to a documentation for the recommended troubleshooting actions.
     */
    @JsonProperty(value = "actionUri")
    private String actionUri;

    /*
     * The information from the URI for the recommended troubleshooting actions.
     */
    @JsonProperty(value = "actionUriText")
    private String actionUriText;

    /**
     * Get the actionId property: ID of the recommended action.
     *
     * @return the actionId value.
     */
    public String actionId() {
        return this.actionId;
    }

    /**
     * Set the actionId property: ID of the recommended action.
     *
     * @param actionId the actionId value to set.
     * @return the TroubleshootingRecommendedActions object itself.
     */
    public TroubleshootingRecommendedActions withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * Get the actionText property: Description of recommended actions.
     *
     * @return the actionText value.
     */
    public String actionText() {
        return this.actionText;
    }

    /**
     * Set the actionText property: Description of recommended actions.
     *
     * @param actionText the actionText value to set.
     * @return the TroubleshootingRecommendedActions object itself.
     */
    public TroubleshootingRecommendedActions withActionText(String actionText) {
        this.actionText = actionText;
        return this;
    }

    /**
     * Get the actionUri property: The uri linking to a documentation for the recommended troubleshooting actions.
     *
     * @return the actionUri value.
     */
    public String actionUri() {
        return this.actionUri;
    }

    /**
     * Set the actionUri property: The uri linking to a documentation for the recommended troubleshooting actions.
     *
     * @param actionUri the actionUri value to set.
     * @return the TroubleshootingRecommendedActions object itself.
     */
    public TroubleshootingRecommendedActions withActionUri(String actionUri) {
        this.actionUri = actionUri;
        return this;
    }

    /**
     * Get the actionUriText property: The information from the URI for the recommended troubleshooting actions.
     *
     * @return the actionUriText value.
     */
    public String actionUriText() {
        return this.actionUriText;
    }

    /**
     * Set the actionUriText property: The information from the URI for the recommended troubleshooting actions.
     *
     * @param actionUriText the actionUriText value to set.
     * @return the TroubleshootingRecommendedActions object itself.
     */
    public TroubleshootingRecommendedActions withActionUriText(String actionUriText) {
        this.actionUriText = actionUriText;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
