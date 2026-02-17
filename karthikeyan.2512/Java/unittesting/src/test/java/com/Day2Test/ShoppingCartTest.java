package com.Day2Test;

import com.Day2Task.ShoppingCart;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;


public class ShoppingCartTest {


    @Nested
    class AddItem{
        static ShoppingCart shoppingCart = new ShoppingCart();


        @ParameterizedTest
        @Order(1)
        @ValueSource(strings = {"karthik"})
        void addItem(String item) {
            shoppingCart.addItem(item);

        }
    }
}
