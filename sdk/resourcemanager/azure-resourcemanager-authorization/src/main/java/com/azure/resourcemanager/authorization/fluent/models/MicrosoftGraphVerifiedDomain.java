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

/** verifiedDomain. */
@Fluent
public final class MicrosoftGraphVerifiedDomain {
    /*
     * For example, 'Email', 'OfficeCommunicationsOnline'.
     */
    @JsonProperty(value = "capabilities")
    private String capabilities;

    /*
     * true if this is the default domain associated with the tenant; otherwise, false.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /*
     * true if this is the initial domain associated with the tenant; otherwise, false
     */
    @JsonProperty(value = "isInitial")
    private Boolean isInitial;

    /*
     * The domain name; for example, 'contoso.onmicrosoft.com'
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * For example, 'Managed'.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * verifiedDomain
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphVerifiedDomain class. */
    public MicrosoftGraphVerifiedDomain() {
    }

    /**
     * Get the capabilities property: For example, 'Email', 'OfficeCommunicationsOnline'.
     *
     * @return the capabilities value.
     */
    public String capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: For example, 'Email', 'OfficeCommunicationsOnline'.
     *
     * @param capabilities the capabilities value to set.
     * @return the MicrosoftGraphVerifiedDomain object itself.
     */
    public MicrosoftGraphVerifiedDomain withCapabilities(String capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the isDefault property: true if this is the default domain associated with the tenant; otherwise, false.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set the isDefault property: true if this is the default domain associated with the tenant; otherwise, false.
     *
     * @param isDefault the isDefault value to set.
     * @return the MicrosoftGraphVerifiedDomain object itself.
     */
    public MicrosoftGraphVerifiedDomain withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get the isInitial property: true if this is the initial domain associated with the tenant; otherwise, false.
     *
     * @return the isInitial value.
     */
    public Boolean isInitial() {
        return this.isInitial;
    }

    /**
     * Set the isInitial property: true if this is the initial domain associated with the tenant; otherwise, false.
     *
     * @param isInitial the isInitial value to set.
     * @return the MicrosoftGraphVerifiedDomain object itself.
     */
    public MicrosoftGraphVerifiedDomain withIsInitial(Boolean isInitial) {
        this.isInitial = isInitial;
        return this;
    }

    /**
     * Get the name property: The domain name; for example, 'contoso.onmicrosoft.com'.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The domain name; for example, 'contoso.onmicrosoft.com'.
     *
     * @param name the name value to set.
     * @return the MicrosoftGraphVerifiedDomain object itself.
     */
    public MicrosoftGraphVerifiedDomain withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: For example, 'Managed'.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: For example, 'Managed'.
     *
     * @param type the type value to set.
     * @return the MicrosoftGraphVerifiedDomain object itself.
     */
    public MicrosoftGraphVerifiedDomain withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the additionalProperties property: verifiedDomain.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: verifiedDomain.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphVerifiedDomain object itself.
     */
    public MicrosoftGraphVerifiedDomain withAdditionalProperties(Map<String, Object> additionalProperties) {
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
