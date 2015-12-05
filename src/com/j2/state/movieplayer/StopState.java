package com.j2.state.movieplayer;

public class StopState implements State{
 Player player;

 public StopState(Player player){
  this.player = player;
 }
 
 public void mointorIsOff(){
  System.out.println("Moive is stop");
 }
 
 public void movieIsEnd(){
  System.out.println("The End");
 }

}
