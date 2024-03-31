package 커맨드패턴.command;

import 커맨드패턴.receiver.Stereo;

public class StereoOnWithCDCommand implements Command{
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolumn(11);
    }

    @Override
    public void undo(){
        stereo.off();
        stereo.setVolumn(0);
    }

}