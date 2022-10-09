// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.alertsmanagement.models.SmartGroupModificationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Alert Modification details. */
@Fluent
public final class SmartGroupModificationInner extends ProxyResource {
    /*
     * Properties of the smartGroup modification item.
     */
    @JsonProperty(value = "properties")
    private SmartGroupModificationProperties properties;

    /**
     * Get the properties property: Properties of the smartGroup modification item.
     *
     * @return the properties value.
     */
    public SmartGroupModificationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the smartGroup modification item.
     *
     * @param properties the properties value to set.
     * @return the SmartGroupModificationInner object itself.
     */
    public SmartGroupModificationInner withProperties(SmartGroupModificationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
