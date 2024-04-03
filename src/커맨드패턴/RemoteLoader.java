package 커맨드패턴;

import javax.crypto.Mac;

import 커맨드패턴.command.CeilingFanHighCommand;
import 커맨드패턴.command.CeilingFanLowCommand;
import 커맨드패턴.command.CeilingFanMediumCommand;
import 커맨드패턴.command.CeilingFanOffCommand;
import 커맨드패턴.command.CeilingFanOnCommand;
import 커맨드패턴.command.Command;
import 커맨드패턴.command.GarageDoorCloseCommand;
import 커맨드패턴.command.GarageDoorOpenCommand;
import 커맨드패턴.command.LightOffCommand;
import 커맨드패턴.command.LightOnCommand;
import 커맨드패턴.command.MacroCommand;
import 커맨드패턴.command.StereoOffWithCDCommand;
import 커맨드패턴.command.StereoOnWithCDCommand;
import 커맨드패턴.invoker.RemoteControl;
import 커맨드패턴.receiver.CeilingFan;
import 커맨드패턴.receiver.GarageDoor;
import 커맨드패턴.receiver.Light;
import 커맨드패턴.receiver.Stereo;

public class RemoteLoader{

    public static void main(String[] args) {
        // RemoteControl remoteControl = new RemoteControl();

        // Light livingRoomLight = new Light("Living Room");
        // Light kitchenLight = new Light("Kitchen");
         
        // // CeilingFan ceilingFan = new CeilingFan("Living Room");
        // GarageDoor garageDoor = new GarageDoor("Garage");
        // Stereo stereo = new Stereo("Living Room");

        // LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        // LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        // LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        // LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);


        // CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        // CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        // GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        // StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        // StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);


        // remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        // remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        // remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        // remoteControl.setCommand(3, garageDoorOpen, garageDoorClose);
        // remoteControl.setCommand(4, stereoOnWithCD, stereoOffWithCD);

        // 람다식 표현
        // remoteControl.setCommand(0, ()->livingRoomLight.on(), ()->livingRoomLight.off());
        // remoteControl.setCommand(1, ()->kitchenLight.on(), ()->kitchenLight.off());
        // remoteControl.setCommand(2, ()->ceilingFan.on(), ()->ceilingFan.off());
        // remoteControl.setCommand(3, ()->garageDoor.up(), ()->garageDoor.down());
        // remoteControl.setCommand(4, ()->stereo.on(), ()->stereo.off());
        

        // System.out.println(remoteControl);

        // remoteControl.onButtonWasPushed(0);
        // remoteControl.onButtonWasPushed(1);
        // remoteControl.onButtonWasPushed(2);
        // remoteControl.onButtonWasPushed(3);
        // remoteControl.offButtonWasPushed(4);
    
        // undo 확인하기
        // remoteControl.onButtonWasPushed(0);
        // remoteControl.undoButtonWasPushed();
        // remoteControl.offButtonWasPushed(0);
        // remoteControl.undoButtonWasPushed();


        // CeilingFan ceilingFan = new CeilingFan("Living Room");

        // CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        // CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        // CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        // remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        // remoteControl.onButtonWasPushed(0);
        // remoteControl.offButtonWasPushed(0);
        // System.out.println(remoteControl);
        // remoteControl.undoButtonWasPushed();
        
        // remoteControl.onButtonWasPushed(1);
        // System.out.println(remoteControl);
        // remoteControl.undoButtonWasPushed();
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
    

        Command[] partyOn = {lightOn, stereoOn, ceilingFanOn};
        Command[] partOff = {lightOff, stereoOff, ceilingFanOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("--매크로ON--");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--매크로OFF--");
        remoteControl.offButtonWasPushed(0);

    }

}