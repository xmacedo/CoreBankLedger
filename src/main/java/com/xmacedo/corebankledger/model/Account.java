package com.xmacedo.corebankledger.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

public class Account {
    private final UUID id;
    private final String documentId;
    private final String name;
    private final Currency currency;
    private final boolean allowNegativeBalance;
    private final StatusAccount statusAccount;
    private final BigDecimal limit;
    private final BigDecimal balance;

    public Account(UUID id, String documentId, String name, Currency currency, boolean allowNegativeBalance, BigDecimal limit) {
        this.id = id;
        this.documentId = documentId;
        this.name = name;
        this.currency = currency;
        this.allowNegativeBalance = allowNegativeBalance;
        this.statusAccount = StatusAccount.ACTIVE;
        this.limit = limit;
        this.balance = BigDecimal.ZERO;
    }

    public UUID getId() {
        return id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public boolean isAllowNegativeBalance() {
        return allowNegativeBalance;
    }

    public String getDocumentId() {
        return documentId;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public StatusAccount getStatusAccount() {
        return statusAccount;
    }

    public String getName() {
        return name;
    }
}
