package com.xmacedo.corebankledger.service;

import com.xmacedo.corebankledger.model.Account;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.UUID;

public class AccountService {
    private static List<Account> accounts;
    private static Currency currency;

    public AccountService() {
        this.accounts = new ArrayList<>();
        this.currency = Currency.getInstance("BRL");
    }

    public void createAccount(String documentId, String name, boolean allowNegativeBalance, BigDecimal limit) {

        if (documentId == null || currency == null) {
            //raise exception
        }

        if (checkExistAccount(documentId)) {
            //raise exception
        }

        Account account = new Account(UUID.randomUUID(), documentId, name, currency, allowNegativeBalance, limit);
        accounts.add(account);
    }

    public boolean checkExistAccount(String documentId) {
        return accounts.stream()
                .anyMatch(account -> account.getDocumentId()
                        .equals(documentId));

    }

    public List<Account> getAccounts(){
        return accounts;
    }
}
