package com.cts.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.scd.service.GreetNoteServiceAdvance;
import com.cts.scd.service.GreetNoteTimeBaseImp;
import com.cts.scd.service.GreetingServiceArguementImp;

@Configuration
public class MyConfig {
	
	@Bean
	public GreetNoteTimeBaseImp gs1()
	{
		return (new GreetNoteTimeBaseImp());
	}
	
	@Bean
	public GreetingServiceArguementImp gs2()
	{
		return new GreetingServiceArguementImp("Asas");
	}
	
	@Bean
	public GreetNoteServiceAdvance gs3()
	{
		return new GreetNoteServiceAdvance(new GreetNoteTimeBaseImp());
	}
	
	@Bean
	public GreetingServiceArguementImp gs4()
	{
		
		GreetingServiceArguementImp obj = new GreetingServiceArguementImp();
		obj.setGreetNote("ASasasasa");
		return obj;
	}
	
	

}
