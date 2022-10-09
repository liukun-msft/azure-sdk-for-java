// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.resourcemanager.netapp.fluent.models.SubscriptionQuotaItemInner;
import com.azure.resourcemanager.netapp.models.SubscriptionQuotaItem;

public final class SubscriptionQuotaItemImpl implements SubscriptionQuotaItem {
    private SubscriptionQuotaItemInner innerObject;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    SubscriptionQuotaItemImpl(
        SubscriptionQuotaItemInner innerObject, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Integer current() {
        return this.innerModel().current();
    }

    public Integer defaultProperty() {
        return this.innerModel().defaultProperty();
    }

    public SubscriptionQuotaItemInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }
}
