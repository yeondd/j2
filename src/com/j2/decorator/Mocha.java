package com.j2.decorator;

public class Mocha extends CondimentDecorator{
  Beverage beverage;
  
  public Mocha(Beverage beverage){
    this.beverage = beverage; //������ �ȿ��� ������� ->�� ����
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", Mocha";
  }
  
  public double cost(){
    return beverage.cost() + .20;
  }