package com.j2.factory.figure;

public class TwoDFigureStore extends FigureStore {
  protected Figure createFigure(String item) {
    Figure figure = null;
    FigureIngredientFactory ingredientFactory = new TwoDFigureIngredientFactory();
    
    if (item.equals("circle")) {
      figure = new CircleFigure(ingredientFactory);
      figure.setName("2D Circle Figure");
    }
    if (item.equals("triangle")) {
      figure = new TriangleFigure(ingredientFactory);
      figure.setName("2D Triangle Figure");
    }
    if (item.equals("square")) {
      figure = new SquareFigure(ingredientFactory);
      figure.setName("2D Square Figure");
    }
    return figure;
  }
}
