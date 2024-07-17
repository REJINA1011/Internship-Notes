package com.f1soft.Task.DesignPatterns.Structural.Adpater.ClientDevCommunication;

public class Client{
    public static void main(String[] args){
        ProjectManager projectManager=new ProjectManager();

        projectManager.projectUpdate("Project2","4 months");
    }
}
