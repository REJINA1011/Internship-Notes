package com.f1soft.Task.DesignPatterns.Creational.AbstractFactory.GadgetFactory;

public class AcerMonitor implements Monitor{
    @Override
    public void size(int length, int breadth) {
        System.out.println("Size of AcerMonitor is:["+length+"X"+breadth+"]");

    }
}
