// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.agrifood.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.agrifood.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.agrifood.models.PrivateEndpoint;
import com.azure.resourcemanager.agrifood.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.agrifood.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionInnerTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"privateEndpoint\":{\"id\":\"zidnsezcxtbzsgfy\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"ewmdw\",\"actionsRequired\":\"eiachboosflnr\"},\"provisioningState\":\"Creating\"},\"id\":\"pteehzzv\",\"name\":\"pyqr\",\"type\":\"mzinpvswjdk\"}")
                .toObject(PrivateEndpointConnectionInner.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.PENDING, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ewmdw", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("eiachboosflnr", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionInner model =
            new PrivateEndpointConnectionInner()
                .withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                        .withDescription("ewmdw")
                        .withActionsRequired("eiachboosflnr"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.PENDING, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("ewmdw", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("eiachboosflnr", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
