package com.cts.jpa.hib.demo.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name =  "studentTab")
public class Student {
	
	@EmbeddedId
	private StudentIdentity sid;
	
	@Column(name = "fnm" , nullable = false)
	private String firstname;
	
	@Column(name = "lnm")
	private String  lastname;
	
	@Column(name = "dob" , nullable = false)
	private Date dob;
	
	public Student() {
		
	}

	public Student(StudentIdentity sid, String firstname, String lastname, Date dob) {
		super();
		this.sid = sid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
	}

	public StudentIdentity getSid() {
		return sid;
	}

	public void setSid(StudentIdentity sid) {
		this.sid = sid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
}
