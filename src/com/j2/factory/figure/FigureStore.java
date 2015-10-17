package com.j2.factory.figure;

public abstract class FigureStore {
  protected abstract Figure createFigure(String item);
  
  public Figure orderFigure(String type) {
    Figure figure = createFigure(type);
    System.out.println("--- Making a " + figure.getName() + " ---");
    figure.prepare();
    figure.draw();
    figure.coloring();
    figure.print();
    return figure;
  }
}
