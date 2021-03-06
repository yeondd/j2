package com.j2.iterator.dinermerger.before;

public class DinerMenu{
  static final int MAX_ITEMS = 3;
  int numberOfItems = 0;
  MenuItem[] menuItems;
  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("������ ����",
                "Soup of the day, with a side of potato salad", false, 3.29);
  }
  
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem menuItem = new MenuItem(n, d, v, p);
    if (numberOfItems >= MAX_ITEMS) {
      System.out.println("Sorry full...");
    }
    else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems = numberOfItems + 1;
    }
  }
  
  public MenuItem[] getMenuItems() {
    return menuItems;
  }
}
