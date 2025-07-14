package org.example.model;

public class Chocolate extends ProductForSale {
    private String color;
    private Boolean hasSuger;


    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }


    public Chocolate(String type, double price, String description, String color, Boolean hasSuger) {
        super(type, price, description);
        this.color = color;
        this.hasSuger = hasSuger;
    }
    
    @Override
    public void showDetails(){
        System.out.println(super.toString() + this);
    }


    @Override
    public String toString() {
        return "Chocolate [color=" + color + ", hasSuger=" + hasSuger + "]";
    }
    
}