package com.cts.currency.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("b1")
public class CurrencyConverterImp implements CurrencyConverter {
	
	@Autowired
	private CurrentTimeImp time;
	
	@Value("#{${map.values}}")
	private HashMap<String,Double> listofcurrency;
	
	public String ConverteCurrency(double curr, String from, String to) {
		double val1 =  listofcurrency.get(from);
		double val2 = listofcurrency.get(to);
		double res=(curr/val1)*val2;
		return String.valueOf(curr) +" "+ from + " is " + String.valueOf(res) + " " + to +" at time of "+time.getTime() ;
	}
	
	

}
