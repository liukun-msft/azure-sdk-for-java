// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CassandraSource;
import com.azure.resourcemanager.datafactory.models.CassandraSourceReadConsistencyLevels;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CassandraSourceTests {
    @Test
    public void testDeserialize() {
        CassandraSource model =
            BinaryData
                .fromString("{\"type\":\"CassandraSource\",\"consistencyLevel\":\"LOCAL_ONE\",\"\":{}}")
                .toObject(CassandraSource.class);
        Assertions.assertEquals(CassandraSourceReadConsistencyLevels.LOCAL_ONE, model.consistencyLevel());
    }

    @Test
    public void testSerialize() {
        CassandraSource model =
            new CassandraSource().withConsistencyLevel(CassandraSourceReadConsistencyLevels.LOCAL_ONE);
        model = BinaryData.fromObject(model).toObject(CassandraSource.class);
        Assertions.assertEquals(CassandraSourceReadConsistencyLevels.LOCAL_ONE, model.consistencyLevel());
    }
}
