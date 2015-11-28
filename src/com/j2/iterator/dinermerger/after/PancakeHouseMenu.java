package com.j2.iterator.dinermerger.after;
import java.util.*;

public class PancakeHouseMenu implements Menu{
  ArrayList menuItems;
  //MenuItem[] menuItems;
  public PancakeHouseMenu() {
    //menuItems = new menuItems[MAX_ITEMS];
    menuItems = new ArrayList();
        addItem("-p-알리오 올리오 스파게티",
                "마늘과 올리브 오일로 맛을 낸 파스타", true, 2.99);
        addItem("-p-가든샐러드",
                "싱싱한 양상추와 각종 야채를 곁들인 야채 샐러드", false, 2.99);
        addItem("-p-오늘의 스프",
                "오늘의 스프, 감자 샐러드와 후식", false, 3.29);
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
  
  public Iterator createIterator() {
    return new PancakeHouseMenuIterator(menuItems);
  }
}

