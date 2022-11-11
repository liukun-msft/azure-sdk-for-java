// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.IdentityConfiguration;
import com.azure.resourcemanager.machinelearning.models.JobBaseProperties;
import com.azure.resourcemanager.machinelearning.models.JobService;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class JobBasePropertiesTests {
    @Test
    public void testDeserialize() {
        JobBaseProperties model =
            BinaryData
                .fromString(
                    "{\"jobType\":\"JobBaseProperties\",\"componentId\":\"a\",\"computeId\":\"g\",\"displayName\":\"hocxvdfffwafqrou\",\"experimentName\":\"spave\",\"identity\":{\"identityType\":\"IdentityConfiguration\"},\"isArchived\":true,\"services\":{\"xdbeesmieknl\":{\"endpoint\":\"n\",\"errorMessage\":\"zudhcxg\",\"jobServiceType\":\"oyxcdyuib\",\"port\":595382657,\"properties\":{\"aeoisrvh\":\"bzydvfvfcj\",\"ukiscvwmzhw\":\"gorf\",\"nzeyqxtjj\":\"lefaxvxilcbtgn\"},\"status\":\"qlqhycavodg\"},\"cjhfgmvecactxmw\":{\"endpoint\":\"riaa\",\"errorMessage\":\"uagydwqfbylyrf\",\"jobServiceType\":\"agt\",\"port\":1621141865,\"properties\":{\"zldmozuxy\":\"qwogfnzjvus\",\"ysownbtgkbug\":\"fsbtkad\",\"pe\":\"jqctojcmisofie\",\"hihihlhzdsqtzbsr\":\"ojyqdhcuplcplcw\"},\"status\":\"o\"},\"etoge\":{\"endpoint\":\"e\",\"errorMessage\":\"wcluqovekqvgq\",\"jobServiceType\":\"wifzmp\",\"port\":1626415565,\"properties\":{\"rfsphuagrt\":\"qikfxcv\",\"xubyjaffmmfblcqc\":\"ikteusqczkvyk\",\"brta\":\"ubgq\",\"lqxihhrmooiz\":\"metttwgd\"},\"status\":\"eypxiutcxapzhyr\"}},\"status\":\"Preparing\",\"description\":\"slhvnhlab\",\"properties\":{\"hvv\":\"kkzjcjbtrga\"},\"tags\":{\"oqbeitpkxzt\":\"xjjs\",\"pimaqxzhemjyh\":\"oobklftidgfcwq\",\"bawpfajnjwltlwt\":\"hujswtwkozzwcul\",\"uktalhsnvkcdmxz\":\"j\"}}")
                .toObject(JobBaseProperties.class);
        Assertions.assertEquals("slhvnhlab", model.description());
        Assertions.assertEquals("kkzjcjbtrga", model.properties().get("hvv"));
        Assertions.assertEquals("xjjs", model.tags().get("oqbeitpkxzt"));
        Assertions.assertEquals("a", model.componentId());
        Assertions.assertEquals("g", model.computeId());
        Assertions.assertEquals("hocxvdfffwafqrou", model.displayName());
        Assertions.assertEquals("spave", model.experimentName());
        Assertions.assertEquals(true, model.isArchived());
        Assertions.assertEquals("n", model.services().get("xdbeesmieknl").endpoint());
        Assertions.assertEquals("oyxcdyuib", model.services().get("xdbeesmieknl").jobServiceType());
        Assertions.assertEquals(595382657, model.services().get("xdbeesmieknl").port());
        Assertions.assertEquals("bzydvfvfcj", model.services().get("xdbeesmieknl").properties().get("aeoisrvh"));
    }

    @Test
    public void testSerialize() {
        JobBaseProperties model =
            new JobBaseProperties()
                .withDescription("slhvnhlab")
                .withProperties(mapOf("hvv", "kkzjcjbtrga"))
                .withTags(
                    mapOf(
                        "oqbeitpkxzt",
                        "xjjs",
                        "pimaqxzhemjyh",
                        "oobklftidgfcwq",
                        "bawpfajnjwltlwt",
                        "hujswtwkozzwcul",
                        "uktalhsnvkcdmxz",
                        "j"))
                .withComponentId("a")
                .withComputeId("g")
                .withDisplayName("hocxvdfffwafqrou")
                .withExperimentName("spave")
                .withIdentity(new IdentityConfiguration())
                .withIsArchived(true)
                .withServices(
                    mapOf(
                        "xdbeesmieknl",
                        new JobService()
                            .withEndpoint("n")
                            .withJobServiceType("oyxcdyuib")
                            .withPort(595382657)
                            .withProperties(
                                mapOf("aeoisrvh", "bzydvfvfcj", "ukiscvwmzhw", "gorf", "nzeyqxtjj", "lefaxvxilcbtgn")),
                        "cjhfgmvecactxmw",
                        new JobService()
                            .withEndpoint("riaa")
                            .withJobServiceType("agt")
                            .withPort(1621141865)
                            .withProperties(
                                mapOf(
                                    "zldmozuxy",
                                    "qwogfnzjvus",
                                    "ysownbtgkbug",
                                    "fsbtkad",
                                    "pe",
                                    "jqctojcmisofie",
                                    "hihihlhzdsqtzbsr",
                                    "ojyqdhcuplcplcw")),
                        "etoge",
                        new JobService()
                            .withEndpoint("e")
                            .withJobServiceType("wifzmp")
                            .withPort(1626415565)
                            .withProperties(
                                mapOf(
                                    "rfsphuagrt",
                                    "qikfxcv",
                                    "xubyjaffmmfblcqc",
                                    "ikteusqczkvyk",
                                    "brta",
                                    "ubgq",
                                    "lqxihhrmooiz",
                                    "metttwgd"))));
        model = BinaryData.fromObject(model).toObject(JobBaseProperties.class);
        Assertions.assertEquals("slhvnhlab", model.description());
        Assertions.assertEquals("kkzjcjbtrga", model.properties().get("hvv"));
        Assertions.assertEquals("xjjs", model.tags().get("oqbeitpkxzt"));
        Assertions.assertEquals("a", model.componentId());
        Assertions.assertEquals("g", model.computeId());
        Assertions.assertEquals("hocxvdfffwafqrou", model.displayName());
        Assertions.assertEquals("spave", model.experimentName());
        Assertions.assertEquals(true, model.isArchived());
        Assertions.assertEquals("n", model.services().get("xdbeesmieknl").endpoint());
        Assertions.assertEquals("oyxcdyuib", model.services().get("xdbeesmieknl").jobServiceType());
        Assertions.assertEquals(595382657, model.services().get("xdbeesmieknl").port());
        Assertions.assertEquals("bzydvfvfcj", model.services().get("xdbeesmieknl").properties().get("aeoisrvh"));
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
