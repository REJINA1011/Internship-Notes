package com.f1soft.Task.DesignPatterns.Structural.Adpater.ClientDevCommunication;

public class DeveloperAdapter implements ProjectMeeting{

    Developer developer;

    public DeveloperAdapter(String projectName){
        if(projectName.equalsIgnoreCase("project2")){
            developer=new Developer();
        }
    }
    @Override
    public void projectUpdate(String projectName, String duration) {
        developer.message(projectName,duration);
    }
}
