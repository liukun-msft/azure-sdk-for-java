// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDataExplorerSource;
import org.junit.jupiter.api.Test;

public final class AzureDataExplorerSourceTests {
    @Test
    public void testDeserialize() {
        AzureDataExplorerSource model =
            BinaryData
                .fromString("{\"type\":\"AzureDataExplorerSource\",\"\":{}}")
                .toObject(AzureDataExplorerSource.class);
    }

    @Test
    public void testSerialize() {
        AzureDataExplorerSource model = new AzureDataExplorerSource();
        model = BinaryData.fromObject(model).toObject(AzureDataExplorerSource.class);
    }
}
