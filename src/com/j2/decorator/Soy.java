package com.j2.decorator;

public class Soy extends CondimentDecorator{
  public Soy(Beverage beverage){
    this.beverage = beverage; //생성자 안에서 만들었음 ->센 관계
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", Soy";
  }
  
  public double cost(){
    return beverage.cost() + .15;
  }
}