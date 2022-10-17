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
import com.azure.resourcemanager.policyinsights.models.PolicyEvent;
import com.azure.resourcemanager.policyinsights.models.PolicyEventsResourceType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PolicyEventsListQueryResultsForResourceGroupLevelPolicyAssignmentMockTests {
    @Test
    public void testListQueryResultsForResourceGroupLevelPolicyAssignment() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"@odata.id\":\"fqwmkyoquf\",\"@odata.context\":\"ruzslzoj\",\"timestamp\":\"2021-11-19T14:44:25Z\",\"resourceId\":\"fnmdxotn\",\"policyAssignmentId\":\"dgug\",\"policyDefinitionId\":\"zihgrkyu\",\"effectiveParameters\":\"absnmfpp\",\"isCompliant\":false,\"subscriptionId\":\"evy\",\"resourceType\":\"hsgz\",\"resourceLocation\":\"zbgomfgbeg\",\"resourceGroup\":\"gleohi\",\"resourceTags\":\"tnluankrr\",\"policyAssignmentName\":\"eeebtijvacv\",\"policyAssignmentOwner\":\"qzbqqxlajrnwxa\",\"policyAssignmentParameters\":\"veh\",\"policyAssignmentScope\":\"uyxoaf\",\"policyDefinitionName\":\"oqltfae\",\"policyDefinitionAction\":\"inmfgvxirp\",\"policyDefinitionCategory\":\"riypoqeyhlqhyk\",\"policySetDefinitionId\":\"lpyznuciqdsmexi\",\"policySetDefinitionName\":\"dfuxtya\",\"policySetDefinitionOwner\":\"ibmi\",\"policySetDefinitionCategory\":\"nnust\",\"policySetDefinitionParameters\":\"ljhnmgixhcmav\",\"managementGroupIds\":\"foudor\",\"policyDefinitionReferenceId\":\"gyyprotwy\",\"complianceState\":\"ndm\",\"tenantId\":\"hu\",\"principalOid\":\"mjkavlgorbmft\",\"components\":[{\"id\":\"zfjltfvnzcyjto\",\"type\":\"vopvp\",\"name\":\"bzqgqqi\",\"timestamp\":\"2021-11-17T02:49:04Z\",\"tenantId\":\"vqwt\",\"principalOid\":\"ky\",\"policyDefinitionAction\":\"cysihs\",\"\":{}},{\"id\":\"dhohsdtmcdzsuf\",\"type\":\"hdxbzlm\",\"name\":\"uapcvhdbevwqqxe\",\"timestamp\":\"2021-10-13T15:46:58Z\",\"tenantId\":\"nqzi\",\"principalOid\":\"fkbg\",\"policyDefinitionAction\":\"bowxe\",\"\":{}},{\"id\":\"jmygvk\",\"type\":\"kjjeokbz\",\"name\":\"ezrxcczurtleipqx\",\"timestamp\":\"2021-09-05T03:07:28Z\",\"tenantId\":\"zgnzv\",\"principalOid\":\"bzdixzmq\",\"policyDefinitionAction\":\"odawopqhewjptmcg\",\"\":{}},{\"id\":\"t\",\"type\":\"lnd\",\"name\":\"tutmzl\",\"timestamp\":\"2021-08-29T17:52:22Z\",\"tenantId\":\"lvfhrbbp\",\"principalOid\":\"qvcww\",\"policyDefinitionAction\":\"urmochpprprs\",\"\":{}}],\"\":{}}]}";

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

        PagedIterable<PolicyEvent> response =
            manager
                .policyEvents()
                .listQueryResultsForResourceGroupLevelPolicyAssignment(
                    PolicyEventsResourceType.DEFAULT,
                    "rqbnjjrc",
                    "egy",
                    "cw",
                    64469059,
                    "xjumvq",
                    "olihrra",
                    OffsetDateTime.parse("2021-11-30T11:24:50Z"),
                    OffsetDateTime.parse("2021-05-20T12:59:42Z"),
                    "aubrjtloq",
                    "fuojrngif",
                    "rzpasccbiuimzdly",
                    Context.NONE);

        Assertions.assertEquals(OffsetDateTime.parse("2021-11-19T14:44:25Z"), response.iterator().next().timestamp());
        Assertions.assertEquals("fnmdxotn", response.iterator().next().resourceId());
        Assertions.assertEquals("dgug", response.iterator().next().policyAssignmentId());
        Assertions.assertEquals("zihgrkyu", response.iterator().next().policyDefinitionId());
        Assertions.assertEquals("absnmfpp", response.iterator().next().effectiveParameters());
        Assertions.assertEquals(false, response.iterator().next().isCompliant());
        Assertions.assertEquals("evy", response.iterator().next().subscriptionId());
        Assertions.assertEquals("hsgz", response.iterator().next().resourceType());
        Assertions.assertEquals("zbgomfgbeg", response.iterator().next().resourceLocation());
        Assertions.assertEquals("gleohi", response.iterator().next().resourceGroup());
        Assertions.assertEquals("tnluankrr", response.iterator().next().resourceTags());
        Assertions.assertEquals("eeebtijvacv", response.iterator().next().policyAssignmentName());
        Assertions.assertEquals("qzbqqxlajrnwxa", response.iterator().next().policyAssignmentOwner());
        Assertions.assertEquals("veh", response.iterator().next().policyAssignmentParameters());
        Assertions.assertEquals("uyxoaf", response.iterator().next().policyAssignmentScope());
        Assertions.assertEquals("oqltfae", response.iterator().next().policyDefinitionName());
        Assertions.assertEquals("inmfgvxirp", response.iterator().next().policyDefinitionAction());
        Assertions.assertEquals("riypoqeyhlqhyk", response.iterator().next().policyDefinitionCategory());
        Assertions.assertEquals("lpyznuciqdsmexi", response.iterator().next().policySetDefinitionId());
        Assertions.assertEquals("dfuxtya", response.iterator().next().policySetDefinitionName());
        Assertions.assertEquals("ibmi", response.iterator().next().policySetDefinitionOwner());
        Assertions.assertEquals("nnust", response.iterator().next().policySetDefinitionCategory());
        Assertions.assertEquals("ljhnmgixhcmav", response.iterator().next().policySetDefinitionParameters());
        Assertions.assertEquals("foudor", response.iterator().next().managementGroupIds());
        Assertions.assertEquals("gyyprotwy", response.iterator().next().policyDefinitionReferenceId());
        Assertions.assertEquals("ndm", response.iterator().next().complianceState());
        Assertions.assertEquals("hu", response.iterator().next().tenantId());
        Assertions.assertEquals("mjkavlgorbmft", response.iterator().next().principalOid());
        Assertions.assertEquals("zfjltfvnzcyjto", response.iterator().next().components().get(0).id());
        Assertions.assertEquals("vopvp", response.iterator().next().components().get(0).type());
        Assertions.assertEquals("bzqgqqi", response.iterator().next().components().get(0).name());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-11-17T02:49:04Z"),
                response.iterator().next().components().get(0).timestamp());
        Assertions.assertEquals("vqwt", response.iterator().next().components().get(0).tenantId());
        Assertions.assertEquals("ky", response.iterator().next().components().get(0).principalOid());
        Assertions.assertEquals("cysihs", response.iterator().next().components().get(0).policyDefinitionAction());
    }
}
