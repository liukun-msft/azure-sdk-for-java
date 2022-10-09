// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.monitor.fluent.models.DiagnosticSettingsResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents a collection of alert rule resources. */
@Fluent
public final class DiagnosticSettingsResourceCollection {
    /*
     * The collection of diagnostic settings resources;.
     */
    @JsonProperty(value = "value")
    private List<DiagnosticSettingsResourceInner> value;

    /**
     * Get the value property: The collection of diagnostic settings resources;.
     *
     * @return the value value.
     */
    public List<DiagnosticSettingsResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection of diagnostic settings resources;.
     *
     * @param value the value value to set.
     * @return the DiagnosticSettingsResourceCollection object itself.
     */
    public DiagnosticSettingsResourceCollection withValue(List<DiagnosticSettingsResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
