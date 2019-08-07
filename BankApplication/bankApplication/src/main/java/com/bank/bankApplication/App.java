package com.bank.bankApplication;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import com.bank.bankApplication.Util.JPAUtil;
import com.bank.bankApplication.model.Address;
import com.bank.bankApplication.model.BankAccount;
import com.bank.bankApplication.model.HomeLoan;
import com.bank.bankApplication.model.Loan;
import com.bank.bankApplication.model.PersonalLoan;
import com.bank.bankApplication.model.VechileLoan;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Address a1=new Address(1, "madurai", "Tamilnadu", "12-33-44", "anna nagar", "4545343");
    	
    	BankAccount bank=new BankAccount("121454541", "SBI", "Ashwin", "238789279100101", a1, new ArrayList<Loan>());
    	
    	
    	PersonalLoan loan1=new PersonalLoan(1, 12293.93, 12, "11.6", bank, 12378723.2323, 123455);
    	VechileLoan loan2=new VechileLoan(2, 567876, 24, "6.8", bank, "Honda", 456654, "honda_city");
    	HomeLoan loan3=new HomeLoan(3, 1231234, 180, "18.6", bank, "Ashwin", a1);
    	
    	PersonalLoan loan4=new PersonalLoan(4, 34523.93, 12, "34.4", bank, 12378723.2323, 123455);
    	VechileLoan loan5=new VechileLoan(5, 234, 24, "9.8", bank, "Yamaga", 456654, "yamaga_dealer");
    	HomeLoan loan6=new HomeLoan(6, 234, 180, "88.7", bank, "kumar", a1);
    	
    	PersonalLoan loan7=new PersonalLoan(7, 456.93, 12, "681", bank, 345345.2323, 3454);
    	VechileLoan loan8=new VechileLoan(8, 6897, 24, "32.8", bank, "Hero", 456654, "Hero_city");
    	HomeLoan loan9=new HomeLoan(9, 456456, 180, "66.9", bank, "aswath", a1);
    	
    	
    	bank.getBanks().add(loan1);
    	bank.getBanks().add(loan2);
    	bank.getBanks().add(loan3);
    	
    	bank.getBanks().add(loan4);
    	bank.getBanks().add(loan5);
    	bank.getBanks().add(loan6);
    	
    	bank.getBanks().add(loan7);
    	bank.getBanks().add(loan8);
    	bank.getBanks().add(loan9);
    	
    	EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(a1);
		em.persist(bank);
		em.getTransaction().commit();
		
		System.out.println("Emp Saved !!");
		
		JPAUtil.shutdown();
    }
}
