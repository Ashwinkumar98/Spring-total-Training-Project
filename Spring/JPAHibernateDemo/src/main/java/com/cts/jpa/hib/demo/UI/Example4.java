package com.cts.jpa.hib.demo.UI;

import javax.persistence.EntityManager;

import com.cts.jpa.hib.demo.model.oneToone.BankAccount;
import com.cts.jpa.hib.demo.model.oneToone.Customer;
import com.cts.jpa.hib.demo.util.JPAUtil;

public class Example4 {
	
	public static void main(String[] args) {
		
		BankAccount acc= new BankAccount();
		Customer cus = new Customer("345345345345","Ashwin",acc);
		acc.setAccno("56875865675");
		acc.setCustomer(cus);
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(cus);
		em.getTransaction().commit();
		
		System.out.println("Customer Saved !!");
		
		JPAUtil.shutdown();
	}

}
