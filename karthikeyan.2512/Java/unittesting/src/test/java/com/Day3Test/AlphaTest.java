package com.Day3Test;

import com.Day3Task.Alpha;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class AlphaTest {
    private static final Alpha alpha = new Alpha();

    @Test
    void testB() {
        assertEquals("B", alpha.b());

    }

    @Test
    void testA() {
        assertEquals("A", alpha.a());

    }
}
