// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.elastic.fluent.models.ElasticMonitorResourceInner;
import com.azure.resourcemanager.elastic.models.ElasticMonitorResource;
import com.azure.resourcemanager.elastic.models.ElasticMonitorResourceUpdateParameters;
import com.azure.resourcemanager.elastic.models.IdentityProperties;
import com.azure.resourcemanager.elastic.models.MonitorProperties;
import com.azure.resourcemanager.elastic.models.ResourceSku;
import java.util.Collections;
import java.util.Map;

public final class ElasticMonitorResourceImpl
    implements ElasticMonitorResource, ElasticMonitorResource.Definition, ElasticMonitorResource.Update {
    private ElasticMonitorResourceInner innerObject;

    private final com.azure.resourcemanager.elastic.ElasticManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ResourceSku sku() {
        return this.innerModel().sku();
    }

    public MonitorProperties properties() {
        return this.innerModel().properties();
    }

    public IdentityProperties identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ElasticMonitorResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.elastic.ElasticManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String monitorName;

    private ElasticMonitorResourceUpdateParameters updateBody;

    public ElasticMonitorResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ElasticMonitorResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMonitors()
                .create(resourceGroupName, monitorName, this.innerModel(), Context.NONE);
        return this;
    }

    public ElasticMonitorResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMonitors()
                .create(resourceGroupName, monitorName, this.innerModel(), context);
        return this;
    }

    ElasticMonitorResourceImpl(String name, com.azure.resourcemanager.elastic.ElasticManager serviceManager) {
        this.innerObject = new ElasticMonitorResourceInner();
        this.serviceManager = serviceManager;
        this.monitorName = name;
    }

    public ElasticMonitorResourceImpl update() {
        this.updateBody = new ElasticMonitorResourceUpdateParameters();
        return this;
    }

    public ElasticMonitorResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMonitors()
                .updateWithResponse(resourceGroupName, monitorName, updateBody, Context.NONE)
                .getValue();
        return this;
    }

    public ElasticMonitorResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMonitors()
                .updateWithResponse(resourceGroupName, monitorName, updateBody, context)
                .getValue();
        return this;
    }

    ElasticMonitorResourceImpl(
        ElasticMonitorResourceInner innerObject, com.azure.resourcemanager.elastic.ElasticManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.monitorName = Utils.getValueFromIdByName(innerObject.id(), "monitors");
    }

    public ElasticMonitorResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMonitors()
                .getByResourceGroupWithResponse(resourceGroupName, monitorName, Context.NONE)
                .getValue();
        return this;
    }

    public ElasticMonitorResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getMonitors()
                .getByResourceGroupWithResponse(resourceGroupName, monitorName, context)
                .getValue();
        return this;
    }

    public ElasticMonitorResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ElasticMonitorResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ElasticMonitorResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public ElasticMonitorResourceImpl withSku(ResourceSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public ElasticMonitorResourceImpl withProperties(MonitorProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public ElasticMonitorResourceImpl withIdentity(IdentityProperties identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
