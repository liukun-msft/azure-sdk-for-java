// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ScaleRuleAuth;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ScaleRuleAuthTests {
    @Test
    public void testDeserialize() {
        ScaleRuleAuth model =
            BinaryData
                .fromString("{\"secretRef\":\"gdknnqv\",\"triggerParameter\":\"znqntoru\"}")
                .toObject(ScaleRuleAuth.class);
        Assertions.assertEquals("gdknnqv", model.secretRef());
        Assertions.assertEquals("znqntoru", model.triggerParameter());
    }

    @Test
    public void testSerialize() {
        ScaleRuleAuth model = new ScaleRuleAuth().withSecretRef("gdknnqv").withTriggerParameter("znqntoru");
        model = BinaryData.fromObject(model).toObject(ScaleRuleAuth.class);
        Assertions.assertEquals("gdknnqv", model.secretRef());
        Assertions.assertEquals("znqntoru", model.triggerParameter());
    }
}
