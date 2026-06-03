package com.xmacedo.corebankledger.model;

import java.util.Currency;
import java.util.UUID;

public class Account {
    private final UUID id;
    private final String ownerName;
    private final Currency currency;
    private final boolean allowNegativeBalance;
    //active
    //limit


    public Account(UUID id, String ownerName, Currency currency, boolean allowNegativeBalance) {
        this.id = id;
        this.ownerName = ownerName;
        this.currency = currency;
        this.allowNegativeBalance = allowNegativeBalance;
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
}
