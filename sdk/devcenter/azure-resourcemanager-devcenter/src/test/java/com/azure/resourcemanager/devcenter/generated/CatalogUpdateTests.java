// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.CatalogUpdate;
import com.azure.resourcemanager.devcenter.models.GitCatalog;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CatalogUpdateTests {
    @Test
    public void testDeserialize() {
        CatalogUpdate model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"gitHub\":{\"uri\":\"nkymuctqhjfbebrj\",\"branch\":\"erfuwuttt\",\"secretIdentifier\":\"vjrbirphxepcyvah\",\"path\":\"ljkyqxjvuuj\"},\"adoGit\":{\"uri\":\"dokgjl\",\"branch\":\"oxgvclt\",\"secretIdentifier\":\"sncghkjeszz\",\"path\":\"ijhtxf\"}},\"tags\":{\"xnehmpvec\":\"bfs\"}}")
                .toObject(CatalogUpdate.class);
        Assertions.assertEquals("bfs", model.tags().get("xnehmpvec"));
        Assertions.assertEquals("nkymuctqhjfbebrj", model.gitHub().uri());
        Assertions.assertEquals("erfuwuttt", model.gitHub().branch());
        Assertions.assertEquals("vjrbirphxepcyvah", model.gitHub().secretIdentifier());
        Assertions.assertEquals("ljkyqxjvuuj", model.gitHub().path());
        Assertions.assertEquals("dokgjl", model.adoGit().uri());
        Assertions.assertEquals("oxgvclt", model.adoGit().branch());
        Assertions.assertEquals("sncghkjeszz", model.adoGit().secretIdentifier());
        Assertions.assertEquals("ijhtxf", model.adoGit().path());
    }

    @Test
    public void testSerialize() {
        CatalogUpdate model =
            new CatalogUpdate()
                .withTags(mapOf("xnehmpvec", "bfs"))
                .withGitHub(
                    new GitCatalog()
                        .withUri("nkymuctqhjfbebrj")
                        .withBranch("erfuwuttt")
                        .withSecretIdentifier("vjrbirphxepcyvah")
                        .withPath("ljkyqxjvuuj"))
                .withAdoGit(
                    new GitCatalog()
                        .withUri("dokgjl")
                        .withBranch("oxgvclt")
                        .withSecretIdentifier("sncghkjeszz")
                        .withPath("ijhtxf"));
        model = BinaryData.fromObject(model).toObject(CatalogUpdate.class);
        Assertions.assertEquals("bfs", model.tags().get("xnehmpvec"));
        Assertions.assertEquals("nkymuctqhjfbebrj", model.gitHub().uri());
        Assertions.assertEquals("erfuwuttt", model.gitHub().branch());
        Assertions.assertEquals("vjrbirphxepcyvah", model.gitHub().secretIdentifier());
        Assertions.assertEquals("ljkyqxjvuuj", model.gitHub().path());
        Assertions.assertEquals("dokgjl", model.adoGit().uri());
        Assertions.assertEquals("oxgvclt", model.adoGit().branch());
        Assertions.assertEquals("sncghkjeszz", model.adoGit().secretIdentifier());
        Assertions.assertEquals("ijhtxf", model.adoGit().path());
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
