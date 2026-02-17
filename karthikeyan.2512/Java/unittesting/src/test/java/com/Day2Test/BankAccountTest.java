package com.Day2Test;

import com.Day2Task.BankAccount;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Nested
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class Deposit{
       static BankAccount bankAccount = new BankAccount();

        @Test
        @DisplayName("testing the deposit")
        @Order(1)
        void testingDeposit() {
            // Act
             bankAccount.deposit(100);
             int result = bankAccount.getBalance();
             // Assert
            assertEquals(100, result);

        }
        @Test
        @DisplayName("checking the balance")
        @Order(3)
        void checkingBalance() {
            // Assert
            assertEquals(75 ,  bankAccount.getBalance());

        }

        @Test
        @DisplayName("testing the withdraw")
        @Order(2)
        void testingWithdraw() {
            // Act
            bankAccount.withdraw(25);
            int result = bankAccount.getBalance();
            // Assert
            assertEquals(75 ,result);

        }
    }
}
