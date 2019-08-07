package com.cts.jpa.hib.demo.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "OnlyEmp")
//@Inheritance(strategy = InheritanceType.JOINED)
//@Table(name = "Emp")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Table(name = "AllInOne")
//@DiscriminatorColumn(name = "emp_type",discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue("emp")
public class Employee {
	
	@Id
	@Column(name = "eid")
	private int empid;
	
	@Column(name="empname")
	private String empname;
	
	private double basic;
	
	public Employee()
	{
		
	}

	public Employee(int empid, String empname, double basic) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.basic = basic;
	}


	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	

}
