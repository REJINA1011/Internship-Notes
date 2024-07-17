package com.f1soft.Task.DesignPatterns.Behavioral.Command.StockOperation;

public class Stock {
    private String name="hello";
    private int quantity=10;

    public void buy() {
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");

    }

}
