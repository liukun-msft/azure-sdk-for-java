// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.kusto.KustoManager;
import com.azure.resourcemanager.kusto.models.AzureSkuName;
import com.azure.resourcemanager.kusto.models.AzureSkuTier;
import com.azure.resourcemanager.kusto.models.Cluster;
import com.azure.resourcemanager.kusto.models.ClusterNetworkAccessFlag;
import com.azure.resourcemanager.kusto.models.EngineType;
import com.azure.resourcemanager.kusto.models.IdentityType;
import com.azure.resourcemanager.kusto.models.PublicIpType;
import com.azure.resourcemanager.kusto.models.PublicNetworkAccess;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ClustersListTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"sku\":{\"name\":\"Standard_E64i_v3\",\"capacity\":1894572195,\"tier\":\"Standard\"},\"zones\":[\"m\",\"xmaehvbbxu\",\"iplt\"],\"identity\":{\"principalId\":\"tbaxk\",\"tenantId\":\"ywrckp\",\"type\":\"None\",\"userAssignedIdentities\":{}},\"properties\":{\"state\":\"Deleting\",\"provisioningState\":\"Running\",\"uri\":\"pvruudlg\",\"dataIngestionUri\":\"bth\",\"stateReason\":\"tgk\",\"trustedExternalTenants\":[],\"optimizedAutoscale\":{\"version\":1139587975,\"isEnabled\":true,\"minimum\":1128262143,\"maximum\":318971885},\"enableDiskEncryption\":true,\"enableStreamingIngest\":true,\"virtualNetworkConfiguration\":{\"subnetId\":\"bcvhzlhpl\",\"enginePublicIpId\":\"dqkdlwwqfbu\",\"dataManagementPublicIpId\":\"lkxt\"},\"keyVaultProperties\":{\"keyName\":\"fsmlmbtxhwgfw\",\"keyVersion\":\"tawc\",\"keyVaultUri\":\"zbrhubskhudyg\",\"userIdentity\":\"okkqfqjbvleo\"},\"enablePurge\":false,\"languageExtensions\":{\"value\":[]},\"enableDoubleEncryption\":true,\"publicNetworkAccess\":\"Enabled\",\"allowedIpRangeList\":[\"avyvnqqyba\"],\"engineType\":\"V3\",\"acceptedAudiences\":[],\"enableAutoStop\":false,\"restrictOutboundNetworkAccess\":\"Disabled\",\"allowedFqdnList\":[\"qgzsles\",\"cbhernntiewdj\",\"vbquwr\",\"ehwagoh\"],\"publicIPType\":\"IPv4\",\"virtualClusterGraduationProperties\":\"kmr\",\"privateEndpointConnections\":[]},\"etag\":\"vhmxtdrjfu\",\"location\":\"acoebj\",\"tags\":{\"draufactkah\":\"zcjznmwcpmgua\",\"neekulfg\":\"ovajjziuxxps\",\"d\":\"lqubkwdlen\",\"pjuohminyfl\":\"utujba\"},\"id\":\"orwmduvwpklv\",\"name\":\"w\",\"type\":\"ygdxpgpqchis\"}]}";

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

        KustoManager manager =
            KustoManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Cluster> response = manager.clusters().list(Context.NONE);

        Assertions.assertEquals("acoebj", response.iterator().next().location());
        Assertions.assertEquals("zcjznmwcpmgua", response.iterator().next().tags().get("draufactkah"));
        Assertions.assertEquals(AzureSkuName.STANDARD_E64I_V3, response.iterator().next().sku().name());
        Assertions.assertEquals(1894572195, response.iterator().next().sku().capacity());
        Assertions.assertEquals(AzureSkuTier.STANDARD, response.iterator().next().sku().tier());
        Assertions.assertEquals("m", response.iterator().next().zones().get(0));
        Assertions.assertEquals(IdentityType.NONE, response.iterator().next().identity().type());
        Assertions.assertEquals(1139587975, response.iterator().next().optimizedAutoscale().version());
        Assertions.assertEquals(true, response.iterator().next().optimizedAutoscale().isEnabled());
        Assertions.assertEquals(1128262143, response.iterator().next().optimizedAutoscale().minimum());
        Assertions.assertEquals(318971885, response.iterator().next().optimizedAutoscale().maximum());
        Assertions.assertEquals(true, response.iterator().next().enableDiskEncryption());
        Assertions.assertEquals(true, response.iterator().next().enableStreamingIngest());
        Assertions.assertEquals("bcvhzlhpl", response.iterator().next().virtualNetworkConfiguration().subnetId());
        Assertions
            .assertEquals("dqkdlwwqfbu", response.iterator().next().virtualNetworkConfiguration().enginePublicIpId());
        Assertions
            .assertEquals("lkxt", response.iterator().next().virtualNetworkConfiguration().dataManagementPublicIpId());
        Assertions.assertEquals("fsmlmbtxhwgfw", response.iterator().next().keyVaultProperties().keyName());
        Assertions.assertEquals("tawc", response.iterator().next().keyVaultProperties().keyVersion());
        Assertions.assertEquals("zbrhubskhudyg", response.iterator().next().keyVaultProperties().keyVaultUri());
        Assertions.assertEquals("okkqfqjbvleo", response.iterator().next().keyVaultProperties().userIdentity());
        Assertions.assertEquals(false, response.iterator().next().enablePurge());
        Assertions.assertEquals(true, response.iterator().next().enableDoubleEncryption());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, response.iterator().next().publicNetworkAccess());
        Assertions.assertEquals("avyvnqqyba", response.iterator().next().allowedIpRangeList().get(0));
        Assertions.assertEquals(EngineType.V3, response.iterator().next().engineType());
        Assertions.assertEquals(false, response.iterator().next().enableAutoStop());
        Assertions
            .assertEquals(
                ClusterNetworkAccessFlag.DISABLED, response.iterator().next().restrictOutboundNetworkAccess());
        Assertions.assertEquals("qgzsles", response.iterator().next().allowedFqdnList().get(0));
        Assertions.assertEquals(PublicIpType.IPV4, response.iterator().next().publicIpType());
        Assertions.assertEquals("kmr", response.iterator().next().virtualClusterGraduationProperties());
    }
}
