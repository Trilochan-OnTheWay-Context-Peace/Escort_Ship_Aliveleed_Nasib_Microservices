package com.Escort.ship.microservices.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.config.GatewayAutoConfiguration;
import org.springframework.cloud.gateway.config.GatewayMetricsAutoConfiguration;

@SpringBootApplication(exclude = {GatewayAutoConfiguration.class, GatewayMetricsAutoConfiguration.class})
public class EscortShipApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EscortShipApiGatewayApplication.class, args);
    }

}
