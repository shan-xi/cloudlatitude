package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    public void when_sayHello_success() {
        String got = new Hello().sayHello();
        String want = "Hello";
        Assertions.assertEquals(got, want);
    }
}
