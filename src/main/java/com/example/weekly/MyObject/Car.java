package com.example.weekly.MyObject;

public class Car {
    private String color;

    public Car(String color) {
        this.color = color;
        System.out.println("Inside car constructor");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
