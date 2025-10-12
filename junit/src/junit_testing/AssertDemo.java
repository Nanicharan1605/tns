package junit_testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertDemo {

    @Disabled("Skipping this test temporarily") // replaces JUnit 4 @Ignore
    @Test
    void testAssertTrue() {
        assertTrue("Hello".contains("H"), "String should contain 'H'");
    }

    @Test
    void assertEqualsMethod() {
        int res = 2;
        int exp = 2;
        assertEquals(exp, res, "Expected and actual values should match");
    }

    @Test
    void testNull() {
        String s = null;
        assertNull(s, "String should be null");
    }
}
