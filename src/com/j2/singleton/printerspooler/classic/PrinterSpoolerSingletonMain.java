package com.j2.singleton.printerspooler.classic;

public class PrinterSpoolerSingletonMain {
  public static void main(String args[]) {
    PrinterSpoolerSingleton s1 = PrinterSpoolerSingleton.getInstance();
    PrinterSpoolerSingleton s2 = PrinterSpoolerSingleton.getInstance();
    PrinterSpoolerSingleton s3 = PrinterSpoolerSingleton.getInstance();
    s3.fill();
  }
}
