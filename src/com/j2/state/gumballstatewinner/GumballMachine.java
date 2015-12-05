package com.j2.state.gumballstatewinner;

public class GumballMachine {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State winnerState;
  State state = soldOutState;
  int count = 0;
  
  public GumballMachine(int n) {
    this.count = n;
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    
    if(n > 0){
      state = noQuarterState;
    }
  }
  
  public void setState(State state) {
    this.state = state;
  }
  
  public State getState(){
    return state;
  }
  
  public void insertQuarter() {
    state.insertQuarter();
  }
  
   public void ejectQuarter() {
        state.ejectQuarter();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
  
  public State getNoQuarterState(){
    return noQuarterState;
  }
  
  public State getSoldState(){
    return soldState;
  }
  
  public State getHasQuarterState(){
    return hasQuarterState;
  }
  
  public State getWinnerState() {
    return winnerState;
  }
  
  public State getSoldOutState(){
    return soldOutState;
  }
  
  public void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
      if (count != 0) {
          count = count - 1;
      }
  }
  
  public int getCount() {
    return count;
  }
}

  
  
  
  