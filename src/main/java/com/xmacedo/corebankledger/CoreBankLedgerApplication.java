package com.xmacedo.corebankledger;

import com.xmacedo.corebankledger.service.AccountService;
import java.math.BigDecimal;
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
                    break;
                case "2":
                    System.out.println("Deposit");
                    break;
                case "3":
                    System.out.println("Transfer");
                    break;
                case "4":
            }
        }

        scanner.close();
    }

    private static void createAccountInput(Scanner scanner) {
        //todo questions to create account

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
        System.out.println("2. Deposit");
        System.out.println("3. Transfer");
        System.out.println("4. View funds");
        System.out.println("5. Exit");
        System.out.print("Choose your choice: ");
    }


    private static void startAccountCreation(){
        accountService.createAccount("123.456.789-00", "John Doe",true, BigDecimal.ZERO);
    }

}
