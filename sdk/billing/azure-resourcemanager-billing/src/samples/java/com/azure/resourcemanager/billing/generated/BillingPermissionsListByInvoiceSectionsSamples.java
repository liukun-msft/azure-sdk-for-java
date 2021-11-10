// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.Context;

/** Samples for BillingPermissions ListByInvoiceSections. */
public final class BillingPermissionsListByInvoiceSectionsSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2020-05-01/examples/InvoiceSectionPermissionsList.json
     */
    /**
     * Sample code: InvoiceSectionPermissionsList.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoiceSectionPermissionsList(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingPermissions()
            .listByInvoiceSections(
                "{billingAccountName}", "{billingProfileName}", "{invoiceSectionName}", Context.NONE);
    }
}
