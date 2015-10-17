package com.j2.factory.figure;

public class ThreeDFigureIngredientFactory implements FigureIngredientFactory {
  public Color createColor() {
    return new BlackColor();
  }
  public Line createLine() {
    return new DotLine();
  }
}
