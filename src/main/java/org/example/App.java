package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class App 
{
    public static void main( String[] args )
    {

        /// Java Base Configuration

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean("desktop",Desktop.class);
        dt.myLap();



        /// through Spring xml file
       /* ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.code();
        obj.getAge();*/

        /*Laptop laptop = (Laptop) context.getBean("laptop");
        laptop.myLap();*/

        ////
    }
}
