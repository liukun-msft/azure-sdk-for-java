// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a Script Package subresource. */
@Immutable
public final class ScriptPackageProperties {
    /*
     * User friendly description of the package
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Module version
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * Company that created and supports the package
     */
    @JsonProperty(value = "company", access = JsonProperty.Access.WRITE_ONLY)
    private String company;

    /*
     * Link to support by the package vendor
     */
    @JsonProperty(value = "uri", access = JsonProperty.Access.WRITE_ONLY)
    private String uri;

    /** Creates an instance of ScriptPackageProperties class. */
    public ScriptPackageProperties() {
    }

    /**
     * Get the description property: User friendly description of the package.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the version property: Module version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the company property: Company that created and supports the package.
     *
     * @return the company value.
     */
    public String company() {
        return this.company;
    }

    /**
     * Get the uri property: Link to support by the package vendor.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
