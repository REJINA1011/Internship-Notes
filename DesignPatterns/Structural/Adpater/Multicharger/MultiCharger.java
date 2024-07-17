package com.f1soft.Task.DesignPatterns.Structural.Adpater.Multicharger;

public class MultiCharger implements Charger{

    private CableAdapter cableAdapter;
    @Override
    public void charge(String cableType) {
        if(cableType.equalsIgnoreCase("microUsb")){
            System.out.println("Charging with Micro USB");
        } else if (cableType.equalsIgnoreCase("TypeC")|| cableType.equalsIgnoreCase("typeA")) {
            cableAdapter=new CableAdapter(cableType);
            cableAdapter.charge(cableType);
        }else {
            System.out.println("Cable not available");
        }
    }
}
