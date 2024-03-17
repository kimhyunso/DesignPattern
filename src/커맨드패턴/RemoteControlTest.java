package 커맨드패턴;

import 커맨드패턴.command.GarageDoorOpenCommand;
import 커맨드패턴.command.LightOnCommand;
import 커맨드패턴.invoker.SimpleRemoteControl;
import 커맨드패턴.receiver.GarageDoor;
import 커맨드패턴.receiver.Light;

// 클라이언트
public class RemoteControlTest {
    public static void main(String[] args){
        // 인보커
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 리시버
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();    
    }
    
}
