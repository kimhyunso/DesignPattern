package 커맨드패턴;

import 커맨드패턴.command.CeilingFanOnCommand;
import 커맨드패턴.command.LightOffCommand;
import 커맨드패턴.command.LightOnCommand;
import 커맨드패턴.invoker.RemoteControl;
import 커맨드패턴.receiver.CeilingFan;
import 커맨드패턴.receiver.GarageDoor;
import 커맨드패턴.receiver.Light;
import 커맨드패턴.receiver.Stereo;

public class RemoteLoader{

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
         
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);


        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);



    }

}