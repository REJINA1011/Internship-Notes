package com.f1soft.Task.DesignPatterns.Behavioral.Command.ButtonOperation;

public class CommandMainClass {
    public static void main(String[] args){

        ButtonOperation buttonOperation= new ButtonOperation();

        //Command Classes
        AddCommand addOperation= new AddCommand(buttonOperation);
        SubtractCommand subtractOperation = new SubtractCommand(buttonOperation);

        RequestCollection request=new RequestCollection();

        request.setOperationCommands(addOperation);
        request.setOperationCommands(subtractOperation);

        request.commandExecution();

    }
}
