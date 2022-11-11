// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailyRetentionFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.Day;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DailyRetentionFormatTests {
    @Test
    public void testDeserialize() {
        DailyRetentionFormat model =
            BinaryData
                .fromString(
                    "{\"daysOfTheMonth\":[{\"date\":24191265,\"isLast\":true},{\"date\":1410759489,\"isLast\":false},{\"date\":2048724944,\"isLast\":false}]}")
                .toObject(DailyRetentionFormat.class);
        Assertions.assertEquals(24191265, model.daysOfTheMonth().get(0).date());
        Assertions.assertEquals(true, model.daysOfTheMonth().get(0).isLast());
    }

    @Test
    public void testSerialize() {
        DailyRetentionFormat model =
            new DailyRetentionFormat()
                .withDaysOfTheMonth(
                    Arrays
                        .asList(
                            new Day().withDate(24191265).withIsLast(true),
                            new Day().withDate(1410759489).withIsLast(false),
                            new Day().withDate(2048724944).withIsLast(false)));
        model = BinaryData.fromObject(model).toObject(DailyRetentionFormat.class);
        Assertions.assertEquals(24191265, model.daysOfTheMonth().get(0).date());
        Assertions.assertEquals(true, model.daysOfTheMonth().get(0).isLast());
    }
}
