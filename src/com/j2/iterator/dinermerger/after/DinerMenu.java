package com.j2.iterator.dinermerger.after;

public class DinerMenu implements Menu{
  static final int MAX_ITEMS = 3;
  int numberOfItems = 0;
  MenuItem[] menuItems;
  
  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("채식주의자 메뉴",
                "두부 스테이크, 토마토 샐러드, 야채주스", true, 2.99);
        addItem("토스트 세트",
                "베이컨치즈 토스트, 프렌치 토스트, 오렌지 주스", false, 2.99);
        addItem("오늘의 스프",
                "오늘의 스프와 감자 샐러드, 커피", false, 3.29);
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
