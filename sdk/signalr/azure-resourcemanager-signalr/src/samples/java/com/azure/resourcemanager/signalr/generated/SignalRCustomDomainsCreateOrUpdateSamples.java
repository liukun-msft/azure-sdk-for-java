// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.resourcemanager.signalr.models.ResourceReference;

/** Samples for SignalRCustomDomains CreateOrUpdate. */
public final class SignalRCustomDomainsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/signalr/resource-manager/Microsoft.SignalRService/preview/2022-08-01-preview/examples/SignalRCustomDomains_CreateOrUpdate.json
     */
    /**
     * Sample code: SignalRCustomDomains_CreateOrUpdate.
     *
     * @param manager Entry point to SignalRManager.
     */
    public static void signalRCustomDomainsCreateOrUpdate(com.azure.resourcemanager.signalr.SignalRManager manager) {
        manager
            .signalRCustomDomains()
            .define("myDomain")
            .withExistingSignalR("myResourceGroup", "mySignalRService")
            .withDomainName("example.com")
            .withCustomCertificate(
                new ResourceReference()
                    .withId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/Microsoft.SignalRService/SignalR/mySignalRService/customCertificates/myCert"))
            .create();
    }
}
