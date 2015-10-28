package com.j2.singleton.dcl;

public class Singleton {
  private static int numCalled;
  private volatile static Singleton uniqueInstance;
  
  private Singleton() {}
  
  public static Singleton getInstance() {
    if(uniqueInstance == null) {
      synchronized (Singleton.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new Singleton();
        }
      }
    }
    
    System.out.println("numCalled : "+ numCalled++);
    return uniqueInstance;
  }
  
}

  