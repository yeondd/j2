package com.j2.decorator;

public class StarbuzzCoffee{
  public static void main(String arg[]) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $ " + beverage.cost());
    
    Beverage darkRoast = new DarkRoast();
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Mocha(darkRoast);
    darkRoast = new Whip(darkRoast);
    System.out.println(darkRoast.getDescription() + " $ " + darkRoast.cost());
    
    
    Beverage house = new HouseBlend();
    house = new Soy(house);
    house = new Mocha(house);
    house = new Whip(house);
    System.out.println(house.getDescription() + " $ " + house.cost());
  }
}