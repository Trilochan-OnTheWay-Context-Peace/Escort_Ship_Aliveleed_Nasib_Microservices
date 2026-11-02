package com.Escort.ship.functional.programs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.context.properties.ConfigurationPropertiesReportEndpointAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.webmvc.autoconfigure.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;

@SpringBootApplication(exclude = {WebMvcAutoConfiguration.class,
        ConfigurationPropertiesReportEndpointAutoConfiguration.class})
public class EscortShipFunctionalProgramsApplication {

    public static void main(String[] args) {

        SpringApplication.run(EscortShipFunctionalProgramsApplication.class, args);
    }

    @Bean(name = "mvcConversionService")
    public FormattingConversionService mvcConversionService() {
        return new DefaultFormattingConversionService();
    }
}

