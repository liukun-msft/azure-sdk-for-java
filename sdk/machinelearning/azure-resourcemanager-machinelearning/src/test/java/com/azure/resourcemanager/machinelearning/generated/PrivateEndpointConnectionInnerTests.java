// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpoint;
import com.azure.resourcemanager.machinelearning.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.machinelearning.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.machinelearning.models.Sku;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import com.azure.resourcemanager.machinelearning.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionInnerTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"privateEndpoint\":{\"id\":\"pikxwczbyscnpqxu\",\"subnetArmId\":\"vyq\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"ybrk\",\"actionsRequired\":\"dumjgrtfwvuk\"},\"provisioningState\":\"Deleting\"},\"identity\":{\"principalId\":\"d7f14c3e-fcd0-4def-ad3f-1a573e3bd040\",\"tenantId\":\"4d0af150-cf4d-479a-9047-106d273a9b37\",\"type\":\"None\",\"userAssignedIdentities\":{\"jcny\":{\"principalId\":\"350a54dd-26df-4c65-97dd-10ea2f292a10\",\"clientId\":\"c1be5daf-e495-4a5b-a692-a56795002758\"},\"kryhtnapczwlokj\":{\"principalId\":\"c742ec85-88fd-49d2-a9b2-4cc8c43c6698\",\"clientId\":\"7f1b5c58-7d49-424d-9e42-f7c6a62689cb\"},\"kkvnipjox\":{\"principalId\":\"675741ff-4394-4785-897d-30bce8aabac5\",\"clientId\":\"9b3b44c2-9d93-41a2-8ab5-887e4058de66\"}}},\"location\":\"nchgej\",\"tags\":{\"ahuxinpm\":\"dmailzydehojw\",\"vcputegj\":\"njaqwixjspro\",\"uuvmkjozkrwfnd\":\"wmfdatscmdvpjhul\"},\"sku\":{\"name\":\"djpslw\",\"tier\":\"Premium\",\"size\":\"vwryoqpso\",\"family\":\"ctazakljlahbcryf\",\"capacity\":1389039399},\"id\":\"osygex\",\"name\":\"aojakhmsbzjhcrz\",\"type\":\"vdphlxaolthqtr\"}")
                .toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("nchgej", model.location());
        Assertions.assertEquals("dmailzydehojw", model.tags().get("ahuxinpm"));
        Assertions.assertEquals("djpslw", model.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.sku().tier());
        Assertions.assertEquals("vwryoqpso", model.sku().size());
        Assertions.assertEquals("ctazakljlahbcryf", model.sku().family());
        Assertions.assertEquals(1389039399, model.sku().capacity());
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ybrk", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("dumjgrtfwvuk", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionInner model =
            new PrivateEndpointConnectionInner()
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.NONE)
                        .withUserAssignedIdentities(
                            mapOf(
                                "jcny",
                                new UserAssignedIdentity(),
                                "kryhtnapczwlokj",
                                new UserAssignedIdentity(),
                                "kkvnipjox",
                                new UserAssignedIdentity())))
                .withLocation("nchgej")
                .withTags(
                    mapOf(
                        "ahuxinpm", "dmailzydehojw", "vcputegj", "njaqwixjspro", "uuvmkjozkrwfnd", "wmfdatscmdvpjhul"))
                .withSku(
                    new Sku()
                        .withName("djpslw")
                        .withTier(SkuTier.PREMIUM)
                        .withSize("vwryoqpso")
                        .withFamily("ctazakljlahbcryf")
                        .withCapacity(1389039399))
                .withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("ybrk")
                        .withActionsRequired("dumjgrtfwvuk"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("nchgej", model.location());
        Assertions.assertEquals("dmailzydehojw", model.tags().get("ahuxinpm"));
        Assertions.assertEquals("djpslw", model.sku().name());
        Assertions.assertEquals(SkuTier.PREMIUM, model.sku().tier());
        Assertions.assertEquals("vwryoqpso", model.sku().size());
        Assertions.assertEquals("ctazakljlahbcryf", model.sku().family());
        Assertions.assertEquals(1389039399, model.sku().capacity());
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ybrk", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("dumjgrtfwvuk", model.privateLinkServiceConnectionState().actionsRequired());
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
