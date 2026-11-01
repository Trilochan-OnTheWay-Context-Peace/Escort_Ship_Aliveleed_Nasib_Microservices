package com.white.ship.microservices.cart.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.webmvc.autoconfigure.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;

@SpringBootApplication(exclude = {WebMvcAutoConfiguration.class})
public class WhiteHeavenCartMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhiteHeavenCartMicroserviceApplication.class, args);
    }



    @Bean(name = "mvcConversionService")
    public FormattingConversionService mvcConversionService() {
        return new DefaultFormattingConversionService();
    }



}
