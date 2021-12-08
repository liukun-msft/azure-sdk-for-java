// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.implementation;

import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.ResourceProviderOperationInner;
import com.azure.resourcemanager.kubernetesconfiguration.models.ResourceProviderOperation;
import com.azure.resourcemanager.kubernetesconfiguration.models.ResourceProviderOperationDisplay;

public final class ResourceProviderOperationImpl implements ResourceProviderOperation {
    private ResourceProviderOperationInner innerObject;

    private final com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager serviceManager;

    ResourceProviderOperationImpl(
        ResourceProviderOperationInner innerObject,
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public ResourceProviderOperationDisplay display() {
        return this.innerModel().display();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public ResourceProviderOperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager() {
        return this.serviceManager;
    }
}
