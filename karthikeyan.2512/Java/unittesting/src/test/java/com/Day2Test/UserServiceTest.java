package com.Day2Test;

import com.Day2Task.Math2;
import com.Day2Task.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    private  UserService userService;
    @BeforeEach
    public void setUp() {
        userService = new UserService();
    }
    @Nested
    class Register{

        @ParameterizedTest
        @ValueSource(strings = {"karthik" , "hari" , "hffds","jlhn","khbhj"})
        void testingRegisterWithValid(String actual) {
            // Act & Assert
            assertTrue(userService.register(actual));
        }

        @Test
        void testingRegisterWithInvalid() {
            // Act & Assert
            assertFalse(userService.register(null));
        }
    }

    @Nested
    class Login{

        @ParameterizedTest
        @ValueSource(strings = {"karthik" , "jbfkdgk" , "ghrow", "gbkbvv","mn","bvmnfbm"})
        void testingLoginWithInValid(String actual) {
            // Act & Assert
            assertFalse(userService.login(actual));
        }

        @Test
        void testingLoginWithvalid() {
            // Act & Assert
            assertTrue(userService.login("admin"));
        }
    }
}
