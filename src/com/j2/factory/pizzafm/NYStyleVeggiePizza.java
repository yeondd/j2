package com.j2.factory.pizzafm;

public class NYStyleVeggiePizza extends Pizza {
  public NYStyleVeggiePizza() {
    name = "NY Style Sauce and Veggie Pizza";
    dough = "Thin Crust Dough";
    sauce = "Marinara Sauce";
    
    toppings.add("Greated Reggiano Cheese");
  }
}
