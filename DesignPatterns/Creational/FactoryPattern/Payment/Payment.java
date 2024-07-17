package com.f1soft.Task.DesignPatterns.Creational.FactoryPattern.Payment;

public class Payment {

    ModeOfPayment modeOfPayment;

    public void setModeOfPayment(String type,int priceToPay){
        if(type.equalsIgnoreCase("cash")){
            modeOfPayment=new Cash();
            modeOfPayment.totalPayment(priceToPay);
        } else if (type.equalsIgnoreCase("creditcard")) {
            modeOfPayment=new CreditCard();
            modeOfPayment.totalPayment(priceToPay);
        } else if (type.equalsIgnoreCase("ebanking")) {
            modeOfPayment=new EBanking();
            modeOfPayment.totalPayment(priceToPay);
        }else {
            System.out.println("Other Modes not available");
        }
    }

}
