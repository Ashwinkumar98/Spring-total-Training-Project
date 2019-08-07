package com.cts.currency.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.cts.currency.service"})
@PropertySource(value = {"classpath:application.properties"})
public class MyConfig {

}
