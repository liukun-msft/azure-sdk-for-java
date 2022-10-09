// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.JobInner;

/** An instance of this class provides access to all the operations defined in JobsClient. */
public interface JobsClient {
    /**
     * List Jobs
     *
     * <p>Lists all of the Jobs for the Transform.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of Job items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobInner> list(String resourceGroupName, String accountName, String transformName);

    /**
     * List Jobs
     *
     * <p>Lists all of the Jobs for the Transform.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @param filter Restricts the set of items returned.
     * @param orderby Specifies the key by which the result collection should be ordered.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of Job items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobInner> list(
        String resourceGroupName,
        String accountName,
        String transformName,
        String filter,
        String orderby,
        Context context);

    /**
     * Get Job
     *
     * <p>Gets a Job.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @param jobName The Job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobInner get(String resourceGroupName, String accountName, String transformName, String jobName);

    /**
     * Get Job
     *
     * <p>Gets a Job.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @param jobName The Job name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobInner> getWithResponse(
        String resourceGroupName, String accountName, String transformName, String jobName, Context context);

    /**
     * Create Job
     *
     * <p>Creates a Job.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @param jobName The Job name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobInner create(
        String resourceGroupName, String accountName, String transformName, String jobName, JobInner parameters);

    /**
     * Create Job
     *
     * <p>Creates a Job.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @param jobName The Job name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job resource type along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobInner> createWithResponse(
        String resourceGroupName,
        String accountName,
        String transformName,
        String jobName,
        JobInner parameters,
        Context context);

    /**
     * Delete Job
     *
     * <p>Deletes a Job.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @param jobName The Job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String transformName, String jobName);

    /**
     * Delete Job
     *
     * <p>Deletes a Job.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @param jobName The Job name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String transformName, String jobName, Context context);

    /**
     * Update Job
     *
     * <p>Update is only supported for description and priority. Updating Priority will take effect when the Job state
     * is Queued or Scheduled and depending on the timing the priority update may be ignored.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @param jobName The Job name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobInner update(
        String resourceGroupName, String accountName, String transformName, String jobName, JobInner parameters);

    /**
     * Update Job
     *
     * <p>Update is only supported for description and priority. Updating Priority will take effect when the Job state
     * is Queued or Scheduled and depending on the timing the priority update may be ignored.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @param jobName The Job name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Job resource type along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobInner> updateWithResponse(
        String resourceGroupName,
        String accountName,
        String transformName,
        String jobName,
        JobInner parameters,
        Context context);

    /**
     * Cancel Job
     *
     * <p>Cancel a Job.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @param jobName The Job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cancelJob(String resourceGroupName, String accountName, String transformName, String jobName);

    /**
     * Cancel Job
     *
     * <p>Cancel a Job.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param transformName The Transform name.
     * @param jobName The Job name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> cancelJobWithResponse(
        String resourceGroupName, String accountName, String transformName, String jobName, Context context);
}
