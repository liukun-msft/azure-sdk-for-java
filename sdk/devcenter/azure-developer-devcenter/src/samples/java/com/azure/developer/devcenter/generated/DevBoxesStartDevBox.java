// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;
import com.azure.developer.devcenter.DevBoxesClient;
import com.azure.developer.devcenter.DevBoxesClientBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class DevBoxesStartDevBox {
    public static void main(String[] args) {
        DevBoxesClient devBoxesClient =
                new DevBoxesClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .devCenter("ContosoDevCenter")
                        .devCenterDnsSuffix("devcenters.azure.com")
                        .tenantId("84fq37b9-22t3-t887-l09p-93241ngq0s95")
                        .buildClient();
        // BEGIN:com.azure.developer.devcenter.generated.devboxesstartdevbox.devboxesstartdevbox
        RequestOptions requestOptions = new RequestOptions();
        SyncPoller<BinaryData, BinaryData> response =
                devBoxesClient.beginStartDevBox("myProject", "me", "MyDevBox", requestOptions);
        // END:com.azure.developer.devcenter.generated.devboxesstartdevbox.devboxesstartdevbox
    }
}
