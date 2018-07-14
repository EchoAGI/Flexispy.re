package com.vvt.capture.location;

import java.util.HashMap;
import java.util.Map;

public enum CallingModule {
    CORE(0),
    PANIC(1),
    ALERT(2),
    ON_DEMAND(3);
    private static Map<Integer, CallingModule> values = new HashMap<>();
    static {
        for (CallingModule value : CallingModule.values) {
            values.put(value.getNumber(), value)
        }
    }
    private int number;
    private CallingModule(int value) {
        this.number = value;
    }
    public static CallingModule forValue(int value) {
        return values.get(value);
    }

    public int getNumber() {
        return this.number;
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/location/CallingModule.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */