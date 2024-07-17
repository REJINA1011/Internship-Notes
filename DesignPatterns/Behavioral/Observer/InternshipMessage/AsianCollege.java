package com.f1soft.Task.DesignPatterns.Behavioral.Observer.InternshipMessage;

import com.f1soft.Task.DesignPatterns.Behavioral.Observer.Conversion.Subject;

public class AsianCollege extends College{

    AsianCollege(HrDepartment hrDepartment){
        this.hrDepartment=hrDepartment;
        this.hrDepartment.addCollege(this);
    }

    @Override
    public void sendMessage() {
        System.out.println(hrDepartment.getInternCount()+"Selected");
    }
}
