package com.example.Order.Service;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.Order.Service.Order;
public interface OrderRepository extends MongoRepository<Order, String> {
}
