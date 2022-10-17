// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.Apple;
import com.azure.resourcemanager.appcontainers.models.AppleRegistration;
import com.azure.resourcemanager.appcontainers.models.LoginScopes;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppleTests {
    @Test
    public void testDeserialize() {
        Apple model =
            BinaryData
                .fromString(
                    "{\"enabled\":true,\"registration\":{\"clientId\":\"gnxkrxdqmidtth\",\"clientSecretSettingName\":\"vqdra\"},\"login\":{\"scopes\":[\"big\"]}}")
                .toObject(Apple.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("gnxkrxdqmidtth", model.registration().clientId());
        Assertions.assertEquals("vqdra", model.registration().clientSecretSettingName());
        Assertions.assertEquals("big", model.login().scopes().get(0));
    }

    @Test
    public void testSerialize() {
        Apple model =
            new Apple()
                .withEnabled(true)
                .withRegistration(
                    new AppleRegistration().withClientId("gnxkrxdqmidtth").withClientSecretSettingName("vqdra"))
                .withLogin(new LoginScopes().withScopes(Arrays.asList("big")));
        model = BinaryData.fromObject(model).toObject(Apple.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("gnxkrxdqmidtth", model.registration().clientId());
        Assertions.assertEquals("vqdra", model.registration().clientSecretSettingName());
        Assertions.assertEquals("big", model.login().scopes().get(0));
    }
}
