package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {
    public static void main(String[] args) {

        /// Java Base Configuration

      /*  ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean("desktop",Desktop.class);
        dt.myLap();

*/

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien obj = context.getBean(Alien.class);
        obj.code();
        obj.getAge();


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
