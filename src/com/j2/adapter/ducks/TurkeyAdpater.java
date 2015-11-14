package com.j2.adapter.ducks;

public class TurkeyAdpater implements Duck {
  Turkey turkey;
  public TurkeyAdpater(Turkey turkey){
    this.turkey = turkey;
  }
  
  public void quack() {
    turkey.gobble();
  }
  
  public void fly(){
    for(int i = 0; i < 3; i++)
      turkey.fly();
  }
}
