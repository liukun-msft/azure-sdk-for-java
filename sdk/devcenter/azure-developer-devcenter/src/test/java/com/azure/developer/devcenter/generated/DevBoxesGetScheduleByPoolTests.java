// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class DevBoxesGetScheduleByPoolTests extends DevCenterClientTestBase {
    @Test
    @Disabled
    public void testDevBoxesGetScheduleByPoolTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                devBoxesClient.getScheduleByPoolWithResponse("myProject", "DevPool", "{scheduleName}", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"name\":\"{scheduleName}\",\"type\":\"StopDevBox\",\"frequency\":\"Daily\",\"time\":\"17:30\",\"timeZone\":\"America/Los_Angeles\"}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
