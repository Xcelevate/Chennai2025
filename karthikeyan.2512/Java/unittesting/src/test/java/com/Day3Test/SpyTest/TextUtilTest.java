package com.Day3Test.SpyTest;

import com.Day3Task.Mockito.TextUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class TextUtilTest {
    @Spy
    TextUtil text;

    @Test
    void testingTexts() {
        doReturn("X").when(text).upper("x");
        assertEquals("X", text.upper("x"));
        assertEquals("X!", text.shout("x"));
    }
}
