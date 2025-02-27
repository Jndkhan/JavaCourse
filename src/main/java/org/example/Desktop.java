package org.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop Object Created ..");
    }
    @Override
    public void myLap() {
        System.out.println("in Desktop class");
    }
}
