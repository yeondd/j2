package com.j2.factory.pizzafm;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nystore = new NYPizzaStore();
    Pizza npizza = nystore.orderPizza("veggie");
    System.out.println("We ordered a " + npizza.getName());
    
    System.out.println("");
    
    PizzaStore smstore = new SMPizzaStore();
    Pizza spizza = smstore.orderPizza("clam");
    System.out.println("We ordered a " + spizza.getName());

  }
}
