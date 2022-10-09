// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Tasks. */
public interface Tasks {
    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security task recommendations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityTask> list();

    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security task recommendations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityTask> list(String filter, Context context);

    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security task recommendations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityTask> listByHomeRegion(String ascLocation);

    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security task recommendations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityTask> listByHomeRegion(String ascLocation, String filter, Context context);

    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param taskName Name of the task object, will be a GUID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security task that we recommend to do in order to strengthen security.
     */
    SecurityTask getSubscriptionLevelTask(String ascLocation, String taskName);

    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param taskName Name of the task object, will be a GUID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security task that we recommend to do in order to strengthen security along with {@link Response}.
     */
    Response<SecurityTask> getSubscriptionLevelTaskWithResponse(String ascLocation, String taskName, Context context);

    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param taskName Name of the task object, will be a GUID.
     * @param taskUpdateActionType Type of the action to do on the task.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateSubscriptionLevelTaskState(
        String ascLocation, String taskName, TaskUpdateActionType taskUpdateActionType);

    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param taskName Name of the task object, will be a GUID.
     * @param taskUpdateActionType Type of the action to do on the task.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> updateSubscriptionLevelTaskStateWithResponse(
        String ascLocation, String taskName, TaskUpdateActionType taskUpdateActionType, Context context);

    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security task recommendations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityTask> listByResourceGroup(String resourceGroupName, String ascLocation);

    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security task recommendations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SecurityTask> listByResourceGroup(
        String resourceGroupName, String ascLocation, String filter, Context context);

    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param taskName Name of the task object, will be a GUID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security task that we recommend to do in order to strengthen security.
     */
    SecurityTask getResourceGroupLevelTask(String resourceGroupName, String ascLocation, String taskName);

    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param taskName Name of the task object, will be a GUID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security task that we recommend to do in order to strengthen security along with {@link Response}.
     */
    Response<SecurityTask> getResourceGroupLevelTaskWithResponse(
        String resourceGroupName, String ascLocation, String taskName, Context context);

    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param taskName Name of the task object, will be a GUID.
     * @param taskUpdateActionType Type of the action to do on the task.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateResourceGroupLevelTaskState(
        String resourceGroupName, String ascLocation, String taskName, TaskUpdateActionType taskUpdateActionType);

    /**
     * Recommended tasks that will help improve the security of the subscription proactively.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param ascLocation The location where ASC stores the data of the subscription. can be retrieved from Get
     *     locations.
     * @param taskName Name of the task object, will be a GUID.
     * @param taskUpdateActionType Type of the action to do on the task.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> updateResourceGroupLevelTaskStateWithResponse(
        String resourceGroupName,
        String ascLocation,
        String taskName,
        TaskUpdateActionType taskUpdateActionType,
        Context context);
}
