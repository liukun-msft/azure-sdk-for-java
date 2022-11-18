// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.ComplianceResultInner;

/** An instance of this class provides access to all the operations defined in ComplianceResultsClient. */
public interface ComplianceResultsClient {
    /**
     * Security compliance results in the subscription.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of compliance results response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ComplianceResultInner> list(String scope);

    /**
     * Security compliance results in the subscription.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of compliance results response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ComplianceResultInner> list(String scope, Context context);

    /**
     * Security Compliance Result.
     *
     * @param resourceId The identifier of the resource.
     * @param complianceResultName name of the desired assessment compliance result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a compliance result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ComplianceResultInner> getWithResponse(String resourceId, String complianceResultName, Context context);

    /**
     * Security Compliance Result.
     *
     * @param resourceId The identifier of the resource.
     * @param complianceResultName name of the desired assessment compliance result.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a compliance result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ComplianceResultInner get(String resourceId, String complianceResultName);
}
