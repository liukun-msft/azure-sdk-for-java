// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.hdinsight.models.PrivateEndpointConnectionListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionListResultTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"linkIdentifier\":\"bqplh\",\"provisioningState\":\"Updating\"},\"id\":\"uepzl\",\"name\":\"phwzsoldweyuqdu\",\"type\":\"vmnnrw\"},{\"properties\":{\"linkIdentifier\":\"ork\",\"provisioningState\":\"InProgress\"},\"id\":\"wjhhgdnhxmsivf\",\"name\":\"miloxggdufiqndie\",\"type\":\"zaofjchvcyy\"}],\"nextLink\":\"fgdo\"}")
                .toObject(PrivateEndpointConnectionListResult.class);
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionListResult model =
            new PrivateEndpointConnectionListResult()
                .withValue(Arrays.asList(new PrivateEndpointConnectionInner(), new PrivateEndpointConnectionInner()));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionListResult.class);
    }
}
