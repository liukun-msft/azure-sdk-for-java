// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.fluent.UsagesClient;
import com.azure.resourcemanager.loganalytics.fluent.models.UsageMetricInner;
import com.azure.resourcemanager.loganalytics.models.UsageMetric;
import com.azure.resourcemanager.loganalytics.models.Usages;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class UsagesImpl implements Usages {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsagesImpl.class);

    private final UsagesClient innerClient;

    private final com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager;

    public UsagesImpl(
        UsagesClient innerClient, com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<UsageMetric> list(String resourceGroupName, String workspaceName) {
        PagedIterable<UsageMetricInner> inner = this.serviceClient().list(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new UsageMetricImpl(inner1, this.manager()));
    }

    public PagedIterable<UsageMetric> list(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<UsageMetricInner> inner = this.serviceClient().list(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new UsageMetricImpl(inner1, this.manager()));
    }

    private UsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}
