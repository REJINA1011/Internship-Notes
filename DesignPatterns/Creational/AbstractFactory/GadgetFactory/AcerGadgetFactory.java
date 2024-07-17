package com.f1soft.Task.DesignPatterns.Creational.AbstractFactory.GadgetFactory;

public class AcerGadgetFactory extends GadgetFactory{
    @Override
    public Laptop makeLaptop() {
        return new AcerLaptop();
    }

    @Override
    public Monitor makeMonitor() {
        return new AcerMonitor();
    }
}
