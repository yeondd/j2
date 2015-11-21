package com.j2.templatemethod.sort.comparator;
import java.util.*;
public class DuckSortTestDrive {
  public static void main(String args[]) {
    Duck[] ducks = {new Duck("Daffy",8), new Duck("Jack",2), new Duck("Harry",7), new Duck("Donald",10), new Duck("Louie", 2), new Duck("Anna", 2)};
    
    Arrays.sort(ducks, new DuckSortbyName());
    Arrays.sort(ducks, new DuckSortbyWeight());
    display(ducks);
  }
  
  public static void display(Duck[] ducks) {
    for(int i = 0; i < ducks.length; i++)
      System.out.println(ducks[i]);
  }
}
