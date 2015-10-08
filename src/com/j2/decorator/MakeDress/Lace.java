package com.j2.decorator.MakeDress;

public class Lace extends SleevelessDressDecorator{
  public Lace(SleevelessDress dress){
    this.dress = dress;
  }
  
 public String getDescription() {
  return dress.getDescription() + ", lace";
 }
 
  public double cost() {
    return 1000 + dress.cost();
  }
}