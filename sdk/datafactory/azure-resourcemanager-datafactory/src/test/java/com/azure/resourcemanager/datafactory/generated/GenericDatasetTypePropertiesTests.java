// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.GenericDatasetTypeProperties;
import org.junit.jupiter.api.Test;

public final class GenericDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        GenericDatasetTypeProperties model = BinaryData.fromString("{}").toObject(GenericDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        GenericDatasetTypeProperties model = new GenericDatasetTypeProperties();
        model = BinaryData.fromObject(model).toObject(GenericDatasetTypeProperties.class);
    }
}
