package com.j2.singleton.subclass;

public class Singleton {
  protected static int numCalled;
  private static Singleton uniqueInstance;
  
  protected Singleton() {}
  
  public static synchronized Singleton getInstance() {
    if(uniqueInstance == null) {
      System.out.println("Creating a new instance...");
      uniqueInstance = new Singleton();
    }
    System.out.println("numCalled : "+ numCalled++);
    return uniqueInstance;
  }
}
