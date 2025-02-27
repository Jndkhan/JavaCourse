package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

  /*  @Bean
    public Alien alien( Computer com){   // @Qualifier("laptop") to get only this object or use primary
        Alien obj = new Alien();
        obj.setAge(22);
        obj.setCom(com);
        return obj;

    }

   // @Bean(name = {"desktop", "com","myDesktop"})  /// can use multiple names
    @Bean
   // @Scope("prototype")    // for creating multiple objects,
    @Primary
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    public Laptop laptop(){
        return  new Laptop();
    }
*/
}
