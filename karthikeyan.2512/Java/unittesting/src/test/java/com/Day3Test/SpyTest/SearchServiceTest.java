package com.Day3Test.SpyTest;


import com.Day3Task.Mockito.Reporter;
import com.Day3Task.Mockito.SearchService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class SearchServiceTest {

    @Spy
    Reporter repo;

    @InjectMocks
    SearchService service;

    @Test
    void testingSearchMethod() {
        //doReturn("search:Karthik").when(repo).send(anyString());
        service.search("karthik");

        verify(repo).send(eq("search:" + "karthik"));
    }
}
