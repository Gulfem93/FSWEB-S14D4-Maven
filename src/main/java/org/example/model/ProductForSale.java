package org.example.model;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;


    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public abstract void showDetails();

    public double  getSalesPrice(int quantity){
        return quantity*price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductForSale{");
        sb.append("type=").append(type);
        sb.append(", price=").append(price);
        sb.append(", description=").append(description);
        sb.append('}');
        return sb.toString();
    }

    
}