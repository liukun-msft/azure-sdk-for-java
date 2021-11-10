// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ApplicationGroupPatchProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** ApplicationGroup properties that can be patched. */
@Fluent
public final class ApplicationGroupPatch extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGroupPatch.class);

    /*
     * tags to be updated
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * ApplicationGroup properties that can be patched.
     */
    @JsonProperty(value = "properties")
    private ApplicationGroupPatchProperties innerProperties;

    /**
     * Get the tags property: tags to be updated.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: tags to be updated.
     *
     * @param tags the tags value to set.
     * @return the ApplicationGroupPatch object itself.
     */
    public ApplicationGroupPatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: ApplicationGroup properties that can be patched.
     *
     * @return the innerProperties value.
     */
    private ApplicationGroupPatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: Description of ApplicationGroup.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of ApplicationGroup.
     *
     * @param description the description value to set.
     * @return the ApplicationGroupPatch object itself.
     */
    public ApplicationGroupPatch withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGroupPatchProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of ApplicationGroup.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.innerProperties() == null ? null : this.innerProperties().friendlyName();
    }

    /**
     * Set the friendlyName property: Friendly name of ApplicationGroup.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the ApplicationGroupPatch object itself.
     */
    public ApplicationGroupPatch withFriendlyName(String friendlyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGroupPatchProperties();
        }
        this.innerProperties().withFriendlyName(friendlyName);
        return this;
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
