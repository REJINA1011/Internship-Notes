package com.f1soft.Task.DesignPatterns.Behavioral.Command.ButtonOperation;

import java.util.ArrayList;
import java.util.List;

//controls the execution of the requests
public class RequestCollection {

    private List<Command> operationList= new ArrayList<Command>();

    public void setOperationCommands(Command command){
        operationList.add(command);
    }

    public void commandExecution(){
        for(Command command:operationList){
            command.execute();
        }
        operationList.clear();
    }
}
