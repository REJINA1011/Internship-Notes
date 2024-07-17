package com.f1soft.Task.DesignPatterns.Creational.FactoryPattern.Payment;

public class CreditCard implements ModeOfPayment{
    @Override
    public void totalPayment(int cost) {
        System.out.println("Payment made by credit card is"+cost);
    }
}
