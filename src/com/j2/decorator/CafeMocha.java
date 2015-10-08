package com.j2.decorator;

public class CafeMocha extends Beverage {
  public CafeMocha() {
    description = "CafeMocha Coffee";
  }
  
  public double cost() {
    return 1.00;
  }
}
