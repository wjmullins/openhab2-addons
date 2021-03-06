/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.dsmr.internal;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * This class defines common constants, which are used across the whole binding.
 *
 * @author M. Volaart - Initial contribution
 * @author Hilbrand Bouwkamp - Removed time constants
 */
@NonNullByDefault
public final class DSMRBindingConstants {
    /**
     * Binding id.
     */
    public static final String BINDING_ID = "dsmr";

    /**
     * Key to use to identify serial port.
     */
    public static final String DSMR_PORT_NAME = "org.openhab.binding.dsmr";

    /**
     * Bridge device thing
     */
    public static final ThingTypeUID THING_TYPE_DSMR_BRIDGE = new ThingTypeUID(BINDING_ID, "dsmrBridge");

    private DSMRBindingConstants() {
        // Constants class
    }
}
