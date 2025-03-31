package com.example.Order.Service;


import org.springframework.stereotype.Service;
import java.util.List;
import com.example.Order.Service.Order;

@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Order placeOrder(Order order) {
        return repository.save(order);
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }
}

