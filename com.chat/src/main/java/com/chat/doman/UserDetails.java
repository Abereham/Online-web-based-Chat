package com.chat.doman;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity 
public class UserDetails {
	@Id @GeneratedValue
	private String userDetailsID;
	private String firstName;
	private String lastname;
	private int phoneNO;
	private int email;
	
	@OneToOne
	 @JoinColumn(name="userId")
	 private User user;
	
	
	public UserDetails(String userDetailsID, String firstName, String lastname, int phoneNO, int email) {
		super();
		this.userDetailsID = userDetailsID;
		this.firstName = firstName;
		this.lastname = lastname;
		this.phoneNO = phoneNO;
		this.email = email;
	}
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public UserDetails() {
		super();
	}
	public String getUserDetailsID() {
		return userDetailsID;
	}
	public void setUserDetailsID(String userDetailsID) {
		this.userDetailsID = userDetailsID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getPhoneNO() {
		return phoneNO;
	}
	public void setPhoneNO(int phoneNO) {
		this.phoneNO = phoneNO;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	
	
	
}
