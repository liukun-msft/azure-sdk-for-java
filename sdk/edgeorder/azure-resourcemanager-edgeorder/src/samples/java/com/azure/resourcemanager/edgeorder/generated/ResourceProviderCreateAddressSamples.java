// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.generated;

import com.azure.resourcemanager.edgeorder.models.AddressType;
import com.azure.resourcemanager.edgeorder.models.ContactDetails;
import com.azure.resourcemanager.edgeorder.models.ShippingAddress;
import java.util.Arrays;

/** Samples for ResourceProvider CreateAddress. */
public final class ResourceProviderCreateAddressSamples {
    /*
     * x-ms-original-file: specification/edgeorder/resource-manager/Microsoft.EdgeOrder/stable/2021-12-01/examples/CreateAddress.json
     */
    /**
     * Sample code: CreateAddress.
     *
     * @param manager Entry point to EdgeOrderManager.
     */
    public static void createAddress(com.azure.resourcemanager.edgeorder.EdgeOrderManager manager) {
        manager
            .resourceProviders()
            .defineAddress("TestMSAddressName")
            .withRegion("westus")
            .withExistingResourceGroup("TestRG")
            .withContactDetails(
                new ContactDetails()
                    .withContactName("Petr Cech")
                    .withPhone("fakePhoneNumberPlaceholder")
                    .withPhoneExtension("")
                    .withEmailList(Arrays.asList("testemail@microsoft.com")))
            .withShippingAddress(
                new ShippingAddress()
                    .withStreetAddress1("16 TOWNSEND ST")
                    .withStreetAddress2("UNIT 1")
                    .withCity("San Francisco")
                    .withStateOrProvince("CA")
                    .withCountry("US")
                    .withPostalCode("94107")
                    .withCompanyName("Microsoft")
                    .withAddressType(AddressType.NONE))
            .create();
    }
}
