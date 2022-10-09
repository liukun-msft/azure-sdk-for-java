// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.EntityClient;
import com.azure.analytics.purview.catalog.EntityClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class EntityDeleteByGuid {
    public static void main(String[] args) {
        EntityClient entityClient =
                new EntityClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.catalog.generated.entitydeletebyguid.entitydeletebyguid
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                entityClient.deleteByGuidWithResponse("fd279eb4-f6c3-1b0b-ad67-e4f8abd2972f", requestOptions);
        // END:com.azure.analytics.purview.catalog.generated.entitydeletebyguid.entitydeletebyguid
    }
}
