// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.containers.containerregistry.models.ArtifactManifestPlatform;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of manifest attributes. */
@Fluent
public final class ManifestAttributesManifest {
    /*
     * List of manifest attributes details
     */
    @JsonProperty(value = "references")
    private List<ArtifactManifestPlatform> references;

    /** Creates an instance of ManifestAttributesManifest class. */
    public ManifestAttributesManifest() {}

    /**
     * Get the references property: List of manifest attributes details.
     *
     * @return the references value.
     */
    public List<ArtifactManifestPlatform> getReferences() {
        return this.references;
    }

    /**
     * Set the references property: List of manifest attributes details.
     *
     * @param references the references value to set.
     * @return the ManifestAttributesManifest object itself.
     */
    public ManifestAttributesManifest setReferences(List<ArtifactManifestPlatform> references) {
        this.references = references;
        return this;
    }
}
