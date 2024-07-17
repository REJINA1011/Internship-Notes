package com.f1soft.Task.DesignPatterns.Creational.FactoryPattern.Payment;

public class PaymentModule {
    public static void main(String[] args){

        Payment payment =new Payment();

        payment.setModeOfPayment("cash",2000);

        payment.setModeOfPayment("creditcard",1000);
    }
}

