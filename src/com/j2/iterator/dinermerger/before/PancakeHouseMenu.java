package com.j2.iterator.dinermerger.before;
import java.util.ArrayList;
public class PancakeHouseMenu {
  ArrayList menuItems;
  //MenuItem[] menuItems;
  public PancakeHouseMenu() {
    //menuItems = new menuItems[MAX_ITEMS];
    menuItems = new ArrayList();
    addItem("-p-Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("-p-BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("-p-������ ����",
                "Soup of the day, with a side of potato salad", false, 3.29);
  }
  
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem menuItem = new MenuItem(n, d, v, p);
     //menuItems[numberOfItems] = menuItem;
     // numberOfItems+=1;
    menuItems.add(menuItem);
  }
  //public MenuItem[] getMenuItems() {
  public ArrayList getMenuItems(){
    return menuItems;
  }
}
