// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IntegrationRuntimeNodes. */
public interface IntegrationRuntimeNodes {
    /**
     * Gets a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a self-hosted integration runtime node along with {@link Response}.
     */
    Response<SelfHostedIntegrationRuntimeNode> getWithResponse(
        String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName, Context context);

    /**
     * Gets a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a self-hosted integration runtime node.
     */
    SelfHostedIntegrationRuntimeNode get(
        String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName);

    /**
     * Deletes a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName, Context context);

    /**
     * Deletes a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName);

    /**
     * Updates a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @param updateIntegrationRuntimeNodeRequest The parameters for updating an integration runtime node.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of Self-hosted integration runtime node along with {@link Response}.
     */
    Response<SelfHostedIntegrationRuntimeNode> updateWithResponse(
        String resourceGroupName,
        String factoryName,
        String integrationRuntimeName,
        String nodeName,
        UpdateIntegrationRuntimeNodeRequest updateIntegrationRuntimeNodeRequest,
        Context context);

    /**
     * Updates a self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @param updateIntegrationRuntimeNodeRequest The parameters for updating an integration runtime node.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of Self-hosted integration runtime node.
     */
    SelfHostedIntegrationRuntimeNode update(
        String resourceGroupName,
        String factoryName,
        String integrationRuntimeName,
        String nodeName,
        UpdateIntegrationRuntimeNodeRequest updateIntegrationRuntimeNodeRequest);

    /**
     * Get the IP address of self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IP address of self-hosted integration runtime node along with {@link Response}.
     */
    Response<IntegrationRuntimeNodeIpAddress> getIpAddressWithResponse(
        String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName, Context context);

    /**
     * Get the IP address of self-hosted integration runtime node.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param integrationRuntimeName The integration runtime name.
     * @param nodeName The integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IP address of self-hosted integration runtime node.
     */
    IntegrationRuntimeNodeIpAddress getIpAddress(
        String resourceGroupName, String factoryName, String integrationRuntimeName, String nodeName);
}
