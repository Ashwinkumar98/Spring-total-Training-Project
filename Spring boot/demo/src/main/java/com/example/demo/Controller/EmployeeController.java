package com.example.demo.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.EmployeeService.EmployeeSericveImp;
import com.example.demo.model.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeSericveImp emp;
	
	@ModelAttribute
	public void populateDesign(Model model)
	{
		model.addAttribute("desig",new String[] {"PAT","PA","A","SA","Ar","Sr.Ar"});
	}
	
	@GetMapping
	public ModelAndView showEmpInp()
	{
		return new ModelAndView("empInp","emp",new Employee());
	}
	
	@PostMapping
	public ModelAndView showEmpOut(@ModelAttribute("emp") Employee e)
	{
		e=emp.ComputeAllowance(e);
		return new ModelAndView("empOut","emp",e);
	}

}
