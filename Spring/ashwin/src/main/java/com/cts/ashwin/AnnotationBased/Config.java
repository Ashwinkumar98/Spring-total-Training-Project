package com.cts.ashwin.AnnotationBased;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.cts.scd.service"})
@PropertySource(value = {"classpath:application.properties"})
public class Config {
	
	@Bean
	public LocalDate today()
	{
		return LocalDate.now();
	}

}
