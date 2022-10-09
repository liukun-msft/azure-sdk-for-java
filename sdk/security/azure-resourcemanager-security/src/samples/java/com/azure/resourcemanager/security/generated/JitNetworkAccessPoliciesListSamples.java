// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for JitNetworkAccessPolicies List. */
public final class JitNetworkAccessPoliciesListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/JitNetworkAccessPolicies/GetJitNetworkAccessPoliciesSubscription_example.json
     */
    /**
     * Sample code: Get JIT network access policies on a subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getJITNetworkAccessPoliciesOnASubscription(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.jitNetworkAccessPolicies().list(Context.NONE);
    }
}
