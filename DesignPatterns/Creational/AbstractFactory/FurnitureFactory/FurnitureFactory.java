package com.f1soft.Task.DesignPatterns.Creational.AbstractFactory.FurnitureFactory;


//abstract Factory(factory responsible to create other distinct factories)
public abstract class FurnitureFactory{
    public abstract Chair createChair();
    public abstract Sofa createSofa();
}
