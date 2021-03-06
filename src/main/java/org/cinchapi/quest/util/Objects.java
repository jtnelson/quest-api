/*
 * The MIT License (MIT)
 * 
 * Copyright (c) 2014 Jeff Nelson, Cinchapi Software Collective
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.cinchapi.quest.util;

import java.util.Collection;

import com.google.common.base.Strings;

/**
 * Utilities for general Objects.
 * 
 * @author jnelson
 */
public class Objects {

    /**
     * Return {@code true} if {@code value} is {@code null} or considered empty.
     * A value is considered empty if:
     * <ul>
     * <li>It is a collection with no members</li>
     * <li>It is an array with a length of 0</li>
     * <li>It is a string with no characters</li>
     * </ul>
     * 
     * @param value
     * @return {@code true} if the object is considered null or empty
     */
    public static boolean isNullOrEmpty(Object value) {
        return value == null
                || (value instanceof Collection && ((Collection<?>) value)
                        .isEmpty())
                || (value.getClass().isArray() && ((Object[]) value).length == 0)
                || (value instanceof String && Strings
                        .isNullOrEmpty((String) value));
    }
}
