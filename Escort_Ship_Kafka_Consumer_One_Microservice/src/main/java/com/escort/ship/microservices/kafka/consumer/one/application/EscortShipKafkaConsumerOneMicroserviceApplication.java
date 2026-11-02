package com.escort.ship.microservices.kafka.consumer.one.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.webmvc.autoconfigure.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;

@SpringBootApplication(exclude = {WebMvcAutoConfiguration.class})
public class EscortShipKafkaConsumerOneMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EscortShipKafkaConsumerOneMicroserviceApplication.class, args);
    }


    @Bean(name = "mvcConversionService")
    public FormattingConversionService mvcConversionService() {
        return new DefaultFormattingConversionService();
    }


}
