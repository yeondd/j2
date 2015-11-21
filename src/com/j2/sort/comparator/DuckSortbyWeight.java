package com.j2.templatemethod.sort.comparator;
import java.util.Comparator;
public class DuckSortbyWeight implements Comparator<Duck>{
 public int compare(Duck o1, Duck o2) {
  return (o1.weight < o2.weight) ? -1 : (o1.weight > o2.weight) ? 1:0;
 }
}