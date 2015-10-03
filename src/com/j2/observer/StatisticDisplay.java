package com.j2.observer;

public class StatisticDisplay implements Observer, DisplayElement{
  private float temperature;
  private float humidity;
  private Subject weatherData;
  private float avg;
  private float tempmax = 0;
  private float tempmin;
  
  public StatisticDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  
  public void update(float temperature, float humidity, float pressure){
    if(this.temperature == 0)
      avg = temperature;
    else
      avg = (this.temperature + temperature)/2;
    
    if(this.temperature == 0)
      tempmin = temperature;
    
    this.temperature = temperature;
    this.humidity = humidity;
    
    if(temperature <= tempmin)
      tempmin = temperature;
    
    if(temperature > tempmax)
      tempmax = temperature;
    display();
  }
  
  public void display() {
    System.out.println("Avg/Max/Min temperature = " + avg + "/" + tempmax + "/" + tempmin);
  }
}
  