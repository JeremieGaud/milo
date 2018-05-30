/*
 * Copyright (c) 2018 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.sdk.server.events.conversions;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UByte;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UShort;

import static org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned.ubyte;

final class UInt16Conversions {

    private UInt16Conversions() {}

    @Nonnull
    static Boolean uInt16ToBoolean(@Nonnull UShort us) {
        return us.intValue() != 0;
    }

    @Nullable
    static UByte uInt16ToByte(@Nonnull UShort us) {
        int i = us.intValue();

        if (i < UByte.MAX_VALUE) {
            return ubyte(i);
        } else {
            return null;
        }
    }

    @Nonnull
    static Double uInt16ToDouble(@Nonnull UShort us) {
        return us.doubleValue();
    }

    @Nonnull
    static Float uInt16ToFloat(@Nonnull UShort us) {
        return us.floatValue();
    }

    @Nullable
    static Short uInt16ToInt16(@Nonnull UShort us) {
        int i = us.intValue();

        if (i <= Short.MAX_VALUE) {
            return (short) i;
        } else {
            return null;
        }
    }

    @Nonnull
    static Integer uInt16ToInt32(@Nonnull UShort us) {
        return us.intValue();
    }

    @Nonnull
    static Long uInt16ToInt64(@Nonnull UShort us) {
        return us.longValue();
    }

    // TODO
    // SByte
    // StatusCode
    // String
    // UInt32
    // UInt64

}
