package com.j2.decorator.MakeDress;

public class LaceDress extends SleevelessDress{
  public LaceDress(){
    description = "Lace Dress";
  }
  
  public double cost() {
    return 5000;
  }
}