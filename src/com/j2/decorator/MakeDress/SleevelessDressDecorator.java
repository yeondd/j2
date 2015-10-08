package com.j2.decorator.MakeDress;

public abstract class SleevelessDressDecorator extends SleevelessDress { 
  SleevelessDress dress;
  public abstract String getDescription();
}