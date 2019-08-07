package com.example.demo.EmployeeService;
import org.springframework.stereotype.Service;
import com.example.demo.model.Employee;


@Service
public class EmployeeSericveImp implements EmployeeService {

	@Override
	public Employee ComputeAllowance(Employee e) {
		
		e.setHra(e.getBasic()*0.23);
		return e;
	}

}
