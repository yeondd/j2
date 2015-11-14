package com.j2.facade.hometheater.simple;

public class Computer {
    String description;
    Light light;
 
    public Computer(String description) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public String toString() {
        return description;
    }
}