package com.f1soft.Task.DesignPatterns.Behavioral.Observer.InternshipMessage;

import java.util.ArrayList;
import java.util.List;

public class HrDepartment {
    public int internCount;
    public List<College>colleges=new ArrayList<>();

    public int getInternCount() {
        return internCount;
    }

    public void setInternCount(int internCount) {
        this.internCount = internCount;
        notifyColleges();
    }

    public void addCollege(College college){
        colleges.add(college);
    }

    public void notifyColleges(){
        for(College college:colleges){
            college.sendMessage();
        }
    }
}
