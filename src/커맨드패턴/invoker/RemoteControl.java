package 커맨드패턴.invoker;

import 커맨드패턴.command.Command;
import 커맨드패턴.command.NoCommand;

public class RemoteControl{
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        
        for (int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n----- 리모컨 -----\n");
        for (int i = 0; i < onCommands.length; i++){
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
             + "   " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
