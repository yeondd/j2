package com.j2.factory.figure;

public abstract class Figure {
  String name;
  Color color;
  Line line;
  
  abstract void prepare();
  void draw() {
    System.out.println("Draw a line");
  }
  void coloring() {
    System.out.println("Paint the figure");
  }
  void print() {
    System.out.println("Printing the figure in 2D or 3D");
  }
  void setName(String name){
    this.name = name;
  }
  String getName() {
    return name;
  }
  public String toString(){
    StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (color != null) {
            result.append(color);
            result.append("\n");
        }
        if (line != null) {
            result.append(line);
            result.append("\n");
        }
        return result.toString();
    }
}
