// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for StoragePoolManagement class. */
public interface StoragePoolManagement {
    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the DiskPoolsClient object to access its operations.
     *
     * @return the DiskPoolsClient object.
     */
    DiskPoolsClient getDiskPools();

    /**
     * Gets the DiskPoolZonesClient object to access its operations.
     *
     * @return the DiskPoolZonesClient object.
     */
    DiskPoolZonesClient getDiskPoolZones();

    /**
     * Gets the ResourceSkusClient object to access its operations.
     *
     * @return the ResourceSkusClient object.
     */
    ResourceSkusClient getResourceSkus();

    /**
     * Gets the IscsiTargetsClient object to access its operations.
     *
     * @return the IscsiTargetsClient object.
     */
    IscsiTargetsClient getIscsiTargets();
}
