package com.j2.factory.figure;

public class CircleFigure extends Figure {
  FigureIngredientFactory ingredientFactory;
  
  public CircleFigure(FigureIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }
  
  void prepare() {
    System.out.println("Preparing" + name);
    color = ingredientFactory.createColor();
    line = ingredientFactory.createLine();
  }
}
