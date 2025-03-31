package com.example.Market.Service;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketOrderService {
    private final MarketOrderRepository repository;

    public MarketOrderService(MarketOrderRepository repository) {
        this.repository = repository;
    }

    public MarketOrder processOrder(MarketOrder order) {
        order.setStatus("Processed");
        return repository.save(order);
    }

    public List<MarketOrder> getAllOrders() {
        return repository.findAll();
    }
}
