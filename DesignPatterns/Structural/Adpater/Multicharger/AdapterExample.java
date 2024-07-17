package com.f1soft.Task.DesignPatterns.Structural.Adpater.Multicharger;

public class AdapterExample {
    public static void main(String[] args){

        MultiCharger multiCharger= new MultiCharger();

        multiCharger.charge("microUsb");
        multiCharger.charge("typeC");
        multiCharger.charge("typeA");
    }
}
