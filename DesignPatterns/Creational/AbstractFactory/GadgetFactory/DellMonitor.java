package com.f1soft.Task.DesignPatterns.Creational.AbstractFactory.GadgetFactory;

public class DellMonitor implements Monitor{
    @Override
    public void size(int length, int breadth) {
        System.out.println("Size of DellMonitor is:["+length+"X"+breadth+"]");

    }
}
