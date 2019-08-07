package com.cts.scd.service;

import org.springframework.stereotype.Service;

@Service("s1")
public class GreetServiceImp implements GreetService {

	public String greet(String username) {
		return "Welcome : "+username;
	}

}
