package com.example.demo.GreetService;


import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceImp implements GreetService {

	@Override
	public String getGreeting() {
		
		int h = LocalTime.now().getHour();
		
		String greeting = null;
		
		if(h>=4 && h<12) greeting="Good Morning";
		else if(h>=12 && h<=16) greeting="Good Noon";
		else greeting="Good Evening";
		
		return greeting;
	}

}
