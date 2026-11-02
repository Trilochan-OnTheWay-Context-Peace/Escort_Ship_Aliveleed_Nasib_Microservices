package com.Escort.ship.microservices.catalogue.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.config.GatewayAutoConfiguration;

@SpringBootApplication(exclude = {GatewayAutoConfiguration.class})
public class EscortShipProductCatalogueApplication {

    public static void main(String[] args) {
        SpringApplication.run(EscortShipProductCatalogueApplication.class, args);
    }

}
