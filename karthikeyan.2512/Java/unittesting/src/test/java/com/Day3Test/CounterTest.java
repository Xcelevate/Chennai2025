package com.Day3Test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import com.Day3Task.Counter;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CounterTest {
    static Counter counter = new Counter();

    @Test
    @Order(1)
    void initialCountShouldZero(){
        assertEquals(0 ,  counter.value());
    }
    @Test
    @Order(3)
    void multipleIncreamentIncreasesCount(){
        counter.inc();
        counter.inc();
        counter.inc();
        counter.inc();
        counter.inc();
        assertEquals(6, counter.value());
    }

    @Test
    @Order(2)
    void oneIncreamentshouldBeOne(){
        counter.inc();
        assertEquals(1, counter.value());
    }
}

