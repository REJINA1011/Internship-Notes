package com.f1soft.Task.DesignPatterns.Behavioral.Observer.InternshipMessage;

public class InternshipMessage {
    public static void main(String[] args){
        HrDepartment hrDepartment =new HrDepartment();

        new AsianCollege(hrDepartment);
        new NCCSCollege(hrDepartment);

        System.out.println("Number of students");
        hrDepartment.setInternCount(25);
    }
}
