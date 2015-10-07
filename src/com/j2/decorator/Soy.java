package com.j2.decorator;

public class Soy extends CondimentDecorator{
  public Soy(Beverage beverage){
    this.beverage = beverage; //������ �ȿ��� ������� ->�� ����
  }
  
  public String getDescription(){
    return beverage.getDescription() + ", Soy";
  }
  
  public double cost(){
    return beverage.cost() + .15;
  }
}