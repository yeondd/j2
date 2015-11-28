package com.j2.iterator.dinermerger.after;

public class DinerMenu implements Menu{
  static final int MAX_ITEMS = 3;
  int numberOfItems = 0;
  MenuItem[] menuItems;
  
  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("ä�������� �޴�",
                "�κ� ������ũ, �丶�� ������, ��ä�ֽ�", true, 2.99);
        addItem("�佺Ʈ ��Ʈ",
                "������ġ�� �佺Ʈ, ����ġ �佺Ʈ, ������ �ֽ�", false, 2.99);
        addItem("������ ����",
                "������ ������ ���� ������, Ŀ��", false, 3.29);
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
  
  public Iterator createIterator() {
    return new DinerMenuIterator(menuItems);
  }
}
