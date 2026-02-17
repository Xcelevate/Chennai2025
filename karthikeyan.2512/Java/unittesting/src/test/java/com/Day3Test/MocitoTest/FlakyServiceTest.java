package com.Day3Test.MocitoTest;

import com.Day3Task.Mockito.Processor;
import com.Day3Task.Mockito.FlakyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class FlakyServiceTest {

    @Mock
    Processor p;

    @InjectMocks
    FlakyService service;

    @Test
    void checksMockObjecftResult(){
        when(p.process("karthik")).thenThrow(new RuntimeException()).thenReturn("ok");

        assertThrows(RuntimeException.class , () -> service.attempt("karthik"));
        assertEquals("ok", service.attempt("karthik"));
        assertEquals("ok", service.attempt("karthik"));

        verify(p , never()).process(any());

        //assertThrows(RuntimeException.class , () -> service.attempt("karthik"));
    }
}
