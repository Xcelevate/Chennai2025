package com.Day3Test.SpyTest;


import com.Day3Task.Spy.MathLib;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MathLibTest {


    @Spy
    MathLib math ;

    @Test
    void  testingMathLib(){
        doReturn(49).when(math).square(7);
        doReturn(100).when(math).square(10);
        doThrow(new ArithmeticException()).when(math).square(0);

        assertEquals(149 ,math.sumSquares(10 ,7));
        assertThrows(ArithmeticException.class ,() -> math.square(0));
        assertEquals(90,math.sumSquares(9 ,3));
    }

}
