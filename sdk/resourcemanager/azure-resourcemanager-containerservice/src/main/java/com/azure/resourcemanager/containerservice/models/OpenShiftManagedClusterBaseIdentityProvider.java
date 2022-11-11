// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Structure for any Identity provider. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = OpenShiftManagedClusterBaseIdentityProvider.class)
@JsonTypeName("OpenShiftManagedClusterBaseIdentityProvider")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AADIdentityProvider", value = OpenShiftManagedClusterAadIdentityProvider.class)
})
@Immutable
public class OpenShiftManagedClusterBaseIdentityProvider {
    /** Creates an instance of OpenShiftManagedClusterBaseIdentityProvider class. */
    public OpenShiftManagedClusterBaseIdentityProvider() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
