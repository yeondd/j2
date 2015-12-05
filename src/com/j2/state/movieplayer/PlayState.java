package com.j2.state.movieplayer;

public class PlayState implements State{
 Player player;
 
 public PlayState(Player player){
  this.player = player;
 }
 
 public void mointorIsOff() {
  System.out.println("Now your moive is pause. Your mointor is Off");
  player.setState(player.getPauseState());
 }

 public void movieIsEnd() {
  System.out.println("Moive is still remain");
 }

}
