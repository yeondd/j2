package com.j2.factory.figure;

public class ThreeDFigureStore extends FigureStore {
  protected Figure createFigure(String item) {
    Figure figure = null;
    FigureIngredientFactory ingredientFactory = new ThreeDFigureIngredientFactory();
    
    if (item.equals("circle")) {
      figure = new CircleFigure(ingredientFactory);
      figure.setName("3D Circle Figure");
    }
    if (item.equals("triangle")) {
      figure = new TriangleFigure(ingredientFactory);
      figure.setName("3D Triangle Figure");
    }
    if (item.equals("square")) {
      figure = new SquareFigure(ingredientFactory);
      figure.setName("3D Square Figure");
    }
    return figure;
  }
}

