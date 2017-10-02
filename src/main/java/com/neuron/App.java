package com.neuron;

import com.neuron.utils.DataLoaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@ComponentScan(basePackages = "com.neuron")
@EnableTransactionManagement
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    @Autowired
    DataLoaderUtil dataLoaderUtil;

    public static void main(String args[]) {
        ApplicationContext ctx = SpringApplication.run(App.class, args);
        logger.info("Let's inspect the beans provided by Spring Boot:");
//        dataLoaderUtil.loadData();
    }




}
