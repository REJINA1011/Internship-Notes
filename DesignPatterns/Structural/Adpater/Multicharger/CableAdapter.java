package com.f1soft.Task.DesignPatterns.Structural.Adpater.Multicharger;

public class CableAdapter implements Charger{
    DataCable dataCable;

    public CableAdapter(String cableType){
        if(cableType.equalsIgnoreCase("typeC")){
            dataCable=new TypeC();
        }
        if(cableType.equalsIgnoreCase("typeA")) {
            dataCable=new TypeA();
        }
    }
    @Override
    public void charge(String cableType) {
        if(cableType.equalsIgnoreCase("typeC")){
            dataCable.typeCPort();
        } else if (cableType.equalsIgnoreCase("typeA")) {
            dataCable.typeAPort();
        }
    }
}
