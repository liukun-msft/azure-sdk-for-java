// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.UsageName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UsageNameTests {
    @Test
    public void testDeserialize() {
        UsageName model =
            BinaryData
                .fromString("{\"localizedValue\":\"hwit\",\"value\":\"ypyynpcdpumnzg\"}")
                .toObject(UsageName.class);
        Assertions.assertEquals("hwit", model.localizedValue());
        Assertions.assertEquals("ypyynpcdpumnzg", model.value());
    }

    @Test
    public void testSerialize() {
        UsageName model = new UsageName().withLocalizedValue("hwit").withValue("ypyynpcdpumnzg");
        model = BinaryData.fromObject(model).toObject(UsageName.class);
        Assertions.assertEquals("hwit", model.localizedValue());
        Assertions.assertEquals("ypyynpcdpumnzg", model.value());
    }
}
