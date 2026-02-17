package com.Day3Test.MocitoTest;

import com.Day3Task.Mockito.EmailSender;
import com.Day3Task.Mockito.NotificationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class NotificationServiceTest {

    @Mock
    EmailSender sender;

    @InjectMocks
    NotificationService ns;


    @Test
    void sendNotification() {
        when(sender.send("karthik" ,"Welcome")).thenReturn(true);
        //doReturn(true).when(sender.send("karthik" ,"Welcome"));

       boolean boo =  ns.notifyUser("karthik");
       assertTrue(boo);
    }

}
