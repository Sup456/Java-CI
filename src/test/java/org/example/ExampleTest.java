package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {
    @Test
    void success_test() {
        String a = "Hello";
        a = Example.addTestPostfix(a);
        assertTrue(a.equals("HelloTest"));
    }
}
