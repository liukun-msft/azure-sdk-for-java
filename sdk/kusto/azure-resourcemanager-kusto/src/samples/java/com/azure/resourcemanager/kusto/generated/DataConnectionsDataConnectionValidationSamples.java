// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionValidationInner;
import com.azure.resourcemanager.kusto.models.BlobStorageEventType;
import com.azure.resourcemanager.kusto.models.Compression;
import com.azure.resourcemanager.kusto.models.DatabaseRouting;
import com.azure.resourcemanager.kusto.models.EventGridDataConnection;
import com.azure.resourcemanager.kusto.models.EventGridDataFormat;
import com.azure.resourcemanager.kusto.models.EventHubDataConnection;
import com.azure.resourcemanager.kusto.models.EventHubDataFormat;

/** Samples for DataConnections DataConnectionValidation. */
public final class DataConnectionsDataConnectionValidationSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2022-07-07/examples/KustoDataConnectionValidationAsync.json
     */
    /**
     * Sample code: KustoDataConnectionValidation.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoDataConnectionValidation(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .dataConnections()
            .dataConnectionValidation(
                "kustorptest",
                "kustoCluster",
                "KustoDatabase8",
                new DataConnectionValidationInner()
                    .withDataConnectionName("dataConnectionTest")
                    .withProperties(
                        new EventHubDataConnection()
                            .withEventHubResourceId(
                                "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.EventHub/namespaces/eventhubTestns1/eventhubs/eventhubTest1")
                            .withConsumerGroup("testConsumerGroup1")
                            .withTableName("TestTable")
                            .withMappingRuleName("TestMapping")
                            .withDataFormat(EventHubDataFormat.JSON)
                            .withCompression(Compression.NONE)
                            .withManagedIdentityResourceId(
                                "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.ManagedIdentity/userAssignedIdentities/managedidentityTest1")),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2022-07-07/examples/KustoDataConnectionEventGridValidationAsync.json
     */
    /**
     * Sample code: KustoDataConnectionEventGridValidation.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoDataConnectionEventGridValidation(com.azure.resourcemanager.kusto.KustoManager manager) {
        manager
            .dataConnections()
            .dataConnectionValidation(
                "kustorptest",
                "kustoCluster",
                "KustoDatabase8",
                new DataConnectionValidationInner()
                    .withDataConnectionName("dataConnectionTest")
                    .withProperties(
                        new EventGridDataConnection()
                            .withStorageAccountResourceId(
                                "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Storage/storageAccounts/teststorageaccount")
                            .withEventGridResourceId(
                                "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.Storage/storageAccounts/teststorageaccount/providers/Microsoft.EventGrid/eventSubscriptions/eventSubscriptionTest")
                            .withEventHubResourceId(
                                "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.EventHub/namespaces/eventhubTestns1/eventhubs/eventhubTest1")
                            .withConsumerGroup("$Default")
                            .withTableName("TestTable")
                            .withMappingRuleName("TestMapping")
                            .withDataFormat(EventGridDataFormat.JSON)
                            .withIgnoreFirstRecord(false)
                            .withBlobStorageEventType(BlobStorageEventType.MICROSOFT_STORAGE_BLOB_CREATED)
                            .withManagedIdentityResourceId(
                                "/subscriptions/12345678-1234-1234-1234-123456789098/resourceGroups/kustorptest/providers/Microsoft.ManagedIdentity/userAssignedIdentities/managedidentityTest1")
                            .withDatabaseRouting(DatabaseRouting.SINGLE)),
                Context.NONE);
    }
}
