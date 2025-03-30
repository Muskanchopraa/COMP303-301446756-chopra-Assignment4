package com.example.Market.Service;


import com.example.Market.Service.MarketOrder;
import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface MarketOrderRepository extends MongoRepository<MarketOrder, String> {
}

