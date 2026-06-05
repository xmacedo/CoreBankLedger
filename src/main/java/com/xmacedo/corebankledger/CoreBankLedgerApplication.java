package com.xmacedo.corebankledger;

import java.util.Scanner;

public class CoreBankLedgerApplication {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while(running){
            printMenu();
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Create account");
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

}
