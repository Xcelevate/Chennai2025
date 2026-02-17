package com.Day3Test.MocitoTest;

import com.Day3Task.Mockito.Inventory;
import com.Day3Task.Mockito.OrderService3;
import com.Day3Task.Mockito.PaymentGateway;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;



@ExtendWith(MockitoExtension.class)
class OrderService3Test {

    @Mock
    private Inventory inventory;
    @Mock
    private PaymentGateway pg;

    @InjectMocks
    private OrderService3 o3;


    @Test
    void whenStockAvailable() {

        when(inventory.inStock("kk")).thenReturn(true);
        when(pg.charge("IT019", 50000)).thenReturn("Hiii");

        String result = o3.place("kk", "IT019", 50000);

        assertEquals("Hiii", result);
        verify(inventory).inStock(any());
        verify(pg).charge(any(), anyInt());

    }


    @Test
    void whenStockNotAvailable() {
        when(inventory.inStock("kk")).thenReturn(false);


        String result = o3.place("kk", "IT019", 50000);

        assertEquals("out_of_stock", result);
        verify(inventory).inStock("kk");
        verifyNoInteractions(pg);
    }
}