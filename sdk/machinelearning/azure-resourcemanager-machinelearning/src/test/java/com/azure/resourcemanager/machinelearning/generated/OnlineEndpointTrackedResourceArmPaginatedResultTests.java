// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.OnlineEndpointInner;
import com.azure.resourcemanager.machinelearning.models.EndpointAuthMode;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.machinelearning.models.OnlineEndpointProperties;
import com.azure.resourcemanager.machinelearning.models.OnlineEndpointTrackedResourceArmPaginatedResult;
import com.azure.resourcemanager.machinelearning.models.PublicNetworkAccessType;
import com.azure.resourcemanager.machinelearning.models.Sku;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OnlineEndpointTrackedResourceArmPaginatedResultTests {
    @Test
    public void testDeserialize() {
        OnlineEndpointTrackedResourceArmPaginatedResult model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"hxgsrboldfor\",\"value\":[{\"identity\":{\"principalId\":\"f9cc1332-2aa2-43aa-afa2-bce138a95e05\",\"tenantId\":\"ed133acf-913d-40e3-a672-17d9b10dc26d\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"kind\":\"fhfovv\",\"properties\":{\"compute\":\"qpbtuodxes\",\"provisioningState\":\"Creating\",\"publicNetworkAccess\":\"Enabled\",\"traffic\":{},\"authMode\":\"AADToken\",\"description\":\"umuaslzkwrrwoycq\",\"properties\":{},\"scoringUri\":\"http://example.org/hahnomdrkywuhps\",\"swaggerUri\":\"http://example.org/uurutlwexxwlalni\"},\"sku\":{\"name\":\"zsrzpgepq\",\"tier\":\"Free\",\"size\":\"wwpgdakchzyvlixq\",\"family\":\"kcxk\",\"capacity\":330254773},\"location\":\"xmysuxswqrntv\",\"tags\":{\"pwcyyufmhr\":\"jpsttexoq\",\"wmqs\":\"nc\"},\"id\":\"kcdqzhlct\",\"name\":\"dunqnd\",\"type\":\"fpch\"},{\"identity\":{\"principalId\":\"c828a975-6161-4e0d-bdab-33107e4827a3\",\"tenantId\":\"48700d8b-467a-449d-9b59-c111ca6455fe\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"kind\":\"cgegydcwbo\",\"properties\":{\"compute\":\"umvq\",\"provisioningState\":\"Succeeded\",\"publicNetworkAccess\":\"Disabled\",\"traffic\":{},\"authMode\":\"AMLToken\",\"description\":\"iouaubrjt\",\"properties\":{},\"scoringUri\":\"http://example.org/fuojrngif\",\"swaggerUri\":\"http://example.org/z\"},\"sku\":{\"name\":\"sccbiuimzd\",\"tier\":\"Premium\",\"size\":\"fqwmkyoquf\",\"family\":\"ruzslzoj\",\"capacity\":617076882},\"location\":\"fnmdxotn\",\"tags\":{\"i\":\"gugey\"},\"id\":\"grkyuizabsnmfpph\",\"name\":\"jee\",\"type\":\"yhyhsgzfczb\"},{\"identity\":{\"principalId\":\"01e534d8-91d9-4248-b232-b9451a0bc811\",\"tenantId\":\"31c64586-19eb-40c1-8677-4065c45f572e\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"kind\":\"glqgleoh\",\"properties\":{\"compute\":\"etnluankrrfx\",\"provisioningState\":\"Succeeded\",\"publicNetworkAccess\":\"Enabled\",\"traffic\":{},\"authMode\":\"Key\",\"description\":\"acvbmqz\",\"properties\":{},\"scoringUri\":\"http://example.org/lajrnwxacevehj\",\"swaggerUri\":\"http://example.org/yxoaf\"},\"sku\":{\"name\":\"oqltfae\",\"tier\":\"Standard\",\"size\":\"mfgvxirpghriypo\",\"family\":\"yhlqhykprlpyznu\",\"capacity\":184808617},\"location\":\"smexiitdf\",\"tags\":{\"nnust\":\"yasiibmiy\",\"nmgixh\":\"nlj\",\"oudorhcgyyp\":\"mavmq\",\"hu\":\"otwypundmb\"},\"id\":\"cmjkavlgorbmftpm\",\"name\":\"tzfjltf\",\"type\":\"nzcyjtotp\"}]}")
                .toObject(OnlineEndpointTrackedResourceArmPaginatedResult.class);
        Assertions.assertEquals("hxgsrboldfor", model.nextLink());
        Assertions.assertEquals("xmysuxswqrntv", model.value().get(0).location());
        Assertions.assertEquals("jpsttexoq", model.value().get(0).tags().get("pwcyyufmhr"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("fhfovv", model.value().get(0).kind());
        Assertions.assertEquals(EndpointAuthMode.AADTOKEN, model.value().get(0).properties().authMode());
        Assertions.assertEquals("umuaslzkwrrwoycq", model.value().get(0).properties().description());
        Assertions.assertEquals("qpbtuodxes", model.value().get(0).properties().compute());
        Assertions
            .assertEquals(PublicNetworkAccessType.ENABLED, model.value().get(0).properties().publicNetworkAccess());
        Assertions.assertEquals("zsrzpgepq", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.FREE, model.value().get(0).sku().tier());
        Assertions.assertEquals("wwpgdakchzyvlixq", model.value().get(0).sku().size());
        Assertions.assertEquals("kcxk", model.value().get(0).sku().family());
        Assertions.assertEquals(330254773, model.value().get(0).sku().capacity());
    }

    @Test
    public void testSerialize() {
        OnlineEndpointTrackedResourceArmPaginatedResult model =
            new OnlineEndpointTrackedResourceArmPaginatedResult()
                .withNextLink("hxgsrboldfor")
                .withValue(
                    Arrays
                        .asList(
                            new OnlineEndpointInner()
                                .withLocation("xmysuxswqrntv")
                                .withTags(mapOf("pwcyyufmhr", "jpsttexoq", "wmqs", "nc"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withKind("fhfovv")
                                .withProperties(
                                    new OnlineEndpointProperties()
                                        .withAuthMode(EndpointAuthMode.AADTOKEN)
                                        .withDescription("umuaslzkwrrwoycq")
                                        .withProperties(mapOf())
                                        .withCompute("qpbtuodxes")
                                        .withPublicNetworkAccess(PublicNetworkAccessType.ENABLED)
                                        .withTraffic(mapOf()))
                                .withSku(
                                    new Sku()
                                        .withName("zsrzpgepq")
                                        .withTier(SkuTier.FREE)
                                        .withSize("wwpgdakchzyvlixq")
                                        .withFamily("kcxk")
                                        .withCapacity(330254773)),
                            new OnlineEndpointInner()
                                .withLocation("fnmdxotn")
                                .withTags(mapOf("i", "gugey"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withKind("cgegydcwbo")
                                .withProperties(
                                    new OnlineEndpointProperties()
                                        .withAuthMode(EndpointAuthMode.AMLTOKEN)
                                        .withDescription("iouaubrjt")
                                        .withProperties(mapOf())
                                        .withCompute("umvq")
                                        .withPublicNetworkAccess(PublicNetworkAccessType.DISABLED)
                                        .withTraffic(mapOf()))
                                .withSku(
                                    new Sku()
                                        .withName("sccbiuimzd")
                                        .withTier(SkuTier.PREMIUM)
                                        .withSize("fqwmkyoquf")
                                        .withFamily("ruzslzoj")
                                        .withCapacity(617076882)),
                            new OnlineEndpointInner()
                                .withLocation("smexiitdf")
                                .withTags(
                                    mapOf(
                                        "nnust",
                                        "yasiibmiy",
                                        "nmgixh",
                                        "nlj",
                                        "oudorhcgyyp",
                                        "mavmq",
                                        "hu",
                                        "otwypundmb"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withKind("glqgleoh")
                                .withProperties(
                                    new OnlineEndpointProperties()
                                        .withAuthMode(EndpointAuthMode.KEY)
                                        .withDescription("acvbmqz")
                                        .withProperties(mapOf())
                                        .withCompute("etnluankrrfx")
                                        .withPublicNetworkAccess(PublicNetworkAccessType.ENABLED)
                                        .withTraffic(mapOf()))
                                .withSku(
                                    new Sku()
                                        .withName("oqltfae")
                                        .withTier(SkuTier.STANDARD)
                                        .withSize("mfgvxirpghriypo")
                                        .withFamily("yhlqhykprlpyznu")
                                        .withCapacity(184808617))));
        model = BinaryData.fromObject(model).toObject(OnlineEndpointTrackedResourceArmPaginatedResult.class);
        Assertions.assertEquals("hxgsrboldfor", model.nextLink());
        Assertions.assertEquals("xmysuxswqrntv", model.value().get(0).location());
        Assertions.assertEquals("jpsttexoq", model.value().get(0).tags().get("pwcyyufmhr"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("fhfovv", model.value().get(0).kind());
        Assertions.assertEquals(EndpointAuthMode.AADTOKEN, model.value().get(0).properties().authMode());
        Assertions.assertEquals("umuaslzkwrrwoycq", model.value().get(0).properties().description());
        Assertions.assertEquals("qpbtuodxes", model.value().get(0).properties().compute());
        Assertions
            .assertEquals(PublicNetworkAccessType.ENABLED, model.value().get(0).properties().publicNetworkAccess());
        Assertions.assertEquals("zsrzpgepq", model.value().get(0).sku().name());
        Assertions.assertEquals(SkuTier.FREE, model.value().get(0).sku().tier());
        Assertions.assertEquals("wwpgdakchzyvlixq", model.value().get(0).sku().size());
        Assertions.assertEquals("kcxk", model.value().get(0).sku().family());
        Assertions.assertEquals(330254773, model.value().get(0).sku().capacity());
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
