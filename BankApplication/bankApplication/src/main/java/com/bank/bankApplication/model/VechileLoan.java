package com.bank.bankApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle_Loan")
public class VechileLoan extends Loan{
	
	
	@Column(name="Vehicle_Name")
	private String name;
	
	@Column(name="Vehicle_Amount")
	private double amount;
	
	@Column(name="vendor_name")
	private String vendor_name;
	
	

	public VechileLoan() {}




	public VechileLoan(int id, double loanamount, int duration, String intrest, BankAccount banks, String name,
			double amount, String vendor_name) {
		super(id, loanamount, duration, intrest, banks);
		this.name = name;
		this.amount = amount;
		this.vendor_name = vendor_name;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}







	public double getAmount() {
		return amount;
	}







	public void setAmount(double amount) {
		this.amount = amount;
	}







	public String getVendor_name() {
		return vendor_name;
	}







	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}







	@Override
	public String toString() {
		return "VechileLoan [name=" + name + ", amount=" + amount + ", vendor_name=" + vendor_name + "]";
	}
	
	
	

}
