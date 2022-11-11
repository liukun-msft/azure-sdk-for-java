// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.ContainerIdentityInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.GenericContainerExtendedInfo;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GenericContainerExtendedInfoTests {
    @Test
    public void testDeserialize() {
        GenericContainerExtendedInfo model =
            BinaryData
                .fromString(
                    "{\"rawCertData\":\"wflj\",\"containerIdentityInfo\":{\"uniqueName\":\"amtuatmzwcjjnc\",\"aadTenantId\":\"jzmizv\",\"servicePrincipalClientId\":\"gat\",\"audience\":\"uvbxngr\"},\"serviceEndpoints\":{\"lswva\":\"ggahtt\",\"zasunwqrjzfrgq\":\"qfutlxjo\",\"r\":\"aohcmbuocn\",\"yvk\":\"hmbpyryxamebly\"}}")
                .toObject(GenericContainerExtendedInfo.class);
        Assertions.assertEquals("wflj", model.rawCertData());
        Assertions.assertEquals("amtuatmzwcjjnc", model.containerIdentityInfo().uniqueName());
        Assertions.assertEquals("jzmizv", model.containerIdentityInfo().aadTenantId());
        Assertions.assertEquals("gat", model.containerIdentityInfo().servicePrincipalClientId());
        Assertions.assertEquals("uvbxngr", model.containerIdentityInfo().audience());
        Assertions.assertEquals("ggahtt", model.serviceEndpoints().get("lswva"));
    }

    @Test
    public void testSerialize() {
        GenericContainerExtendedInfo model =
            new GenericContainerExtendedInfo()
                .withRawCertData("wflj")
                .withContainerIdentityInfo(
                    new ContainerIdentityInfo()
                        .withUniqueName("amtuatmzwcjjnc")
                        .withAadTenantId("jzmizv")
                        .withServicePrincipalClientId("gat")
                        .withAudience("uvbxngr"))
                .withServiceEndpoints(
                    mapOf("lswva", "ggahtt", "zasunwqrjzfrgq", "qfutlxjo", "r", "aohcmbuocn", "yvk", "hmbpyryxamebly"));
        model = BinaryData.fromObject(model).toObject(GenericContainerExtendedInfo.class);
        Assertions.assertEquals("wflj", model.rawCertData());
        Assertions.assertEquals("amtuatmzwcjjnc", model.containerIdentityInfo().uniqueName());
        Assertions.assertEquals("jzmizv", model.containerIdentityInfo().aadTenantId());
        Assertions.assertEquals("gat", model.containerIdentityInfo().servicePrincipalClientId());
        Assertions.assertEquals("uvbxngr", model.containerIdentityInfo().audience());
        Assertions.assertEquals("ggahtt", model.serviceEndpoints().get("lswva"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
