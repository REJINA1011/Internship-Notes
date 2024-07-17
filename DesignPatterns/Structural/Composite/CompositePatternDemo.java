package com.f1soft.Task.DesignPatterns.Structural.Composite;

public class CompositePatternDemo {
    public static void main(String[] args){
        Employee CEO = new Employee("Kritagya","CEO", 300000);


        Employee headSales = new Employee("Sudarshan","Head Sales", 200000);

        Employee headMarketing = new Employee("Rejina","Head Marketing", 2000000);


        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        //CEO add the other person in the head department
        CEO.addEmployee(headSales);
        CEO.addEmployee(headMarketing);

        //headSales add executives
        headSales.addEmployee(salesExecutive1);
        headSales.addEmployee(salesExecutive2);

        //
        headMarketing.addEmployee(clerk1);
        headMarketing.addEmployee(clerk2);

        System.out.println(CEO);

        headMarketing.removeEmployee(clerk2);

        System.out.println("GetSubordinate"+headMarketing.getSubordinate().toString());


    }
}
