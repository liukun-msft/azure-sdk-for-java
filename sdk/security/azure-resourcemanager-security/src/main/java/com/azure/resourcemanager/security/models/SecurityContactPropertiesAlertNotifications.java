// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines whether to send email notifications about new security alerts. */
@Fluent
public final class SecurityContactPropertiesAlertNotifications {
    /*
     * Defines if email notifications will be sent about new security alerts
     */
    @JsonProperty(value = "state")
    private State state;

    /*
     * Defines the minimal alert severity which will be sent as email notifications
     */
    @JsonProperty(value = "minimalSeverity")
    private MinimalSeverity minimalSeverity;

    /**
     * Get the state property: Defines if email notifications will be sent about new security alerts.
     *
     * @return the state value.
     */
    public State state() {
        return this.state;
    }

    /**
     * Set the state property: Defines if email notifications will be sent about new security alerts.
     *
     * @param state the state value to set.
     * @return the SecurityContactPropertiesAlertNotifications object itself.
     */
    public SecurityContactPropertiesAlertNotifications withState(State state) {
        this.state = state;
        return this;
    }

    /**
     * Get the minimalSeverity property: Defines the minimal alert severity which will be sent as email notifications.
     *
     * @return the minimalSeverity value.
     */
    public MinimalSeverity minimalSeverity() {
        return this.minimalSeverity;
    }

    /**
     * Set the minimalSeverity property: Defines the minimal alert severity which will be sent as email notifications.
     *
     * @param minimalSeverity the minimalSeverity value to set.
     * @return the SecurityContactPropertiesAlertNotifications object itself.
     */
    public SecurityContactPropertiesAlertNotifications withMinimalSeverity(MinimalSeverity minimalSeverity) {
        this.minimalSeverity = minimalSeverity;
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
