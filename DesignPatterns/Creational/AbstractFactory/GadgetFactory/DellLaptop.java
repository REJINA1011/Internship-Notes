package com.f1soft.Task.DesignPatterns.Creational.AbstractFactory.GadgetFactory;

public class DellLaptop implements Laptop{
    @Override
    public void builtInKeyboard() {
        System.out.println("DellLaptop has a builtIn keyboard");

    }
}
