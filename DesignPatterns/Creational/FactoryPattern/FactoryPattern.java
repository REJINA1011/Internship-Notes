package com.f1soft.Task.DesignPatterns.Creational.FactoryPattern;
//step1:make interface
interface Logistics{
    default void printTransportMode(){}

}

//step2: make concrete classes
class RoadLogistics implements Logistics{
    @Override
    public void printTransportMode() {
        System.out.println("RoadLogistic");
    }
}

class SeaLogistics implements Logistics{
    @Override
    public void printTransportMode() {
        System.out.println("SeaLogistic");
    }
}

//step3: object generation class:factory method
class Transport{
    public Logistics getMode(String modeType){
        if(modeType.equalsIgnoreCase("ROAD")){
            return new RoadLogistics();//products
        }
        if(modeType.equalsIgnoreCase("SEA")){
            return new SeaLogistics();//products
        }
        return null;
    }
}

//step4:Main class
public class FactoryPattern {
    public static void main(String[] args){
        Transport transport= new Transport();

        //object passing from Transport to Logistic type variable
        Logistics logistics1= transport.getMode("road");

        Logistics logistics2 =transport.getMode("sea");

        //method implementation
        logistics1.printTransportMode();
        logistics2.printTransportMode();




    }
}
