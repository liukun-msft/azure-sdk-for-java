// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.implementation;

import org.apache.qpid.proton.engine.Delivery;

import java.nio.ByteBuffer;
import java.util.UUID;

public final class DeliveryUtil {
    private static final int LOCK_TOKEN_SIZE = 16;

    public static String extractLockToken(Delivery delivery) {
        final byte[] deliveryTag = delivery.getTag();
        if (deliveryTag != null && deliveryTag.length == LOCK_TOKEN_SIZE) {
            final byte[] reorderedBytes = new byte[LOCK_TOKEN_SIZE];
            for (int i = 0; i < LOCK_TOKEN_SIZE; i++) {
                int indexInReorderedBytes;
                switch (i) {
                    case 0:
                        indexInReorderedBytes = 3;
                        break;
                    case 1:
                        indexInReorderedBytes = 2;
                        break;
                    case 2:
                        indexInReorderedBytes = 1;
                        break;
                    case 3:
                        indexInReorderedBytes = 0;
                        break;
                    case 4:
                        indexInReorderedBytes = 5;
                        break;
                    case 5:
                        indexInReorderedBytes = 4;
                        break;
                    case 6:
                        indexInReorderedBytes = 7;
                        break;
                    case 7:
                        indexInReorderedBytes = 6;
                        break;
                    default:
                        indexInReorderedBytes = i;
                }

                reorderedBytes[indexInReorderedBytes] = deliveryTag[i];
            }
            final ByteBuffer buffer = ByteBuffer.wrap(reorderedBytes);
            final long mostSignificantBits = buffer.getLong();
            final long leastSignificantBits = buffer.getLong();
            final UUID lockToken = new UUID(mostSignificantBits, leastSignificantBits);
            return lockToken.toString();
        }
        return null;
    }
}
