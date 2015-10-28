package com.j2.singleton.chocolate;

public class ChocolateController {
  public static void main(String args[]) {
    ChocolateBolier bolier = ChocolateBolier.getInstance();
    bolier.fill();
    
    ChocolateBolier bolier2 = ChocolateBolier.getInstance();
    bolier2.fill();
  }
}
