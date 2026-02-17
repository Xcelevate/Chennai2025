package com.Day3Test.SpyTest;

import com.Day3Task.Mockito.QueueReader;
import com.Day3Task.Mockito.QueueService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class QueueServiceTest {

    @Spy
    QueueReader qr;

    @InjectMocks
    QueueService qs;


    @Test
    void  testingQueueService() {
        assertEquals("null|null",qs.readTwice());

        doReturn("Hello").when(qr).read();

        assertEquals("Hello|Hello" , qs.readTwice());

    }

}
