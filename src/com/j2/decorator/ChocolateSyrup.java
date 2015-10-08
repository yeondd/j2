package com.j2.decorator;

public class ChocolateSyrup extends CondimentDecorator {
 //Beverage beverage;
 
 public ChocolateSyrup(Beverage beverage) {
  this.beverage = beverage;
 }
 
 public String getDescription() {
  return beverage.getDescription() + ", ChocolateSyrup";
 }
 
 public double cost() {
  return .30 + beverage.cost();
 }

}
