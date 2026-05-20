package com.ebac.modulo61.configuration;

import com.ebac.modulo61.service.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public Database database(){
        return new Database();
    }

}
