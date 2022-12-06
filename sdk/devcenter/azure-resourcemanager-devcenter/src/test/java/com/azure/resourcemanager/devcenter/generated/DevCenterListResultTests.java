// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.DevCenterListResult;
import org.junit.jupiter.api.Test;

public final class DevCenterListResultTests {
    @Test
    public void testDeserialize() {
        DevCenterListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Accepted\",\"devCenterUri\":\"gjxpybczmehmt\"},\"identity\":{\"principalId\":\"084be245-8a2b-45fc-82bb-bd6db1eb398a\",\"tenantId\":\"f3b48b54-e277-4901-981d-cf0bb4267060\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"rupidgsyb\",\"tags\":{\"xaobhdxbmtqioqjz\":\"hphoycm\",\"ownoizhw\":\"htbmuf\"},\"id\":\"rxybqsoq\",\"name\":\"jgkdmbpazlobcu\",\"type\":\"pdznrbtcqqjnqgl\"},{\"properties\":{\"provisioningState\":\"Creating\",\"devCenterUri\":\"foooj\"},\"identity\":{\"principalId\":\"03475844-5760-4648-9ca8-465bbab16ebd\",\"tenantId\":\"fe49a613-19e9-4d6c-96f1-d652ec462cc0\",\"type\":\"None\",\"userAssignedIdentities\":{}},\"location\":\"saagdf\",\"tags\":{\"izntocipao\":\"zlhjxrifkwmrvkt\"},\"id\":\"ajpsquc\",\"name\":\"poyfdkfogkn\",\"type\":\"gjofjd\"},{\"properties\":{\"provisioningState\":\"NotSpecified\",\"devCenterUri\":\"deupewnwrei\"},\"identity\":{\"principalId\":\"ce989883-7976-4a7e-9a50-f7969f5764bd\",\"tenantId\":\"413da7af-7575-47cf-bf21-15a5ccc86186\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"sarhmofc\",\"tags\":{\"rkdtmlxh\":\"my\"},\"id\":\"kuksjtxukcdm\",\"name\":\"arcryuanzwuxzdxt\",\"type\":\"yrlhmwhfpmrqobm\"}],\"nextLink\":\"kknryrtihf\"}")
                .toObject(DevCenterListResult.class);
    }

    @Test
    public void testSerialize() {
        DevCenterListResult model = new DevCenterListResult();
        model = BinaryData.fromObject(model).toObject(DevCenterListResult.class);
    }
}
