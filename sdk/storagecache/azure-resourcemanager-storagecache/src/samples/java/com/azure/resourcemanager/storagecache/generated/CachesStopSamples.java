// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.Context;

/** Samples for Caches Stop. */
public final class CachesStopSamples {
    /*
     * x-ms-original-file: specification/storagecache/resource-manager/Microsoft.StorageCache/stable/2022-05-01/examples/Caches_Stop.json
     */
    /**
     * Sample code: Caches_Stop.
     *
     * @param manager Entry point to StorageCacheManager.
     */
    public static void cachesStop(com.azure.resourcemanager.storagecache.StorageCacheManager manager) {
        manager.caches().stop("scgroup", "sc", Context.NONE);
    }
}
