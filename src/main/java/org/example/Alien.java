package org.example;

public class Alien {

    private int age;

    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }

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
