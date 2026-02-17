package com.Day3Test.MocitoTest;

import com.Day3Task.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CheckoutServiceTest {

    @Mock
    private PaymentGateway gateway;

    @InjectMocks
    private CheckoutService service;

    @Test
    void testCheckout() {
        when(gateway.charge(anyString(), anyDouble())).thenReturn("Default");
//        when(gateway.charge("14", 56)).thenReturn("Hiii");

        assertEquals("Default", service.checkout("14", 56));
        assertEquals("Default", service.checkout("493", 30234.5));
    }


}
