// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batch.fluent.LocationsClient;
import com.azure.resourcemanager.batch.fluent.models.BatchLocationQuotaInner;
import com.azure.resourcemanager.batch.fluent.models.CheckNameAvailabilityResultInner;
import com.azure.resourcemanager.batch.fluent.models.SupportedSkuInner;
import com.azure.resourcemanager.batch.models.BatchLocationQuota;
import com.azure.resourcemanager.batch.models.CheckNameAvailabilityParameters;
import com.azure.resourcemanager.batch.models.CheckNameAvailabilityResult;
import com.azure.resourcemanager.batch.models.Locations;
import com.azure.resourcemanager.batch.models.SupportedSku;

public final class LocationsImpl implements Locations {
    private static final ClientLogger LOGGER = new ClientLogger(LocationsImpl.class);

    private final LocationsClient innerClient;

    private final com.azure.resourcemanager.batch.BatchManager serviceManager;

    public LocationsImpl(LocationsClient innerClient, com.azure.resourcemanager.batch.BatchManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<BatchLocationQuota> getQuotasWithResponse(String locationName, Context context) {
        Response<BatchLocationQuotaInner> inner = this.serviceClient().getQuotasWithResponse(locationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BatchLocationQuotaImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BatchLocationQuota getQuotas(String locationName) {
        BatchLocationQuotaInner inner = this.serviceClient().getQuotas(locationName);
        if (inner != null) {
            return new BatchLocationQuotaImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<SupportedSku> listSupportedVirtualMachineSkus(String locationName) {
        PagedIterable<SupportedSkuInner> inner = this.serviceClient().listSupportedVirtualMachineSkus(locationName);
        return Utils.mapPage(inner, inner1 -> new SupportedSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<SupportedSku> listSupportedVirtualMachineSkus(
        String locationName, Integer maxresults, String filter, Context context) {
        PagedIterable<SupportedSkuInner> inner =
            this.serviceClient().listSupportedVirtualMachineSkus(locationName, maxresults, filter, context);
        return Utils.mapPage(inner, inner1 -> new SupportedSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<SupportedSku> listSupportedCloudServiceSkus(String locationName) {
        PagedIterable<SupportedSkuInner> inner = this.serviceClient().listSupportedCloudServiceSkus(locationName);
        return Utils.mapPage(inner, inner1 -> new SupportedSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<SupportedSku> listSupportedCloudServiceSkus(
        String locationName, Integer maxresults, String filter, Context context) {
        PagedIterable<SupportedSkuInner> inner =
            this.serviceClient().listSupportedCloudServiceSkus(locationName, maxresults, filter, context);
        return Utils.mapPage(inner, inner1 -> new SupportedSkuImpl(inner1, this.manager()));
    }

    public Response<CheckNameAvailabilityResult> checkNameAvailabilityWithResponse(
        String locationName, CheckNameAvailabilityParameters parameters, Context context) {
        Response<CheckNameAvailabilityResultInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(locationName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckNameAvailabilityResult checkNameAvailability(
        String locationName, CheckNameAvailabilityParameters parameters) {
        CheckNameAvailabilityResultInner inner = this.serviceClient().checkNameAvailability(locationName, parameters);
        if (inner != null) {
            return new CheckNameAvailabilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private LocationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.batch.BatchManager manager() {
        return this.serviceManager;
    }
}
