// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.StreamingEndpointInner;
import com.azure.resourcemanager.mediaservices.models.ArmStreamingEndpointCurrentSku;
import com.azure.resourcemanager.mediaservices.models.CrossSiteAccessPolicies;
import com.azure.resourcemanager.mediaservices.models.StreamingEndpoint;
import com.azure.resourcemanager.mediaservices.models.StreamingEndpointAccessControl;
import com.azure.resourcemanager.mediaservices.models.StreamingEndpointResourceState;
import com.azure.resourcemanager.mediaservices.models.StreamingEntityScaleUnit;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class StreamingEndpointImpl
    implements StreamingEndpoint, StreamingEndpoint.Definition, StreamingEndpoint.Update {
    private StreamingEndpointInner innerObject;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ArmStreamingEndpointCurrentSku sku() {
        return this.innerModel().sku();
    }

    public String description() {
        return this.innerModel().description();
    }

    public int scaleUnits() {
        return this.innerModel().scaleUnits();
    }

    public String availabilitySetName() {
        return this.innerModel().availabilitySetName();
    }

    public StreamingEndpointAccessControl accessControl() {
        return this.innerModel().accessControl();
    }

    public Long maxCacheAge() {
        return this.innerModel().maxCacheAge();
    }

    public List<String> customHostNames() {
        List<String> inner = this.innerModel().customHostNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String hostname() {
        return this.innerModel().hostname();
    }

    public Boolean cdnEnabled() {
        return this.innerModel().cdnEnabled();
    }

    public String cdnProvider() {
        return this.innerModel().cdnProvider();
    }

    public String cdnProfile() {
        return this.innerModel().cdnProfile();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public StreamingEndpointResourceState resourceState() {
        return this.innerModel().resourceState();
    }

    public CrossSiteAccessPolicies crossSiteAccessPolicies() {
        return this.innerModel().crossSiteAccessPolicies();
    }

    public OffsetDateTime freeTrialEndTime() {
        return this.innerModel().freeTrialEndTime();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public OffsetDateTime lastModified() {
        return this.innerModel().lastModified();
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

    public StreamingEndpointInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String streamingEndpointName;

    private Boolean createAutoStart;

    public StreamingEndpointImpl withExistingMediaservice(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public StreamingEndpoint create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingEndpoints()
                .create(
                    resourceGroupName,
                    accountName,
                    streamingEndpointName,
                    this.innerModel(),
                    createAutoStart,
                    Context.NONE);
        return this;
    }

    public StreamingEndpoint create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingEndpoints()
                .create(
                    resourceGroupName, accountName, streamingEndpointName, this.innerModel(), createAutoStart, context);
        return this;
    }

    StreamingEndpointImpl(String name, com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerObject = new StreamingEndpointInner();
        this.serviceManager = serviceManager;
        this.streamingEndpointName = name;
        this.createAutoStart = null;
    }

    public StreamingEndpointImpl update() {
        return this;
    }

    public StreamingEndpoint apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingEndpoints()
                .update(resourceGroupName, accountName, streamingEndpointName, this.innerModel(), Context.NONE);
        return this;
    }

    public StreamingEndpoint apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingEndpoints()
                .update(resourceGroupName, accountName, streamingEndpointName, this.innerModel(), context);
        return this;
    }

    StreamingEndpointImpl(
        StreamingEndpointInner innerObject,
        com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "mediaservices");
        this.streamingEndpointName = Utils.getValueFromIdByName(innerObject.id(), "streamingEndpoints");
    }

    public StreamingEndpoint refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingEndpoints()
                .getWithResponse(resourceGroupName, accountName, streamingEndpointName, Context.NONE)
                .getValue();
        return this;
    }

    public StreamingEndpoint refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStreamingEndpoints()
                .getWithResponse(resourceGroupName, accountName, streamingEndpointName, context)
                .getValue();
        return this;
    }

    public void start() {
        serviceManager.streamingEndpoints().start(resourceGroupName, accountName, streamingEndpointName);
    }

    public void start(Context context) {
        serviceManager.streamingEndpoints().start(resourceGroupName, accountName, streamingEndpointName, context);
    }

    public void stop() {
        serviceManager.streamingEndpoints().stop(resourceGroupName, accountName, streamingEndpointName);
    }

    public void stop(Context context) {
        serviceManager.streamingEndpoints().stop(resourceGroupName, accountName, streamingEndpointName, context);
    }

    public void scale(StreamingEntityScaleUnit parameters) {
        serviceManager.streamingEndpoints().scale(resourceGroupName, accountName, streamingEndpointName, parameters);
    }

    public void scale(StreamingEntityScaleUnit parameters, Context context) {
        serviceManager
            .streamingEndpoints()
            .scale(resourceGroupName, accountName, streamingEndpointName, parameters, context);
    }

    public StreamingEndpointImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public StreamingEndpointImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public StreamingEndpointImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public StreamingEndpointImpl withSku(ArmStreamingEndpointCurrentSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public StreamingEndpointImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public StreamingEndpointImpl withScaleUnits(int scaleUnits) {
        this.innerModel().withScaleUnits(scaleUnits);
        return this;
    }

    public StreamingEndpointImpl withAvailabilitySetName(String availabilitySetName) {
        this.innerModel().withAvailabilitySetName(availabilitySetName);
        return this;
    }

    public StreamingEndpointImpl withAccessControl(StreamingEndpointAccessControl accessControl) {
        this.innerModel().withAccessControl(accessControl);
        return this;
    }

    public StreamingEndpointImpl withMaxCacheAge(Long maxCacheAge) {
        this.innerModel().withMaxCacheAge(maxCacheAge);
        return this;
    }

    public StreamingEndpointImpl withCustomHostNames(List<String> customHostNames) {
        this.innerModel().withCustomHostNames(customHostNames);
        return this;
    }

    public StreamingEndpointImpl withCdnEnabled(Boolean cdnEnabled) {
        this.innerModel().withCdnEnabled(cdnEnabled);
        return this;
    }

    public StreamingEndpointImpl withCdnProvider(String cdnProvider) {
        this.innerModel().withCdnProvider(cdnProvider);
        return this;
    }

    public StreamingEndpointImpl withCdnProfile(String cdnProfile) {
        this.innerModel().withCdnProfile(cdnProfile);
        return this;
    }

    public StreamingEndpointImpl withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies) {
        this.innerModel().withCrossSiteAccessPolicies(crossSiteAccessPolicies);
        return this;
    }

    public StreamingEndpointImpl withAutoStart(Boolean autoStart) {
        this.createAutoStart = autoStart;
        return this;
    }
}
