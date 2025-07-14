package org.example.model;

public class Store {
    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            if(product != null){
                product.showDetails();
            }
            
        }
    }

    public static void main(String[] args) {
        // Create an array of ProductForSale objects
        ProductForSale[] products = new ProductForSale[5];
        
        // Initialize with concrete products
        products[0] = new Chocolate("sweet", 15, "check desc");
        products[1] = new Bread("Bakey", 5, "br desc", "einkorn", "brown");
        products[2] = new Coke("Drinks", 15, "dr desc", true, 2.5);
        
        // List all products
        listProducts(products);
        
        // Demonstrate getSalesPrice
        System.out.println("Total for 3 chocolates: $" + 
                         products[0].getSalesPrice(3));
    }
}