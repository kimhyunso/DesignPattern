package 커맨드패턴.command;

import 커맨드패턴.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command{

    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute(){
        ceilingFan.off();
    }

}