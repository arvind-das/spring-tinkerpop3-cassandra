package com.neuron.configs.globals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({ "classpath:application-${spring.profiles.active}.properties" })
public class AppConfig {

    @Value("${storage.backend}")
    private String dbBackend;

    @Value("${storage.hostname}")
    private String dbHost;


    public String getConfigurationForDB(){
        return new StringBuilder().append(dbBackend).append(":").append(dbHost).toString();
    }
}
