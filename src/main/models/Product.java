package main.models;
import java.util.Date;

public class Product {
    private String productName;
    private int productId;
    private double price;
    private int quantity;
    private String manufacturer;
    private String category;

    public Product(String productName, int productId, double price, int quantity, String manufacturer, String category) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCategory() {
        return category;
    }
}