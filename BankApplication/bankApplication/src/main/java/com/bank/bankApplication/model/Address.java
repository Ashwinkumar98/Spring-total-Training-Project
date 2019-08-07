package com.bank.bankApplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address_Deatils")
public class Address {
	
	@Id
	private int id;
	
	private String city;
	
	private String state;
	
	private String doorno;
	
	private String streetName;
	
	private String zipcode;
	
	public Address() {
		
	}

	public Address(int id, String city, String state, String doorno, String streetName, String zipcode) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.doorno = doorno;
		this.streetName = streetName;
		this.zipcode = zipcode;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDoorno() {
		return doorno;
	}

	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", doorno=" + doorno + ", streetName="
				+ streetName + ", zipcode=" + zipcode + "]";
	}
	
	
}
