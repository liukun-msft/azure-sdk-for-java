// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for RecoveryServicesManagementClient class. */
public interface RecoveryServicesManagementClient {
    /**
     * Gets The subscription Id.
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
     * Gets the VaultCertificatesClient object to access its operations.
     *
     * @return the VaultCertificatesClient object.
     */
    VaultCertificatesClient getVaultCertificates();

    /**
     * Gets the RegisteredIdentitiesClient object to access its operations.
     *
     * @return the RegisteredIdentitiesClient object.
     */
    RegisteredIdentitiesClient getRegisteredIdentities();

    /**
     * Gets the ReplicationUsagesClient object to access its operations.
     *
     * @return the ReplicationUsagesClient object.
     */
    ReplicationUsagesClient getReplicationUsages();

    /**
     * Gets the PrivateLinkResourcesOperationsClient object to access its operations.
     *
     * @return the PrivateLinkResourcesOperationsClient object.
     */
    PrivateLinkResourcesOperationsClient getPrivateLinkResourcesOperations();

    /**
     * Gets the RecoveryServicesClient object to access its operations.
     *
     * @return the RecoveryServicesClient object.
     */
    RecoveryServicesClient getRecoveryServices();

    /**
     * Gets the VaultsClient object to access its operations.
     *
     * @return the VaultsClient object.
     */
    VaultsClient getVaults();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the VaultExtendedInfoesClient object to access its operations.
     *
     * @return the VaultExtendedInfoesClient object.
     */
    VaultExtendedInfoesClient getVaultExtendedInfoes();

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     *
     * @return the ResourceProvidersClient object.
     */
    ResourceProvidersClient getResourceProviders();

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    UsagesClient getUsages();
}
