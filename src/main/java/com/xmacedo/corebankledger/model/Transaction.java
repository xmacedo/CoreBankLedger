package com.xmacedo.corebankledger.model;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

public record Transaction(UUID id, String description, List<Entry> entries, Instant createdAt) {
    public Transaction{
        if(entries.isEmpty()){
            throw new IllegalArgumentException("Transaction must have at least one entry");
        }
    }
}
