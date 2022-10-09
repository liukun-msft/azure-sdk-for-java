// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for SecurityContacts Get. */
public final class SecurityContactsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2020-01-01-preview/examples/SecurityContacts/GetSecurityContact_example.json
     */
    /**
     * Sample code: Get a security contact.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getASecurityContact(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.securityContacts().getWithResponse("default", Context.NONE);
    }
}
