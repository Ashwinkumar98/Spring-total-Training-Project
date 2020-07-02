package com.cts.jpa.hib.demo.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="OnlyContra")
//@DiscriminatorValue("contractor")
public class ContractorEmp extends Employee {
	
	@Column(name = "cdur")
	private int contractorDur;
	
	public ContractorEmp()
	{
		
	}
	

	public ContractorEmp(int empid, String empname, double basic, int contractorDur) {
		super(empid, empname, basic);
		this.contractorDur = contractorDur;
	}




	public int getContractorDur() {
		return contractorDur;
	}

	public void setContractorDur(int contractorDur) {
		this.contractorDur = contractorDur;
	}


	@Override
	public String toString() {
		return "ContractorEmp [contractorDur=" + contractorDur + ", getEmpid()=" + getEmpid() + ", getEmpname()="
				+ getEmpname() + ", getBasic()=" + getBasic() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}