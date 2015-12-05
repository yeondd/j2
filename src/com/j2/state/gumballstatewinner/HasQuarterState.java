package com.j2.state.gumballstatewinner;
import java.util.Random;

public class HasQuarterState implements State {
  Random randomWinner = new Random(System.currentTimeMillis());
  GumballMachine gm;
  
  public HasQuarterState(GumballMachine gm){
    this.gm = gm;
  }
  
  public void insertQuarter(){
      System.out.println("You can not insert another quareter");
  }
  
  public void ejectQuarter(){
      System.out.println("Quarter returned");
      gm.setState(gm.getNoQuarterState());
     }
  
  public void turnCrank(){
       System.out.println("You turned...");
       int winner = randomWinner.nextInt(10);
       if((winner == 0) && gm.getCount() > 1)
         gm.setState(gm.getWinnerState());
       else
         gm.setState(gm.getSoldState());
       gm.setState(gm.getSoldState());
     }

  public void dispense(){
    System.out.println("No gumball dispensed");
  }
}

  