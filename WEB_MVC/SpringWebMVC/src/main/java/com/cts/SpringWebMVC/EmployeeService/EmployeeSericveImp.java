package com.cts.SpringWebMVC.EmployeeService;

import org.springframework.stereotype.Service;

import com.cts.SpringWebMVC.model.Employee;

@Service
public class EmployeeSericveImp implements EmployeeService {

	@Override
	public Employee ComputeAllowance(Employee e) {
		
		e.setHra(e.getBasic()*0.23);
		return e;
	}

}
