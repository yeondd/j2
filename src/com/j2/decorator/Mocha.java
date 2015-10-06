package com.j2.decorator;

public class Mocha extends CondimentDecorator{
  Beverage beverage;
  
  public Mocha(Beverage beverage){
    this.beverage = beverage; //생성자 안에서 만들었음 ->센 관계
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", Mocha";
  }
  
  public double cost(){
    return beverage.cost() + .20;
  }