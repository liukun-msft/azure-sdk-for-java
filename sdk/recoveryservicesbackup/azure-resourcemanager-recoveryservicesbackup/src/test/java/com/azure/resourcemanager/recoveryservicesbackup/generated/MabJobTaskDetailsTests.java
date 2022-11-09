// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabJobTaskDetails;
import java.time.Duration;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MabJobTaskDetailsTests {
    @Test
    public void testDeserialize() {
        MabJobTaskDetails model =
            BinaryData
                .fromString(
                    "{\"taskId\":\"wkojpllndnpd\",\"startTime\":\"2021-01-15T15:33:07Z\",\"endTime\":\"2021-04-21T23:03:02Z\",\"duration\":\"PT204H2M23S\",\"status\":\"ug\"}")
                .toObject(MabJobTaskDetails.class);
        Assertions.assertEquals("wkojpllndnpd", model.taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-15T15:33:07Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-21T23:03:02Z"), model.endTime());
        Assertions.assertEquals(Duration.parse("PT204H2M23S"), model.duration());
        Assertions.assertEquals("ug", model.status());
    }

    @Test
    public void testSerialize() {
        MabJobTaskDetails model =
            new MabJobTaskDetails()
                .withTaskId("wkojpllndnpd")
                .withStartTime(OffsetDateTime.parse("2021-01-15T15:33:07Z"))
                .withEndTime(OffsetDateTime.parse("2021-04-21T23:03:02Z"))
                .withDuration(Duration.parse("PT204H2M23S"))
                .withStatus("ug");
        model = BinaryData.fromObject(model).toObject(MabJobTaskDetails.class);
        Assertions.assertEquals("wkojpllndnpd", model.taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-15T15:33:07Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-21T23:03:02Z"), model.endTime());
        Assertions.assertEquals(Duration.parse("PT204H2M23S"), model.duration());
        Assertions.assertEquals("ug", model.status());
    }
}
