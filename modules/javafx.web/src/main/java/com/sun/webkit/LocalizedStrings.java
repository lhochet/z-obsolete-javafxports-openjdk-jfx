/*
 * Copyright (c) 2011, 2016, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.sun.webkit;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

final class LocalizedStrings {
    private final static Logger log =
        Logger.getLogger(LocalizedStrings.class.getName());

    private final static ResourceBundle BUNDLE =
        ResourceBundle.getBundle("com.sun.webkit.LocalizedStrings",
            Locale.getDefault());

    /** Private ctor to avoid unexpected instantiation */
    private LocalizedStrings() {}

    private static String getLocalizedProperty(String propName) {
        log.log(Level.FINE, "Get property: " + propName);
        String propValue = BUNDLE.getString(propName);
        if ((propValue != null) && (propValue.trim().length() > 0)) {
            log.log(Level.FINE, "Property value: " + propValue);
            return propValue.trim();
        }
        log.log(Level.FINE, "Unknown property value");
        return null;
    }
}