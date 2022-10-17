// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.GalleryListResult;
import org.junit.jupiter.api.Test;

public final class GalleryListResultTests {
    @Test
    public void testDeserialize() {
        GalleryListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"yqrimzin\",\"galleryResourceId\":\"vswjdk\"},\"id\":\"soodqxhcrmnoh\",\"name\":\"t\",\"type\":\"kwh\"},{\"properties\":{\"provisioningState\":\"ifiyipjxsqwpgrj\",\"galleryResourceId\":\"znorcj\"},\"id\":\"snb\",\"name\":\"xqabnmocpcysh\",\"type\":\"rzafbljjgpbtoqcj\"},{\"properties\":{\"provisioningState\":\"javbqidtqajz\",\"galleryResourceId\":\"ulpkudjkrl\"},\"id\":\"bzhfepgzgqexz\",\"name\":\"ocxscpaierhhbcs\",\"type\":\"l\"},{\"properties\":{\"provisioningState\":\"a\",\"galleryResourceId\":\"tjaodxobnb\"},\"id\":\"k\",\"name\":\"pxokajionp\",\"type\":\"mexgstxgcp\"}],\"nextLink\":\"gmaajrm\"}")
                .toObject(GalleryListResult.class);
    }

    @Test
    public void testSerialize() {
        GalleryListResult model = new GalleryListResult();
        model = BinaryData.fromObject(model).toObject(GalleryListResult.class);
    }
}
