package 커맨드패턴;

import 커맨드패턴.command.CeilingFanOffCommand;
import 커맨드패턴.command.CeilingFanOnCommand;
import 커맨드패턴.command.GarageDoorCloseCommand;
import 커맨드패턴.command.GarageDoorOpenCommand;
import 커맨드패턴.command.LightOffCommand;
import 커맨드패턴.command.LightOnCommand;
import 커맨드패턴.command.StereoOffWithCDCommand;
import 커맨드패턴.command.StereoOnWithCDCommand;
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
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);


        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOffWithCD);


        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(4);
    }

}