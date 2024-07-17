package com.f1soft.Task.DesignPatterns.Creational.AbstractFactory.GadgetFactory;

public class MainGadgetFactory {
    public static void main(String[] args){

        GadgetFactory gadgetFactory=new DellGadgetFactory();

        Laptop dellLaptop= gadgetFactory.makeLaptop();

        dellLaptop.builtInKeyboard();
    }
}
