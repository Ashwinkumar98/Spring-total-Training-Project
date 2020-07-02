package com.cts.crud.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.crud.model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {
	
}