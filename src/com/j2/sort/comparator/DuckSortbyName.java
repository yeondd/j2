package com.j2.templatemethod.sort.comparator;
import java.util.Comparator;
public class DuckSortbyName implements Comparator<Duck>{
 public int compare(Duck o1, Duck o2) {
   String dName1 = o1.name;
   String dName2 = o2.name;
  return dName1.compareTo(dName2);
 }
}