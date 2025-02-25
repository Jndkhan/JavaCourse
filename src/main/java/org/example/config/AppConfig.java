package org.example.config;

import org.example.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean(name = "desktop")
    public Desktop desktop1(){
        return new Desktop();
    }

}
