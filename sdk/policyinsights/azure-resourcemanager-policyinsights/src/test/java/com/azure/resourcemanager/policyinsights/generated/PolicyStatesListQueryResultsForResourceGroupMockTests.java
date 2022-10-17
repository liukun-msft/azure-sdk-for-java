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
import com.azure.resourcemanager.policyinsights.models.PolicyState;
import com.azure.resourcemanager.policyinsights.models.PolicyStatesResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PolicyStatesListQueryResultsForResourceGroupMockTests {
    @Test
    public void testListQueryResultsForResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"@odata.id\":\"ndfcpfn\",\"@odata.context\":\"thjtwk\",\"timestamp\":\"2021-03-31T04:06:02Z\",\"resourceId\":\"rxuzvoam\",\"policyAssignmentId\":\"cqiosmgbza\",\"policyDefinitionId\":\"xqdlyrtltlapr\",\"effectiveParameters\":\"zkatb\",\"isCompliant\":true,\"subscriptionId\":\"nnbsoqeqa\",\"resourceType\":\"rvlagunbtgfebwln\",\"resourceLocation\":\"hyreeu\",\"resourceGroup\":\"qavbpdqmj\",\"resourceTags\":\"yyzglgouwtlmjjy\",\"policyAssignmentName\":\"j\",\"policyAssignmentOwner\":\"obaxkjeytu\",\"policyAssignmentParameters\":\"bfjkw\",\"policyAssignmentScope\":\"snkq\",\"policyDefinitionName\":\"syrq\",\"policyDefinitionAction\":\"jqhden\",\"policyDefinitionCategory\":\"ulkpakd\",\"policySetDefinitionId\":\"fmjnnawtqa\",\"policySetDefinitionName\":\"xuckpggqoweyir\",\"policySetDefinitionOwner\":\"lisn\",\"policySetDefinitionCategory\":\"fl\",\"policySetDefinitionParameters\":\"mpizru\",\"managementGroupIds\":\"pqxpx\",\"policyDefinitionReferenceId\":\"fcngjsa\",\"complianceState\":\"iixtmkzj\",\"policyEvaluationDetails\":{\"evaluatedExpressions\":[],\"ifNotExistsDetails\":{\"resourceId\":\"hgfgrwsd\",\"totalResources\":360439780}},\"policyDefinitionGroupNames\":[\"zvzbglbyv\"],\"components\":[{\"id\":\"tbrxkjz\",\"type\":\"gxffmshkwf\",\"name\":\"gozxw\",\"timestamp\":\"2021-06-23T15:52:15Z\",\"complianceState\":\"yd\",\"\":{}},{\"id\":\"aclnapxbiygnugj\",\"type\":\"fsmfcttuxuuyi\",\"name\":\"lq\",\"timestamp\":\"2021-01-23T22:11:32Z\",\"complianceState\":\"vrehmrnjhvsujzt\",\"\":{}},{\"id\":\"qjtwhauu\",\"type\":\"prnjletlxsmr\",\"name\":\"do\",\"timestamp\":\"2021-04-29T17:32:24Z\",\"complianceState\":\"mowaziynknlqwzdv\",\"\":{}},{\"id\":\"xqszdtmaajquh\",\"type\":\"ylr\",\"name\":\"m\",\"timestamp\":\"2021-04-02T01:51:44Z\",\"complianceState\":\"bmzyospsps\",\"\":{}}],\"policyDefinitionVersion\":\"kyjpmspbps\",\"policySetDefinitionVersion\":\"fppyogtieyujtvcz\",\"policyAssignmentVersion\":\"n\",\"\":{}}]}";

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

        PagedIterable<PolicyState> response =
            manager
                .policyStates()
                .listQueryResultsForResourceGroup(
                    PolicyStatesResource.LATEST,
                    "pelnjetag",
                    "tsxoatftgz",
                    1034709707,
                    "pbswvefloccsrm",
                    "zihmipgawtxxpky",
                    OffsetDateTime.parse("2021-06-09T22:40:53Z"),
                    OffsetDateTime.parse("2021-05-09T23:26:24Z"),
                    "cjxgrytf",
                    "pcycilrmcaykg",
                    "noxuztrksx",
                    Context.NONE);

        Assertions.assertEquals(OffsetDateTime.parse("2021-03-31T04:06:02Z"), response.iterator().next().timestamp());
        Assertions.assertEquals("rxuzvoam", response.iterator().next().resourceId());
        Assertions.assertEquals("cqiosmgbza", response.iterator().next().policyAssignmentId());
        Assertions.assertEquals("xqdlyrtltlapr", response.iterator().next().policyDefinitionId());
        Assertions.assertEquals("zkatb", response.iterator().next().effectiveParameters());
        Assertions.assertEquals(true, response.iterator().next().isCompliant());
        Assertions.assertEquals("nnbsoqeqa", response.iterator().next().subscriptionId());
        Assertions.assertEquals("rvlagunbtgfebwln", response.iterator().next().resourceType());
        Assertions.assertEquals("hyreeu", response.iterator().next().resourceLocation());
        Assertions.assertEquals("qavbpdqmj", response.iterator().next().resourceGroup());
        Assertions.assertEquals("yyzglgouwtlmjjy", response.iterator().next().resourceTags());
        Assertions.assertEquals("j", response.iterator().next().policyAssignmentName());
        Assertions.assertEquals("obaxkjeytu", response.iterator().next().policyAssignmentOwner());
        Assertions.assertEquals("bfjkw", response.iterator().next().policyAssignmentParameters());
        Assertions.assertEquals("snkq", response.iterator().next().policyAssignmentScope());
        Assertions.assertEquals("syrq", response.iterator().next().policyDefinitionName());
        Assertions.assertEquals("jqhden", response.iterator().next().policyDefinitionAction());
        Assertions.assertEquals("ulkpakd", response.iterator().next().policyDefinitionCategory());
        Assertions.assertEquals("fmjnnawtqa", response.iterator().next().policySetDefinitionId());
        Assertions.assertEquals("xuckpggqoweyir", response.iterator().next().policySetDefinitionName());
        Assertions.assertEquals("lisn", response.iterator().next().policySetDefinitionOwner());
        Assertions.assertEquals("fl", response.iterator().next().policySetDefinitionCategory());
        Assertions.assertEquals("mpizru", response.iterator().next().policySetDefinitionParameters());
        Assertions.assertEquals("pqxpx", response.iterator().next().managementGroupIds());
        Assertions.assertEquals("fcngjsa", response.iterator().next().policyDefinitionReferenceId());
        Assertions.assertEquals("iixtmkzj", response.iterator().next().complianceState());
        Assertions
            .assertEquals(
                "hgfgrwsd", response.iterator().next().policyEvaluationDetails().ifNotExistsDetails().resourceId());
        Assertions
            .assertEquals(
                360439780, response.iterator().next().policyEvaluationDetails().ifNotExistsDetails().totalResources());
        Assertions.assertEquals("zvzbglbyv", response.iterator().next().policyDefinitionGroupNames().get(0));
        Assertions.assertEquals("tbrxkjz", response.iterator().next().components().get(0).id());
        Assertions.assertEquals("gxffmshkwf", response.iterator().next().components().get(0).type());
        Assertions.assertEquals("gozxw", response.iterator().next().components().get(0).name());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-06-23T15:52:15Z"),
                response.iterator().next().components().get(0).timestamp());
        Assertions.assertEquals("yd", response.iterator().next().components().get(0).complianceState());
    }
}
