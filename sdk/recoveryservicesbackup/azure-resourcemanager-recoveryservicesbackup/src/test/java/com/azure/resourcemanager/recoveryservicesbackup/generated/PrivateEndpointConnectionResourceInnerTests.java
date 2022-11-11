// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.PrivateEndpointConnectionResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateEndpoint;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateEndpointConnection;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateEndpointConnectionStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProvisioningState;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionResourceInnerTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Failed\",\"privateEndpoint\":{\"id\":\"topbobjogh\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"m\",\"actionRequired\":\"hrzayvvtpgvdf\"}},\"eTag\":\"otkftutqxlngx\",\"location\":\"efgugnxk\",\"tags\":{\"tthzrvqd\":\"qmi\",\"ehoqfbowskan\":\"abhjybi\"},\"id\":\"ktzlcuiywg\",\"name\":\"ywgndrv\",\"type\":\"nhzgpphrcgyn\"}")
                .toObject(PrivateEndpointConnectionResourceInner.class);
        Assertions.assertEquals("efgugnxk", model.location());
        Assertions.assertEquals("qmi", model.tags().get("tthzrvqd"));
        Assertions.assertEquals(ProvisioningState.FAILED, model.properties().provisioningState());
        Assertions.assertEquals("topbobjogh", model.properties().privateEndpoint().id());
        Assertions
            .assertEquals(
                PrivateEndpointConnectionStatus.PENDING,
                model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("m", model.properties().privateLinkServiceConnectionState().description());
        Assertions
            .assertEquals("hrzayvvtpgvdf", model.properties().privateLinkServiceConnectionState().actionRequired());
        Assertions.assertEquals("otkftutqxlngx", model.etag());
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionResourceInner model =
            new PrivateEndpointConnectionResourceInner()
                .withLocation("efgugnxk")
                .withTags(mapOf("tthzrvqd", "qmi", "ehoqfbowskan", "abhjybi"))
                .withProperties(
                    new PrivateEndpointConnection()
                        .withProvisioningState(ProvisioningState.FAILED)
                        .withPrivateEndpoint(new PrivateEndpoint().withId("topbobjogh"))
                        .withPrivateLinkServiceConnectionState(
                            new PrivateLinkServiceConnectionState()
                                .withStatus(PrivateEndpointConnectionStatus.PENDING)
                                .withDescription("m")
                                .withActionRequired("hrzayvvtpgvdf")))
                .withEtag("otkftutqxlngx");
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionResourceInner.class);
        Assertions.assertEquals("efgugnxk", model.location());
        Assertions.assertEquals("qmi", model.tags().get("tthzrvqd"));
        Assertions.assertEquals(ProvisioningState.FAILED, model.properties().provisioningState());
        Assertions.assertEquals("topbobjogh", model.properties().privateEndpoint().id());
        Assertions
            .assertEquals(
                PrivateEndpointConnectionStatus.PENDING,
                model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("m", model.properties().privateLinkServiceConnectionState().description());
        Assertions
            .assertEquals("hrzayvvtpgvdf", model.properties().privateLinkServiceConnectionState().actionRequired());
        Assertions.assertEquals("otkftutqxlngx", model.etag());
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
