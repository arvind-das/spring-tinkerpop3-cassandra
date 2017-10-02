package com.neuron.configs.dbFactories;


import com.neuron.configs.globals.AppConfig;
import com.thinkaurelius.titan.core.TitanFactory;
import com.thinkaurelius.titan.core.TitanGraph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TitanDBFactory {

    @Autowired
    private AppConfig appConfig;

    @Bean
    @Scope(value = "request")
    public TitanGraph titanGraph(){

        return  TitanFactory.open(appConfig.getConfigurationForDB());
    }


}
