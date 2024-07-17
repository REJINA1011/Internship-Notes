package com.f1soft.Task.DesignPatterns.Behavioral.Stragey.TravelModes;

public class Car implements Transportation{
    @Override
    public void travelMode() {
        System.out.println("Travelling using Car");
    }
}
