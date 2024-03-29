package com.cts.crud.controller;

import java.security.Provider.Service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.crud.Service.CustomerService;
import com.cts.crud.Service.PostpaidService;
import com.cts.crud.Service.PrepaidService;
import com.cts.crud.model.Customer;


@Controller
@Scope("session")
public class TelecomController {
	
	private Customer cusSession;
	
	@Autowired
	private PrepaidService preservice;
	
	@Autowired
	private PostpaidService postservice;
	
	@Autowired
	private CustomerService cuservice;
	
	@GetMapping("/home")
	public ModelAndView CustomerForm()
	{
		return new ModelAndView("customerForm","cus",new Customer());
	}
	
	@RequestMapping("/header")
	public ModelAndView headerPage()
	{
		return new ModelAndView("header");
	}
	
	@RequestMapping("/footer")
	public ModelAndView footerPage()
	{
		return new ModelAndView("footer");
	}
	
	@PostMapping("/home")
	public ModelAndView getCustomerData(@Valid @ModelAttribute(name="cus") Customer customer,BindingResult res)
	{   
		if(res.hasErrors())
		{
			return new ModelAndView("customerForm","cus",customer);
		}
		cusSession=customer;
		return new ModelAndView("OfferPage","OfferData",null);
	}
	
	@PostMapping("/getOffers")
	public ModelAndView displayOffers(@RequestParam(name="offers") String offerType)
	{
		ModelAndView mv=new ModelAndView("OfferPage");
		
		if(offerType.equals("pre"))
		{
			mv.addObject("OfferData",preservice.findAll());
			mv.addObject("type","Prepaid");
		}
		else if(offerType.equals("post"))
		{
			mv.addObject("OfferData",postservice.findAll());
			mv.addObject("type","Postpaid");
		}
		else
		{
			mv=new ModelAndView("OfferPage","OfferData",null);
		}
		return mv;
	}
	
	@GetMapping("/report")
	public ModelAndView reportPage(@RequestParam(name="id",required = true) Long id,@RequestParam(name="type") String type)
	{
		if(type.equals("Prepaid"))
		{
			cusSession.setOfferdetails(preservice.findById(id));
			cuservice.save(cusSession);
		}
		else
		{
			cusSession.setOfferdetails(postservice.findById(id));
			cuservice.save(cusSession);
		}
		return new ModelAndView("report","data",cusSession);
	}
	
	
	
	
	
}
