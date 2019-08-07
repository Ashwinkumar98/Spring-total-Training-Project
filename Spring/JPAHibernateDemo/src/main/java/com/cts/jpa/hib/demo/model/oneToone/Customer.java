package com.cts.jpa.hib.demo.model.oneToone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@Column(name = "aadhar")
	private String aadhar;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(mappedBy = "customer" , cascade = CascadeType.ALL)
	private BankAccount bank;
	
	public Customer() {}
	
	public Customer(String aadhar, String name, BankAccount bank) {
		super();
		this.aadhar = aadhar;
		this.name = name;
		this.bank = bank;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount getBank() {
		return bank;
	}

	public void setBank(BankAccount bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Customer [aadhar=" + aadhar + ", name=" + name + ", bank=" + bank + "]";
	}
	
}
