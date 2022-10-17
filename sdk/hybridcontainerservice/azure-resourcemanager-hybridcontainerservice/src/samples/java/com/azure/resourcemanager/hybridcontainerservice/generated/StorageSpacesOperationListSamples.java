// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.Context;

/** Samples for StorageSpacesOperation List. */
public final class StorageSpacesOperationListSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/preview/2022-05-01-preview/examples/ListStorageSpaceBySubscription.json
     */
    /**
     * Sample code: ListStorageSpaceBySubscription.
     *
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void listStorageSpaceBySubscription(
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.storageSpacesOperations().list(Context.NONE);
    }
}
