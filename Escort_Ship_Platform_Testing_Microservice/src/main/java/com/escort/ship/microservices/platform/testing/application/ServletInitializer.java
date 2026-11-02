package com.white.ship.microservices.platform.testing.application;

import com.white.ship.microservices.payment.application.EscortShipPlatformTestingMicroserviceApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EscortShipPlatformTestingMicroserviceApplication.class);
    }

}
