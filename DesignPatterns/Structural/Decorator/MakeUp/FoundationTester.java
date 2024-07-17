package com.f1soft.Task.DesignPatterns.Structural.Decorator.MakeUp;

public class FoundationTester {
    public static void main(String[] args){

        Gender girl =new Girl();

        Gender girlFoundation= new DryFoundation(new Girl());

        Gender boyFoundation = new DryFoundation(new Boy());

        girlFoundation.oilySkin();
        System.out.println();
        boyFoundation.oilySkin();
    }
}
