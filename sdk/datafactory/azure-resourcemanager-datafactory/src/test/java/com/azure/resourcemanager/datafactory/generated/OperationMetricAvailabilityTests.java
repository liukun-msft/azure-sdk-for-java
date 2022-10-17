// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OperationMetricAvailability;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationMetricAvailabilityTests {
    @Test
    public void testDeserialize() {
        OperationMetricAvailability model =
            BinaryData
                .fromString("{\"timeGrain\":\"nwui\",\"blobDuration\":\"a\"}")
                .toObject(OperationMetricAvailability.class);
        Assertions.assertEquals("nwui", model.timeGrain());
        Assertions.assertEquals("a", model.blobDuration());
    }

    @Test
    public void testSerialize() {
        OperationMetricAvailability model =
            new OperationMetricAvailability().withTimeGrain("nwui").withBlobDuration("a");
        model = BinaryData.fromObject(model).toObject(OperationMetricAvailability.class);
        Assertions.assertEquals("nwui", model.timeGrain());
        Assertions.assertEquals("a", model.blobDuration());
    }
}
