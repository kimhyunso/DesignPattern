package 커맨드패턴.command;

import 커맨드패턴.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command{

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute(){
        garageDoor.up();
    }

    @Override
    public void undo(){
        garageDoor.down();
    }
}
