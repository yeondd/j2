package com.j2.state.movieplayer;

public class PauseState implements State{
 Player player;
 
 public PauseState(Player player){
  this.player = player;
 }
 
 public void mointorIsOff(){
  System.out.println("Your mointor is already off. Please pressure the play button");
 }
 
 public void movieIsEnd(){
  System.out.println("mi");
 }

}
