// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.ApplicationInner;

/** Resource collection API of SecurityConnectorApplicationOperations. */
public interface SecurityConnectorApplicationOperations {
    /**
     * Get a specific application for the requested scope by applicationId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param applicationId The security Application key - unique key for the standard application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific application for the requested scope by applicationId.
     */
    Application get(String resourceGroupName, String securityConnectorName, String applicationId);

    /**
     * Get a specific application for the requested scope by applicationId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param applicationId The security Application key - unique key for the standard application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific application for the requested scope by applicationId along with {@link Response}.
     */
    Response<Application> getWithResponse(
        String resourceGroupName, String securityConnectorName, String applicationId, Context context);

    /**
     * Creates or update a security Application on the given security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param applicationId The security Application key - unique key for the standard application.
     * @param application Application over a subscription scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Application over a given scope.
     */
    Application createOrUpdate(
        String resourceGroupName, String securityConnectorName, String applicationId, ApplicationInner application);

    /**
     * Creates or update a security Application on the given security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param applicationId The security Application key - unique key for the standard application.
     * @param application Application over a subscription scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security Application over a given scope along with {@link Response}.
     */
    Response<Application> createOrUpdateWithResponse(
        String resourceGroupName,
        String securityConnectorName,
        String applicationId,
        ApplicationInner application,
        Context context);

    /**
     * Delete an Application over a given scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param applicationId The security Application key - unique key for the standard application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String securityConnectorName, String applicationId);

    /**
     * Delete an Application over a given scope.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param applicationId The security Application key - unique key for the standard application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String securityConnectorName, String applicationId, Context context);
}
