// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.Context;

/** Samples for Products Get. */
public final class ProductsGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/Product.json
     */
    /**
     * Sample code: Product.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void product(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.products().getWithResponse("{billingAccountName}", "{productName}", Context.NONE);
    }
}
