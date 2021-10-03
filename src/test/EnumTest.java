package test;

import java.util.HashMap;
import java.util.Map;

public enum EnumTest {
    END_OF_PERIOD(0),
    NOW(1);

    public final int value;

    EnumTest(int value) {
        this.value = value;
    }

    private static Map<Integer, EnumTest> map = new HashMap<>();

    static {
        for (EnumTest status : EnumTest.values()) {
            map.put(status.value, status);
        }
    }

    public static EnumTest valueOf(int value) {
        return map.get(value);
    }
}
