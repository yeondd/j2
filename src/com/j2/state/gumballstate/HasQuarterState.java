package com.j2.state.gumballstate;

public class HasQuarterState implements State {
  GumballMachine gm;
  
  public HasQuarterState(GumballMachine gm){
    this.gm = gm;
  }
  
  public void insertBrokenQuarter(){
    System.out.println("Your coin is intact");
  }
  
  public void insertQuarter(){
//    if(state == HAS_QUARTER)
      System.out.println("You can not insert another quareter");
//    else if(state == NO_QUARTER)
//      System.out.println("You inserted a quareter");
//    else if(state == SOLD_OUT)
//      System.out.println("You cannot insert a quarter. Sold Out.");
//    else if(state == SOLD)
//      System.out.println("wait!");
  }
  
  public void ejectQuarter(){
//    if (state == HAS_QUARTER) {
      System.out.println("Quarter returned");
      gm.setState(gm.getNoQuarterState());
//      state = NO_QUARTER;
//     } else if (state == NO_QUARTER) {
//            System.out.println("You haven't inserted a quarter");
//     } else if (state == SOLD) {
//            System.out.println("Sorry, you already turned the crank");
//    } else if (state == SOLD_OUT) {
//            System.out.println("You can't eject, you haven't inserted a quarter yet");
     }
  
  public void turnCrank(){
//    if (state == SOLD) {
//            System.out.println("Turning twice doesn't get you another gumball!");
//     } else if (state == NO_QUARTER) {
//            System.out.println("You turned but there's no quarter");
//     } else if (state == SOLD_OUT) {
//            System.out.println("You turned, but there are no gumballs");
//     } else if (state == HAS_QUARTER) {
       System.out.println("You turned...");
       gm.setState(gm.getSoldState());
//       dispense();
     }

  public void dispense(){
    System.out.println("No gumball dispensed");
  }
}

  