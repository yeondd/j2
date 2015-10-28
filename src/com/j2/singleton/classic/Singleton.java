package com.j2.singleton.classic;

public class Singleton {
  private static int numCalled;
  private static Singleton uniqueInstance;
  
  private Singleton() {}
  
  public static Singleton getInstance() {
    if(uniqueInstance == null) {
      System.out.println("Creating a new instance...");
      uniqueInstance = new Singleton();
    }
    System.out.println("numCalled : "+ numCalled++);
    return uniqueInstance;
  }
  
}

  