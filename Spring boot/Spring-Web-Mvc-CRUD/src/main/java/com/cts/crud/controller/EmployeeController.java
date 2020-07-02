package com.cts.crud.controller;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.crud.EmployeeService.EmployeeService;
import com.cts.crud.model.Department;
import com.cts.crud.model.Employee;


@Controller
public class EmployeeController {
	public final static int SAVED=1;
	public final static int DELETED=2;
	
	@Autowired
	private EmployeeService service;
	
	public void populateDept(Model m)
	{
		m.addAttribute("depts", Department.values());
	}
	
	@GetMapping("/emps")
	public ModelAndView getEmployees()
	{
		return new ModelAndView("Employees","emplist",service.findAll());
	}
	
	@GetMapping("/newEmp")
	public ModelAndView newEmpFrom(@RequestParam(name="id" ,required = false,defaultValue="-1") Long id)
	{
		if(id!=-1)
		{
			return new ModelAndView("empForm","emp",service.findById(id));
		}
	
		return new ModelAndView("empForm","emp",new Employee()); 
	}
	
	@PostMapping("/newEmp")
	public ModelAndView addEmployeeData(@RequestParam(name="id" ,required = false,defaultValue="-1") Long id,@Valid @ModelAttribute(name="emp") Employee e,BindingResult res)
	{
		ModelAndView mv;
		
		if(res.hasErrors())
		{
			System.out.println(res.getAllErrors());
			mv=new ModelAndView("empForm","emp",e);
		}
		else
		{
			if(id>0)
			{
				Employee empData = service.findById(e.getEmpId());
				empData=e;
				service.save(empData);
			}
			else
			{
				e=service.save(e);
			}
			
			long empId = e.getEmpId();
			mv=new ModelAndView("redirect:/home?id="+empId+"&msgCode="+SAVED);
		}
		return mv;
	}
	
	
	@GetMapping("/SearchEmp")
	public ModelAndView searchEmp()
	{
		return new ModelAndView("SearchEmp","data",null);
	}
	
	
	@GetMapping("/{id}")
	public ModelAndView details(@PathVariable Long id)
	{
		ModelAndView mv=null;
		
		
		mv=new ModelAndView("empdetails","emp",service.findById(id));
		
		
		return mv;
	}
	
	@RequestMapping("/deleteEmp/{id}")
	public ModelAndView deleteEmp(@PathVariable Long id)
	{
		ModelAndView mv;
		service.deleteById(id);
		mv=new ModelAndView("redirect:/home?id="+id+"&msgCode="+DELETED);
		return mv;
	}
	
	@RequestMapping("/editEmp/{id}")
	public ModelAndView editEmp(@PathVariable Long id)
	{
		ModelAndView mv;
		mv=new ModelAndView("redirect:/newEmp?id="+id);
		return mv;
	}
	
	@GetMapping("/findData")
	public ModelAndView findData(@RequestParam(name="search" ,required = true) String find,
			@RequestParam(name="inputval" ,required = true) String input,
			@RequestParam(name="inputval1" , required = false) String val)
	{
		ModelAndView mv = new ModelAndView("SearchEmp");
		
		if(find.equals("Id"))
		{
			mv.addObject("data", service.findById(Long.parseLong(input)));
			mv.addObject("check",1);
		}
		else if(find.equals("EmailId"))
		{
			mv.addObject("data", service.findByemailid(input));
			mv.addObject("check",1);
		}
		else if(find.equals("Mobileno"))
		{
			mv.addObject("data", service.findBymobileno(input));
			mv.addObject("check",1);
		}
		else if(find.equals("Department"))
		{
			System.out.println(service.findAllBydept(Department.valueOf(input)));
			mv.addObject("data", service.findAllBydept(Department.valueOf(input)));
			mv.addObject("check",2);
		}
		else if(find.equals("JoiningDate"))
		{
			mv.addObject("data",service.findAllByjoinDate(LocalDate.parse(input)));
			mv.addObject("check",2);
		}
		else if(find.equals("Basic"))
		{
			mv.addObject("data",service.findAllByBasicRange(Double.parseDouble(input), Double.parseDouble(val)));
			mv.addObject("check",2);
		}
			
		return mv;
	}
	
	
}