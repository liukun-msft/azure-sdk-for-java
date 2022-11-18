// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Algorithm identifier for encryption, default RSA-OAEP. */
public final class JsonWebKeyEncryptionAlgorithm extends ExpandableStringEnum<JsonWebKeyEncryptionAlgorithm> {
    /** Static value RSA-OAEP for JsonWebKeyEncryptionAlgorithm. */
    public static final JsonWebKeyEncryptionAlgorithm RSA_OAEP = fromString("RSA-OAEP");

    /** Static value RSA-OAEP-256 for JsonWebKeyEncryptionAlgorithm. */
    public static final JsonWebKeyEncryptionAlgorithm RSA_OAEP_256 = fromString("RSA-OAEP-256");

    /** Static value RSA1_5 for JsonWebKeyEncryptionAlgorithm. */
    public static final JsonWebKeyEncryptionAlgorithm RSA1_5 = fromString("RSA1_5");

    /**
     * Creates or finds a JsonWebKeyEncryptionAlgorithm from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JsonWebKeyEncryptionAlgorithm.
     */
    @JsonCreator
    public static JsonWebKeyEncryptionAlgorithm fromString(String name) {
        return fromString(name, JsonWebKeyEncryptionAlgorithm.class);
    }

    /**
     * Gets known JsonWebKeyEncryptionAlgorithm values.
     *
     * @return known JsonWebKeyEncryptionAlgorithm values.
     */
    public static Collection<JsonWebKeyEncryptionAlgorithm> values() {
        return values(JsonWebKeyEncryptionAlgorithm.class);
    }
}
