// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.DscCompilationJobStreamsClient;
import com.azure.resourcemanager.automation.fluent.models.JobStreamListResultInner;
import com.azure.resourcemanager.automation.models.DscCompilationJobStreams;
import com.azure.resourcemanager.automation.models.JobStreamListResult;
import java.util.UUID;

public final class DscCompilationJobStreamsImpl implements DscCompilationJobStreams {
    private static final ClientLogger LOGGER = new ClientLogger(DscCompilationJobStreamsImpl.class);

    private final DscCompilationJobStreamsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public DscCompilationJobStreamsImpl(
        DscCompilationJobStreamsClient innerClient,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public JobStreamListResult listByJob(String resourceGroupName, String automationAccountName, UUID jobId) {
        JobStreamListResultInner inner =
            this.serviceClient().listByJob(resourceGroupName, automationAccountName, jobId);
        if (inner != null) {
            return new JobStreamListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<JobStreamListResult> listByJobWithResponse(
        String resourceGroupName, String automationAccountName, UUID jobId, Context context) {
        Response<JobStreamListResultInner> inner =
            this.serviceClient().listByJobWithResponse(resourceGroupName, automationAccountName, jobId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new JobStreamListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private DscCompilationJobStreamsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}
