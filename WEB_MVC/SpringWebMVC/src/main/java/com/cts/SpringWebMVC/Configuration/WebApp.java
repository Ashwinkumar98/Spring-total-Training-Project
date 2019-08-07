package com.cts.SpringWebMVC.Configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebApp implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webctx = new AnnotationConfigWebApplicationContext();
		webctx.register(SpringWebMvcConfig.class);
		webctx.setServletContext(servletContext);		
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(webctx));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
	}

}
