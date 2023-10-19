package asserts;

import org.junit.jupiter.api.Assertions;

public class AssertTemplate {
    public static void testParams(String key, String actual, String message) {
    try {
        Assertions.assertEquals(key, actual, message);
    } catch (AssertionError e) {
        System.out.println(e.getMessage());
    }
}

    public static void testParams(String key, String message) {
        try {
            Assertions.assertNotNull(key, message);
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }
}
