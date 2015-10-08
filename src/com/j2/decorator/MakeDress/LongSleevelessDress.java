package com.j2.decorator.MakeDress;

public class LongSleevelessDress extends SleevelessDress{
  public LongSleevelessDress(){
    description = "Long Sleeveless Dress";
  }
  
  public double cost() {
    return 5000;
  }
}