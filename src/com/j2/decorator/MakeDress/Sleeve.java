package com.j2.decorator.MakeDress;

public class Sleeve extends SleevelessDressDecorator{
  public Sleeve(SleevelessDress dress){
    this.dress = dress;
  }
  
 public String getDescription() {
  return dress.getDescription() + ", sleeve";
 }
 
  public double cost() {
    return 500 + dress.cost();
  }
}