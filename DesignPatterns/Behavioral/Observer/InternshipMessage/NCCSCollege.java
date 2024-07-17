package com.f1soft.Task.DesignPatterns.Behavioral.Observer.InternshipMessage;

public class NCCSCollege extends College{

    NCCSCollege(HrDepartment hrDepartment){
        this.hrDepartment=hrDepartment;
        this.hrDepartment.addCollege(this);
    }
    @Override
    public void sendMessage() {
        System.out.println(hrDepartment.getInternCount()+"Selected");
    }
}
