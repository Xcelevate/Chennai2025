package com.Day3Test.MocitoTest;

import com.Day3Task.Mockito.Flow;
import com.Day3Task.Mockito.Steps;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class FlowTest {
    @Mock
    Steps step;
    @InjectMocks
    Flow flow;
    @Test
    void  testing(){

        flow.run();

        InOrder inOrder = inOrder(step);

        inOrder.verify(step).step1();
        inOrder.verify(step).step2();
    }
}
