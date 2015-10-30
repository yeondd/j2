package com.j2.singleton.printerspooler.dcl;

public class PrinterSpoolerSingletonMain {
  public static void main(String args[]) {
    PrinterSpoolerSingleton s1 = PrinterSpoolerSingleton.getInstance();
    s1.checkPrinting();
    PrinterSpoolerSingleton s2 = PrinterSpoolerSingleton.getInstance();
    s2.fill();
    PrinterSpoolerSingleton s3 = PrinterSpoolerSingleton.getInstance();
  }
}
