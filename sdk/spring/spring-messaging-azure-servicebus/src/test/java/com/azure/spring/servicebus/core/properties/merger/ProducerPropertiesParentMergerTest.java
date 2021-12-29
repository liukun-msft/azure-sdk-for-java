// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.servicebus.core.properties.merger;

import com.azure.spring.servicebus.core.properties.NamespaceProperties;
import com.azure.spring.servicebus.core.properties.ProducerProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProducerPropertiesParentMergerTest {
    private final SenderPropertiesParentMerger merger = new SenderPropertiesParentMerger();

    @Test
    void childNotProvidedShouldUseParent() {
        ProducerProperties child = new ProducerProperties();

        NamespaceProperties parent = new NamespaceProperties();
        parent.setConnectionString("parent-connection-str");
        parent.getProxy().setHostname("parent-hostname");

        ProducerProperties result = merger.mergeParent(child, parent);

        Assertions.assertEquals("parent-connection-str", result.getConnectionString());
        Assertions.assertEquals("parent-hostname", result.getProxy().getHostname());
    }

    @Test
    void childProvidedShouldUseChild() {
        ProducerProperties child = new ProducerProperties();
        child.setConnectionString("child-connection-str");
        child.getProxy().setHostname("child-hostname");
        child.setEntityName("test");

        NamespaceProperties parent = new NamespaceProperties();
        parent.setConnectionString("parent-connection-str");
        parent.getProxy().setHostname("parent-hostname");

        ProducerProperties result = merger.mergeParent(child, parent);

        Assertions.assertEquals("child-connection-str", result.getConnectionString());
        Assertions.assertEquals("child-hostname", result.getProxy().getHostname());
        Assertions.assertEquals("test", result.getEntityName());
    }
}
