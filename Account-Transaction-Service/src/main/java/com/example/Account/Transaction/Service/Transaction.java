package com.example.Account.Transaction.Service;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transactions")
public class Transaction {
    @Id
    private String id;
    private String userId;
    private double amount;
    private String type; // "BUY" or "SELL"

    // Constructors
    public Transaction() {}
    public Transaction(String userId, double amount, String type) {
        this.userId = userId;
        this.amount = amount;
        this.type = type;
    }

    // Getters and Setters
}
