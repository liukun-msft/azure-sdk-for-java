// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.GoogleAdWordsSource;
import org.junit.jupiter.api.Test;

public final class GoogleAdWordsSourceTests {
    @Test
    public void testDeserialize() {
        GoogleAdWordsSource model =
            BinaryData.fromString("{\"type\":\"GoogleAdWordsSource\",\"\":{}}").toObject(GoogleAdWordsSource.class);
    }

    @Test
    public void testSerialize() {
        GoogleAdWordsSource model = new GoogleAdWordsSource();
        model = BinaryData.fromObject(model).toObject(GoogleAdWordsSource.class);
    }
}
