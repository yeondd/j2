package com.j2.state.gumballstatewinner;

public interface State{
  public void insertQuarter();
  public void ejectQuarter();
  public void turnCrank();
  public void dispense();
}