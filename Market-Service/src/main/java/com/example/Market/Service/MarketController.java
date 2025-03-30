package com.example.Market.Service;



import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/market")
public class MarketController {
    private final MarketOrderService service;

    public MarketController(MarketOrderService service) {
        this.service = service;
    }

    @PostMapping
    public MarketOrder processOrder(@RequestBody MarketOrder order) {
        return service.processOrder(order);
    }

    @GetMapping
    public List<MarketOrder> getOrders() {
        return service.getAllOrders();
    }
}
