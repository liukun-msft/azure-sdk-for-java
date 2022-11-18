// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.AclAction;
import com.azure.resourcemanager.webpubsub.models.NetworkAcl;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpointAcl;
import com.azure.resourcemanager.webpubsub.models.WebPubSubNetworkACLs;
import com.azure.resourcemanager.webpubsub.models.WebPubSubRequestType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WebPubSubNetworkACLsTests {
    @Test
    public void testDeserialize() {
        WebPubSubNetworkACLs model =
            BinaryData
                .fromString(
                    "{\"defaultAction\":\"Allow\",\"publicNetwork\":{\"allow\":[\"ClientConnection\",\"RESTAPI\"],\"deny\":[\"Trace\"]},\"privateEndpoints\":[{\"name\":\"azqugxywpmueefj\",\"allow\":[\"RESTAPI\",\"RESTAPI\"],\"deny\":[\"Trace\",\"ClientConnection\",\"RESTAPI\"]},{\"name\":\"suyonobglaocq\",\"allow\":[\"ServerConnection\"],\"deny\":[\"RESTAPI\"]},{\"name\":\"udxytlmoyrx\",\"allow\":[\"ClientConnection\",\"ClientConnection\"],\"deny\":[\"ServerConnection\"]},{\"name\":\"ntxhdzhlrqjbhck\",\"allow\":[\"ServerConnection\",\"ServerConnection\",\"RESTAPI\"],\"deny\":[\"ClientConnection\",\"Trace\"]}]}")
                .toObject(WebPubSubNetworkACLs.class);
        Assertions.assertEquals(AclAction.ALLOW, model.defaultAction());
        Assertions.assertEquals(WebPubSubRequestType.CLIENT_CONNECTION, model.publicNetwork().allow().get(0));
        Assertions.assertEquals(WebPubSubRequestType.TRACE, model.publicNetwork().deny().get(0));
        Assertions.assertEquals(WebPubSubRequestType.RESTAPI, model.privateEndpoints().get(0).allow().get(0));
        Assertions.assertEquals(WebPubSubRequestType.TRACE, model.privateEndpoints().get(0).deny().get(0));
        Assertions.assertEquals("azqugxywpmueefj", model.privateEndpoints().get(0).name());
    }

    @Test
    public void testSerialize() {
        WebPubSubNetworkACLs model =
            new WebPubSubNetworkACLs()
                .withDefaultAction(AclAction.ALLOW)
                .withPublicNetwork(
                    new NetworkAcl()
                        .withAllow(Arrays.asList(WebPubSubRequestType.CLIENT_CONNECTION, WebPubSubRequestType.RESTAPI))
                        .withDeny(Arrays.asList(WebPubSubRequestType.TRACE)))
                .withPrivateEndpoints(
                    Arrays
                        .asList(
                            new PrivateEndpointAcl()
                                .withAllow(Arrays.asList(WebPubSubRequestType.RESTAPI, WebPubSubRequestType.RESTAPI))
                                .withDeny(
                                    Arrays
                                        .asList(
                                            WebPubSubRequestType.TRACE,
                                            WebPubSubRequestType.CLIENT_CONNECTION,
                                            WebPubSubRequestType.RESTAPI))
                                .withName("azqugxywpmueefj"),
                            new PrivateEndpointAcl()
                                .withAllow(Arrays.asList(WebPubSubRequestType.SERVER_CONNECTION))
                                .withDeny(Arrays.asList(WebPubSubRequestType.RESTAPI))
                                .withName("suyonobglaocq"),
                            new PrivateEndpointAcl()
                                .withAllow(
                                    Arrays
                                        .asList(
                                            WebPubSubRequestType.CLIENT_CONNECTION,
                                            WebPubSubRequestType.CLIENT_CONNECTION))
                                .withDeny(Arrays.asList(WebPubSubRequestType.SERVER_CONNECTION))
                                .withName("udxytlmoyrx"),
                            new PrivateEndpointAcl()
                                .withAllow(
                                    Arrays
                                        .asList(
                                            WebPubSubRequestType.SERVER_CONNECTION,
                                            WebPubSubRequestType.SERVER_CONNECTION,
                                            WebPubSubRequestType.RESTAPI))
                                .withDeny(
                                    Arrays.asList(WebPubSubRequestType.CLIENT_CONNECTION, WebPubSubRequestType.TRACE))
                                .withName("ntxhdzhlrqjbhck")));
        model = BinaryData.fromObject(model).toObject(WebPubSubNetworkACLs.class);
        Assertions.assertEquals(AclAction.ALLOW, model.defaultAction());
        Assertions.assertEquals(WebPubSubRequestType.CLIENT_CONNECTION, model.publicNetwork().allow().get(0));
        Assertions.assertEquals(WebPubSubRequestType.TRACE, model.publicNetwork().deny().get(0));
        Assertions.assertEquals(WebPubSubRequestType.RESTAPI, model.privateEndpoints().get(0).allow().get(0));
        Assertions.assertEquals(WebPubSubRequestType.TRACE, model.privateEndpoints().get(0).deny().get(0));
        Assertions.assertEquals("azqugxywpmueefj", model.privateEndpoints().get(0).name());
    }
}
