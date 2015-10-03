package com.j2.observer;

public class ForecastDisplay implements Observer, DisplayElement{
  private float temperature;
  private float humidity;
  private Subject weatherData;
  
  public ForecastDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  
  public void update(float temperature, float humidity, float pressure){
    this.temperature = temperature;
    this.humidity = humidity;
  
    display();
  }
  
  public void display() {  
    if(humidity >= 90.0)
      System.out.println("Forecast : More of the same");
     else if (humidity > 65.0)
      System.out.println("Forecast : Watch out for cooler, rainy weather");
     else
       System.out.println("Forecast : Improving weather on the way!");
     
  }
}
  