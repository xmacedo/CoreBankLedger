package com.xmacedo.corebankledger;

import com.xmacedo.corebankledger.service.AccountService;
import com.xmacedo.corebankledger.service.MenuAccountService;
import java.math.BigDecimal;
import java.util.Scanner;

public class CoreBankLedgerApplication {
    private static final AccountService accountService = new AccountService();
    private static final MenuAccountService menuAccountService = new MenuAccountService();

    static void main(String[] args) {
        startAccountCreation();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while(running){
            printPrincipalMenu();
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("1 - Create account");
                    createAccountInput(scanner);
                    scanner.nextLine();
                    break;
                case "2":
                    System.out.println("2 - List accounts");
                    menuAccountService.listAccounts();
                    scanner.nextLine();
                    break;
                case "3":
                    System.out.println("3 - Find account");
                    menuAccountService.findAccount(scanner);
                    scanner.nextLine();
                    break;
                case "4":
                    System.out.println("4 - Check account");
                    menuAccountService.checkAccount(scanner);
                    break;
                default:
                    running = false;
                    break;
            }
        }

        scanner.close();
    }
    //todo
    //find account by name
    //get account by id
    //get account by document id
    //

    private static void createAccountInput(Scanner scanner) {
        System.out.println("Enter document id: ");
        String documentId = scanner.nextLine();
        System.out.println("Enter account name: ");
        String accountName = scanner.nextLine();

        accountService.createAccount(documentId, accountName,true, BigDecimal.ZERO);

        System.out.println("Account created successfully!");
    }

    private static void printPrincipalMenu() {
        System.out.println();
        System.out.println("Core Bank Ledger");
        System.out.println("1. Create account");
        System.out.println("2. List accounts");
        System.out.println("3. Find account");
        System.out.println("4. Check account");
        System.out.println("0. Exit");
        System.out.print("Choose your choice: ");
    }


    private static void startAccountCreation(){
        accountService.createAccount("123.456.789-00", "John Doe",true, BigDecimal.ZERO);
    }

}
