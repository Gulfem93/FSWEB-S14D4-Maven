package org.example.model;

public class Coke extends ProductForSale {
    private boolean hasSuger;
    private double size;


    public Coke(String type, double price, String description) {
        super(type, price, description);
    }


    public Coke(String type, double price, String description, boolean hasSuger, double size) {
        super(type, price, description);
        this.hasSuger = hasSuger;
        this.size = size;
    }

    @Override
    public void showDetails(){
        System.out.println(super.toString() + this);
    }


    @Override
    public String toString() {
        return "Coke [hasSuger=" + hasSuger + ", size=" + size + "]";
    }

    
    

    
}