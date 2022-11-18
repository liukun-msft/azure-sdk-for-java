// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Live trace configuration of a Microsoft.SignalRService resource. */
@Fluent
public final class LiveTraceConfiguration {
    /*
     * Indicates whether or not enable live trace.
     * When it's set to true, live trace client can connect to the service.
     * Otherwise, live trace client can't connect to the service, so that you are unable to receive any log, no matter
     * what you configure in "categories".
     * Available values: true, false.
     * Case insensitive.
     */
    @JsonProperty(value = "enabled")
    private String enabled;

    /*
     * Gets or sets the list of category configurations.
     */
    @JsonProperty(value = "categories")
    private List<LiveTraceCategory> categories;

    /** Creates an instance of LiveTraceConfiguration class. */
    public LiveTraceConfiguration() {
    }

    /**
     * Get the enabled property: Indicates whether or not enable live trace. When it's set to true, live trace client
     * can connect to the service. Otherwise, live trace client can't connect to the service, so that you are unable to
     * receive any log, no matter what you configure in "categories". Available values: true, false. Case insensitive.
     *
     * @return the enabled value.
     */
    public String enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether or not enable live trace. When it's set to true, live trace client
     * can connect to the service. Otherwise, live trace client can't connect to the service, so that you are unable to
     * receive any log, no matter what you configure in "categories". Available values: true, false. Case insensitive.
     *
     * @param enabled the enabled value to set.
     * @return the LiveTraceConfiguration object itself.
     */
    public LiveTraceConfiguration withEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the categories property: Gets or sets the list of category configurations.
     *
     * @return the categories value.
     */
    public List<LiveTraceCategory> categories() {
        return this.categories;
    }

    /**
     * Set the categories property: Gets or sets the list of category configurations.
     *
     * @param categories the categories value to set.
     * @return the LiveTraceConfiguration object itself.
     */
    public LiveTraceConfiguration withCategories(List<LiveTraceCategory> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (categories() != null) {
            categories().forEach(e -> e.validate());
        }
    }
}
