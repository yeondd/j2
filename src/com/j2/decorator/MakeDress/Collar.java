package com.j2.decorator.MakeDress;

public class Collar extends SleevelessDressDecorator{
  public Collar(SleevelessDress dress){
    this.dress = dress;
  }
  
 public String getDescription() {
  return dress.getDescription() + ", collar";
 }
 
  public double cost() {
    return 1500 + dress.cost();
  }
}