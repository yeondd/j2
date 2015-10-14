package com.j2.factory;

public class PizzaTestDrive {
  public static void main(String[] arg) {
    SimplePizzaFactory fac = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(fac);
    Pizza pizza = store.orderPizza("cheese");
    System.out.println("We ordered a "+pizza.getName());
  }
}

