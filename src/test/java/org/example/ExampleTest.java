package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {
    @Tag("test1")
    @Test
    void success_test1() {
        String a = "Hello";
        a = Example.addTestPostfix(a);
        assertTrue(a.equals("HelloTest"));
    }

    @Tag("test2")
    @Test
    void success_test2() {
        String a = "World";
        a = Example.addTestPostfix(a);
        assertTrue(a.equals("WorldTest"));
    }
}
