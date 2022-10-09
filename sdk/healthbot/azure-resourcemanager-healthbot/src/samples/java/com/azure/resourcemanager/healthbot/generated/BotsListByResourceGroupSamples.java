// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthbot.generated;

import com.azure.core.util.Context;

/** Samples for Bots ListByResourceGroup. */
public final class BotsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/healthbot/resource-manager/Microsoft.HealthBot/stable/2020-12-08/examples/ListBotsByResourceGroup.json
     */
    /**
     * Sample code: List Bots by Resource Group.
     *
     * @param manager Entry point to HealthbotManager.
     */
    public static void listBotsByResourceGroup(com.azure.resourcemanager.healthbot.HealthbotManager manager) {
        manager.bots().listByResourceGroup("OneResourceGroupName", Context.NONE);
    }
}
