// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSapHanaRecoveryPoint;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointMoveReadinessInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierInformationV2;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestorePointType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureWorkloadSapHanaRecoveryPointTests {
    @Test
    public void testDeserialize() {
        AzureWorkloadSapHanaRecoveryPoint model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSAPHanaRecoveryPoint\",\"recoveryPointTimeInUTC\":\"2021-05-21T00:13:57Z\",\"type\":\"SnapshotFull\",\"recoveryPointTierDetails\":[{\"type\":\"Invalid\",\"status\":\"Valid\",\"extendedInfo\":{\"tnsi\":\"d\",\"z\":\"ud\",\"kdlpa\":\"mes\",\"dfgsftufqobrj\":\"zrcxfailcfxwmdbo\"}}],\"recoveryPointMoveReadinessInfo\":{\"nrzvuljraaer\":{\"isReadyForMove\":true,\"additionalInfo\":\"ckknhxkizvy\"},\"roylaxxu\":{\"isReadyForMove\":true,\"additionalInfo\":\"qgukkjqnv\"},\"hryvy\":{\"isReadyForMove\":true,\"additionalInfo\":\"sdosfjbjsvgjr\"}}}")
                .toObject(AzureWorkloadSapHanaRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-21T00:13:57Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.SNAPSHOT_FULL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.INVALID, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.VALID, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("d", model.recoveryPointTierDetails().get(0).extendedInfo().get("tnsi"));
        Assertions.assertEquals(true, model.recoveryPointMoveReadinessInfo().get("nrzvuljraaer").isReadyForMove());
        Assertions
            .assertEquals("ckknhxkizvy", model.recoveryPointMoveReadinessInfo().get("nrzvuljraaer").additionalInfo());
    }

    @Test
    public void testSerialize() {
        AzureWorkloadSapHanaRecoveryPoint model =
            new AzureWorkloadSapHanaRecoveryPoint()
                .withRecoveryPointTimeInUtc(OffsetDateTime.parse("2021-05-21T00:13:57Z"))
                .withType(RestorePointType.SNAPSHOT_FULL)
                .withRecoveryPointTierDetails(
                    Arrays
                        .asList(
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INVALID)
                                .withStatus(RecoveryPointTierStatus.VALID)
                                .withExtendedInfo(
                                    mapOf(
                                        "tnsi", "d", "z", "ud", "kdlpa", "mes", "dfgsftufqobrj", "zrcxfailcfxwmdbo"))))
                .withRecoveryPointMoveReadinessInfo(
                    mapOf(
                        "nrzvuljraaer",
                        new RecoveryPointMoveReadinessInfo().withIsReadyForMove(true).withAdditionalInfo("ckknhxkizvy"),
                        "roylaxxu",
                        new RecoveryPointMoveReadinessInfo().withIsReadyForMove(true).withAdditionalInfo("qgukkjqnv"),
                        "hryvy",
                        new RecoveryPointMoveReadinessInfo()
                            .withIsReadyForMove(true)
                            .withAdditionalInfo("sdosfjbjsvgjr")));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSapHanaRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-21T00:13:57Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.SNAPSHOT_FULL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.INVALID, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.VALID, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("d", model.recoveryPointTierDetails().get(0).extendedInfo().get("tnsi"));
        Assertions.assertEquals(true, model.recoveryPointMoveReadinessInfo().get("nrzvuljraaer").isReadyForMove());
        Assertions
            .assertEquals("ckknhxkizvy", model.recoveryPointMoveReadinessInfo().get("nrzvuljraaer").additionalInfo());
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
