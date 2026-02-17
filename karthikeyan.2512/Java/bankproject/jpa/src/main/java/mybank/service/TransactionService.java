package mybank.service;

import mybank.dao.AccountDAO;
import mybank.dao.TransactionDAO;

import javax.swing.*;
import java.util.Scanner;

public class TransactionService {
    AccountDAO accountDAO;
    TransactionDAO transactionDAO ;
    Scanner input;

    public TransactionService(){
        accountDAO = new AccountDAO();
        transactionDAO = new TransactionDAO();
        input = new Scanner(System.in);}


    public void UIForSelfTransfer() {
        try {
            System.out.print("Please enter the amount you would like to transfer:");
            double amount = Double.parseDouble(input.nextLine());

            System.out.print("Please enter the from account id:");
            int fromAccount = Integer.parseInt(input.nextLine());

            System.out.print("Please enter the to account id:");
            int toAccount = Integer.parseInt(input.nextLine());

            selfTransfer(fromAccount, toAccount, amount);
        }catch(Exception e){
            System.out.println("Invalid input");
        }
    }

    public void selfTransfer(int fromAccount, int toAccount, double amount) {
        if (fromAccount == toAccount) {
            System.out.println("Can't transfer because both are same Account");
            return;
        }
        if (accountDAO.getAccountByUserId(LoginService.currentUser.getUid(), fromAccount) == null){
            System.out.println("Account doesn't exist");
            return;
        }
        if (accountDAO.getAccountByUserId(LoginService.currentUser.getUid(), toAccount) == null) {
            System.out.println("Account doesn't exist");
            return;
        }
        accountDAO.withdrawAmount(fromAccount, amount);
        accountDAO.depositAmount(toAccount, amount);
        transactionDAO.selfTransferFunds(LoginService.currentUser.getUid() , fromAccount , toAccount , amount);
    }


    public void UIForAnotherTransfer() {
        System.out.print("Enter the UserId to transfer:");
        String toUserId = input.nextLine();
        System.out.print("Enter your Account Id: ");
        int fromAccount = Integer.parseInt(input.nextLine());
        System.out.print("Enter the receiver Account Id: ");
        int toAccount = Integer.parseInt(input.nextLine());
        System.out.print("Enter the amount you would like to transfer:");
        double amount = Double.parseDouble(input.nextLine());
    }

    public void anotherUserTransfer(String toUser , int fromAccount, int toAccount, double amount) {
        if (accountDAO.getAccountByUserId(LoginService.currentUser.getUid(), fromAccount) == null){
            System.out.println("Your Account doesn't exist");
            return;
        }
        if(accountDAO.getAccountByUserId(toUser, toAccount) == null){
            System.out.println("Receiver Account doesn't exist");
            return;
        }
        accountDAO.withdrawAmount(fromAccount, amount);
        accountDAO.depositAmount(toAccount, amount);
        transactionDAO.transferToAnotherUser(LoginService.currentUser.getUid() , toUser, fromAccount , toAccount , amount);
    }
}
