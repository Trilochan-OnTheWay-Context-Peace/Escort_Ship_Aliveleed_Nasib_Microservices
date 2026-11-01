package com.Escort.ship.microservices.catalogue.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.config.GatewayAutoConfiguration;

@SpringBootApplication(exclude = {GatewayAutoConfiguration.class})
public class WhiteHeavenProductCatalogueApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhiteHeavenProductCatalogueApplication.class, args);
    }

}
