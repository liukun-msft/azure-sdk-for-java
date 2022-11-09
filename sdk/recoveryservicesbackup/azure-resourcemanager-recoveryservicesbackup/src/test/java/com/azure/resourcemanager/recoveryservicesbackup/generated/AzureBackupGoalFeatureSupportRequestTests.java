// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureBackupGoalFeatureSupportRequest;
import org.junit.jupiter.api.Test;

public final class AzureBackupGoalFeatureSupportRequestTests {
    @Test
    public void testDeserialize() {
        AzureBackupGoalFeatureSupportRequest model =
            BinaryData
                .fromString("{\"featureType\":\"AzureBackupGoals\"}")
                .toObject(AzureBackupGoalFeatureSupportRequest.class);
    }

    @Test
    public void testSerialize() {
        AzureBackupGoalFeatureSupportRequest model = new AzureBackupGoalFeatureSupportRequest();
        model = BinaryData.fromObject(model).toObject(AzureBackupGoalFeatureSupportRequest.class);
    }
}
