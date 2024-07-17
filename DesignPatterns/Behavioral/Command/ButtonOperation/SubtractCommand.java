package com.f1soft.Task.DesignPatterns.Behavioral.Command.ButtonOperation;

public class SubtractCommand implements Command{

    private ButtonOperation operationRequests;

    public SubtractCommand(ButtonOperation operationRequests){
        this.operationRequests=operationRequests;
    }
    @Override
    public void execute() {
        operationRequests.subtractOperation();
    }
}
