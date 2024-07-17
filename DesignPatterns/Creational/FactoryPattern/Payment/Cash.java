package com.f1soft.Task.DesignPatterns.Creational.FactoryPattern.Payment;

public class Cash implements ModeOfPayment{
    @Override
    public void totalPayment(int cost) {
        System.out.println("Payment made by cash is"+cost);
    }
}
