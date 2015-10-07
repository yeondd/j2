package com.j2.decorator;

public class Ice extends CondimentDecorator{
  //Beverage beverage;
  
  public Ice(Beverage beverage) {
    this.beverage = beverage;
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", Ice";
  }
  
  public double cost(){
    return .15 + beverage.cost();
  }
}