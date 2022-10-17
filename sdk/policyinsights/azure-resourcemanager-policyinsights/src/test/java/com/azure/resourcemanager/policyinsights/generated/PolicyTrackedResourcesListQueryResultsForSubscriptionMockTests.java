// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.PolicyInsightsManager;
import com.azure.resourcemanager.policyinsights.models.PolicyTrackedResource;
import com.azure.resourcemanager.policyinsights.models.PolicyTrackedResourcesResourceType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PolicyTrackedResourcesListQueryResultsForSubscriptionMockTests {
    @Test
    public void testListQueryResultsForSubscription() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"trackedResourceId\":\"a\",\"policyDetails\":{\"policyDefinitionId\":\"mqhldvrii\",\"policyAssignmentId\":\"jnalghf\",\"policyAssignmentDisplayName\":\"tvsexsowuel\",\"policyAssignmentScope\":\"hhahhxvrhmzkwpjg\",\"policySetDefinitionId\":\"spughftqsxhq\",\"policyDefinitionReferenceId\":\"j\"},\"createdBy\":{\"policyDetails\":{\"policyDefinitionId\":\"dxdigr\",\"policyAssignmentId\":\"uufzdmsyqtfihw\",\"policyAssignmentDisplayName\":\"otzi\",\"policyAssignmentScope\":\"amvpphoszqzudph\",\"policySetDefinitionId\":\"mvdk\",\"policyDefinitionReferenceId\":\"ynwcvtbv\"},\"deploymentId\":\"yhmtnvyqiat\",\"deploymentTime\":\"2021-08-14T21:24:19Z\"},\"lastModifiedBy\":{\"policyDetails\":{\"policyDefinitionId\":\"p\",\"policyAssignmentId\":\"cjaesgvvs\",\"policyAssignmentDisplayName\":\"yajguqfhwygzlv\",\"policyAssignmentScope\":\"kfxu\",\"policySetDefinitionId\":\"mdwzrmuhapfcqdps\",\"policyDefinitionReferenceId\":\"qvpsvuoymg\"},\"deploymentId\":\"elvezrypq\",\"deploymentTime\":\"2021-06-02T23:04:04Z\"},\"lastUpdateUtc\":\"2021-09-01T12:22:40Z\"}]}";

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

        PolicyInsightsManager manager =
            PolicyInsightsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PolicyTrackedResource> response =
            manager
                .policyTrackedResources()
                .listQueryResultsForSubscription(
                    PolicyTrackedResourcesResourceType.DEFAULT, 1421362478, "zfjvfbgofe", Context.NONE);
    }
}
