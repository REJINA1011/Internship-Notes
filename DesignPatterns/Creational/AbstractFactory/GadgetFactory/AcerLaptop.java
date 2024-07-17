package com.f1soft.Task.DesignPatterns.Creational.AbstractFactory.GadgetFactory;

public class AcerLaptop implements Laptop{
    @Override
    public void builtInKeyboard() {
        System.out.println("AcerLaptop has a builtIn keyboard");
    }
}
