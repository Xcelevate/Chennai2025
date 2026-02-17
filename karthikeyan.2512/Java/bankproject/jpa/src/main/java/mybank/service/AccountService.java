package mybank.service;

import mybank.dao.AccountDAO;
import mybank.entities.Account;
import mybank.exception.InitialBalanceException;
import mybank.exception.InsufficientBalanceException;
import mybank.exception.InvalidAmount;
import mybank.util.AccountEntityComparator;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AccountService {
    private final AccountDAO accountdao;

    public AccountService() {
        this.accountdao = new AccountDAO();
    }

    public void listAccounts() {
        List<Account> list = accountdao.getAccountsByUserId(LoginService.currentUser.getUid());
        list.sort(new AccountEntityComparator());
        for (Account account : list) {
            System.out.println(account);
        }
    }

    public void createAccount(double amt) {
        if (amt <= 100) {
            throw new InitialBalanceException("Amount must be greater than 100");
        }
        accountdao.accountCreate(LoginService.currentUser.getUid(), amt);
        System.out.println("Account created successfully");
    }

    public double getBalanceByAccId(int accountId) {
        List<Account> list = accountdao.getAccountsByUserId(LoginService.currentUser.getUid());
        for (Account account : list) {
            if (account.getAccId() == accountId) {
                return account.getBalance();
            }
        }
        return 0.0;
    }

    public void deposit(int accId, double amt) {
        if (amt <= 0) {
            throw new InvalidAmount("Amount must be greater than 0");
        }
        List<Account> list = accountdao.getAccountsByUserId(LoginService.currentUser.getUid());
        for (Account account : list) {
            if (account.getAccId() == accId) {
                accountdao.depositAmount(accId, amt);
                System.out.println("Deposited " + amt + "successfully");
                return;
            }
        }
        System.out.println("account doesn't exist");
    }

    public void withdraw(int accId, double amt) {
        if (amt <= 0) {
            throw new InvalidAmount("Amount must be greater than 0");
        }
        List<Account> list = accountdao.getAccountsByUserId(LoginService.currentUser.getUid());
        for (Account account : list) {
            if (account.getAccId() == accId) {
                if (account.getBalance() >= amt) {
                    accountdao.withdrawAmount(accId, amt);
                    System.out.println("Withdraw Successful");
                    return;
                } else {
                    System.out.println("Insufficient Balance");
                    throw new InsufficientBalanceException("Entered amount higher than you balance");
                }
            }
        }
        System.out.println("Withdraw Failed because account doesn't exist");
    }

    public void deleteAccount(int accId) {
        Account account = accountdao.getAccountByUserId(LoginService.currentUser.getUid() , accId);
        if (account != null) {
            accountdao.deleteAccountByAccId(account.getAccId());
            System.out.println("Account deleted successfully.");
        }else{
            System.out.println("Account not found");
        }
    }
}
