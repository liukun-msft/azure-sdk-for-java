// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.IoTSecurityAggregatedRecommendationInner;

/**
 * An instance of this class provides access to all the operations defined in
 * IotSecuritySolutionsAnalyticsRecommendationsClient.
 */
public interface IotSecuritySolutionsAnalyticsRecommendationsClient {
    /**
     * Use this method to get the aggregated security analytics recommendation of yours IoT Security solution. This
     * aggregation is performed by recommendation name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param aggregatedRecommendationName Name of the recommendation aggregated for this query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Security solution recommendation information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IoTSecurityAggregatedRecommendationInner get(
        String resourceGroupName, String solutionName, String aggregatedRecommendationName);

    /**
     * Use this method to get the aggregated security analytics recommendation of yours IoT Security solution. This
     * aggregation is performed by recommendation name.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param aggregatedRecommendationName Name of the recommendation aggregated for this query.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT Security solution recommendation information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<IoTSecurityAggregatedRecommendationInner> getWithResponse(
        String resourceGroupName, String solutionName, String aggregatedRecommendationName, Context context);

    /**
     * Use this method to get the list of aggregated security analytics recommendations of yours IoT Security solution.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT Security solution aggregated recommendations as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IoTSecurityAggregatedRecommendationInner> list(String resourceGroupName, String solutionName);

    /**
     * Use this method to get the list of aggregated security analytics recommendations of yours IoT Security solution.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param solutionName The name of the IoT Security solution.
     * @param top Number of results to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT Security solution aggregated recommendations as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IoTSecurityAggregatedRecommendationInner> list(
        String resourceGroupName, String solutionName, Integer top, Context context);
}
