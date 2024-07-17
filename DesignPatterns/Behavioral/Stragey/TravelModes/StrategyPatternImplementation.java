package com.f1soft.Task.DesignPatterns.Behavioral.Stragey.TravelModes;

public class StrategyPatternImplementation {
    public static void main(String[] args){

        Travel travel= new Travel(new Bicycle());
        travel.setTravelMode();

        travel= new Travel(new Car());
        travel.setTravelMode();
    }
}
