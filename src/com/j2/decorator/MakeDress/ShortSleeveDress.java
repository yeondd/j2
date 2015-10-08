package com.j2.decorator.MakeDress;

public class ShortSleeveDress extends SleevelessDress{
  public ShortSleeveDress(){
    description = "Short Sleeve Dress";
  }
  
  public double cost() {
    return 5000;
  }
}