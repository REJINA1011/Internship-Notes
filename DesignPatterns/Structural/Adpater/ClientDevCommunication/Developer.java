package com.f1soft.Task.DesignPatterns.Structural.Adpater.ClientDevCommunication;

public class Developer{

    public void message(String projectName, String duration){
        System.out.println(projectName+"has been started for "+duration);
    }
}
