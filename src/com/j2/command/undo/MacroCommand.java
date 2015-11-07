package com.j2.command.undo;

public class MacroCommand implements Command{
 Command[] commands;
 public MacroCommand(Command[] command){
  this.commands = command;
 }
 
 public void execute() {
  for(int i = 0; i < commands.length; i++)
   commands[i].execute();
 }

 public void undo() {
  for(int i = 0; i < commands.length; i++)
   commands[i].undo();
 }
 
}
