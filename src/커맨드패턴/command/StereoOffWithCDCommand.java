package 커맨드패턴.command;

import 커맨드패턴.receiver.Stereo;

public class StereoOffWithCDCommand implements Command{
    
    private Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }
    
    @Override
    public void execute(){
        stereo.off();
    }

    @Override
    public void undo(){
        stereo.on();
    }

}