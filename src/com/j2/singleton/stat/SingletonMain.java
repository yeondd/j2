package com.j2.singleton.stat;

public class SingletonMain {
  public static void main(String args[]) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    Singleton s3 = Singleton.getInstance();
  }
}