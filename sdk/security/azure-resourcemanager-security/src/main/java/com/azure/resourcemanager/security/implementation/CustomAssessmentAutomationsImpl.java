// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.CustomAssessmentAutomationsClient;
import com.azure.resourcemanager.security.fluent.models.CustomAssessmentAutomationInner;
import com.azure.resourcemanager.security.models.CustomAssessmentAutomation;
import com.azure.resourcemanager.security.models.CustomAssessmentAutomations;

public final class CustomAssessmentAutomationsImpl implements CustomAssessmentAutomations {
    private static final ClientLogger LOGGER = new ClientLogger(CustomAssessmentAutomationsImpl.class);

    private final CustomAssessmentAutomationsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public CustomAssessmentAutomationsImpl(
        CustomAssessmentAutomationsClient innerClient,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CustomAssessmentAutomation getByResourceGroup(
        String resourceGroupName, String customAssessmentAutomationName) {
        CustomAssessmentAutomationInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, customAssessmentAutomationName);
        if (inner != null) {
            return new CustomAssessmentAutomationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CustomAssessmentAutomation> getByResourceGroupWithResponse(
        String resourceGroupName, String customAssessmentAutomationName, Context context) {
        Response<CustomAssessmentAutomationInner> inner =
            this
                .serviceClient()
                .getByResourceGroupWithResponse(resourceGroupName, customAssessmentAutomationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CustomAssessmentAutomationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String customAssessmentAutomationName) {
        this.serviceClient().delete(resourceGroupName, customAssessmentAutomationName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String customAssessmentAutomationName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, customAssessmentAutomationName, context);
    }

    public PagedIterable<CustomAssessmentAutomation> listByResourceGroup(String resourceGroupName) {
        PagedIterable<CustomAssessmentAutomationInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new CustomAssessmentAutomationImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomAssessmentAutomation> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<CustomAssessmentAutomationInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new CustomAssessmentAutomationImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomAssessmentAutomation> list() {
        PagedIterable<CustomAssessmentAutomationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new CustomAssessmentAutomationImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomAssessmentAutomation> list(Context context) {
        PagedIterable<CustomAssessmentAutomationInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new CustomAssessmentAutomationImpl(inner1, this.manager()));
    }

    public CustomAssessmentAutomation getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String customAssessmentAutomationName = Utils.getValueFromIdByName(id, "customAssessmentAutomations");
        if (customAssessmentAutomationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'customAssessmentAutomations'.",
                                id)));
        }
        return this
            .getByResourceGroupWithResponse(resourceGroupName, customAssessmentAutomationName, Context.NONE)
            .getValue();
    }

    public Response<CustomAssessmentAutomation> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String customAssessmentAutomationName = Utils.getValueFromIdByName(id, "customAssessmentAutomations");
        if (customAssessmentAutomationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'customAssessmentAutomations'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, customAssessmentAutomationName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String customAssessmentAutomationName = Utils.getValueFromIdByName(id, "customAssessmentAutomations");
        if (customAssessmentAutomationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'customAssessmentAutomations'.",
                                id)));
        }
        this.deleteWithResponse(resourceGroupName, customAssessmentAutomationName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String customAssessmentAutomationName = Utils.getValueFromIdByName(id, "customAssessmentAutomations");
        if (customAssessmentAutomationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'customAssessmentAutomations'.",
                                id)));
        }
        return this.deleteWithResponse(resourceGroupName, customAssessmentAutomationName, context);
    }

    private CustomAssessmentAutomationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    public CustomAssessmentAutomationImpl define(String name) {
        return new CustomAssessmentAutomationImpl(name, this.manager());
    }
}
