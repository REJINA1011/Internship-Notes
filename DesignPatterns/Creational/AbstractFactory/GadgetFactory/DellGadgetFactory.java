package com.f1soft.Task.DesignPatterns.Creational.AbstractFactory.GadgetFactory;

public class DellGadgetFactory extends GadgetFactory{

    @Override
    public Laptop makeLaptop() {
        return new DellLaptop();
    }

    @Override
    public Monitor makeMonitor() {
        return new DellMonitor();
    }
}
