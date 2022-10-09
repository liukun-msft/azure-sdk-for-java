// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains information about SSH certificate public key and the path on the Linux VM where the public key is placed.
 */
@Fluent
public final class SshPublicKey {
    /*
     * Specifies the full path on the created VM where ssh public key is stored. If the file already exists, the
     * specified key is appended to the file. Example: /home/user/.ssh/authorized_keys
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * SSH public key certificate used to authenticate with the VM through ssh. The key needs to be at least 2048-bit
     * and in ssh-rsa format. <br><br> For creating ssh keys, see [Create SSH keys on Linux and Mac for Linux VMs in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-mac-create-ssh-keys?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     */
    @JsonProperty(value = "keyData")
    private String keyData;

    /** Creates an instance of SshPublicKey class. */
    public SshPublicKey() {
    }

    /**
     * Get the path property: Specifies the full path on the created VM where ssh public key is stored. If the file
     * already exists, the specified key is appended to the file. Example: /home/user/.ssh/authorized_keys.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Specifies the full path on the created VM where ssh public key is stored. If the file
     * already exists, the specified key is appended to the file. Example: /home/user/.ssh/authorized_keys.
     *
     * @param path the path value to set.
     * @return the SshPublicKey object itself.
     */
    public SshPublicKey withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the keyData property: SSH public key certificate used to authenticate with the VM through ssh. The key needs
     * to be at least 2048-bit and in ssh-rsa format. &lt;br&gt;&lt;br&gt; For creating ssh keys, see [Create SSH keys
     * on Linux and Mac for Linux VMs in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-mac-create-ssh-keys?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @return the keyData value.
     */
    public String keyData() {
        return this.keyData;
    }

    /**
     * Set the keyData property: SSH public key certificate used to authenticate with the VM through ssh. The key needs
     * to be at least 2048-bit and in ssh-rsa format. &lt;br&gt;&lt;br&gt; For creating ssh keys, see [Create SSH keys
     * on Linux and Mac for Linux VMs in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-mac-create-ssh-keys?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     *
     * @param keyData the keyData value to set.
     * @return the SshPublicKey object itself.
     */
    public SshPublicKey withKeyData(String keyData) {
        this.keyData = keyData;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
