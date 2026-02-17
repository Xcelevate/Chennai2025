package mybank;

import mybank.exception.UserNotFoundException;
import mybank.service.AccountService;
import mybank.service.LoginService;
import mybank.service.TransactionService;

import java.util.Scanner;

public class Menu {
    LoginService loginService;
    AccountService accountService;
    TransactionService transactionService;
    Scanner kk = new Scanner(System.in);

    Menu() {
        loginService = new LoginService();
        accountService = new AccountService();
        transactionService = new TransactionService();
    }

    public void showLoginMenu() {
        System.out.println("\nWelcome to Login Menu\n");
        System.out.println("\n1. Login\n2. Exit");
        System.out.print("Choice: ");
        String choice = kk.nextLine();

        switch (choice) {
            case "1" -> {
                System.out.print("UserID: ");
                String uid = kk.nextLine();
                System.out.print("Password: ");
                String pwd = kk.nextLine();
                try {
                    if (loginService.login(uid.trim(), pwd.trim())) {
                        System.out.println("\nLogin successful! Welcome, " + uid);
                    } else {
                        System.out.println("Invalid credentials.");
                    }
                } catch (UserNotFoundException e) {
                    System.out.println("Invalid username or password.");
                }
            }
            case "2" -> System.exit(0);
            default -> System.out.println("Invalid choice.");

        }
    }

    public void showMainMenu() {
        System.out.println("\nWelcome to My Bank");
        System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. View My Accounts");
        System.out.println("2. Create New Account");
        System.out.println("3. View Balance");
        System.out.println("4. Deposit Money");
        System.out.println("5. Withdraw Money");
        System.out.println("6. Transfer Money");
        System.out.println("7. Delete Account");
        System.out.println("8. Logout");
        System.out.print("Selection: ");

        String choice = kk.nextLine();

        switch (choice) {
            case "1" -> accountService.listAccounts();
            case "2" -> {
                System.out.print("Enter initial deposit amount: ");
                double amount = Double.parseDouble(kk.nextLine());
                accountService.createAccount(amount);
                System.out.println("Account created successfully.");
            }
            case "3" -> {
                int id = promptAccountId();
                double bal = accountService.getBalanceByAccId(id);
                if (bal == 0) {
                    System.out.println("no such account exists.");
                    return;
                }
                System.out.println("Current Balance: $" + bal);
            }
            case "4" -> {
                int id = promptAccountId();
                System.out.print("Amount to deposit: ");
                double amt = Double.parseDouble(kk.nextLine());
                accountService.deposit(id, amt);
            }
            case "5" -> {
                int id = promptAccountId();
                System.out.print("Amount to withdraw: ");
                double amt = Double.parseDouble(kk.nextLine());
                accountService.withdraw(id, amt);
                System.out.println("Withdrawal complete.");
            }
            case "6" -> {
                System.out.println("1. self \n2. Another User");
                System.out.print("selection: ");
                int trans = Integer.parseInt(kk.nextLine());
                if(trans == 1){
                    transactionService.UIForSelfTransfer();
                }
                else if(trans == 2){
                    transactionService.UIForAnotherTransfer();
                }
                else{
                    System.out.println("invalid input");
                }

            }
            case "7" -> {
                int id = promptAccountId();
                accountService.deleteAccount(id);
            }
            case "8" -> new LoginService().logout();
            default -> System.out.println("Invalid option.");
        }

    }

    public void entryPoint() {
        while (true) {
            try {
                if (!loginService.isLoggedIn()) {
                    showLoginMenu();
                } else {
                    showMainMenu();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public int promptAccountId() {
        System.out.print("Enter Account ID: ");
        return Integer.parseInt(kk.nextLine());
    }
}
