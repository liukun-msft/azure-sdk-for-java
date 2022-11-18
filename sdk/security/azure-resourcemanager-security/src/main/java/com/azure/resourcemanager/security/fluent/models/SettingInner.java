// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.security.models.AlertSyncSettings;
import com.azure.resourcemanager.security.models.DataExportSettings;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The kind of the security setting. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = SettingInner.class)
@JsonTypeName("Setting")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DataExportSettings", value = DataExportSettings.class),
    @JsonSubTypes.Type(name = "AlertSyncSettings", value = AlertSyncSettings.class)
})
@Immutable
public class SettingInner extends ProxyResource {
    /** Creates an instance of SettingInner class. */
    public SettingInner() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
