// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for SubAssessments List. */
public final class SubAssessmentsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2019-01-01-preview/examples/SubAssessments/ListSubAssessments_example.json
     */
    /**
     * Sample code: List security sub-assessments.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listSecuritySubAssessments(com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .subAssessments()
            .list(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23",
                "82e20e14-edc5-4373-bfc4-f13121257c37",
                Context.NONE);
    }
}
