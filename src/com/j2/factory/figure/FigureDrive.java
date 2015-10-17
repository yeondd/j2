package com.j2.factory.figure;

public class FigureDrive {
  public static void main(String[] args) {
    FigureStore twodStore = new TwoDFigureStore();
    FigureStore threedStore = new ThreeDFigureStore();
    
    Figure figure = twodStore.orderFigure("circle");
    System.out.println("You order a 2D figure a " + figure + "\n");
    
    figure = threedStore.orderFigure("square");
    System.out.println("You order a 3D figure a " + figure + "\n");
  }
}
