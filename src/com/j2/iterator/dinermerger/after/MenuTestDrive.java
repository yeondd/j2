package com.j2.iterator.dinermerger.after;

public class MenuTestDrive {
  public static void main(String[] args) {
    PancakeHouseMenu pm = new PancakeHouseMenu();
    DinerMenu dm = new DinerMenu();
    Waitress w = new Waitress(pm, dm);
    
    System.out.println("vegitrian Menu");
    w.printVMenu();
  }
}
