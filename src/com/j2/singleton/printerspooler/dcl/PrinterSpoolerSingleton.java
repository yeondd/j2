package com.j2.singleton.printerspooler.dcl;

public class PrinterSpoolerSingleton {
  private static int numCalled;
  private boolean empty = true;
  private boolean printing = true;
  private volatile static PrinterSpoolerSingleton uniqueInstance;
  
  private PrinterSpoolerSingleton() {}
  
  public static PrinterSpoolerSingleton getInstance() {
    if(uniqueInstance == null) {
      synchronized (PrinterSpoolerSingleton.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new PrinterSpoolerSingleton();
        }
      }
    }
    System.out.println("numCalled : "+ numCalled++);
    return uniqueInstance;
  }
  
   public void fill() {
    if(isEmpty()) {
      System.out.println("Now I'm changing empty ink");
      empty = false;
    }
  }
  public void checkPrinting(){
    if(IsPrinting()){
      System.out.println("Printing...");
    }
    else
      System.out.println("We have no documents");
  }
  
  public boolean IsPrinting(){
    return printing;
  }

  public boolean isEmpty(){
    System.out.println("Ink is empty");
    return empty;
  }
  
}

  