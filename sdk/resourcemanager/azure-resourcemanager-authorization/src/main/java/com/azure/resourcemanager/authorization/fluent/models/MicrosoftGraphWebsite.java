// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** website. */
@Fluent
public final class MicrosoftGraphWebsite {
    /*
     * The URL of the website.
     */
    @JsonProperty(value = "address")
    private String address;

    /*
     * The display name of the web site.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * websiteType
     */
    @JsonProperty(value = "type")
    private MicrosoftGraphWebsiteType type;

    /*
     * website
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphWebsite class. */
    public MicrosoftGraphWebsite() {
    }

    /**
     * Get the address property: The URL of the website.
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: The URL of the website.
     *
     * @param address the address value to set.
     * @return the MicrosoftGraphWebsite object itself.
     */
    public MicrosoftGraphWebsite withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the displayName property: The display name of the web site.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the web site.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphWebsite object itself.
     */
    public MicrosoftGraphWebsite withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the type property: websiteType.
     *
     * @return the type value.
     */
    public MicrosoftGraphWebsiteType type() {
        return this.type;
    }

    /**
     * Set the type property: websiteType.
     *
     * @param type the type value to set.
     * @return the MicrosoftGraphWebsite object itself.
     */
    public MicrosoftGraphWebsite withType(MicrosoftGraphWebsiteType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the additionalProperties property: website.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: website.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWebsite object itself.
     */
    public MicrosoftGraphWebsite withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
