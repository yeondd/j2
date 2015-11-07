package com.j2.command.undo;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class RemoteLoader {
  public static void main(String[] args) {
    
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    Light light = new Light("Living Room");
    
    LightOnCommand livingRoomOn = new LightOnCommand(light);
    LightOffCommand livingRoomOff = new LightOffCommand(light);
    
    remote.setCommand(0,livingRoomOn, livingRoomOff);
    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);
    remote.undoButtonWasPushed();
    
    DVD dvd = new DVD();
    
    DVDOnCommand dvdOn = new DVDOnCommand(dvd);
    DVDOffCommand dvdOff = new DVDOffCommand(dvd);
    
    remote.setCommand(1, dvdOn, dvdOff);
    remote.onButtonWasPushed(1);
    remote.offButtonWasPushed(1);
    remote.undoButtonWasPushed();
    
    System.out.println("============MACRO============");
    
    Command[] partyOn = {livingRoomOn, dvdOn};
    Command[] partyOff = {livingRoomOff, dvdOff};
    
    MacroCommand partyOnMacro = new MacroCommand(partyOn);
    MacroCommand partyOffMacro = new MacroCommand(partyOff);
    
    remote.setCommand(2, partyOnMacro, partyOffMacro);
    
    System.out.println("<Pushing Macro On>");
    remote.onButtonWasPushed(2);
    System.out.println("<Pushing Macro Off>");
    remote.offButtonWasPushed(2);
    
  }
}
