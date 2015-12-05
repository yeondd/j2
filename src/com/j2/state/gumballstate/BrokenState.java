package com.j2.state.gumballstate;

public class BrokenState implements State {
  GumballMachine gm;
  
  public BrokenState(GumballMachine gm){
    this.gm = gm;
  }
  
  public void insertBrokenQuarter(){
    System.out.println("You already insert the coin.");
  }
  
  public void insertQuarter() {
    System.out.println("You can not insert another quareter");
  }
  
  public void ejectQuarter(){
      System.out.println("Quarter returned");
      gm.setState(gm.getNoQuarterState());
  }
  
  public void turnCrank(){
    System.out.println("We can't sold a gumball. Your coin is wrong.");
  }
  
  public void dispense(){
    System.out.println("Oops. Your coin is broken.");
  }
}
