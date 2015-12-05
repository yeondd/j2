package com.j2.state.movieplayer;

public class Player {
 State playState;
 State stopState;
 State pauseState;
 
 State state = playState;
 
 public Player(){
  playState = new PlayState(this);
  stopState = new StopState(this);
  pauseState = new PauseState(this);
 }
 
 public void setState(State state){
  this.state = state;
 }
 
 public State getState(){
  return state;
 }

 public void mointorIsOff(){
  state.mointorIsOff();
 }
 
 public void movieIsEnd(){
  state.movieIsEnd();
 }
 
 public State getPlayState(){
  return playState;
 }
 
 public State getPauseState(){
  return pauseState;
 }
 
 public State StopState(){
  return stopState;
 }
}
