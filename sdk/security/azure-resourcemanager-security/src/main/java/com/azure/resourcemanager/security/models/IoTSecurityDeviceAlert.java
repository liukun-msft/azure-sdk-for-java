// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Statistical information about the number of alerts per alert type during last set number of days. */
@Immutable
public final class IoTSecurityDeviceAlert {
    /*
     * Display name of the alert
     */
    @JsonProperty(value = "alertDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String alertDisplayName;

    /*
     * Assessed Alert severity.
     */
    @JsonProperty(value = "reportedSeverity", access = JsonProperty.Access.WRITE_ONLY)
    private ReportedSeverity reportedSeverity;

    /*
     * Number of alerts raised for this alert type.
     */
    @JsonProperty(value = "alertsCount", access = JsonProperty.Access.WRITE_ONLY)
    private Long alertsCount;

    /** Creates an instance of IoTSecurityDeviceAlert class. */
    public IoTSecurityDeviceAlert() {
    }

    /**
     * Get the alertDisplayName property: Display name of the alert.
     *
     * @return the alertDisplayName value.
     */
    public String alertDisplayName() {
        return this.alertDisplayName;
    }

    /**
     * Get the reportedSeverity property: Assessed Alert severity.
     *
     * @return the reportedSeverity value.
     */
    public ReportedSeverity reportedSeverity() {
        return this.reportedSeverity;
    }

    /**
     * Get the alertsCount property: Number of alerts raised for this alert type.
     *
     * @return the alertsCount value.
     */
    public Long alertsCount() {
        return this.alertsCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
