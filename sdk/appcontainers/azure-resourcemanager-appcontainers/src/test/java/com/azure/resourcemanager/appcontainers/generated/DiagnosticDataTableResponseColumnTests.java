// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataTableResponseColumn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DiagnosticDataTableResponseColumnTests {
    @Test
    public void testDeserialize() {
        DiagnosticDataTableResponseColumn model =
            BinaryData
                .fromString("{\"columnName\":\"orbteoy\",\"dataType\":\"hjxa\",\"columnType\":\"vjgsl\"}")
                .toObject(DiagnosticDataTableResponseColumn.class);
        Assertions.assertEquals("orbteoy", model.columnName());
        Assertions.assertEquals("hjxa", model.dataType());
        Assertions.assertEquals("vjgsl", model.columnType());
    }

    @Test
    public void testSerialize() {
        DiagnosticDataTableResponseColumn model =
            new DiagnosticDataTableResponseColumn()
                .withColumnName("orbteoy")
                .withDataType("hjxa")
                .withColumnType("vjgsl");
        model = BinaryData.fromObject(model).toObject(DiagnosticDataTableResponseColumn.class);
        Assertions.assertEquals("orbteoy", model.columnName());
        Assertions.assertEquals("hjxa", model.dataType());
        Assertions.assertEquals("vjgsl", model.columnType());
    }
}
