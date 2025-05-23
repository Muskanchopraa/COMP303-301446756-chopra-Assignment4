package com.example.Market.Service;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "market_orders")
public class MarketOrder {
    @Id
    private String id;
    private String stockSymbol;
    private int quantity;
    private double price;
    private String status; // "Pending", "Processed"

    // Constructors
    public MarketOrder() {}
    public MarketOrder(String stockSymbol, int quantity, double price, String status) {
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStockSymbol() {
		return stockSymbol;
	}
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    

    // Getters and Setters
}
