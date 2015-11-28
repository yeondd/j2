package com.j2.iterator.dinermerger.after;
import java.util.*;

public class PancakeHouseMenu implements Menu{
  ArrayList menuItems;
  //MenuItem[] menuItems;
  public PancakeHouseMenu() {
    //menuItems = new menuItems[MAX_ITEMS];
    menuItems = new ArrayList();
        addItem("-p-�˸��� �ø��� ���İ�Ƽ",
                "���ð� �ø��� ���Ϸ� ���� �� �Ľ�Ÿ", true, 2.99);
        addItem("-p-���������",
                "�̽��� ����߿� ���� ��ä�� ����� ��ä ������", false, 2.99);
        addItem("-p-������ ����",
                "������ ����, ���� ������� �Ľ�", false, 3.29);
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

