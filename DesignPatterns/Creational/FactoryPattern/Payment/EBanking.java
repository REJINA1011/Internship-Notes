package com.f1soft.Task.DesignPatterns.Creational.FactoryPattern.Payment;

public class EBanking implements ModeOfPayment{
    @Override
    public void totalPayment(int cost) {
        System.out.println("Payment made by E-banking is"+cost);

    }
}
