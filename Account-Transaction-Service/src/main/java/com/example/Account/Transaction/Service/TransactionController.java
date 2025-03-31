package com.example.Account.Transaction.Service;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController  // Changed from @Controller to @RestController
@CrossOrigin(origins = "http://localhost:8083")  // Allow only this origin
@RequestMapping("/transactions") // We will handle the /transactions endpoint directly
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    // Handle GET request to retrieve all transactions
    @GetMapping
    public List<Transaction> getTransactions() {
        return transactionService.getAllTransactions();
    }

    // Handle POST request to process a new transaction
    @PostMapping
    public Transaction processTransaction(@RequestBody Transaction transaction) {
        return transactionService.processTransaction(transaction);
    }
}
