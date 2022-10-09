// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated;

import com.azure.core.util.Context;

/** Samples for DisasterRecoveryConfigs ListAuthorizationRules. */
public final class DisasterRecoveryConfigsListAuthorizationRulesSamples {
    /*
     * x-ms-original-file: specification/servicebus/resource-manager/Microsoft.ServiceBus/stable/2021-11-01/examples/disasterRecoveryConfigs/SBAliasAuthorizationRuleListAll.json
     */
    /**
     * Sample code: NameSpaceAuthorizationRuleListAll.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void nameSpaceAuthorizationRuleListAll(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .serviceBusNamespaces()
            .manager()
            .serviceClient()
            .getDisasterRecoveryConfigs()
            .listAuthorizationRules(
                "exampleResourceGroup", "sdk-Namespace-9080", "sdk-DisasterRecovery-4047", Context.NONE);
    }
}
