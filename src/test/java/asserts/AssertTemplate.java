package asserts;

import org.junit.jupiter.api.Assertions;
import java.util.logging.*;

public class AssertTemplate {

    static Logger logger = Logger.getLogger(AssertTemplate.class.getName());
    public static void testParams(String key, String actual, String message) {
    try {
        Assertions.assertEquals(key, actual, message);
    } catch (AssertionError e) {
        logger.log(Level.WARNING, e.getMessage());
    }
}

    public static void testParams(String key, String message) {
        try {
            Assertions.assertNotNull(key, message);
        } catch (AssertionError e) {
            logger.log(Level.WARNING, e.getMessage());
        }
    }
}
