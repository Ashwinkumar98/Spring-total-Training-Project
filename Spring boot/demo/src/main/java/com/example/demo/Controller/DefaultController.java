package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	
	@Value("#{${app.title}}")
	public String title;

	@GetMapping({"" , "/" , "/home"})
	public ModelAndView defaultGetRequestHandler() {
		
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("home");
		mv.addObject("pageTitle", "Welcome All");
		mv.addObject("developers",new String[] {"Ashwin","Naveen","Kumar"});
		
		return mv;
	}
	
	@GetMapping("/header")
	public ModelAndView getHeaderPage() {
		return new ModelAndView("header","apptitle",title);
	}
	
	@GetMapping("/footer")
	public String getFooterPage() {
		return "footer";
	}
	
	

}
