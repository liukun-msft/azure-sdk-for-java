// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.AppRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppRegistrationTests {
    @Test
    public void testDeserialize() {
        AppRegistration model =
            BinaryData
                .fromString("{\"appId\":\"l\",\"appSecretSettingName\":\"majtjaod\"}")
                .toObject(AppRegistration.class);
        Assertions.assertEquals("l", model.appId());
        Assertions.assertEquals("majtjaod", model.appSecretSettingName());
    }

    @Test
    public void testSerialize() {
        AppRegistration model = new AppRegistration().withAppId("l").withAppSecretSettingName("majtjaod");
        model = BinaryData.fromObject(model).toObject(AppRegistration.class);
        Assertions.assertEquals("l", model.appId());
        Assertions.assertEquals("majtjaod", model.appSecretSettingName());
    }
}
