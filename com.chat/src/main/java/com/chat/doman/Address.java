package com.chat.doman;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Address {
	
	@Id @GeneratedValue
	private String AddressId;
	private String street;
	private String city;
	private String State;
	private int Zipcode;
	public Address(String addressId, String street, String city, String state, int zipcode) {
		super();
		AddressId = addressId;
		this.street = street;
		this.city = city;
		State = state;
		Zipcode = zipcode;
	}
	public Address() {
		super();
	}
	public String getAddressId() {
		return AddressId;
	}
	public void setAddressId(String addressId) {
		AddressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZipcode() {
		return Zipcode;
	}
	public void setZipcode(int zipcode) {
		Zipcode = zipcode;
	}
	
	

}
