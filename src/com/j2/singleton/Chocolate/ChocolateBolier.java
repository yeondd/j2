package com.j2.singleton.chocolate;

public class ChocolateBolier {
  private boolean empty;
  private boolean boiled;
  private static int numCalled;
  private static ChocolateBolier uniqueInstance;
  
  private ChocolateBolier() {}
  
  public static ChocolateBolier getInstance() {
    if(uniqueInstance == null) {
      System.out.println("Creating a new instance...");
      uniqueInstance = new ChocolateBolier();
    }
    System.out.println("numCalled : "+ numCalled++);
    return uniqueInstance;
  }
  
  public void fill() {
    if(isEmpty()) {
      empty = false;
      boiled = false;
    }
  }
  
  public boolean isEmpty() {
    return empty;
  }
}

  