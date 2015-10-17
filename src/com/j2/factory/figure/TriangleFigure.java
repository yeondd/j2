package com.j2.factory.figure;

public class TriangleFigure extends Figure {
  FigureIngredientFactory ingredientFactory;
  
  public TriangleFigure(FigureIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }
  
  void prepare() {
    System.out.println("Preparing" + name);
    color = ingredientFactory.createColor();
    line = ingredientFactory.createLine();
  }
}
