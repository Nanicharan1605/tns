package junit_testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTest {

    @ParameterizedTest
    @ValueSource(strings = {"cali", "bali"})
    void endsWithI(String str) {
        assertTrue(str.endsWith("i"), "String should end with 'i'");
    }
}
