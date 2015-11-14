package com.j2.adapter.ducks;

public class DuckTestDrive {
  public static void main(String[] args){
    MallardDuck duck = new MallardDuck();
    WildTurkey turkey = new WildTurkey();
    TurkeyAdpater turkeyAdapter = new TurkeyAdpater(turkey);
    
    System.out.println("Turkey says");
    turkey.gobble();
    turkey.fly();
    System.out.println("Turkey Adapter says");
    turkeyAdapter.quack();
    turkeyAdapter.fly();
  }
}

    