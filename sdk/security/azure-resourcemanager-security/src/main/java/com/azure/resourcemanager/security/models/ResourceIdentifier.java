// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A resource identifier for an alert which can be used to direct the alert to the right product exposure group (tenant,
 * workspace, subscription etc.).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ResourceIdentifier.class)
@JsonTypeName("ResourceIdentifier")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureResource", value = AzureResourceIdentifier.class),
    @JsonSubTypes.Type(name = "LogAnalytics", value = LogAnalyticsIdentifier.class)
})
@Immutable
public class ResourceIdentifier {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
