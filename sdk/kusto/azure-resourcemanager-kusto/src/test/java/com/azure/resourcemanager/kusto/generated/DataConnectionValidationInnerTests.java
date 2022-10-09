// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionInner;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionValidationInner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataConnectionValidationInnerTests {
    @Test
    public void testDeserialize() {
        DataConnectionValidationInner model =
            BinaryData
                .fromString(
                    "{\"dataConnectionName\":\"udutnco\",\"properties\":{\"kind\":\"DataConnection\",\"location\":\"lxqtvcofudfl\",\"id\":\"kgjubgdknnqvsazn\",\"name\":\"n\",\"type\":\"orudsgsa\"}}")
                .toObject(DataConnectionValidationInner.class);
        Assertions.assertEquals("udutnco", model.dataConnectionName());
        Assertions.assertEquals("lxqtvcofudfl", model.properties().location());
    }

    @Test
    public void testSerialize() {
        DataConnectionValidationInner model =
            new DataConnectionValidationInner()
                .withDataConnectionName("udutnco")
                .withProperties(new DataConnectionInner().withLocation("lxqtvcofudfl"));
        model = BinaryData.fromObject(model).toObject(DataConnectionValidationInner.class);
        Assertions.assertEquals("udutnco", model.dataConnectionName());
        Assertions.assertEquals("lxqtvcofudfl", model.properties().location());
    }
}
