package com.j2.factory.figure;

public class TwoDFigureIngredientFactory implements FigureIngredientFactory {
  public Color createColor() {
    return new BlueColor();
  }
  public Line createLine() {
    return new DiamondLine();
  }
}
