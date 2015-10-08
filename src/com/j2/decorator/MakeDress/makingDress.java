package com.j2.decorator.MakeDress;

public class makingDress {
  public static void main(String arg[]) {
    SleevelessDress shortdress = new ShortSleeveDress();
    shortdress = new Sleeve(shortdress);
    shortdress = new Sleeve(shortdress);
    shortdress = new Skirt(shortdress);
    System.out.println(shortdress.getDescription() + " : won " + shortdress.cost());
    
    SleevelessDress longdress = new LongSleevelessDress();
    longdress = new Skirt(longdress);
    longdress = new Skirt(longdress);
    longdress = new Skirt(longdress);
    System.out.println(longdress.getDescription() + " : won " + longdress.cost());
    
    SleevelessDress lacedress = new LaceDress();
    lacedress = new Lace(lacedress);
    lacedress = new Lace(lacedress);
    lacedress = new Sleeve(shortdress);
    lacedress = new Skirt(lacedress);
    lacedress = new Skirt(lacedress);
    System.out.println(lacedress.getDescription() + " : won " + lacedress.cost());
  }
}
    