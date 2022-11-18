// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.AzureResourceLink;
import com.azure.resourcemanager.security.models.SecureScoreControlDefinitionSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about the security control. */
@Immutable
public final class SecureScoreControlDefinitionItemInner extends ProxyResource {
    /*
     * Security Control Definition Properties.
     */
    @JsonProperty(value = "properties")
    private SecureScoreControlDefinitionItemProperties innerProperties;

    /** Creates an instance of SecureScoreControlDefinitionItemInner class. */
    public SecureScoreControlDefinitionItemInner() {
    }

    /**
     * Get the innerProperties property: Security Control Definition Properties.
     *
     * @return the innerProperties value.
     */
    private SecureScoreControlDefinitionItemProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the displayName property: User friendly display name of the control.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the description property: User friendly description of the control.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the maxScore property: Maximum control score (0..10).
     *
     * @return the maxScore value.
     */
    public Integer maxScore() {
        return this.innerProperties() == null ? null : this.innerProperties().maxScore();
    }

    /**
     * Get the source property: Source object from which the control was created.
     *
     * @return the source value.
     */
    public SecureScoreControlDefinitionSource source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Get the assessmentDefinitions property: Array of assessments metadata IDs that are included in this security
     * control.
     *
     * @return the assessmentDefinitions value.
     */
    public List<AzureResourceLink> assessmentDefinitions() {
        return this.innerProperties() == null ? null : this.innerProperties().assessmentDefinitions();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
