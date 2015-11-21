package com.j2.templatemethod.sort.comparator;
public class Duck{
  String name;
  int weight;
  
  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }
  
  public String toString() {
    return name + " weight " + weight;
  }
}
