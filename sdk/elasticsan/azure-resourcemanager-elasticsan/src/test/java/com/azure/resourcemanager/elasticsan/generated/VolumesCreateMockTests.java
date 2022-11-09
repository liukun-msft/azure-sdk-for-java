// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.elasticsan.ElasticSanManager;
import com.azure.resourcemanager.elasticsan.models.SourceCreationData;
import com.azure.resourcemanager.elasticsan.models.Volume;
import com.azure.resourcemanager.elasticsan.models.VolumeCreateOption;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class VolumesCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"volumeId\":\"tdhxujznbmpowuwp\",\"creationData\":{\"createSource\":\"None\",\"sourceUri\":\"eualupjmkhf\"},\"sizeGiB\":3301190446287542210,\"storageTarget\":{\"targetIqn\":\"wsrtjriplrbpbe\",\"targetPortalHostname\":\"ghfg\",\"targetPortalPort\":107282315,\"provisioningState\":\"Creating\",\"status\":\"Stopped\"}},\"tags\":{\"egibtnmxiebww\":\"qhjk\"},\"id\":\"loayqcgw\",\"name\":\"tzjuzgwyzmhtxo\",\"type\":\"gmtsavjcbpwxqpsr\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ElasticSanManager manager =
            ElasticSanManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Volume response =
            manager
                .volumes()
                .define("bnbbeldawkz")
                .withExistingVolumegroup("rcrgvx", "vgomz", "fmisg")
                .withTags(mapOf("wjue", "uojgj", "x", "otwmcdyt", "nrjawgqwg", "it"))
                .withCreationData(
                    new SourceCreationData().withCreateSource(VolumeCreateOption.NONE).withSourceUri("kauhashsfwxo"))
                .withSizeGiB(499852451661669688L)
                .create();

        Assertions.assertEquals("qhjk", response.tags().get("egibtnmxiebww"));
        Assertions.assertEquals(VolumeCreateOption.NONE, response.creationData().createSource());
        Assertions.assertEquals("eualupjmkhf", response.creationData().sourceUri());
        Assertions.assertEquals(3301190446287542210L, response.sizeGiB());
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
