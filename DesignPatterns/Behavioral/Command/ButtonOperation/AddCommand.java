package com.f1soft.Task.DesignPatterns.Behavioral.Command.ButtonOperation;

public class AddCommand implements Command{
    private ButtonOperation buttonOperation;

    public AddCommand(ButtonOperation buttonOperation){
        this.buttonOperation=buttonOperation;
    }
    @Override
    public void execute() {
     buttonOperation.addOperation();
    }
}
