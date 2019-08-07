package com.cts.scd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("s2")
public class GreetNoteServiceAdvance implements GreetService {
	
	@Autowired(required = false)
	private GreetNoteProvider gnp;
	
	public GreetNoteServiceAdvance()
	{
		
	}
	
	public GreetNoteServiceAdvance(GreetNoteProvider obj)
	{
		gnp=obj;
	}

	public String greet(String username) {
		return username +" " + gnp.getGreetNote();
	}
	
	
}
