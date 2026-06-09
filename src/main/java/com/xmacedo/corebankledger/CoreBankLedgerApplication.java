package com.xmacedo.corebankledger;

import com.xmacedo.corebankledger.model.Account;
import com.xmacedo.corebankledger.service.AccountService;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class CoreBankLedgerApplication {
    private static final AccountService accountService = new AccountService();

    static void main(String[] args) {
        startAccountCreation();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while(running){
            printMenu();
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("1 - Create account");
                    createAccountInput(scanner);
                    scanner.nextLine();
                    break;
                case "2":
                    System.out.println("2 - List accounts");
                    listAccounts();
                    scanner.nextLine();
                    break;
                case "3":
                    System.out.println("Transfer");
                    break;
                case "4":
                    System.out.println("View funds");
                    break;
                default:
                    running = false;
                    break;
            }
        }

        scanner.close();
    }

    private static void listAccounts() {
        List<Account> accounts = accountService.getAccounts();
        System.out.println("Number of accounts: "+ accounts.size());
        System.out.println("");
        accounts.forEach(account -> {
            System.out.println("------------");
            System.out.println("ID      : "+ account.getId());
            System.out.println("Document: "+ account.getDocumentId());
            System.out.println("Name    : "+ account.getName());
            System.out.println("------------");
            System.out.println("");
        });
        System.out.println("End of accounts list.");
    }

    private static void createAccountInput(Scanner scanner) {
        System.out.println("Enter document id: ");
        String documentId = scanner.nextLine();
        System.out.println("Enter account name: ");
        String accountName = scanner.nextLine();

        accountService.createAccount(documentId, accountName,true, BigDecimal.ZERO);

        System.out.println("Account created successfully!");
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("Core Bank Ledger");
        System.out.println("1. Create account");
        System.out.println("2. List accounts");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. View funds");
        System.out.println("0. Exit");
        System.out.print("Choose your choice: ");
    }


    private static void startAccountCreation(){
        accountService.createAccount("123.456.789-00", "John Doe",true, BigDecimal.ZERO);
    }

}
