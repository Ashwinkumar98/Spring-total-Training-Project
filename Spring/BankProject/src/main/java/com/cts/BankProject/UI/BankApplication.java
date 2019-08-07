package com.cts.BankProject.UI;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import com.cts.BankProject.Util.JPAUtil;
import com.cts.BankProject.model.Address;
import com.cts.BankProject.model.Bank;
import com.cts.BankProject.model.Customer;


public class BankApplication {

	public static void main(String[] args) {
		
		Bank bank =new Bank(1,"SBI",new ArrayList<Customer>());
		
		Address a1=new Address(1,"Madurai","Tamilnadu","12-125","Kambar Street",624201);
		Address a2=new Address(1,"Chennai","Tamilnadu","12-175","Anna nagar Street",34434);
		
		Customer c1=new Customer("1200098271256","Ashwin",a1);
		Customer c2=new Customer("1200098271346","Kumar",a2);
		
		bank.getCustomers().add(c1);
		bank.getCustomers().add(c2);
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(bank);
		em.persist(a1);
		em.persist(a2);
		em.getTransaction().commit();
		
		System.out.println("Data Saved !!");
		
		JPAUtil.shutdown();

	}

}
