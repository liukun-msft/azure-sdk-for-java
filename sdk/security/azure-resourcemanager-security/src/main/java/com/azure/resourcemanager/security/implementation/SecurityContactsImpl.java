// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.SecurityContactsClient;
import com.azure.resourcemanager.security.fluent.models.SecurityContactInner;
import com.azure.resourcemanager.security.models.SecurityContact;
import com.azure.resourcemanager.security.models.SecurityContacts;

public final class SecurityContactsImpl implements SecurityContacts {
    private static final ClientLogger LOGGER = new ClientLogger(SecurityContactsImpl.class);

    private final SecurityContactsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public SecurityContactsImpl(
        SecurityContactsClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecurityContact> list() {
        PagedIterable<SecurityContactInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SecurityContactImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityContact> list(Context context) {
        PagedIterable<SecurityContactInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new SecurityContactImpl(inner1, this.manager()));
    }

    public SecurityContact get(String securityContactName) {
        SecurityContactInner inner = this.serviceClient().get(securityContactName);
        if (inner != null) {
            return new SecurityContactImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SecurityContact> getWithResponse(String securityContactName, Context context) {
        Response<SecurityContactInner> inner = this.serviceClient().getWithResponse(securityContactName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SecurityContactImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String securityContactName) {
        this.serviceClient().delete(securityContactName);
    }

    public Response<Void> deleteWithResponse(String securityContactName, Context context) {
        return this.serviceClient().deleteWithResponse(securityContactName, context);
    }

    public SecurityContact getById(String id) {
        String securityContactName = Utils.getValueFromIdByName(id, "securityContacts");
        if (securityContactName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityContacts'.", id)));
        }
        return this.getWithResponse(securityContactName, Context.NONE).getValue();
    }

    public Response<SecurityContact> getByIdWithResponse(String id, Context context) {
        String securityContactName = Utils.getValueFromIdByName(id, "securityContacts");
        if (securityContactName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityContacts'.", id)));
        }
        return this.getWithResponse(securityContactName, context);
    }

    public void deleteById(String id) {
        String securityContactName = Utils.getValueFromIdByName(id, "securityContacts");
        if (securityContactName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityContacts'.", id)));
        }
        this.deleteWithResponse(securityContactName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String securityContactName = Utils.getValueFromIdByName(id, "securityContacts");
        if (securityContactName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'securityContacts'.", id)));
        }
        return this.deleteWithResponse(securityContactName, context);
    }

    private SecurityContactsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    public SecurityContactImpl define(String name) {
        return new SecurityContactImpl(name, this.manager());
    }
}
