package com.Day1Test;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class CounterTest {
    private Counter c;
    @BeforeEach
     void init() {
        System.out.println("hiiii");
        c = new Counter();
    }


    @Test
    void checkCount1(){
        // Act
        c.increment();
        c.increment();
        c.increment();
        c.increment();
        c.increment();
        c.increment();
        // Assert
        assertEquals(6 ,  c.getCount());
    }

    @Test
    void checkCount2(){
        // Act
        c.increment();
        c.increment();
        c.increment();
        c.increment();
        // Assert
        assertEquals(4 ,  c.getCount());
    }
    @Test
    void checkCount3(){
        // Act & assert
        assertEquals(0, c.getCount());
    }
}
