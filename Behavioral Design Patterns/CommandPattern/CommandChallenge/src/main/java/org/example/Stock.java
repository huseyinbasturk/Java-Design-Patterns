package org.example;

public class Stock {
    private String name = "Google";
    private int quantity = 1000;

    public void buy(){
        System.out.println("Stock [ Name: " + name + "Quantity: " + quantity + " ]");
    }

    public void sell(){
        System.out.println("Stock [ Name: " + name + "Quantity: " + quantity + " ]");
    }
}
