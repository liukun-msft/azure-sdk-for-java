// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.DeletedServicesClient;
import com.azure.resourcemanager.apimanagement.fluent.models.DeletedServiceContractInner;
import com.azure.resourcemanager.apimanagement.models.DeletedServiceContract;
import com.azure.resourcemanager.apimanagement.models.DeletedServices;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DeletedServicesImpl implements DeletedServices {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeletedServicesImpl.class);

    private final DeletedServicesClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public DeletedServicesImpl(
        DeletedServicesClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DeletedServiceContract> list() {
        PagedIterable<DeletedServiceContractInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DeletedServiceContractImpl(inner1, this.manager()));
    }

    public PagedIterable<DeletedServiceContract> list(Context context) {
        PagedIterable<DeletedServiceContractInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new DeletedServiceContractImpl(inner1, this.manager()));
    }

    public DeletedServiceContract getByName(String serviceName, String location) {
        DeletedServiceContractInner inner = this.serviceClient().getByName(serviceName, location);
        if (inner != null) {
            return new DeletedServiceContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeletedServiceContract> getByNameWithResponse(
        String serviceName, String location, Context context) {
        Response<DeletedServiceContractInner> inner =
            this.serviceClient().getByNameWithResponse(serviceName, location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeletedServiceContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DeletedServiceContract purge(String serviceName, String location) {
        DeletedServiceContractInner inner = this.serviceClient().purge(serviceName, location);
        if (inner != null) {
            return new DeletedServiceContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeletedServiceContract purge(String serviceName, String location, Context context) {
        DeletedServiceContractInner inner = this.serviceClient().purge(serviceName, location, context);
        if (inner != null) {
            return new DeletedServiceContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private DeletedServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
