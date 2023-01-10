// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.ComputeResourceInner;
import com.azure.resourcemanager.machinelearning.models.Compute;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.machinelearning.models.Sku;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import com.azure.resourcemanager.machinelearning.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComputeResourceInnerTests {
    @Test
    public void testDeserialize() {
        ComputeResourceInner model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"principalId\":\"9cc93189-f061-4abe-bafd-7ba0976b02d6\",\"tenantId\":\"8b88e376-e9e1-47f2-95ee-d10df6e3d2cf\",\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{\"idokgjlj\":{\"principalId\":\"e4b91e8c-c25b-44cf-b878-b6b9415c9d19\",\"clientId\":\"79905776-a0ca-47bd-b1f9-c204089262ff\"}}},\"location\":\"xgvcl\",\"tags\":{\"bijhtxfvgxbf\":\"sncghkjeszz\",\"ec\":\"mxnehmp\",\"gr\":\"godebfqkkrbmpu\"},\"sku\":{\"name\":\"flz\",\"tier\":\"Standard\",\"size\":\"zpuzycisp\",\"family\":\"zahmgkbrpyydhibn\",\"capacity\":2043148337},\"properties\":{\"computeType\":\"Compute\",\"computeLocation\":\"kadrgvt\",\"provisioningState\":\"Unknown\",\"description\":\"buynhijggm\",\"createdOn\":\"2021-03-31T00:28:57Z\",\"modifiedOn\":\"2021-01-01T18:17:26Z\",\"resourceId\":\"rbu\",\"provisioningErrors\":[],\"isAttachedCompute\":false,\"disableLocalAuth\":true},\"id\":\"zzmhjrunmpxttd\",\"name\":\"hrbnlankxmyskpbh\",\"type\":\"nbtkcxywnytnr\"}")
                .toObject(ComputeResourceInner.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("xgvcl", model.location());
        Assertions.assertEquals("sncghkjeszz", model.tags().get("bijhtxfvgxbf"));
        Assertions.assertEquals("flz", model.sku().name());
        Assertions.assertEquals(SkuTier.STANDARD, model.sku().tier());
        Assertions.assertEquals("zpuzycisp", model.sku().size());
        Assertions.assertEquals("zahmgkbrpyydhibn", model.sku().family());
        Assertions.assertEquals(2043148337, model.sku().capacity());
        Assertions.assertEquals("kadrgvt", model.properties().computeLocation());
        Assertions.assertEquals("buynhijggm", model.properties().description());
        Assertions.assertEquals("rbu", model.properties().resourceId());
        Assertions.assertEquals(true, model.properties().disableLocalAuth());
    }

    @Test
    public void testSerialize() {
        ComputeResourceInner model =
            new ComputeResourceInner()
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                        .withUserAssignedIdentities(mapOf("idokgjlj", new UserAssignedIdentity())))
                .withLocation("xgvcl")
                .withTags(mapOf("bijhtxfvgxbf", "sncghkjeszz", "ec", "mxnehmp", "gr", "godebfqkkrbmpu"))
                .withSku(
                    new Sku()
                        .withName("flz")
                        .withTier(SkuTier.STANDARD)
                        .withSize("zpuzycisp")
                        .withFamily("zahmgkbrpyydhibn")
                        .withCapacity(2043148337))
                .withProperties(
                    new Compute()
                        .withComputeLocation("kadrgvt")
                        .withDescription("buynhijggm")
                        .withResourceId("rbu")
                        .withDisableLocalAuth(true));
        model = BinaryData.fromObject(model).toObject(ComputeResourceInner.class);
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("xgvcl", model.location());
        Assertions.assertEquals("sncghkjeszz", model.tags().get("bijhtxfvgxbf"));
        Assertions.assertEquals("flz", model.sku().name());
        Assertions.assertEquals(SkuTier.STANDARD, model.sku().tier());
        Assertions.assertEquals("zpuzycisp", model.sku().size());
        Assertions.assertEquals("zahmgkbrpyydhibn", model.sku().family());
        Assertions.assertEquals(2043148337, model.sku().capacity());
        Assertions.assertEquals("kadrgvt", model.properties().computeLocation());
        Assertions.assertEquals("buynhijggm", model.properties().description());
        Assertions.assertEquals("rbu", model.properties().resourceId());
        Assertions.assertEquals(true, model.properties().disableLocalAuth());
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
