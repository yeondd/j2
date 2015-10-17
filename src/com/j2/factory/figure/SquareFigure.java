package com.j2.factory.figure;

public class SquareFigure extends Figure {
  FigureIngredientFactory ingredientFactory;
  
  public SquareFigure(FigureIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }
  
  void prepare() {
    System.out.println("Preparing" + name);
    color = ingredientFactory.createColor();
    line = ingredientFactory.createLine();
  }
}
