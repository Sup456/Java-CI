package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    @Tag("test1")
    void success_test1() {
        String a = "Hello";
        a = Example.addTestPostfix(a);
        assertTrue(a.equals("HelloTest"));
    }

    @Test
    @Tag("test2")
    void success_test2() {
        String a = "World";
        a = Example.addTestPostfix(a);
        assertTrue(a.equals("WorldTest"));
    }
}
