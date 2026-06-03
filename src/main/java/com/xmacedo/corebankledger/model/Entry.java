package com.xmacedo.corebankledger.model;

import java.time.Instant;
import java.util.UUID;

public record Entry(UUID id, UUID transactionId, UUID accountId, EntryType type, Money amount, Instant occurredAt) {
    public Entry{
        if(amount.amount().signum() <= 0){
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
}
