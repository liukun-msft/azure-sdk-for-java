// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlanListResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CommitmentPlanListResultTests {
    @Test
    public void testDeserialize() {
        CommitmentPlanListResult model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"emwabnet\",\"value\":[{\"etag\":\"h\",\"properties\":{\"hostingModel\":\"ConnectedContainer\",\"planType\":\"wiwubm\",\"autoRenew\":false},\"id\":\"dnkwwtppjflcxog\",\"name\":\"okonzmnsikvmkqz\",\"type\":\"qqkdltfzxmhhvhgu\"},{\"etag\":\"dkwobdagx\",\"properties\":{\"hostingModel\":\"DisconnectedContainer\",\"planType\":\"xbxwa\",\"autoRenew\":true},\"id\":\"ndlkzgxhurip\",\"name\":\"bpodxunkbebxm\",\"type\":\"byyntwlrbqt\"},{\"etag\":\"evseotgqrlltmuwl\",\"properties\":{\"hostingModel\":\"DisconnectedContainer\",\"planType\":\"zxb\",\"autoRenew\":false},\"id\":\"fuzmuvpbtt\",\"name\":\"um\",\"type\":\"rp\"},{\"etag\":\"bmnzbtbhjpgl\",\"properties\":{\"hostingModel\":\"DisconnectedContainer\",\"planType\":\"dneu\",\"autoRenew\":false},\"id\":\"dyhtozfikdowwquu\",\"name\":\"xzxcl\",\"type\":\"ithhqzon\"}]}")
                .toObject(CommitmentPlanListResult.class);
        Assertions.assertEquals("emwabnet", model.nextLink());
    }

    @Test
    public void testSerialize() {
        CommitmentPlanListResult model = new CommitmentPlanListResult().withNextLink("emwabnet");
        model = BinaryData.fromObject(model).toObject(CommitmentPlanListResult.class);
        Assertions.assertEquals("emwabnet", model.nextLink());
    }
}
