package com.f1soft.Task.DesignPatterns.Structural.Adpater.ClientDevCommunication;

public class ProjectManager implements ProjectMeeting{
    DeveloperAdapter developerAdapter;
    @Override
    public void projectUpdate(String projectName, String duration) {
        if(projectName.equalsIgnoreCase("Project1")){
            System.out.println("Project is finished.");
        } else if (projectName.equalsIgnoreCase("Project2")){
            developerAdapter.projectUpdate(projectName,duration);

        }else {
            System.out.println("Other Projects ongoing...");
        }
    }
}
