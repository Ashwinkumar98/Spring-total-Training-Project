package com.cts.SpringWebMVC.model;


public class Employee {
	
	private int id;
	private String name;
	private double basic;
	private double hra;
	public String desig;
	
	public Employee() {
		
	}
	
	

	public Employee(int id, String name, double basic, double hra, String desig) {
		super();
		this.id = id;
		this.name = name;
		this.basic = basic;
		this.hra = hra;
		this.desig = desig;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}
	
	

	public String getDesig() {
		return desig;
	}



	public void setDesig(String desig) {
		this.desig = desig;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basic=" + basic + ", hra=" + hra + "]";
	}
	
	

}
