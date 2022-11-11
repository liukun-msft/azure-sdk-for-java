// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.UpdateWorkspaceQuotasResultInner;
import org.junit.jupiter.api.Test;

public final class UpdateWorkspaceQuotasResultInnerTests {
    @Test
    public void testDeserialize() {
        UpdateWorkspaceQuotasResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"id\":\"dxwzywqsmbsurexi\",\"type\":\"ryocfsfksymdd\",\"limit\":2863300785135771862,\"unit\":\"Count\",\"status\":\"OperationNotSupportedForSku\"},{\"id\":\"qyud\",\"type\":\"rrqnbpoczvyifqrv\",\"limit\":4225896230813201107,\"unit\":\"Count\",\"status\":\"Undefined\"},{\"id\":\"vvdfwatkpnpul\",\"type\":\"xbczwtruwiqz\",\"limit\":535203573928767895,\"unit\":\"Count\",\"status\":\"InvalidVMFamilyName\"},{\"id\":\"okacspk\",\"type\":\"hzdobpxjmflbvvnc\",\"limit\":5158769929678256713,\"unit\":\"Count\",\"status\":\"Failure\"}],\"nextLink\":\"juqk\"}")
                .toObject(UpdateWorkspaceQuotasResultInner.class);
    }

    @Test
    public void testSerialize() {
        UpdateWorkspaceQuotasResultInner model = new UpdateWorkspaceQuotasResultInner();
        model = BinaryData.fromObject(model).toObject(UpdateWorkspaceQuotasResultInner.class);
    }
}
