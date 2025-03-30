package com.example.Account.Transaction.Service;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService service;

    public TransactionController(TransactionService service) {
        this.service = service;
    }

    @PostMapping
    public Transaction processTransaction(@RequestBody Transaction transaction) {
        return service.processTransaction(transaction);
    }

    @GetMapping
    public List<Transaction> getTransactions() {
        return service.getAllTransactions();
    }
}
