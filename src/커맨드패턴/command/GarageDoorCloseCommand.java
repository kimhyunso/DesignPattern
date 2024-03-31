package 커맨드패턴.command;

import 커맨드패턴.receiver.GarageDoor;

public class GarageDoorCloseCommand implements Command{

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute(){
        garageDoor.down();
    }

    @Override
    public void undo(){
        garageDoor.up();
    }

}