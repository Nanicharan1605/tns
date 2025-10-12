package junit_testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Demo {

    @DisplayName("JUnit Testing - Show Method")
    @RepeatedTest(2)
    void show() {
        System.out.println("This is show method");
    }

    @Disabled("Skipping this test temporarily")
    @Test
    void sayHi() {
        System.out.println("This is Hi method");
    }

    @DisplayName("JUnit Testing - Hello Method")
    @Test
    void hello() {
        System.out.println("This is hello method");
    }
}
