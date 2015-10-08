package com.j2.decorator;

public class Water extends CondimentDecorator{
 //Beverage beverage;
  
 public Water(Beverage beverage) {
  this.beverage = beverage;
 }
 
 public String getDescription() {
  return beverage.getDescription() + ", Water";
 }
 
 public double cost() {
  return .0 + beverage.cost();
 }
}
