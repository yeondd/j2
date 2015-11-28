package com.j2.iterator.dinermerger.after;

public class Waitress {
  PancakeHouseMenu pm;
  DinerMenu dm;
  public Waitress(PancakeHouseMenu p, DinerMenu d) {
    this.pm = p;
    this.dm = d;
  }
  
  public void printMenu(){
   Iterator pI = pm.createIterator();
   Iterator dI = dm.createIterator();
   System.out.println("<< 아침메뉴 >>");
   printMenu(pI);
   System.out.println("<< 점심메뉴 >>");
   printMenu(dI);
  }
  
  public void printMenu(Iterator iterator){
    while(iterator.hasNext()){
      MenuItem menuItem = (MenuItem)iterator.next();
      System.out.println(menuItem.getName() + ", ");
      System.out.println(menuItem.getDescription());
      System.out.println(menuItem.getPrice() + " -- ");
      System.out.println(" ");
    }
  }
  
  public void printMenuForV(){
   Iterator pI = pm.createIterator();
   Iterator dI = dm.createIterator();
   System.out.println("<< Pancake House's Menu for Vegetarian >>");
   printMenuForVegetarian(pI);
   System.out.println("<< Diner's Menu for Vegetarian >>");
   printMenuForVegetarian(dI);
  }
  
  public void printMenuForVegetarian(Iterator iterator){
     while(iterator.hasNext()){
       MenuItem menuItem = (MenuItem)iterator.next();
       if(menuItem.isVegetarian()){
      System.out.println(menuItem.getName() + ", ");
      System.out.println(menuItem.getDescription());
      System.out.println(menuItem.getPrice() + " -- ");
      System.out.println(" ");
       } 
     }
  }
}
