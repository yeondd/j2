package com.j2.decorator.MakeDress;

public class Skirt extends SleevelessDressDecorator{
  public Skirt(SleevelessDress dress){
    this.dress = dress;
  }
  
 public String getDescription() {
  return dress.getDescription() + ", skirt";
 }
 
  public double cost() {
    return 1000 + dress.cost();
  }
}