// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SecurityConnectors. */
public interface SecurityConnectors {
    /**
     * Lists all the security connectors in the specified subscription. Use the 'nextLink' property in the response to
     * get the next page of security connectors for the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security connectors response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityConnector> list();

    /**
     * Lists all the security connectors in the specified subscription. Use the 'nextLink' property in the response to
     * get the next page of security connectors for the specified subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security connectors response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityConnector> list(Context context);

    /**
     * Lists all the security connectors in the specified resource group. Use the 'nextLink' property in the response to
     * get the next page of security connectors for the specified resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security connectors response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityConnector> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the security connectors in the specified resource group. Use the 'nextLink' property in the response to
     * get the next page of security connectors for the specified resource group.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security connectors response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityConnector> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieves details of a specific security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security connector resource.
     */
    SecurityConnector getByResourceGroup(String resourceGroupName, String securityConnectorName);

    /**
     * Retrieves details of a specific security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security connector resource along with {@link Response}.
     */
    Response<SecurityConnector> getByResourceGroupWithResponse(
        String resourceGroupName, String securityConnectorName, Context context);

    /**
     * Deletes a security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String securityConnectorName);

    /**
     * Deletes a security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String securityConnectorName, Context context);

    /**
     * Retrieves details of a specific security connector.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security connector resource along with {@link Response}.
     */
    SecurityConnector getById(String id);

    /**
     * Retrieves details of a specific security connector.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security connector resource along with {@link Response}.
     */
    Response<SecurityConnector> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a security connector.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a security connector.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SecurityConnector resource.
     *
     * @param name resource name.
     * @return the first stage of the new SecurityConnector definition.
     */
    SecurityConnector.DefinitionStages.Blank define(String name);
}
