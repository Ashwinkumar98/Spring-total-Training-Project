package com.cts.SpringWebMVC.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages = "com.cts.SpringWebMVC")
@EnableWebMvc
public class SpringWebMvcConfig implements WebMvcConfigurer {
	
	@Bean
	public ViewResolver viewresolver() {
		InternalResourceViewResolver viewres = new InternalResourceViewResolver();
		viewres.setViewClass(JstlView.class);
		viewres.setPrefix("/pages/");
		viewres.setSuffix(".jsp");
		return viewres;
	}
	
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addResourceHandler("/resources/**").addResourceLocations("/assets/");
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}
	
	
}
