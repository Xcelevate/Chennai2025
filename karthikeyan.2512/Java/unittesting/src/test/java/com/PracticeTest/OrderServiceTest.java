package com.PracticeTest;

import com.Practice.OrderService;
import com.Practice.PaymentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;


@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

    @Spy
    PaymentService ps;

    @InjectMocks
    OrderService orderService;

    @Test
    void testing(){
        doReturn(10).when(ps).finalAmount(anyInt());
        //doReturn(100).when(ps).finalAmount(200);

        assertEquals(20 , orderService.placeOrder(100,8754));
    }

}
