package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("session")
public class TasjController {
	
	private List<String> tasklist;
	
	public TasjController()
	{
		this.tasklist=new ArrayList<>();
	}
	
	@GetMapping("/tasks")
	public ModelAndView showTasks()
	{
		return new ModelAndView("taskpage","task",tasklist);
	}
	
	@GetMapping("/addtasks")
	public ModelAndView addTasks(@RequestParam("task") String task)
	{
		this.tasklist.add(task);
		return new ModelAndView("taskpage","task",tasklist);
	}
	
	@GetMapping("/deltasks")
	public ModelAndView deleteTasks(@RequestParam("task") String task)
	{
		this.tasklist.remove(task);
		return new ModelAndView("taskpage","task",tasklist);
	}
		
}
