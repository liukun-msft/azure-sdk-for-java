// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Base class for backup policy. Workload-specific backup policies are derived from this class. */
@Fluent
public final class ProtectionPolicyResourceInner extends Resource {
    /*
     * ProtectionPolicyResource properties
     */
    @JsonProperty(value = "properties")
    private ProtectionPolicy properties;

    /*
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /** Creates an instance of ProtectionPolicyResourceInner class. */
    public ProtectionPolicyResourceInner() {
    }

    /**
     * Get the properties property: ProtectionPolicyResource properties.
     *
     * @return the properties value.
     */
    public ProtectionPolicy properties() {
        return this.properties;
    }

    /**
     * Set the properties property: ProtectionPolicyResource properties.
     *
     * @param properties the properties value to set.
     * @return the ProtectionPolicyResourceInner object itself.
     */
    public ProtectionPolicyResourceInner withProperties(ProtectionPolicy properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the etag property: Optional ETag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Optional ETag.
     *
     * @param etag the etag value to set.
     * @return the ProtectionPolicyResourceInner object itself.
     */
    public ProtectionPolicyResourceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProtectionPolicyResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProtectionPolicyResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
