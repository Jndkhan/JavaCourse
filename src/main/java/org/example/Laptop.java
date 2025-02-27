package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop object Created..");
    }

    @Override
    public void myLap() {
        System.out.println("in Laptop class");
    }
}
