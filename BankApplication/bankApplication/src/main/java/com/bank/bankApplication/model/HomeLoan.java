package com.bank.bankApplication.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Home_Loan")
public class HomeLoan extends Loan{
	
	@Column(name="Builder_name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	public HomeLoan() {
		
	}



	public HomeLoan(int id, double loanamount, int duration, String intrest, BankAccount banks, String name,
			Address address) {
		super(id, loanamount, duration, intrest, banks);
		this.name = name;
		this.address = address;
	}





	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "HomeLoan [name=" + name + ", address=" + address + "]";
	}
	
	
}
