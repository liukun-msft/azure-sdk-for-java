// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Hosts. */
public interface Hosts {
    /**
     * Gets a host.
     *
     * <p>Implements host GET method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param hostname Name of the host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the host.
     */
    HostModel getByResourceGroup(String resourceGroupName, String hostname);

    /**
     * Gets a host.
     *
     * <p>Implements host GET method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param hostname Name of the host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the host along with {@link Response}.
     */
    Response<HostModel> getByResourceGroupWithResponse(String resourceGroupName, String hostname, Context context);

    /**
     * Deletes an host.
     *
     * <p>Implements host DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param hostname Name of the host.
     * @param force Whether force delete was specified.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hostname, Boolean force);

    /**
     * Deletes an host.
     *
     * <p>Implements host DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param hostname Name of the host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hostname);

    /**
     * Deletes an host.
     *
     * <p>Implements host DELETE method.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param hostname Name of the host.
     * @param force Whether force delete was specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String hostname, Boolean force, Context context);

    /**
     * Implements GET hosts in a subscription.
     *
     * <p>List of hosts in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Hosts as paginated response with {@link PagedIterable}.
     */
    PagedIterable<HostModel> list();

    /**
     * Implements GET hosts in a subscription.
     *
     * <p>List of hosts in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Hosts as paginated response with {@link PagedIterable}.
     */
    PagedIterable<HostModel> list(Context context);

    /**
     * Implements GET hosts in a resource group.
     *
     * <p>List of hosts in a resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Hosts as paginated response with {@link PagedIterable}.
     */
    PagedIterable<HostModel> listByResourceGroup(String resourceGroupName);

    /**
     * Implements GET hosts in a resource group.
     *
     * <p>List of hosts in a resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Hosts as paginated response with {@link PagedIterable}.
     */
    PagedIterable<HostModel> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets a host.
     *
     * <p>Implements host GET method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the host along with {@link Response}.
     */
    HostModel getById(String id);

    /**
     * Gets a host.
     *
     * <p>Implements host GET method.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return define the host along with {@link Response}.
     */
    Response<HostModel> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an host.
     *
     * <p>Implements host DELETE method.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an host.
     *
     * <p>Implements host DELETE method.
     *
     * @param id the resource ID.
     * @param force Whether force delete was specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Boolean force, Context context);

    /**
     * Begins definition for a new HostModel resource.
     *
     * @param name resource name.
     * @return the first stage of the new HostModel definition.
     */
    HostModel.DefinitionStages.Blank define(String name);
}
