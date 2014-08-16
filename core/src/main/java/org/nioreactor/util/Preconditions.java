/*
 * Copyright 2014 Pedro Ribeiro
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.nioreactor.util;

/**
 * Utility class to validation preconditions.
 * <p/>
 * Created by ribeirux on 26/07/14.
 */
public final class Preconditions {

    private Preconditions() {
    }

    public static void checkArgument(final boolean argument) {
        if (!argument) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkArgument(final boolean argument, final Object cause) {
        if (!argument) {
            throw new IllegalArgumentException(String.valueOf(cause));
        }
    }

    public static <T> T checkNotNull(final T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }

        return reference;
    }

    public static <T> T checkNotNull(final T reference, final Object cause) {
        if (reference == null) {
            throw new NullPointerException(String.valueOf(cause));
        }

        return reference;
    }
}
