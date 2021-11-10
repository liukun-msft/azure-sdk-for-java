// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storagepool.fluent.models.ResourceSkuInfoInner;

/** An instance of this class provides access to all the operations defined in ResourceSkusClient. */
public interface ResourceSkusClient {
    /**
     * Lists available StoragePool resources and skus in an Azure location.
     *
     * @param location The location of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list Disk Pool skus operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceSkuInfoInner> list(String location);

    /**
     * Lists available StoragePool resources and skus in an Azure location.
     *
     * @param location The location of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list Disk Pool skus operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceSkuInfoInner> list(String location, Context context);
}
