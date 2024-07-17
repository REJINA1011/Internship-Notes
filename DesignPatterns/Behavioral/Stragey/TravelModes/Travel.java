package com.f1soft.Task.DesignPatterns.Behavioral.Stragey.TravelModes;

public class Travel {
    private Transportation transportation;

    public Travel(Transportation transportation){
        this.transportation=transportation;
    }

    public void setTravelMode(){
        transportation.travelMode();
    }
}
