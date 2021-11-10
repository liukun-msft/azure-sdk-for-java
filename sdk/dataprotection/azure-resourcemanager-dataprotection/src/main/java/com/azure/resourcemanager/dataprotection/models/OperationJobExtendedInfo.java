// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.resourcemanager.dataprotection.fluent.models.OperationJobExtendedInfoInner;

/** An immutable client-side representation of OperationJobExtendedInfo. */
public interface OperationJobExtendedInfo {
    /**
     * Gets the jobId property: Arm Id of the job created for this operation.
     *
     * @return the jobId value.
     */
    String jobId();

    /**
     * Gets the inner com.azure.resourcemanager.dataprotection.fluent.models.OperationJobExtendedInfoInner object.
     *
     * @return the inner object.
     */
    OperationJobExtendedInfoInner innerModel();
}
