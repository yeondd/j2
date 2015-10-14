package com.j2.factory;

public class SimplePizzaFactory{
  Pizza pizza = null;
  public Pizza createPizza(String type){
    if (type.equals("cheese")){
      pizza = new CheesePizza();
    }
    
    return pizza;
  }
}
