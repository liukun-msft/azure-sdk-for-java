// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.fluent.models.ResourceSkuInner;

/** An instance of this class provides access to all the operations defined in ResourceSkusClient. */
public interface ResourceSkusClient {
    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @param includeExtendedLocations To Include Extended Locations information or not in the response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.Compute SKUs available for your Subscription as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ResourceSkuInner> listAsync(String filter, String includeExtendedLocations);

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.Compute SKUs available for your Subscription as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ResourceSkuInner> listAsync();

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.Compute SKUs available for your Subscription as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceSkuInner> list();

    /**
     * Gets the list of Microsoft.Compute SKUs available for your Subscription.
     *
     * @param filter The filter to apply on the operation. Only **location** filter is supported currently.
     * @param includeExtendedLocations To Include Extended Locations information or not in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Microsoft.Compute SKUs available for your Subscription as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceSkuInner> list(String filter, String includeExtendedLocations, Context context);
}
