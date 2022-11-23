// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elastic.fluent.DetachAndDeleteTrafficFiltersClient;
import com.azure.resourcemanager.elastic.models.DetachAndDeleteTrafficFilters;

public final class DetachAndDeleteTrafficFiltersImpl implements DetachAndDeleteTrafficFilters {
    private static final ClientLogger LOGGER = new ClientLogger(DetachAndDeleteTrafficFiltersImpl.class);

    private final DetachAndDeleteTrafficFiltersClient innerClient;

    private final com.azure.resourcemanager.elastic.ElasticManager serviceManager;

    public DetachAndDeleteTrafficFiltersImpl(
        DetachAndDeleteTrafficFiltersClient innerClient,
        com.azure.resourcemanager.elastic.ElasticManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String monitorName, String rulesetId, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, monitorName, rulesetId, context);
    }

    public void delete(String resourceGroupName, String monitorName) {
        this.serviceClient().delete(resourceGroupName, monitorName);
    }

    private DetachAndDeleteTrafficFiltersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.elastic.ElasticManager manager() {
        return this.serviceManager;
    }
}
