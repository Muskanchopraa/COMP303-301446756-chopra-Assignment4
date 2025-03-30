package com.example.Order.Service;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private String stockSymbol;
    private int quantity;
    private double price;
    private String userId;

    // Constructors, Getters, and Setters
}
