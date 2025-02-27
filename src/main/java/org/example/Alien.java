package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("23")
    private int age;

    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }


    @Autowired
    @Qualifier("laptop")
    private Computer com;

    public Alien(){
        System.out.println("Alien Object created ..");
    }
    public Alien(int age){
        System.out.println("single parameterized constructor in alien");
        this.age = age;
    }


    public int getAge() {
        System.out.println(age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }
    public void code(){
        System.out.println("coding...");
        com.myLap();
    }
}
