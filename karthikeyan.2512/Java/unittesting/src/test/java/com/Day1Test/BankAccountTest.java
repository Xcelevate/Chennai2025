package com.Day1Test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void checkSetBalance() {
        BankAccount ba = new BankAccount();
        ba.deposit(10000);
        ba.deposit(1000);
        assertEquals(11000, ba.getBalance());
    }
    @Test
    void checkDeposit() {
        // Arrange
        BankAccount ba = new BankAccount();

        //Act
        ba.deposit(100);
        ba.deposit(500);

        //Assert
        assertEquals(600, ba.getBalance());
    }
    @Test
    void checkWithdraw1() {
        //Arrange
        BankAccount ba = new BankAccount();
        //Act
        ba.deposit(100);
        ba.deposit(500);
        //Assert
        assertThrows(IllegalArgumentException.class, () -> ba.withdraw(700));
    }

    @Test
    void checkWithdraw2() {
        // Arrange
        BankAccount ba = new BankAccount();
        // Act
        ba.deposit(100);
        ba.deposit(500);
        ba.withdraw(500);
        // Assert
        assertEquals(100, ba.getBalance());
    }
}
