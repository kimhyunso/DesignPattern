package 커맨드패턴.invoker;

import 커맨드패턴.command.Command;

public class SimpleRemoteControl{
    
    private Command slot;
    
    public SimpleRemoteControl(){}

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}