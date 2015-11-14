package com.j2.facade.hometheater.simple;

public class Light {
    String description;
    int l;
 
    public Light(String description) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public void setLight(int light) {
        System.out.println(description + " setting frequency to " + light);
        this.l = light;
    }
    public String toString() {
        return description;
    }
}