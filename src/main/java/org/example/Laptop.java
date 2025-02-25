package org.example;

public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop object Created..");
    }

    @Override
    public void myLap() {
        System.out.println("in Laptop class");
    }
}
