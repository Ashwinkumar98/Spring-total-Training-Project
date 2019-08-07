package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.GreetService.GreetService;


@Controller
public class WelcomeController {
	
	@Autowired
	private GreetService greetings;
	
	@RequestMapping("/greet")
	public ModelAndView showGreetPage(@RequestParam(name="uname" ,required = false) String username)
	{
		ModelAndView mv =new ModelAndView();
		mv.setViewName("greet");
		
		if(username!=null)
		{
			mv.addObject("greeting",greetings.getGreeting()+" "+ username);
		}
		return mv;
	}
}
