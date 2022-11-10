// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.IdentityConfiguration;
import com.azure.resourcemanager.machinelearning.models.JobInput;
import com.azure.resourcemanager.machinelearning.models.JobOutput;
import com.azure.resourcemanager.machinelearning.models.JobService;
import com.azure.resourcemanager.machinelearning.models.PipelineJob;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PipelineJobTests {
    @Test
    public void testDeserialize() {
        PipelineJob model =
            BinaryData
                .fromString(
                    "{\"jobType\":\"Pipeline\",\"inputs\":{\"erufgjblcdrmy\":{\"jobInputType\":\"JobInput\",\"description\":\"khup\"},\"lugekdfqnhtt\":{\"jobInputType\":\"JobInput\",\"description\":\"emftzgyyky\"},\"kmhmnulwempdc\":{\"jobInputType\":\"JobInput\",\"description\":\"owrczfjjnnuxxr\"},\"sulwzpflusn\":{\"jobInputType\":\"JobInput\",\"description\":\"rhjul\"}},\"jobs\":{\"iyrgkoek\":\"datahhgzotf\"},\"outputs\":{\"pcqydeykvsk\":{\"jobOutputType\":\"JobOutput\",\"description\":\"xyxhighctxbxmo\"},\"boohxbms\":{\"jobOutputType\":\"JobOutput\",\"description\":\"zdfrjeizikgq\"},\"qaeo\":{\"jobOutputType\":\"JobOutput\",\"description\":\"cqsxrmdvewu\"}},\"settings\":\"datajh\",\"sourceJobId\":\"jkbvhhdaurgho\",\"componentId\":\"aexbkhxjxjo\",\"computeId\":\"lqxr\",\"displayName\":\"knkob\",\"experimentName\":\"tmbozomtzamicbig\",\"identity\":{\"identityType\":\"IdentityConfiguration\"},\"isArchived\":true,\"services\":{\"sotirei\":{\"endpoint\":\"znuxkeuairaabmdl\",\"errorMessage\":\"bedpfixlhupmomih\",\"jobServiceType\":\"dnpxpkcdpr\",\"port\":656606105,\"properties\":{\"ghflrufssjyghsf\":\"yi\",\"fgvqcpdw\":\"rkbhammgmqfm\",\"dcdjhunh\":\"gquxweysland\"},\"status\":\"cgawnrrnquo\"}},\"status\":\"Finalizing\",\"description\":\"bfsx\",\"properties\":{\"mxcjzlquzexokjx\":\"yilbvz\"},\"tags\":{\"bwmvogljsvl\":\"vbzinz\",\"nwcehaqidoyzl\":\"gi\",\"pepiaeapfs\":\"giomqo\",\"pqqncju\":\"rgdtpeqnacyheqw\"}}")
                .toObject(PipelineJob.class);
        Assertions.assertEquals("bfsx", model.description());
        Assertions.assertEquals("yilbvz", model.properties().get("mxcjzlquzexokjx"));
        Assertions.assertEquals("vbzinz", model.tags().get("bwmvogljsvl"));
        Assertions.assertEquals("aexbkhxjxjo", model.componentId());
        Assertions.assertEquals("lqxr", model.computeId());
        Assertions.assertEquals("knkob", model.displayName());
        Assertions.assertEquals("tmbozomtzamicbig", model.experimentName());
        Assertions.assertEquals(true, model.isArchived());
        Assertions.assertEquals("znuxkeuairaabmdl", model.services().get("sotirei").endpoint());
        Assertions.assertEquals("dnpxpkcdpr", model.services().get("sotirei").jobServiceType());
        Assertions.assertEquals(656606105, model.services().get("sotirei").port());
        Assertions.assertEquals("yi", model.services().get("sotirei").properties().get("ghflrufssjyghsf"));
        Assertions.assertEquals("khup", model.inputs().get("erufgjblcdrmy").description());
        Assertions.assertEquals("xyxhighctxbxmo", model.outputs().get("pcqydeykvsk").description());
        Assertions.assertEquals("jkbvhhdaurgho", model.sourceJobId());
    }

    @Test
    public void testSerialize() {
        PipelineJob model =
            new PipelineJob()
                .withDescription("bfsx")
                .withProperties(mapOf("mxcjzlquzexokjx", "yilbvz"))
                .withTags(
                    mapOf(
                        "bwmvogljsvl",
                        "vbzinz",
                        "nwcehaqidoyzl",
                        "gi",
                        "pepiaeapfs",
                        "giomqo",
                        "pqqncju",
                        "rgdtpeqnacyheqw"))
                .withComponentId("aexbkhxjxjo")
                .withComputeId("lqxr")
                .withDisplayName("knkob")
                .withExperimentName("tmbozomtzamicbig")
                .withIdentity(new IdentityConfiguration())
                .withIsArchived(true)
                .withServices(
                    mapOf(
                        "sotirei",
                        new JobService()
                            .withEndpoint("znuxkeuairaabmdl")
                            .withJobServiceType("dnpxpkcdpr")
                            .withPort(656606105)
                            .withProperties(
                                mapOf(
                                    "ghflrufssjyghsf", "yi", "fgvqcpdw", "rkbhammgmqfm", "dcdjhunh", "gquxweysland"))))
                .withInputs(
                    mapOf(
                        "erufgjblcdrmy",
                        new JobInput().withDescription("khup"),
                        "lugekdfqnhtt",
                        new JobInput().withDescription("emftzgyyky"),
                        "kmhmnulwempdc",
                        new JobInput().withDescription("owrczfjjnnuxxr"),
                        "sulwzpflusn",
                        new JobInput().withDescription("rhjul")))
                .withJobs(mapOf("iyrgkoek", "datahhgzotf"))
                .withOutputs(
                    mapOf(
                        "pcqydeykvsk",
                        new JobOutput().withDescription("xyxhighctxbxmo"),
                        "boohxbms",
                        new JobOutput().withDescription("zdfrjeizikgq"),
                        "qaeo",
                        new JobOutput().withDescription("cqsxrmdvewu")))
                .withSettings("datajh")
                .withSourceJobId("jkbvhhdaurgho");
        model = BinaryData.fromObject(model).toObject(PipelineJob.class);
        Assertions.assertEquals("bfsx", model.description());
        Assertions.assertEquals("yilbvz", model.properties().get("mxcjzlquzexokjx"));
        Assertions.assertEquals("vbzinz", model.tags().get("bwmvogljsvl"));
        Assertions.assertEquals("aexbkhxjxjo", model.componentId());
        Assertions.assertEquals("lqxr", model.computeId());
        Assertions.assertEquals("knkob", model.displayName());
        Assertions.assertEquals("tmbozomtzamicbig", model.experimentName());
        Assertions.assertEquals(true, model.isArchived());
        Assertions.assertEquals("znuxkeuairaabmdl", model.services().get("sotirei").endpoint());
        Assertions.assertEquals("dnpxpkcdpr", model.services().get("sotirei").jobServiceType());
        Assertions.assertEquals(656606105, model.services().get("sotirei").port());
        Assertions.assertEquals("yi", model.services().get("sotirei").properties().get("ghflrufssjyghsf"));
        Assertions.assertEquals("khup", model.inputs().get("erufgjblcdrmy").description());
        Assertions.assertEquals("xyxhighctxbxmo", model.outputs().get("pcqydeykvsk").description());
        Assertions.assertEquals("jkbvhhdaurgho", model.sourceJobId());
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
