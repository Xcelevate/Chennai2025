package com.Day3Test;

import com.Day3Task.Resource;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ResourceTest {

    @Nested
    class ResourceLifeCycle {
         Resource resource;

        @BeforeEach
         void setUp() {
            resource = new Resource();
        }

        @AfterEach
        void tearDown() {
            resource.release();
        }

        @Test
        void beforeReleaseShouldFalse() {
            assertFalse(resource.isReleased());
        }

        @Test
        void resourceInitiallyNotReleased() {
            assertFalse(resource.isReleased());
        }

        @Test
        void afterReleaseShouldTrue() {
            assertFalse(resource.isReleased());
        }
    }

}