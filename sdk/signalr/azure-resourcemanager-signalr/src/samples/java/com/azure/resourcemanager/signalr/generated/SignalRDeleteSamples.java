// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.Context;

/** Samples for SignalR Delete. */
public final class SignalRDeleteSamples {
    /*
     * x-ms-original-file: specification/signalr/resource-manager/Microsoft.SignalRService/preview/2022-08-01-preview/examples/SignalR_Delete.json
     */
    /**
     * Sample code: SignalR_Delete.
     *
     * @param manager Entry point to SignalRManager.
     */
    public static void signalRDelete(com.azure.resourcemanager.signalr.SignalRManager manager) {
        manager.signalRs().delete("myResourceGroup", "mySignalRService", Context.NONE);
    }
}
