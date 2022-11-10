// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.ComponentVersion;
import com.azure.resourcemanager.machinelearning.models.ComponentVersionProperties;
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

public final class ComponentVersionsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"componentSpec\":\"dataudpabcreuwzos\",\"isAnonymous\":false,\"isArchived\":false,\"description\":\"vasormrexzvdubew\",\"properties\":{\"ovsdqhzrtdbakrli\":\"gbaduve\",\"ifjmclngygnh\":\"zfvppkeq\"},\"tags\":{\"oqtrotpvclpo\":\"mbcdtajdopggorw\",\"xjgvh\":\"yrlmwkptsk\",\"ookbpu\":\"ccbmkakm\",\"kmlwkt\":\"mgvmuy\"}},\"id\":\"wzkroyrdurxfl\",\"name\":\"qjimejtgzjxxlfej\",\"type\":\"zuqloiwyayyzivr\"}";

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

        MachineLearningManager manager =
            MachineLearningManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ComponentVersion response =
            manager
                .componentVersions()
                .define("zkn")
                .withExistingComponent("jzkcasfwzcntog", "fjwajnrt", "zvaqkifmxawost")
                .withProperties(
                    new ComponentVersionProperties()
                        .withDescription("fnqqwyp")
                        .withProperties(mapOf("b", "r"))
                        .withTags(mapOf("wjfkainjmuym", "tggrss", "gmusaictdscnkzzo", "ecvztsc"))
                        .withIsAnonymous(false)
                        .withIsArchived(true)
                        .withComponentSpec("datakmjqncfvdsc"))
                .create();

        Assertions.assertEquals("vasormrexzvdubew", response.properties().description());
        Assertions.assertEquals("gbaduve", response.properties().properties().get("ovsdqhzrtdbakrli"));
        Assertions.assertEquals("mbcdtajdopggorw", response.properties().tags().get("oqtrotpvclpo"));
        Assertions.assertEquals(false, response.properties().isAnonymous());
        Assertions.assertEquals(false, response.properties().isArchived());
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
