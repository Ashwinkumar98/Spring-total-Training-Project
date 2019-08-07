package com.cts.BankProject.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")
public class Customer {
	
	@Id
	private String accno;
	
	@Column(name="Customer_Name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	public Customer() {
	}
	

	public Customer(String accno, String name, Address address) {
		super();
		this.accno = accno;
		this.name = name;
		this.address = address;
	}

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
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
		return "Customer [accno=" + accno + ", name=" + name + ", address=" + address + "]";
	}
	
}
