package com.cts.BankProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	private int id;
	
	@Column(name="city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "Door_No")
	private String door_no;
	
	@Column(name = "Street_Name")
	private String StreetNo;
	
	@Column(name="Zip_Code")
	private int zipCode;
	
	public Address() {}

	public Address(int id, String city, String state, String door_no, String streetNo, int zipCode) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.door_no = door_no;
		StreetNo = streetNo;
		this.zipCode = zipCode;
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

	public String getDoor_no() {
		return door_no;
	}

	public void setDoor_no(String door_no) {
		this.door_no = door_no;
	}

	public String getStreetNo() {
		return StreetNo;
	}

	public void setStreetNo(String streetNo) {
		StreetNo = streetNo;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", door_no=" + door_no + ", StreetNo="
				+ StreetNo + ", zipCode=" + zipCode + "]";
	}	

}
