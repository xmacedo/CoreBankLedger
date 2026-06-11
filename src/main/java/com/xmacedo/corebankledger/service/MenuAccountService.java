package com.xmacedo.corebankledger.service;

import com.xmacedo.corebankledger.model.Account;
import java.util.List;
import java.util.Scanner;

public class MenuAccountService {
    private static final AccountService accountService = new AccountService();

    public void findAccount(Scanner scanner) {
        // by what?
        listAccounts();
    }

    public void checkAccount(Scanner scanner) {
        listAccounts();
        System.out.println("Enter account number you want to check: ");
        Integer accountNumber = Integer.valueOf(scanner.nextLine());
        showAccountDetails(accountNumber);
        System.out.println("What do you want to do?");
        printMenuAccount();
        //scanner.nextLine();
        switch (scanner.nextLine()) {
            case "1":
                System.out.println("Transfer");
                break;
            case "2":
                System.out.println("Deposit");
                break;
            case "3":
                System.out.println("Withdraw");
                break;
            case "4":
        }
    }

    private void printMenuAccount() {
        System.out.println("1. Transfer");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Close account");
        System.out.println("0. Back");
    }

    private void showAccountDetails(Integer accountNumber) {
        System.out.println("Account details");
        System.out.println();
        Account account = accountService.getAccountByNumber(accountNumber);
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Document ID: " + account.getDocumentId());
        System.out.println("Name: " + account.getName());
        System.out.println("Currency: " + account.getCurrency());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Status: " + account.getStatusAccount());
        System.out.println("Limit: " + account.getLimit());
        System.out.println("Allow negative balance: " + account.isAllowNegativeBalance());
        System.out.println();
    }

    public void listAccounts() {
        List<Account> accounts = accountService.getAccounts();
        System.out.println("Number of accounts: " + accounts.size());
        System.out.println("");
        accounts.forEach(account -> {
            System.out.println("------------");
            System.out.println("ID       : " + account.getId());
            System.out.println("Ac Number: " + account.getAccountNumber());
            System.out.println("Document : " + account.getDocumentId());
            System.out.println("Name     : " + account.getName());
            System.out.println("------------");
            System.out.println(" ");
        });
        System.out.println("End of accounts list.");
    }
}
