package com.cts.crud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.crud.DAO.CustomerDao;
import com.cts.crud.model.Customer;

@Service
public class CustomerServiceImp implements CustomerService {
	
	@Autowired
	private CustomerDao dao;
	
	@Override
	public Customer save(Customer cus) {
		// TODO Auto-generated method stub
		return dao.save(cus);
	}

	@Override
	public Customer findById(Long cusId) {
		// TODO Auto-generated method stub
		return dao.findById(cusId).orElse(null);
	}

}