// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.ProjectEnvironmentTypeInner;
import com.azure.resourcemanager.devcenter.models.EnableStatus;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentity;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devcenter.models.ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment;
import com.azure.resourcemanager.devcenter.models.UserAssignedIdentity;
import com.azure.resourcemanager.devcenter.models.UserRoleAssignmentValue;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ProjectEnvironmentTypeInnerTests {
    @Test
    public void testDeserialize() {
        ProjectEnvironmentTypeInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Succeeded\",\"deploymentTargetId\":\"ik\",\"status\":\"Enabled\",\"creatorRoleAssignment\":{\"roles\":{}},\"userRoleAssignments\":{\"n\":{\"roles\":{}}}},\"tags\":{\"rbu\":\"nhijggmebfsi\",\"ttdbhrbnl\":\"rcvpnazzmhjrunmp\",\"xywnytnrsynlqidy\":\"nkxmyskpbhenbtk\"},\"identity\":{\"principalId\":\"b2520f43-57cf-4906-b29a-f283736577bf\",\"tenantId\":\"38ea1650-6a58-4ce5-8ee9-b51719436067\",\"type\":\"None\",\"userAssignedIdentities\":{\"aaxdbabphlwrq\":{\"principalId\":\"47cc0cd3-beef-4197-a00f-6669ac2eee2e\",\"clientId\":\"ff176180-66d5-431e-ae4d-ca8f2bfcf870\"}}},\"location\":\"ktsthsucocmny\",\"id\":\"zt\",\"name\":\"bt\",\"type\":\"wrqpue\"}")
                .toObject(ProjectEnvironmentTypeInner.class);
        Assertions.assertEquals("nhijggmebfsi", model.tags().get("rbu"));
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("ktsthsucocmny", model.location());
        Assertions.assertEquals("ik", model.deploymentTargetId());
        Assertions.assertEquals(EnableStatus.ENABLED, model.status());
    }

    @Test
    public void testSerialize() {
        ProjectEnvironmentTypeInner model =
            new ProjectEnvironmentTypeInner()
                .withTags(
                    mapOf(
                        "rbu", "nhijggmebfsi", "ttdbhrbnl", "rcvpnazzmhjrunmp", "xywnytnrsynlqidy", "nkxmyskpbhenbtk"))
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.NONE)
                        .withUserAssignedIdentities(mapOf("aaxdbabphlwrq", new UserAssignedIdentity())))
                .withLocation("ktsthsucocmny")
                .withDeploymentTargetId("ik")
                .withStatus(EnableStatus.ENABLED)
                .withCreatorRoleAssignment(
                    new ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment().withRoles(mapOf()))
                .withUserRoleAssignments(mapOf("n", new UserRoleAssignmentValue().withRoles(mapOf())));
        model = BinaryData.fromObject(model).toObject(ProjectEnvironmentTypeInner.class);
        Assertions.assertEquals("nhijggmebfsi", model.tags().get("rbu"));
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("ktsthsucocmny", model.location());
        Assertions.assertEquals("ik", model.deploymentTargetId());
        Assertions.assertEquals(EnableStatus.ENABLED, model.status());
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
