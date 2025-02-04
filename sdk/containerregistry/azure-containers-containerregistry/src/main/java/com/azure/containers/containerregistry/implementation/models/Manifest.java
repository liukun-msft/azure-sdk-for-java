// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Returns the requested manifest file. */
@Fluent
public class Manifest {
    /*
     * Schema version
     */
    @JsonProperty(value = "schemaVersion")
    private Integer schemaVersion;

    /** Creates an instance of Manifest class. */
    public Manifest() {}

    /**
     * Get the schemaVersion property: Schema version.
     *
     * @return the schemaVersion value.
     */
    public Integer getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * Set the schemaVersion property: Schema version.
     *
     * @param schemaVersion the schemaVersion value to set.
     * @return the Manifest object itself.
     */
    public Manifest setSchemaVersion(Integer schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
}
