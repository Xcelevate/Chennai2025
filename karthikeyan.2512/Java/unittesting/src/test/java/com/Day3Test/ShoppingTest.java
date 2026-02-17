package com.Day3Test;

import com.Day3Task.Shopping;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingTest {

    Shopping shop;
    @BeforeEach
    void  setUp() {
       shop =new Shopping();
    }

    @Nested
    class AddItems{

        @Test
        void shouldAddItemInList(){
            shop.add("apple");
            assertEquals(1 , shop.size());
            assertTrue( shop.items().contains("apple"));
        }
        @Test
        void throwExceptionWhenNullAdd(){
            assertThrows(IllegalArgumentException.class , () -> shop.add(null));
        }
        @Test
        void addBlankShouldThrowException(){
            assertThrows(IllegalArgumentException.class , () -> shop.add("  "));
        }
    }

    @Nested
    class RemoveItems{
        @Test
        void removeExistingElement(){
            shop.add("banana");
            shop.remove("banana");
            assertEquals(0 , shop.size());
            assertTrue(shop.items().isEmpty());
        }
        @Test
        void removeNonExistingElement(){
            shop.add("apple");
            assertFalse( shop.remove("banana"));
            assertEquals(1 , shop.size());
        }
    }

    @Nested
    class EmptyShopping{
        @Test
        void removeElementFromEmptyList(){
            assertFalse(shop.remove("karthik"));
        }

        @Test
        void initialSizeCheck(){
            assertEquals(0 , shop.size());
        }

        @Test
        void initialListEmptyCheck(){
            assertTrue(shop.items().isEmpty());
        }
    }
}
