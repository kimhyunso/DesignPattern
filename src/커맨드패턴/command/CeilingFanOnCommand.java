package 커맨드패턴.command;

import 커맨드패턴.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command{

    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute(){
        ceilingFan.on();
    }

}