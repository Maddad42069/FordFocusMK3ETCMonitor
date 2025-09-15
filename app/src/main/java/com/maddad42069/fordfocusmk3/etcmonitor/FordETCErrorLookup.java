package com.maddad42069.fordfocusmk3.etcmonitor;

import java.util.HashMap;

public class FordETCErrorLookup {
    private static HashMap<Integer, String> errorMap = new HashMap<>();
    static {
        errorMap.put(0x00, "No error");
        errorMap.put(0x01, "Throttle actuator malfunction");
        errorMap.put(0x02, "Sensor signal invalid");
        errorMap.put(0x03, "ETC motor circuit fault");
        errorMap.put(0x04, "Throttle plate stuck");
        // Add more Ford-specific ETC error codes and descriptions as needed.
    }

    public static String getErrorDescription(int code) {
        return errorMap.getOrDefault(code, "Unknown error code");
    }
}