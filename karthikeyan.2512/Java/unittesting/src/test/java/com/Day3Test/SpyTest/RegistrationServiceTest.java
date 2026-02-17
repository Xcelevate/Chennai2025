package com.Day3Test.SpyTest;


import com.Day3Task.Spy.RegistrationService;
import com.Day3Task.Spy.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class RegistrationServiceTest {

    @Mock
    UserRepository userRepo;


    @InjectMocks
    private RegistrationService regServ;

    @Test
    void testArgumentMatchOnUserRepository() {
        regServ.register("    kar  thik    ");
        verify(userRepo).save("kar  thik");
    }

    @Test
    void shouldThrowExceptionForNull(){
        assertThrows(IllegalArgumentException.class, () -> regServ.register(null));
    }

}
