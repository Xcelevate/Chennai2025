package com.xcelevate;

import com.Day1Test.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount(5);
    }

    @Nested
    class Deposit {
        @Test
        public void depositShouldIncreaseBalance() {
            bankAccount.deposit(100);
            assertEquals(100, bankAccount.getBalance());
        }

        @Test
        public void shouldThrowExceptionWhenNegativeDeposit() {
            assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(-100));

        }

        @Test
        void multipleDepositsShouldIncreaseBalance() {
            bankAccount.deposit(100);
            bankAccount.deposit(100);
            bankAccount.deposit(100);
            assertEquals(300, bankAccount.getBalance());
        }
    }

    @Nested
    class Withdraw {
        @Test
        public void withdrawShouldDecreaseBalance() {
            bankAccount.deposit(100);
            bankAccount.withdraw(50);
            assertEquals(50, bankAccount.getBalance());
        }

        @Test
        public void withdrawMoreThanBalanceShouldThrowException() {
            bankAccount.deposit(100);
            assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(150));
        }

        @Test
        void withdrawExactBalanceShouldLeaveZero() {
            bankAccount.deposit(100);
            bankAccount.withdraw(100);
            assertEquals(0, bankAccount.getBalance());
        }

        @Test
        void balanceShouldNotChangeAfterFailedWithdraw() {
            bankAccount.deposit(100);
            assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(200));
            assertEquals(100, bankAccount.getBalance());
        }
            @Test
            void multipleWithdrawalsShouldDecreaseBalance () {
                bankAccount.deposit(1000);
                bankAccount.withdraw(100);
                bankAccount.withdraw(50);
                bankAccount.withdraw(200);
                assertEquals(650, bankAccount.getBalance());
            }
        }
    }
