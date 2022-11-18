// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.models.IoTSecuritySolutionModelInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of IoT Security solutions. */
@Fluent
public final class IoTSecuritySolutionsList {
    /*
     * List of IoT Security solutions
     */
    @JsonProperty(value = "value", required = true)
    private List<IoTSecuritySolutionModelInner> value;

    /*
     * The URI to fetch the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of IoTSecuritySolutionsList class. */
    public IoTSecuritySolutionsList() {
    }

    /**
     * Get the value property: List of IoT Security solutions.
     *
     * @return the value value.
     */
    public List<IoTSecuritySolutionModelInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of IoT Security solutions.
     *
     * @param value the value value to set.
     * @return the IoTSecuritySolutionsList object itself.
     */
    public IoTSecuritySolutionsList withValue(List<IoTSecuritySolutionModelInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model IoTSecuritySolutionsList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IoTSecuritySolutionsList.class);
}
