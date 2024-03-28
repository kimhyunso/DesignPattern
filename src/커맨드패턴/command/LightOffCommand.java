package 커맨드패턴.command;

import 커맨드패턴.receiver.Light;

public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }


    @Override
    public void execute(){
        light.off();
    }
}