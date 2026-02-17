package com.Day3Test.SpyTest;


import com.Day3Task.Spy.PriceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class PriceServiceTest {

    @Spy
    PriceService ps;

    @Test
    void  testingPriceService(){
        doReturn(22).when(ps).applyTax(anyInt());
       // doReturn(44).when(ps).applyTax(40);

       assertEquals(44 ,ps.totalPrice(40,20));
//       assertEquals(22 ,ps.totalPrice(10,10));
//       assertEquals(32 , ps.totalPrice(15,15));
    }
}
