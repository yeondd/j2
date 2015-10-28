package com.j2.singleton.subclass;

public class SingletonMain {
  public static void main(String args[]) {
    Singleton foo = CoolerSingleton.getInstance();
    Singleton bar = HotterSingleton.getInstance();
    
    System.out.println(foo);
    System.out.println(bar);
  }
}
