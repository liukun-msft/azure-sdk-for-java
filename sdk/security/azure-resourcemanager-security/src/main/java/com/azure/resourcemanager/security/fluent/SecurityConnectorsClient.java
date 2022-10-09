// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.SecurityConnectorInner;

/** An instance of this class provides access to all the operations defined in SecurityConnectorsClient. */
public interface SecurityConnectorsClient {
    /**
     * Lists all the security connectors in the specified subscription. Use the 'nextLink' property in the response to
     * get the next page of security connectors for the specified subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security connectors response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityConnectorInner> list();

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityConnectorInner> list(Context context);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityConnectorInner> listByResourceGroup(String resourceGroupName);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SecurityConnectorInner> listByResourceGroup(String resourceGroupName, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityConnectorInner getByResourceGroup(String resourceGroupName, String securityConnectorName);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityConnectorInner> getByResourceGroupWithResponse(
        String resourceGroupName, String securityConnectorName, Context context);

    /**
     * Creates or updates a security connector. If a security connector is already created and a subsequent request is
     * issued for the same security connector id, then it will be updated.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param securityConnector The security connector resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security connector resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityConnectorInner createOrUpdate(
        String resourceGroupName, String securityConnectorName, SecurityConnectorInner securityConnector);

    /**
     * Creates or updates a security connector. If a security connector is already created and a subsequent request is
     * issued for the same security connector id, then it will be updated.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param securityConnector The security connector resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security connector resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityConnectorInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String securityConnectorName,
        SecurityConnectorInner securityConnector,
        Context context);

    /**
     * Updates a security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param securityConnector The security connector resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security connector resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SecurityConnectorInner update(
        String resourceGroupName, String securityConnectorName, SecurityConnectorInner securityConnector);

    /**
     * Updates a security connector.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param securityConnector The security connector resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security connector resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SecurityConnectorInner> updateWithResponse(
        String resourceGroupName,
        String securityConnectorName,
        SecurityConnectorInner securityConnector,
        Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String securityConnectorName);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String securityConnectorName, Context context);
}
