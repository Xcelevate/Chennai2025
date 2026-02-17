package com.Day3Test;

import com.Day3Task.Session;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SessionTest {
    Session session;
    @BeforeEach
    public void setUp() {
        session = new Session();
    }
    @Nested
    class sessionTest {
        @Test
        @Order(1)
         void beforeOpenSessionShouldBeClose(){
            assertFalse(session.isOpen());
        }

        @Test
        @Order(2)
         void afterOpenSessionShouldBeOpen(){
            session.open();
            assertTrue(session.isOpen());
        }

        @Test
        @Order(3)
         void openSessionShouldOpen(){
            session.open();
            assertTrue(session.isOpen());
        }
        @Test
        @Order(4)
         void closeSessionShouldBeClosed(){
            session.close();
            assertFalse(session.isOpen());
        }
    }
}