// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.models.PrivateEndpointAcl;
import com.azure.resourcemanager.signalr.models.SignalRRequestType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointAclTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointAcl model =
            BinaryData
                .fromString(
                    "{\"name\":\"zvszj\",\"allow\":[\"ServerConnection\",\"ClientConnection\",\"Trace\"],\"deny\":[\"ServerConnection\",\"ServerConnection\"]}")
                .toObject(PrivateEndpointAcl.class);
        Assertions.assertEquals(SignalRRequestType.SERVER_CONNECTION, model.allow().get(0));
        Assertions.assertEquals(SignalRRequestType.SERVER_CONNECTION, model.deny().get(0));
        Assertions.assertEquals("zvszj", model.name());
    }

    @Test
    public void testSerialize() {
        PrivateEndpointAcl model =
            new PrivateEndpointAcl()
                .withAllow(
                    Arrays
                        .asList(
                            SignalRRequestType.SERVER_CONNECTION,
                            SignalRRequestType.CLIENT_CONNECTION,
                            SignalRRequestType.TRACE))
                .withDeny(Arrays.asList(SignalRRequestType.SERVER_CONNECTION, SignalRRequestType.SERVER_CONNECTION))
                .withName("zvszj");
        model = BinaryData.fromObject(model).toObject(PrivateEndpointAcl.class);
        Assertions.assertEquals(SignalRRequestType.SERVER_CONNECTION, model.allow().get(0));
        Assertions.assertEquals(SignalRRequestType.SERVER_CONNECTION, model.deny().get(0));
        Assertions.assertEquals("zvszj", model.name());
    }
}
