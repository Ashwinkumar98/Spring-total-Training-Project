package com.cts.SpringWebMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	
	@RequestMapping({"" , "/" , "/home"})
	public ModelAndView defaultGetRequestHandler() {
		
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("home");
		mv.addObject("pageTitle", "Welcome All");
		mv.addObject("developers",new String[] {"Ashwin","Naveen","Kumar"});
		
		return mv;
	}
	
	@RequestMapping("/header")
	public String getHeaderPage() {
		return "header";
	}
	
	@RequestMapping("/footer")
	public String getFooterPage() {
		return "footer";
	}
}
