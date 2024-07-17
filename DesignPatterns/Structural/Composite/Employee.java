package com.f1soft.Task.DesignPatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;

    private List<Employee>subordinate;

    Employee(String name, String dept, int salary){
        this.name=name;
        this.dept=dept;
        this.salary=salary;
        subordinate=new ArrayList<Employee>();
    }

    public void addEmployee(Employee e){
        subordinate.add(e);
    }
    public void removeEmployee(Employee e){
        subordinate.remove(e);
    }
    public List<Employee>getSubordinate(){
        return subordinate;
    }
    public String toString(){
        return ("Employee:Name "+name+"\tDepartment "+dept+"\tSalary "+salary);
    }
}
