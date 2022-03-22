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

public class EntityDeleteByGuids {
    public static void main(String[] args) {
        // BEGIN: com.azure.analytics.purview.catalog.generated.entitydeletebyguids.entitydeletebyguids
        EntityClient entityClient =
                new EntityClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.addQueryParam("guid", "18e06957-e265-967a-07f1-e14e2ab8940f");
        requestOptions.addQueryParam("guid", "cc0730ba-9b30-41f0-6953-559d17626d2b");
        Response<BinaryData> response = entityClient.deleteByGuidsWithResponse(requestOptions);
        // END: com.azure.analytics.purview.catalog.generated.entitydeletebyguids.entitydeletebyguids
    }
}
