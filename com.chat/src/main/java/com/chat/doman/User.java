package com.chat.doman;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id 
	private String userId;
	private String password;

	public String getUserId() {
		return userId;
	}

	public User() {
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
